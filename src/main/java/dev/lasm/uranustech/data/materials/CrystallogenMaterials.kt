package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: CrystallogenMaterials
@Suppress("unused") object CrystallogenMaterials {
    fun init() = Unit

    val Carbon13 = material("carbon13") {
        name = "Carbon-13"

        appearance {
            color       = Rgba(25, 25, 25, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 7
            mass         = 13L
            density      = 2.267
            meltingPoint = 3800L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        composition {
            formula = "C-13"
        }

        meta {
            numericId           = 61
            hashId              = 74
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 800L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Ignis - 1")
            aspect("Radio - 1")
        }

        tags(
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.POLYATOMIC_NONMETAL,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Carbon14 = material("carbon14") {
        name = "Carbon-14"

        appearance {
            color       = Rgba(30, 30, 30, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 8
            mass         = 14L
            density      = 2.267
            meltingPoint = 3800L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        composition {
            formula = "C-14"
        }

        meta {
            numericId           = 62
            hashId              = 75
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 800L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Ignis - 1")
            aspect("Radio - 1")
        }

        tags(
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.POLYATOMIC_NONMETAL,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Lead = material("lead") {
        appearance {
            color       = Rgba(60, 40, 110, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 82
            electrons    = 82
            neutrons     = 125
            mass         = 207L
            density      = 11.342
            meltingPoint = 600L
            boilingPoint = 2022L
            plasmaPoint  = 202200L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 1
            durability = 64L
            speed      = 8.0f
        }

        processing {
            byProduct("silver", "sulfur")
        }

        composition {
            formula = "Pb"
        }

        meta {
            numericId           = 820
            hashId              = 174
            originalMod         = "factorization"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            alloyRef("battery_alloy")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.SOLDERING_MATERIAL,
            MaterialTag.Processing.SOLDERING_MATERIAL_BAD,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Germanium = material("germanium") {
        appearance {
            color       = Rgba(212, 212, 212, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 40
            mass         = 72L
            density      = 5.323
            meltingPoint = 1211L
            boilingPoint = 3106L
            plasmaPoint  = 310600L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 2
            durability = 256L
            speed      = 6.0f
        }

        processing {
            byProduct("hematite", "tin", "chromite")
        }

        composition {
            formula = "Ge"
        }

        meta {
            numericId           = 320
            hashId              = 109
            originalMod         = "Mekanism"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Electrum - 1")
            reRegisteredTo("osmium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Tin = material("tin") {
        appearance {
            color       = Rgba(220, 220, 220, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 68
            mass         = 118L
            density      = 7.287
            meltingPoint = 505L
            boilingPoint = 2875L
            plasmaPoint  = 287500L
            hasMetallum  = true
        }

        processing {
            byProduct("molybdenite", "wolframite", "black_fluorite", "arsenopyrite", "stannite", "sperrylite", "huebnerite", "apatite")
        }

        composition {
            formula = "Sn"
        }

        meta {
            numericId           = 500
            hashId              = 130
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Vitreus - 1")
            alloyRef("tin_alloy")
            alloyRef("soldering_alloy")
            alloyRef("lumium")
            alloyRef("bronze")
            alloyRef("enderium_base")
            alloyRef("hepatizon")
            alloyRef("arsenic_bronze")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.SOLDERING_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Silicon = material("silicon") {
        appearance {
            color       = Rgba(60, 60, 80, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 2.3296
            meltingPoint = 1687L
            boilingPoint = 3538L
            plasmaPoint  = 353800L
            hasMetallum  = true
        }

        composition {
            formula = "Si"
        }

        meta {
            numericId           = 140
            hashId              = 85
            originalMod         = "appliedenergistics2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 5
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_silicon")
            alloyRef("redstone_alloy")
            alloyRef("hsse")
            alloyRef("nikoline_alloy")
            alloyRef("electrical_steel")
            alloyRef("carborundum")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Carbon = material("carbon") {
        appearance {
            color       = Rgba(20, 20, 20, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 2.267
            meltingPoint = 3800L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        composition {
            formula = "C"
        }

        meta {
            numericId           = 60
            hashId              = 73
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 800L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Ignis - 1")
            reRegisteredTo("any_carbon")
            reRegisteredTo("any_coal_carbon")
            alloyRef("iron")
            alloyRef("silicon")
            alloyRef("tungsten_carbide")
            alloyRef("tantalum_hafnium_carbide")
            alloyRef("trinaquadalloy")
            alloyRef("carborundum")
        }

        tags(
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.POLYATOMIC_NONMETAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
        )

    }
}
