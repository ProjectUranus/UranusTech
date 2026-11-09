package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: ApproximateMaterials
@Suppress("unused") object ApproximateMaterials {
    fun init() = Unit

    val Cedar = material("cedar") {
        appearance {
            color       = Rgba(217, 88, 37, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9381
            hashId              = 1608
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Iroko = material("iroko") {
        appearance {
            color       = Rgba(117, 47, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9391
            hashId              = 1618
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Alder = material("alder") {
        appearance {
            color       = Rgba(177, 95, 87, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9331
            hashId              = 1557
            originalMod         = "witchery"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Holly = material("holly") {
        appearance {
            color       = Rgba(248, 242, 226, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9389
            hashId              = 1616
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodVarnished = material("wood_varnished") {
        name = "Varnished Wood"

        appearance {
            color       = Rgba(73, 48, 16, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9405
            hashId              = 1535
            originalMod         = "erebus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Elm = material("elm") {
        appearance {
            color       = Rgba(243, 163, 90, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9383
            hashId              = 1610
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Autumnwood = material("autumnwood") {
        name = "Autumn Wood"

        appearance {
            color       = Rgba(191, 64, 35, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9334
            hashId              = 1562
            originalMod         = "ExtrabiomesXL"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sequoia = material("sequoia") {
        appearance {
            color       = Rgba(142, 87, 84, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9362
            hashId              = 1588
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Eucalyptus = material("eucalyptus") {
        appearance {
            color       = Rgba(245, 164, 130, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9384
            hashId              = 1611
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Limewood = material("limewood") {
        appearance {
            color       = Rgba(206, 154, 104, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9354
            hashId              = 1581
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Birch = material("birch") {
        appearance {
            color       = Rgba(215, 204, 142, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9301
            hashId              = 1521
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Locust = material("locust") {
        appearance {
            color       = Rgba(195, 140, 87, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9392
            hashId              = 1619
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bauxite = material("bauxite") {
        appearance {
            color       = Rgba(200, 100, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 17
            electrons    = 17
            neutrons     = 18
            mass         = 36L
            density      = 2.33405752
            meltingPoint = 2800L
            boilingPoint = 5600L
            plasmaPoint  = 560000L
        }

        tool {
            types      = 0
            quality    = 2
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("kaolinite", "ilmenite", "hematite", "alumina", "aluminium_hydroxide")
        }

        composition {
            component("rutile", 129729600L)
            component("ilmenite", 259459200L)
            component("alumina", 259459200L)
        }

        meta {
            numericId           = 9105
            hashId              = 1482
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("aluminium", "titanium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Giganteumwood = material("giganteumwood") {
        appearance {
            color       = Rgba(102, 47, 39, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9349
            hashId              = 1576
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WhiteCedar = material("white_cedar") {
        name = "White Cedar"

        appearance {
            color       = Rgba(219, 219, 205, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9327
            hashId              = 1553
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Mahogany = material("mahogany") {
        appearance {
            color       = Rgba(111, 61, 55, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 48L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9356
            hashId              = 1560
            originalMod         = "tropicraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val DouglasFir = material("douglas_fir") {
        name = "Douglas Fir"

        appearance {
            color       = Rgba(249, 197, 154, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9325
            hashId              = 1551
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Weedwood = material("weedwood") {
        appearance {
            color       = Rgba(80, 50, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 350L
            boilingPoint = 450L
            plasmaPoint  = 45000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8286
            hashId              = 810
            originalMod         = "thebetweenlands"
            furnaceBurnTime     = 100L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Mortuus - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Poplar = material("poplar") {
        appearance {
            color       = Rgba(204, 204, 123, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9361
            hashId              = 1587
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Livingwood = material("livingwood") {
        appearance {
            color       = Rgba(60, 30, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 350L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 64L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8289
            hashId              = 811
            originalMod         = "Botania"
            furnaceBurnTime     = 200L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Victus - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Plastic = material("plastic") {
        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.7557265867
            meltingPoint = 423L
            boilingPoint = 846L
            plasmaPoint  = 84600L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 256L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        composition {
            component("carbon", 216216000L)
            component("hydrogen", 432432000L)
        }

        meta {
            numericId           = 8218
            hashId              = 865
            originalMod         = "MineFactoryReloaded"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Motus - 2")
            reRegisteredTo("any_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.BOUNCY,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodRubber = material("wood_rubber") {
        name = "Rubber Wood"

        appearance {
            color       = Rgba(180, 150, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 350L
            boilingPoint = 450L
            plasmaPoint  = 45000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 12L
            speed      = 1.5f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8224
            hashId              = 807
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 50L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Rosewood = material("rosewood") {
        appearance {
            color       = Rgba(128, 12, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9399
            hashId              = 1626
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ebony = material("ebony") {
        appearance {
            color       = Rgba(58, 52, 46, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 48L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9348
            hashId              = 1575
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Beech = material("beech") {
        appearance {
            color       = Rgba(226, 144, 68, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9377
            hashId              = 1604
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Rowan = material("rowan") {
        appearance {
            color       = Rgba(205, 172, 87, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9333
            hashId              = 1559
            originalMod         = "witchery"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Fir = material("fir") {
        appearance {
            color       = Rgba(110, 106, 63, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9337
            hashId              = 1564
            originalMod         = "ExtrabiomesXL"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Hawthorn = material("hawthorn") {
        appearance {
            color       = Rgba(188, 182, 178, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9332
            hashId              = 1558
            originalMod         = "witchery"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Baobab = material("baobab") {
        appearance {
            color       = Rgba(136, 145, 95, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9343
            hashId              = 1570
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cocobolowood = material("cocobolowood") {
        appearance {
            color       = Rgba(121, 18, 2, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9347
            hashId              = 1574
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Greenheart = material("greenheart") {
        appearance {
            color       = Rgba(76, 118, 88, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9350
            hashId              = 1577
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cypress = material("cypress") {
        appearance {
            color       = Rgba(185, 187, 181, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9336
            hashId              = 1563
            originalMod         = "ExtrabiomesXL"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Hickory = material("hickory") {
        appearance {
            color       = Rgba(218, 174, 134, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9388
            hashId              = 1615
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Oak = material("oak") {
        appearance {
            color       = Rgba(180, 144, 90, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9300
            hashId              = 1520
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodTainted = material("wood_tainted") {
        name = "Tainted Wood"

        appearance {
            color       = Rgba(90, 23, 231, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 64L
            speed      = 1.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9406
            hashId              = 1537
            originalMod         = "ForbiddenMagic"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Wenge = material("wenge") {
        appearance {
            color       = Rgba(88, 81, 70, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9365
            hashId              = 1591
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Darkwood = material("darkwood") {
        appearance {
            color       = Rgba(51, 45, 54, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9367
            hashId              = 1594
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Junglewood = material("junglewood") {
        appearance {
            color       = Rgba(177, 128, 92, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9303
            hashId              = 1523
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Redwood = material("redwood") {
        appearance {
            color       = Rgba(163, 115, 70, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9340
            hashId              = 1567
            originalMod         = "ExtrabiomesXL"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Elderwood = material("elderwood") {
        appearance {
            color       = Rgba(189, 141, 115, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9382
            hashId              = 1609
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SacredOak = material("sacred_oak") {
        name = "Sacred Oak"

        appearance {
            color       = Rgba(159, 132, 77, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 48L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9373
            hashId              = 1600
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Pine = material("pine") {
        appearance {
            color       = Rgba(187, 151, 77, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9335
            hashId              = 1593
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Mangrove = material("mangrove") {
        appearance {
            color       = Rgba(236, 228, 217, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9372
            hashId              = 1599
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Applewood = material("applewood") {
        appearance {
            color       = Rgba(97, 49, 36, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9375
            hashId              = 1602
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Teak = material("teak") {
        appearance {
            color       = Rgba(123, 115, 95, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9363
            hashId              = 1589
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodScorched = material("wood_scorched") {
        name = "Scorched Wood"

        appearance {
            color       = Rgba(44, 44, 44, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 8L
            speed      = 1.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9404
            hashId              = 1534
            originalMod         = "erebus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Goldwood = material("goldwood") {
        appearance {
            color       = Rgba(210, 187, 151, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9369
            hashId              = 1596
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ashwood = material("ashwood") {
        appearance {
            color       = Rgba(244, 190, 90, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9376
            hashId              = 1603
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cinnamonwood = material("cinnamonwood") {
        name = "Cinnawood"

        appearance {
            color       = Rgba(65, 192, 192, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 1.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9317
            hashId              = 1542
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PVC = material("pvc") {
        appearance {
            color       = Rgba(250, 250, 50, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.7557265867
            meltingPoint = 423L
            boilingPoint = 846L
            plasmaPoint  = 84600L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 256L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "plastic" amount 648648000L
        }

        composition {
            component("carbon", 216216000L)
            component("hydrogen", 432432000L)
        }

        meta {
            numericId           = 8197
            hashId              = 869
            originalMod         = "hbm"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Motus - 2")
            reRegisteredTo("any_plastic")
            reRegisteredTo("any_hard_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.BOUNCY,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Hellbark = material("hellbark") {
        appearance {
            color       = Rgba(200, 150, 100, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9370
            hashId              = 1597
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val JapaneseMaple = material("japanese_maple") {
        name = "Japanese Maple"

        appearance {
            color       = Rgba(152, 76, 86, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9338
            hashId              = 1565
            originalMod         = "ExtrabiomesXL"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Witchwood = material("witchwood") {
        appearance {
            color       = Rgba(118, 112, 142, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 48L
            speed      = 3.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9321
            hashId              = 1547
            originalMod         = "arsmagica2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Jacaranda = material("jacaranda") {
        appearance {
            color       = Rgba(201, 171, 162, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9371
            hashId              = 1598
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Willow = material("willow") {
        appearance {
            color       = Rgba(37, 150, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9314
            hashId              = 1539
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Coconutwood = material("coconutwood") {
        name = "Coconut"

        appearance {
            color       = Rgba(255, 170, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9318
            hashId              = 1543
            originalMod         = "tropicraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Olivewood = material("olivewood") {
        appearance {
            color       = Rgba(174, 169, 129, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9395
            hashId              = 1622
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sweetgum = material("sweetgum") {
        appearance {
            color       = Rgba(215, 140, 74, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9400
            hashId              = 1627
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Padauk = material("padauk") {
        appearance {
            color       = Rgba(179, 99, 59, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9357
            hashId              = 1583
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("paduak")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Crimsonwood = material("crimsonwood") {
        appearance {
            color       = Rgba(180, 90, 106, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9306
            hashId              = 1526
            originalMod         = "netherlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Etherealwood = material("etherealwood") {
        appearance {
            color       = Rgba(76, 150, 115, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9368
            hashId              = 1595
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Palm = material("palm") {
        appearance {
            color       = Rgba(201, 124, 69, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9358
            hashId              = 1561
            originalMod         = "tropicraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Foxfirewood = material("foxfirewood") {
        name = "Foxfire"

        appearance {
            color       = Rgba(51, 51, 101, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9408
            hashId              = 1528
            originalMod         = "netherlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Magicwood = material("magicwood") {
        appearance {
            color       = Rgba(90, 105, 180, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9374
            hashId              = 1601
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Whitebeam = material("whitebeam") {
        appearance {
            color       = Rgba(192, 183, 174, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9402
            hashId              = 1629
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Gingko = material("gingko") {
        appearance {
            color       = Rgba(243, 226, 173, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9386
            hashId              = 1613
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val DarkOak = material("dark_oak") {
        name = "Dark Oak"

        appearance {
            color       = Rgba(70, 45, 21, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9305
            hashId              = 1525
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Logwood = material("logwood") {
        appearance {
            color       = Rgba(166, 44, 34, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9393
            hashId              = 1620
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Figwood = material("figwood") {
        appearance {
            color       = Rgba(202, 126, 27, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9385
            hashId              = 1612
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PinkIvory = material("pink_ivory") {
        name = "Pink Ivory"

        appearance {
            color       = Rgba(234, 125, 148, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9397
            hashId              = 1624
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Butternutwood = material("butternutwood") {
        appearance {
            color       = Rgba(237, 163, 112, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9380
            hashId              = 1607
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Balsa = material("balsa") {
        appearance {
            color       = Rgba(165, 158, 151, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9342
            hashId              = 1569
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Boxwood = material("boxwood") {
        appearance {
            color       = Rgba(253, 237, 192, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9378
            hashId              = 1605
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Kapok = material("kapok") {
        appearance {
            color       = Rgba(116, 108, 52, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9352
            hashId              = 1579
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Papayawood = material("papayawood") {
        appearance {
            color       = Rgba(218, 200, 109, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9359
            hashId              = 1585
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodRotten = material("wood_rotten") {
        name = "Rotten Wood"

        appearance {
            color       = Rgba(22, 44, 15, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 8L
            speed      = 1.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9310
            hashId              = 1531
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Skyroot = material("skyroot") {
        appearance {
            color       = Rgba(50, 80, 80, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 350L
            boilingPoint = 450L
            plasmaPoint  = 45000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 64L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8291
            hashId              = 809
            originalMod         = "aether"
            furnaceBurnTime     = 100L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Volatus - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Thorntree = material("thorntree") {
        appearance {
            color       = Rgba(180, 144, 90, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9329
            hashId              = 1555
            originalMod         = "enhancedbiomes"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Pearwood = material("pearwood") {
        appearance {
            color       = Rgba(180, 127, 97, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9396
            hashId              = 1623
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bakelite = material("bakelite") {
        appearance {
            color       = Rgba(201, 57, 64, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.7557265867
            meltingPoint = 423L
            boilingPoint = 846L
            plasmaPoint  = 84600L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 256L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "plastic" amount 648648000L
        }

        composition {
            component("carbon", 216216000L)
            component("hydrogen", 432432000L)
        }

        meta {
            numericId           = 8198
            hashId              = 870
            originalMod         = "hbm"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Motus - 2")
            reRegisteredTo("any_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.BOUNCY,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Dreamwood = material("dreamwood") {
        appearance {
            color       = Rgba(200, 240, 240, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 350L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8290
            hashId              = 812
            originalMod         = "Botania"
            furnaceBurnTime     = 400L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Spiritus - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Mahoe = material("mahoe") {
        appearance {
            color       = Rgba(121, 147, 166, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9355
            hashId              = 1582
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Zebrawood = material("zebrawood") {
        appearance {
            color       = Rgba(172, 139, 86, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9366
            hashId              = 1592
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Greatwood = material("greatwood") {
        appearance {
            color       = Rgba(60, 30, 25, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 64L
            speed      = 6.0f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8296
            hashId              = 814
            originalMod         = "Thaumcraft"
            furnaceBurnTime     = 400L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bark = material("bark") {
        appearance {
            color       = Rgba(80, 40, 0, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8275
            hashId              = 802
            originalMod         = "BinnieCore"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Yew = material("yew") {
        appearance {
            color       = Rgba(226, 160, 114, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9403
            hashId              = 1630
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Wood = material("wood") {
        appearance {
            color       = Rgba(100, 50, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            reversingTarget        = ref("any_wood")
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8221
            hashId              = 803
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodFrozen = material("wood_frozen") {
        name = "Frozen Wood"

        appearance {
            color       = Rgba(84, 125, 125, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 8L
            speed      = 1.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9312
            hashId              = 1533
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Chestnutwood = material("chestnutwood") {
        appearance {
            color       = Rgba(179, 162, 85, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9345
            hashId              = 1572
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Plumwood = material("plumwood") {
        appearance {
            color       = Rgba(171, 99, 123, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9360
            hashId              = 1586
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Hemlock = material("hemlock") {
        appearance {
            color       = Rgba(196, 174, 96, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9387
            hashId              = 1614
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Rubber = material("rubber") {
        appearance {
            color       = Rgba(20, 20, 20, 255)
            iconSet     = IconSet.RUBBER
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 5L
            density      = 0.8719783877
            meltingPoint = 410L
            boilingPoint = 820L
            plasmaPoint  = 82000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 256L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        composition {
            component("carbon", 249480000L)
            component("hydrogen", 399168000L)
        }

        meta {
            numericId           = 8217
            hashId              = 864
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Motus - 2")
            reRegisteredTo("any_rubber")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.BOUNCY,
            MaterialTag.Properties.STRETCHY,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Acacia = material("acacia") {
        appearance {
            color       = Rgba(186, 104, 59, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9304
            hashId              = 1524
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Syzgium = material("syzgium") {
        appearance {
            color       = Rgba(221, 184, 183, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9401
            hashId              = 1628
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Towerwood = material("towerwood") {
        appearance {
            color       = Rgba(166, 101, 58, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 64L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9320
            hashId              = 1546
            originalMod         = "TwilightForest"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sycamore = material("sycamore") {
        appearance {
            color       = Rgba(214, 155, 69, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9326
            hashId              = 1552
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ogrewood = material("ogrewood") {
        appearance {
            color       = Rgba(180, 90, 106, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 48L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9322
            hashId              = 1548
            originalMod         = "MoCreatures"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Hornbeam = material("hornbeam") {
        appearance {
            color       = Rgba(195, 147, 87, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9390
            hashId              = 1617
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Aspen = material("aspen") {
        appearance {
            color       = Rgba(68, 65, 50, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9324
            hashId              = 1550
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Rainbowood = material("rainbowood") {
        appearance {
            color       = Rgba(200, 64, 245, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 64L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9319
            hashId              = 1544
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RainbowEucalyptus = material("rainbow_eucalyptus") {
        name = "Rainbow Eucalyptus"

        appearance {
            color       = Rgba(116, 141, 198, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9339
            hashId              = 1566
            originalMod         = "ExtrabiomesXL"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Purpleheart = material("purpleheart") {
        appearance {
            color       = Rgba(91, 22, 45, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9398
            hashId              = 1625
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Silverwood = material("silverwood") {
        appearance {
            color       = Rgba(234, 222, 210, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 450L
            boilingPoint = 650L
            plasmaPoint  = 65000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 0L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 8.0f
        }

        processing {
            burningTarget         = "ashes" amount 0L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8297
            hashId              = 815
            originalMod         = "Thaumcraft"
            furnaceBurnTime     = 800L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Praecantio - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodDead = material("wood_dead") {
        name = "Dead Wood"

        appearance {
            color       = Rgba(116, 108, 63, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 8L
            speed      = 1.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9309
            hashId              = 1530
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Shimmerwood = material("shimmerwood") {
        appearance {
            color       = Rgba(234, 234, 234, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 350L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8414
            hashId              = 813
            originalMod         = "Botania"
            furnaceBurnTime     = 400L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Lux - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_magical_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Brazilwood = material("brazilwood") {
        appearance {
            color       = Rgba(112, 55, 84, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9379
            hashId              = 1606
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cherrywood = material("cherrywood") {
        appearance {
            color       = Rgba(173, 124, 50, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9344
            hashId              = 1571
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bamboo = material("bamboo") {
        appearance {
            color       = Rgba(100, 200, 100, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 350L
            boilingPoint = 450L
            plasmaPoint  = 45000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8418
            hashId              = 808
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Walnutwood = material("walnutwood") {
        appearance {
            color       = Rgba(98, 78, 64, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9364
            hashId              = 1590
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Spruce = material("spruce") {
        appearance {
            color       = Rgba(102, 79, 47, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9302
            hashId              = 1522
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Wyvernwood = material("wyvernwood") {
        appearance {
            color       = Rgba(77, 159, 158, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 48L
            speed      = 4.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9323
            hashId              = 1549
            originalMod         = "MoCreatures"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SilverPine = material("silver_pine") {
        name = "Silver Pine"

        appearance {
            color       = Rgba(32, 7, 70, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9330
            hashId              = 1556
            originalMod         = "enhancedbiomes"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Teflon = material("teflon") {
        appearance {
            color       = Rgba(80, 80, 80, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.7557265867
            meltingPoint = 423L
            boilingPoint = 846L
            plasmaPoint  = 84600L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 256L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "plastic" amount 648648000L
        }

        composition {
            component("carbon", 216216000L)
            component("hydrogen", 432432000L)
        }

        meta {
            numericId           = 8196
            hashId              = 866
            originalMod         = "hbm"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Motus - 2")
            reRegisteredTo("any_plastic")
            reRegisteredTo("polymer")
            reRegisteredTo("ptfe")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.BOUNCY,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlueSpruce = material("blue_spruce") {
        name = "Blue Spruce"

        appearance {
            color       = Rgba(213, 213, 217, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9409
            hashId              = 1545
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodMossy = material("wood_mossy") {
        name = "Mossy Wood"

        appearance {
            color       = Rgba(29, 127, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 8L
            speed      = 1.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9311
            hashId              = 1532
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Citruswood = material("citruswood") {
        appearance {
            color       = Rgba(152, 163, 28, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9346
            hashId              = 1573
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Hazel = material("hazel") {
        appearance {
            color       = Rgba(228, 175, 175, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9316
            hashId              = 1541
            originalMod         = "BinnieCore"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Larch = material("larch") {
        appearance {
            color       = Rgba(215, 151, 133, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9353
            hashId              = 1580
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WhiteElm = material("white_elm") {
        name = "White Elm"

        appearance {
            color       = Rgba(162, 167, 103, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9328
            hashId              = 1554
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodBleached = material("wood_bleached") {
        name = "Bleached Wood"

        appearance {
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9407
            hashId              = 1536
            originalMod         = "erebus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HardPlastic = material("hard_plastic") {
        name = "Hard Plastic"

        appearance {
            color       = Rgba(180, 180, 180, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.7557265867
            meltingPoint = 423L
            boilingPoint = 846L
            plasmaPoint  = 84600L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 256L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "plastic" amount 648648000L
        }

        composition {
            component("carbon", 216216000L)
            component("hydrogen", 432432000L)
        }

        meta {
            numericId           = 8199
            hashId              = 871
            originalMod         = "hbm"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Motus - 2")
            reRegisteredTo("any_plastic")
            reRegisteredTo("any_hard_plastic")
            reRegisteredTo("polycarbonate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.BOUNCY,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Maclura = material("maclura") {
        appearance {
            color       = Rgba(242, 168, 29, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9394
            hashId              = 1621
            originalMod         = "ExtraTrees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlueMahoe = material("blue_mahoe") {
        name = "Blue Mahoe"

        appearance {
            color       = Rgba(15, 103, 254, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9315
            hashId              = 1540
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodCompressed = material("wood_compressed") {
        name = "Compressed Wood"

        appearance {
            color       = Rgba(94, 60, 25, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 8L
            speed      = 1.5f
        }

        processing {
            pulverTarget          = "wood" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9308
            hashId              = 1529
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Warpedwood = material("warpedwood") {
        name = "Warped Wood"

        appearance {
            color       = Rgba(42, 141, 133, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.5f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9307
            hashId              = 1527
            originalMod         = "netherlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sakura = material("sakura") {
        appearance {
            color       = Rgba(250, 161, 122, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9341
            hashId              = 1568
            originalMod         = "ExtrabiomesXL"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Maple = material("maple") {
        appearance {
            color       = Rgba(151, 26, 26, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9313
            hashId              = 1538
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ipe = material("ipe") {
        appearance {
            color       = Rgba(101, 58, 39, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 2.0f
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 9351
            hashId              = 1578
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_default_wood")
            reRegisteredTo("any_normal_wood")
            reRegisteredTo("any_untreated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.APPROXIMATE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }
}
