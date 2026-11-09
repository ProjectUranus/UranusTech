package dev.lasm.uranustech.data

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.utils.rloc
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.sounds.SoundEvents
import net.minecraft.world.item.BucketItem
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.LiquidBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Fluid
import net.minecraft.world.level.material.MapColor
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.common.SoundActions
import net.neoforged.neoforge.fluids.BaseFlowingFluid
import net.neoforged.neoforge.fluids.FluidType
import net.neoforged.neoforge.registries.*
import java.util.*
import java.util.function.Supplier

object UranusTechMaterialFluids {
    private val fluidTypes: DeferredRegister<FluidType> = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, UranusTech.MODID)
    private val fluids: DeferredRegister<Fluid> = DeferredRegister.create(Registries.FLUID, UranusTech.MODID)

    data class Entry(
        val material: Material,
        val key: ResourceKey<Material>,
        val generator: FluidGeneratorModel,
        val type: DeferredHolder<FluidType, FluidType>,
        val source: DeferredHolder<Fluid, BaseFlowingFluid.Source>,
        val flowing: DeferredHolder<Fluid, BaseFlowingFluid.Flowing>,
        val block: DeferredBlock<LiquidBlock>,
        val bucket: DeferredItem<BucketItem>
    ) {
        // Keep the geology module's existing crude-oil appearance while sharing its registration.
        private val crudeOil = material.id == "crude_oil" && generator == FluidGeneratorModel.LIQUID
        val texture = if (crudeOil) rloc("block/crude_oil_still") else generator.texture(material)
        val flowingTexture = if (crudeOil) rloc("block/crude_oil_flow") else texture
        val color: Int = if (crudeOil) 0xFF26211B.toInt() else generator.color(material).let {
            (it.a shl 24) or (it.r shl 16) or (it.g shl 8) or it.b
        }

        internal fun flowProperties(): BaseFlowingFluid.Properties = BaseFlowingFluid.Properties(type, source, flowing)
            .block(block)
            .bucket(bucket)
            .slopeFindDistance(if (crudeOil || generator == FluidGeneratorModel.MOLTEN) 2 else 4)
            .levelDecreasePerBlock(if (crudeOil || generator == FluidGeneratorModel.MOLTEN) 2 else 1)
            .tickRate(if (crudeOil) 25 else if (generator == FluidGeneratorModel.MOLTEN) 30 else 5)
            .explosionResistance(100.0f)
    }

    private val entries = linkedMapOf<ResourceKey<Material>, EnumMap<FluidGeneratorModel, Entry>>()
    private var registeredFluids: List<Entry> = emptyList()

    fun values(): List<Entry> = registeredFluids

    operator fun get(material: ResourceKey<Material>, state: FluidGeneratorModel): Entry? = entries[material]?.get(state)

    /** GT6 OreDictMaterial.fluid selects an existing state at the requested temperature. */
    fun atTemperature(material: ResourceKey<Material>, temperature: Long): Entry? {
        val states = entries[material] ?: return null
        return when (FluidGeneratorModel.phaseAt(states.values.first().material, temperature)) {
            MaterialPhase.PLASMA -> states[FluidGeneratorModel.PLASMA]
            MaterialPhase.GAS -> states[FluidGeneratorModel.GAS]
            MaterialPhase.LIQUID -> states[FluidGeneratorModel.MOLTEN] ?: states[FluidGeneratorModel.LIQUID]
            MaterialPhase.SOLID -> null
        }
    }

    fun registerMaterialFluids(bus: IEventBus) {
        for (material in UranusTech.BUILTIN_MATERIALS) {
            val key = ref(material.id)
            for (generator in FluidGeneratorModel.forMaterial(material)) {
                val id = generator.registrationId(material.id)
                lateinit var entry: Entry
                val type = fluidTypes.register(id) { -> FluidType(typeProperties(material, generator)) }
                val source = fluids.register(id) { -> BaseFlowingFluid.Source(entry.flowProperties()) }
                val flowing = fluids.register("flowing_$id") { -> BaseFlowingFluid.Flowing(entry.flowProperties()) }
                val block = UranusTech.BLOCKS.register(id) { ->
                    LiquidBlock(source.get(), BlockBehaviour.Properties.of()
                        .mapColor(MapColor.NONE)
                        .replaceable()
                        .noCollission()
                        .noOcclusion()
                        .strength(100.0f)
                        .noLootTable()
                        .liquid()
                        .lightLevel { generator.lightLevel })
                }
                val bucket = UranusTech.ITEMS.register("${id}_bucket") { ->
                    BucketItem(source.get(), Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET))
                }
                entry = Entry(material, key, generator, type, source, flowing, block, bucket)
                val states = entries.getOrPut(key) { EnumMap(FluidGeneratorModel::class.java) }
                check(states.putIfAbsent(generator, entry) == null) { "Material fluid already registered: $id" }
            }
        }
        registeredFluids = entries.values.flatMap { it.values }
        fluidTypes.register(bus)
        fluids.register(bus)
    }

    private fun typeProperties(material: Material, generator: FluidGeneratorModel): FluidType.Properties {
        val liquidDensity = (material.physics.density * 1_000).coerceIn(1.0, Int.MAX_VALUE.toDouble()).toInt()
        val crudeOil = material.id == "crude_oil" && generator == FluidGeneratorModel.LIQUID
        return FluidType.Properties.create()
            .density(if (crudeOil) 900 else if (generator.gaseous) -1 else liquidDensity)
            .viscosity(if (crudeOil) 2_000 else if (generator == FluidGeneratorModel.MOLTEN) 6_000 else if (generator.gaseous) 100 else 1_000)
            .temperature(generator.temperature(material))
            .lightLevel(generator.lightLevel)
            .canConvertToSource(false)
            .canSwim(!generator.gaseous)
            .canDrown(!generator.gaseous)
            .canExtinguish(false)
            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
    }

    fun registerCreativeTabs() {
        val byGenerator = EnumMap<FluidGeneratorModel, MutableList<Entry>>(FluidGeneratorModel::class.java)
        values().forEach { byGenerator.getOrPut(it.generator) { mutableListOf() }.add(it) }
        for ((generator, entries) in byGenerator) {
            UranusTech.CREATIVE_MODE_TABS.register("material_${generator.formName}", Supplier {
                CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.${UranusTech.MODID}.material.${generator.formName}"))
                    .icon { entries.first().bucket.get().defaultInstance }
                    .displayItems { _, output -> entries.forEach { output.accept(it.bucket.get()) } }
                    .build()
            })
        }
    }
}
