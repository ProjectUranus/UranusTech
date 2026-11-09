package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: CompoundMaterials
@Suppress("unused") object CompoundMaterials {
    fun init() = Unit

    val Water = material("water") {
        appearance {
            color       = Rgba(100, 100, 255, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 2
            mass         = 6L
            meltingPoint = 273L
            boilingPoint = 373L
            plasmaPoint  = 37300L
        }

        fluids {
            solidifyingTarget = "ice" amount 648648000L
        }

        composition {
            formula = "H₂O"
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9800
            hashId              = 568
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val DuraniumHexaastatide = material("duranium_hexaastatide") {
        name = "Duranium Hexaastatide"

        appearance {
            color       = Rgba(25, 145, 175, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 93
            electrons    = 93
            neutrons     = 133
            mass         = 227L
            density      = 8.857142857
            meltingPoint = 664L
            boilingPoint = 878L
            plasmaPoint  = 87871L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("diduranium_trioxide", "astatine")
        }

        composition {
            formula = "DnAt₆"
            component("duranium_elemental", 92664000L)
            component("astatine", 555984000L)
        }

        meta {
            numericId           = 9203
            hashId              = 1513
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("astatine", "duranium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val AquaRegia = material("aqua_regia") {
        name = "Aqua Regia"

        appearance {
            color       = Rgba(64, 255, 64, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 0.5779396554
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "(HNO₃)(HCl)₄"
            component("nitric_acid", 249480000L)
            component("hydrochloric_acid", 399168000L)
        }

        meta {
            numericId           = 9827
            hashId              = 741
            originalMod         = "factorization"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val TantalumPentoxide = material("tantalum_pentoxide") {
        name = "Tantalum Pentoxide"

        appearance {
            color       = Rgba(64, 50, 10, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 36
            mass         = 62L
            density      = 4.759306429
            meltingPoint = 978L
            boilingPoint = 1701L
            plasmaPoint  = 170171L
        }

        composition {
            formula = "Ta₂O₅"
            component("tantalum", 185328000L)
            component("oxygen", 463320000L)
        }

        meta {
            numericId           = 8462
            hashId              = 616
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tantalum")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val OnyxBlack = material("onyx_black") {
        name = "Black Onyx"

        appearance {
            color       = Rgba(50, 50, 50, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8416
            hashId              = 1002
            originalMod         = "voltzengine"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Lucrum - 2")
            reRegisteredTo("onyx")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Zircon = material("zircon") {
        appearance {
            color       = Rgba(99, 24, 29, 255)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 16
            mass         = 30L
            density      = 1.473552667
            meltingPoint = 1365L
            boilingPoint = 2420L
            plasmaPoint  = 242033L
        }

        fluids {
            smeltingTarget    = "zirconium" amount 72072000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
            byProduct("rutile", "hafnium", "uraninite")
        }

        composition {
            formula = "Zr(SiO₂)O₂"
            component("zirconium", 108108000L)
            component("silicon_dioxide", 324324000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 8419
            hashId              = 1038
            originalMod         = "tropicraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val PetroleumCoke = material("petroleum_coke") {
        name = "Petroleum Coke"

        appearance {
            color       = Rgba(150, 150, 180, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 0.929
            meltingPoint = 1700L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            burningTarget         = "dark_ashes" amount 72072000L
        }

        composition {
            formula = "C₂S"
            component("carbon", 1297296000L)
            component("sulfur", 648648000L)
        }

        meta {
            numericId           = 8390
            hashId              = 1053
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 6400L
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 3")
            aspect("Ignis - 1")
            reRegisteredTo("pet_coke")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Vermiculite = material("vermiculite") {
        appearance {
            color       = Rgba(200, 180, 15, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 17L
            density      = 1.429553481
            meltingPoint = 1436L
            boilingPoint = 2180L
            plasmaPoint  = 218097L
        }

        processing {
            byProduct("mica", "asbestos", "biotite", "diatomite")
        }

        composition {
            formula = "(Al₂O₃)₂Fe₃(SiO₂)₄(H₂O)₄H₂"
            component("alumina", 166320000L)
            component("iron", 49896000L)
            component("silicon_dioxide", 199584000L)
            component("water", 199584000L)
            component("hydrogen", 33264000L)
        }

        meta {
            numericId           = 9152
            hashId              = 1502
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("aluminium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Niter = material("niter") {
        appearance {
            color       = Rgba(255, 200, 200, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.18440752
            meltingPoint = 607L
            boilingPoint = 1214L
            plasmaPoint  = 121400L
        }

        processing {
            byProduct("potassium_nitrate", "sodium_nitrate")
        }

        composition {
            formula = "(KNO₃)(NaNO₃)"
            component("potassium_nitrate", 324324000L)
            component("sodium_nitrate", 324324000L)
        }

        meta {
            numericId           = 8206
            hashId              = 854
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("nitre")
            sourceOf("sodium", "potassium_nitrate", "sodium_nitrate", "potassium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PotassiumHeptafluorotantalate = material("potassium_heptafluorotantalate") {
        name = "Potassium Heptafluorotantalate"

        appearance {
            color       = Rgba(164, 200, 225, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 17
            electrons    = 17
            neutrons     = 21
            mass         = 38L
            density      = 1.8389872
            meltingPoint = 433L
            boilingPoint = 839L
            plasmaPoint  = 83900L
        }

        composition {
            formula = "K₂TaF₇"
            component("potassium", 129729600L)
            component("tantalum", 64864800L)
            component("fluorine", 454053600L)
        }

        meta {
            numericId           = 8038
            hashId              = 714
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Uranium238Tetrafluoride = material("uranium238_tetrafluoride") {
        name = "Uranium-238 Tetrafluoride"

        appearance {
            color       = Rgba(86, 118, 105, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 36
            mass         = 62L
            density      = 3.7913568
            meltingPoint = 1309L
            boilingPoint = 1690L
            plasmaPoint  = 169000L
        }

        composition {
            formula = "U-238F₄"
            component("uranium", 129729600L)
            component("fluorine", 518918400L)
        }

        meta {
            numericId           = 9009
            hashId              = 737
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
            aspect("Perditio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val BlueVitriol = material("blue_vitriol") {
        name = "Blue Vitriol"

        appearance {
            color       = Rgba(66, 66, 222, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 26L
            density      = 1.838786
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "CuSO₄"
            component("copper", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8404
            hashId              = 721
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("roman_vitriol")
            reRegisteredTo("cyprus_vitriol")
            reRegisteredTo("solution_blue_vitriol")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Nikolite = material("nikolite") {
        appearance {
            color       = Rgba(60, 180, 200, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 16
            electrons    = 16
            neutrons     = 18
            mass         = 35L
            density      = 3.195919888
            meltingPoint = 1500L
            plasmaPoint  = 300000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            oreMultiplier           = 4
            byProduct("copper", "rare_earth", "azurite", "arsenic")
        }

        composition {
            formula = "((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₅,₁₁Cu₃(SiO₂)Ar"
            component("sodalite", 324324000L)
            component("copper", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("argon", 64864800L)
        }

        meta {
            numericId           = 8340
            hashId              = 1062
            originalMod         = "Redpower"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Electrum - 2")
            reRegisteredTo("electrotine")
            reRegisteredTo("teslatite")
            alloyRef("blue_alloy")
            alloyRef("nikoline_alloy")
            alloyRef("electrotine_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val PinkFluorite = material("pink_fluorite") {
        name = "Pink Fluorite"

        appearance {
            color       = Rgba(226, 117, 148, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "white_fluorite", "red_fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8437
            hashId              = 650
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Diatomite = material("diatomite") {
        appearance {
            color       = Rgba(225, 225, 225, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 1.027039323
            meltingPoint = 1944L
            boilingPoint = 3142L
            plasmaPoint  = 314240L
        }

        processing {
            byProduct("mica", "opal", "biotite", "perlite", "sapphire")
        }

        composition {
            formula = "SiO₂₈(Fe₂O₃)((Al₂O₃))"
            component("flint", 518918400L)
            component("hematite", 64864800L)
            component("sapphire", 64864800L)
        }

        meta {
            numericId           = 9001
            hashId              = 1497
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val DiamondIndustrial = material("diamond_industrial") {
        name = "Industrial Diamond"

        appearance {
            color       = Rgba(255, 255, 210, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1440L
            speed      = 9.0f
        }

        processing {
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8423
            hashId              = 934
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Fabrico - 2")
            reRegisteredTo("any_diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Redstone = material("redstone") {
        appearance {
            color       = Rgba(200, 0, 0, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 48
            mass         = 84L
            density      = 6.348333383
            meltingPoint = 500L
            boilingPoint = 1500L
            plasmaPoint  = 150000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            oreMultiplier           = 4
            byProduct("cinnabar", "rare_earth", "glowstone")
        }

        composition {
            formula = "(FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr)"
            component("pyrite", 324324000L)
            component("mercury", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("ruby", 64864800L)
        }

        meta {
            numericId           = 8333
            hashId              = 1061
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 1")
            aspect("Potentia - 2")
            alloyRef("red_alloy")
            alloyRef("gold_inductive")
            alloyRef("redstone_alloy")
            alloyRef("electrum_flux")
            alloyRef("conductive_iron")
            alloyRef("energetic_silver")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.PULVERIZING_CINNABAR,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val SodiumPyrosulfate = material("sodium_pyrosulfate") {
        name = "Sodium Pyrosulfate"

        appearance {
            color       = Rgba(240, 240, 255, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.553273
            meltingPoint = 674L
            boilingPoint = 1348L
            plasmaPoint  = 134800L
        }

        composition {
            formula = "Na₂S₂O₇"
            component("sodium", 117936000L)
            component("sulfur", 117936000L)
            component("oxygen", 412776000L)
        }

        meta {
            numericId           = 8231
            hashId              = 681
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sodium_pyrosulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val AluminiumHydroxide = material("aluminium_hydroxide") {
        name = "Aluminium Hydroxide"

        appearance {
            color       = Rgba(190, 190, 200, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 5
            electrons    = 5
            neutrons     = 5
            mass         = 11L
            density      = 0.38607952
            meltingPoint = 573L
            boilingPoint = 1146L
            plasmaPoint  = 114600L
        }

        fluids {
            smeltingTarget    = "alumina" amount 231660000L
        }

        processing {
            byProduct("bauxite", "ilmenite", "hematite", "alumina")
        }

        composition {
            formula = "AlO₃H₃"
            component("aluminium", 92664000L)
            component("oxygen", 277992000L)
            component("hydrogen", 277992000L)
        }

        meta {
            numericId           = 8014
            hashId              = 624
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("gibbsite")
            sourceOf("aluminium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val YellowFluorite = material("yellow_fluorite") {
        name = "Yellow Fluorite"

        appearance {
            color       = Rgba(206, 182, 80, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "green_fluorite", "orange_fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8442
            hashId              = 655
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Rutile = material("rutile") {
        appearance {
            color       = Rgba(110, 80, 120, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 38
            electrons    = 38
            neutrons     = 42
            mass         = 80L
            density      = 4.542858
            meltingPoint = 2041L
            boilingPoint = 3560L
            plasmaPoint  = 356000L
        }

        tool {
            types      = 0
            quality    = 2
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("hematite", "zircon")
        }

        composition {
            formula = "TiO₂"
            component("titanium", 648648000L)
            component("oxygen", 1297296000L)
        }

        meta {
            numericId           = 9192
            hashId              = 626
            originalMod         = "Mariculture"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("titanium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Sphalerite = material("sphalerite") {
        appearance {
            color       = Rgba(222, 222, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 23
            electrons    = 23
            neutrons     = 25
            mass         = 48L
            density      = 4.6005
            meltingPoint = 540L
            boilingPoint = 948L
            plasmaPoint  = 94850L
        }

        fluids {
            smeltingTarget    = "zinc" amount 216216000L
        }

        processing {
            byProduct("cadmium", "gallium", "zinc", "kesterite", "selenium", "indium")
        }

        composition {
            formula = "ZnS"
            component("zinc", 324324000L)
            component("sulfur", 324324000L)
        }

        meta {
            numericId           = 9130
            hashId              = 1443
            originalMod         = "HardcoreEnderExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("zinc")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeteoricIron = material("meteoric_iron") {
        name = "Meteoric Iron"

        appearance {
            color       = Rgba(150, 140, 120, 255)
            iconSet     = IconSet.SPACE
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2011L
            boilingPoint = 3334L
            plasmaPoint  = 333400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 896L
            speed      = 7.0f
        }

        processing {
            oreMultiplier           = 2
            byProduct("nickel", "iridium", "platinum")
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8649
            hashId              = 1227
            originalMod         = "GalacticraftCore"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            reRegisteredTo("any_iron")
            reRegisteredTo("any_iron_or_steel")
            alloyRef("meteoric_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val CalciumSulfate = material("calcium_sulfate") {
        name = "Calcium Sulfate"

        appearance {
            color       = Rgba(240, 220, 210, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 22L
            density      = 0.6021193333
            meltingPoint = 1730L
            plasmaPoint  = 300000L
        }

        composition {
            formula = "CaSO₄"
            component("calcium", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8274
            hashId              = 640
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("calcium_sulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val PinkDiamond = material("pink_diamond") {
        name = "Pink Diamond"

        appearance {
            color       = Rgba(240, 160, 160, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1600L
            speed      = 12.0f
        }

        processing {
            byProduct("graphite", "diamond")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8424
            hashId              = 933
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Auram - 4")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val CatsEye = material("cats_eye") {
        name = "Cat's Eye"

        appearance {
            color       = Rgba(77, 116, 81, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("hematite", "tiger_eye", "dragon_eye", "hawks_eye", "black_eye", "tiger_iron")
            generifyingTarget      = "tiger_eye" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8431
            hashId              = 978
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Terra - 1")
            reRegisteredTo("green_tiger_eye")
            reRegisteredTo("any_tiger_eye")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Tungstate = material("tungstate") {
        appearance {
            color       = Rgba(55, 50, 35, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 21
            mass         = 36L
            density      = 2.903388
            meltingPoint = 1134L
            boilingPoint = 1584L
            plasmaPoint  = 158428L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("pyrolusite", "silver", "lithium_chloride")
        }

        composition {
            formula = "Li₂(WO₃)O"
            component("lithium", 185328000L)
            component("tungsten_trioxide", 370656000L)
            component("oxygen", 92664000L)
        }

        meta {
            numericId           = 9133
            hashId              = 1463
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium", "tungsten")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val HeavyWater = material("heavy_water") {
        name = "Heavy Water"

        appearance {
            color       = Rgba(255, 255, 100, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 6L
            density      = 1.1056
            meltingPoint = 277L
            boilingPoint = 375L
            plasmaPoint  = 37500L
        }

        composition {
            formula = "D₂O"
            component("deuterium", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9812
            hashId              = 570
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            aspect("Tempestas - 2")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Huebnerite = material("huebnerite") {
        appearance {
            color       = Rgba(55, 50, 35, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 28
            mass         = 49L
            density      = 4.449286
            meltingPoint = 1426L
            boilingPoint = 1717L
            plasmaPoint  = 171733L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("wolframite", "molybdenite", "green_fluorite", "arsenopyrite", "cassiterite", "topaz")
        }

        composition {
            formula = "Mn(WO₃)O"
            component("manganese", 108108000L)
            component("tungsten_trioxide", 432432000L)
            component("oxygen", 108108000L)
        }

        meta {
            numericId           = 9195
            hashId              = 1461
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("gyubnera")
            sourceOf("manganese", "tungsten")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val LithiumOxide = material("lithium_oxide") {
        name = "Lithium Oxide"

        appearance {
            color       = Rgba(222, 222, 234, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 5
            mass         = 10L
            density      = 0.3564763333
            meltingPoint = 320L
            boilingPoint = 1070L
            plasmaPoint  = 107000L
        }

        composition {
            formula = "Li₂O"
            component("lithium", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 8004
            hashId              = 661
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium")
            alloyRef("ferrite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Uvarovite = material("uvarovite") {
        appearance {
            color       = Rgba(180, 255, 180, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 1.2962974
            meltingPoint = 1295L
            boilingPoint = 2033L
            plasmaPoint  = 203395L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 7.0f
        }

        processing {
            byProduct("almandine", "grossular", "pyrope", "spessartine", "andradite")
        }

        composition {
            formula = "Ca₃Cr₂(SiO₂)₃O₆"
            component("calcium", 97297200L)
            component("chromium", 64864800L)
            component("silicon_dioxide", 291891600L)
            component("oxygen", 194594400L)
        }

        meta {
            numericId           = 9135
            hashId              = 967
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 1")
            aspect("Machina - 1")
            reRegisteredTo("any_garnet")
            reRegisteredTo("garnet_green")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Enori = material("enori") {
        appearance {
            color       = Rgba(255, 255, 255, 127)
            iconSet     = IconSet.NETHERSTAR
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 1811L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        fluids {
            solidifyingTarget = "iron" amount 648648000L
            smeltingTarget    = "iron" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 280L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "iron" amount 648648000L
            smashingTarget        = "iron" amount 648648000L
            cuttingTarget         = "iron" amount 648648000L
            workingTarget         = "iron" amount 648648000L
            forgingTarget         = "iron" amount 648648000L
            burningTarget         = "iron" amount 0L
            bendingTarget         = "iron" amount 648648000L
            compressingTarget     = "iron" amount 648648000L
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8380
            hashId              = 1093
            originalMod         = "ActuallyAdditions"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Metallum - 2")
            reRegisteredTo("any_iron")
            reRegisteredTo("any_iron_or_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Vinteum = material("vinteum") {
        appearance {
            color       = Rgba(80, 80, 255, 255)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = -1L
            density      = 0.0
            meltingPoint = 1L
            boilingPoint = 2L
            plasmaPoint  = 3L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 128L
            speed      = 10.0f
        }

        composition {
            formula = "Ma"
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8316
            hashId              = 1015
            originalMod         = "arsmagica2"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Praecantio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SodiumSulfate = material("sodium_sulfate") {
        name = "Sodium Sulfate"

        appearance {
            color       = Rgba(190, 190, 140, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.5735308571
            meltingPoint = 1157L
            boilingPoint = 1702L
            plasmaPoint  = 170200L
        }

        composition {
            formula = "Na₂SO₄"
            component("sodium", 185328000L)
            component("sulfur", 92664000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8270
            hashId              = 679
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sodium_sulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val BlueDiamond = material("blue_diamond") {
        name = "Blue Diamond"

        appearance {
            color       = Rgba(30, 60, 240, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("graphite", "diamond")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8464
            hashId              = 928
            originalMod         = "ExtraPlanets"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Coal = material("coal") {
        appearance {
            color       = Rgba(70, 70, 70, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 0.929
            meltingPoint = 1700L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 324324000L
        }

        processing {
            byProduct("lignite", "sulfur")
            burningTarget         = "dark_ashes" amount 162162000L
        }

        composition {
            formula = "C"
            component("carbon", 648648000L)
        }

        meta {
            numericId           = 8334
            hashId              = 1045
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 1600L
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
            aspect("Ignis - 2")
            reRegisteredTo("any_coal_carbon")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Pyrolusite = material("pyrolusite") {
        appearance {
            color       = Rgba(50, 50, 70, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 41
            electrons    = 41
            neutrons     = 46
            mass         = 87L
            density      = 7.442858
            meltingPoint = 808L
            boilingPoint = 2334L
            plasmaPoint  = 233400L
        }

        fluids {
            smeltingTarget    = "manganese" amount 486486000L
        }

        processing {
            byProduct("bromargyrite", "hematite", "chromite")
        }

        composition {
            formula = "MnO₂"
            component("manganese", 648648000L)
            component("oxygen", 1297296000L)
        }

        meta {
            numericId           = 9126
            hashId              = 628
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("manganese")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val PotassiumAluminate = material("potassium_aluminate") {
        name = "Potassium Aluminate"

        appearance {
            color       = Rgba(250, 230, 230, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 24L
            density      = 0.8907145
            meltingPoint = 1920L
            boilingPoint = 3840L
            plasmaPoint  = 384000L
        }

        composition {
            formula = "KAlO₂"
            component("potassium", 162162000L)
            component("aluminium", 162162000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 8023
            hashId              = 712
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val PurpleSapphire = material("purple_sapphire") {
        name = "Purple Sapphire"

        appearance {
            color       = Rgba(220, 50, 255, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 25L
            density      = 1.918381167
            meltingPoint = 2318L
            boilingPoint = 3321L
            plasmaPoint  = 332166L
        }

        fluids {
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "ruby", "green_sapphire", "blue_sapphire")
            generifyingTarget      = "sapphire" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)V"
            component("alumina", 540540000L)
            component("vanadium", 108108000L)
        }

        meta {
            numericId           = 8383
            hashId              = 951
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Electrum - 1")
            reRegisteredTo("any_sapphire")
            sourceOf("sapphire", "aluminium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Glowstone = material("glowstone") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        processing {
            oreMultiplier           = 4
            byProduct("redstone", "gold", "gloomstone", "yellow_fluorite")
        }

        composition {
            formula = "(Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He"
            component("phosphorite", 324324000L)
            component("gold", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("helium", 64864800L)
        }

        meta {
            numericId           = 8341
            hashId              = 1065
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Sensus - 1")
            reRegisteredTo("any_glowstone")
            alloyRef("energetic_alloy")
            alloyRef("lumium")
            alloyRef("energetic_silver")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Chalcopyrite = material("chalcopyrite") {
        appearance {
            color       = Rgba(160, 120, 40, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 24
            mass         = 45L
            density      = 5.242
            meltingPoint = 986L
            boilingPoint = 1850L
            plasmaPoint  = 185075L
        }

        fluids {
            smeltingTarget    = "copper" amount 144144000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("pyrite", "cobaltite", "cadmium", "gold", "sperrylite", "stannite", "indium")
        }

        composition {
            formula = "CuFeS₂"
            component("copper", 162162000L)
            component("iron", 162162000L)
            component("sulfur", 324324000L)
        }

        meta {
            numericId           = 9111
            hashId              = 1446
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("iron", "copper")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedVitriol = material("red_vitriol") {
        name = "Red Vitriol"

        appearance {
            color       = Rgba(222, 66, 66, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 25L
            density      = 1.822119333
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "CoSO₄"
            component("cobalt", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8406
            hashId              = 726
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Pyrope = material("pyrope") {
        appearance {
            color       = Rgba(120, 50, 100, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.8807974
            meltingPoint = 1626L
            boilingPoint = 2479L
            plasmaPoint  = 247945L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 7.0f
        }

        processing {
            byProduct("almandine", "grossular", "spessartine", "andradite", "uvarovite")
        }

        composition {
            formula = "(Al₂O₃)Mg₃(SiO₂)₃O₃"
            component("alumina", 162162000L)
            component("magnesium", 97297200L)
            component("silicon_dioxide", 291891600L)
            component("oxygen", 97297200L)
        }

        meta {
            numericId           = 9127
            hashId              = 961
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 1")
            aspect("Sano - 1")
            reRegisteredTo("garnet_purple")
            reRegisteredTo("any_garnet")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Uraninite = material("uraninite") {
        appearance {
            color       = Rgba(35, 35, 35, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 108
            electrons    = 108
            neutrons     = 162
            mass         = 270L
            density      = 18.952858
            meltingPoint = 504L
            boilingPoint = 1528L
            plasmaPoint  = 152800L
        }

        fluids {
            smeltingTarget    = "uranium" amount 216216000L
        }

        processing {
            byProduct("lead", "radium", "rare_earth", "thorium")
        }

        composition {
            formula = "UO₂"
            component("uranium", 648648000L)
            component("oxygen", 1297296000L)
        }

        meta {
            numericId           = 9134
            hashId              = 1436
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("uranium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val YellowLimonite = material("yellow_limonite") {
        name = "Yellow Limonite"

        appearance {
            color       = Rgba(200, 200, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 22L
            density      = 1.96923697
            meltingPoint = 1523L
            boilingPoint = 3046L
            plasmaPoint  = 304600L
        }

        fluids {
            smeltingTarget    = "hematite" amount 324324000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("nickel", "brown_limonite", "cobaltite")
        }

        composition {
            formula = "FeHO₂"
            component("iron", 162162000L)
            component("hydrogen", 162162000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 9137
            hashId              = 1472
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("bog_iron")
            sourceOf("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Amazonite = material("amazonite") {
        appearance {
            color       = Rgba(71, 241, 170, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 0.8123255385
            meltingPoint = 1853L
            boilingPoint = 2937L
            plasmaPoint  = 293707L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        composition {
            formula = "(Al₂O₃)(SiO₂)₆K₂O"
            component("alumina", 124740000L)
            component("silicon_dioxide", 449064000L)
            component("potassium", 49896000L)
            component("oxygen", 24948000L)
        }

        meta {
            numericId           = 8417
            hashId              = 998
            originalMod         = "voltzengine"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 5")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val VanadiumMagnetite = material("vanadium_magnetite") {
        name = "Vanadium Magnetite"

        appearance {
            color       = Rgba(35, 35, 60, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 15
            mass         = 29L
            density      = 2.5610615
            meltingPoint = 1236L
            boilingPoint = 2368L
            plasmaPoint  = 236885L
            hasMetallum  = true
        }

        processing {
            byProduct("magnetite", "vanadium_pentoxide")
        }

        composition {
            formula = "(Fe₃O₄)(V₂O₅)"
            component("magnetite", 324324000L)
            component("vanadium_pentoxide", 324324000L)
        }

        meta {
            numericId           = 9143
            hashId              = 1474
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            reRegisteredTo("ferrovanadium")
            sourceOf("vanadium", "iron")
            alloyRef("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val Quicklime = material("quicklime") {
        appearance {
            color       = Rgba(240, 230, 210, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 0.7707145
            meltingPoint = 2886L
            boilingPoint = 3120L
            plasmaPoint  = 312000L
        }

        composition {
            formula = "CaO"
            component("calcium", 324324000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 9271
            hashId              = 643
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Propylene = material("propylene") {
        appearance {
            color       = Rgba(90, 60, 140, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        meta {
            numericId           = 9867
            hashId              = 763
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Vanilla = material("vanilla") {
        appearance {
            color       = Rgba(110, 80, 40, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 3
            mass         = 7L
            density      = 0.9547897903
            meltingPoint = 1614L
            boilingPoint = 1833L
            plasmaPoint  = 183315L
        }

        composition {
            formula = "C₈H₈O₃"
            component("carbon", 273114947L)
            component("hydrogen", 273114947L)
            component("oxygen", 102418105L)
        }

        meta {
            numericId           = 9787
            hashId              = 594
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Redstonia = material("redstonia") {
        appearance {
            color       = Rgba(255, 0, 0, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 48
            mass         = 84L
            density      = 6.348333383
            meltingPoint = 500L
            boilingPoint = 1500L
            plasmaPoint  = 150000L
        }

        fluids {
            solidifyingTarget = "redstone" amount 648648000L
            smeltingTarget    = "redstone" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 300L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "redstone" amount 648648000L
            smashingTarget        = "redstone" amount 648648000L
            cuttingTarget         = "redstone" amount 648648000L
            workingTarget         = "redstone" amount 648648000L
            forgingTarget         = "redstone" amount 648648000L
            burningTarget         = "redstone" amount 0L
            bendingTarget         = "redstone" amount 648648000L
            compressingTarget     = "redstone" amount 648648000L
            generifyingTarget      = "redstone" amount 648648000L
        }

        composition {
            formula = "(FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr)"
            component("redstone", 648648000L)
        }

        meta {
            numericId           = 8375
            hashId              = 1088
            originalMod         = "ActuallyAdditions"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Machina - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sapphire = material("sapphire") {
        appearance {
            color       = Rgba(120, 120, 160, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.9000478333
            meltingPoint = 2345L
            boilingPoint = 3250L
            plasmaPoint  = 325000L
        }

        fluids {
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "ruby", "green_sapphire", "blue_sapphire")
        }

        composition {
            formula = "(Al₂O₃)"
            component("alumina", 540540000L)
        }

        meta {
            numericId           = 8304
            hashId              = 946
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 5")
            reRegisteredTo("saphire")
            reRegisteredTo("any_sapphire")
            sourceOf("sapphire", "aluminium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Galena = material("galena") {
        appearance {
            color       = Rgba(100, 60, 100, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 52
            electrons    = 52
            neutrons     = 73
            mass         = 125L
            density      = 8.707875
            meltingPoint = 784L
            boilingPoint = 1850L
            plasmaPoint  = 185062L
        }

        fluids {
            smeltingTarget    = "lead" amount 216216000L
        }

        processing {
            byProduct("sphalerite", "silver", "lead", "selenium", "red_fluorite", "calcite")
        }

        composition {
            formula = "Pb₃Ag₃S₂"
            component("lead", 243243000L)
            component("silver", 243243000L)
            component("sulfur", 162162000L)
        }

        meta {
            numericId           = 9117
            hashId              = 1449
            originalMod         = "factorization"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lead", "silver")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sperrylite = material("sperrylite") {
        appearance {
            color       = Rgba(105, 105, 105, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 48
            electrons    = 48
            neutrons     = 67
            mass         = 115L
            density      = 11.004
            meltingPoint = 1271L
            boilingPoint = 2092L
            plasmaPoint  = 209266L
        }

        fluids {
            smeltingTarget    = "platinum" amount 162162000L
        }

        processing {
            byProduct("antimony", "copper", "hematite", "rhodium", "cooperite")
        }

        composition {
            formula = "PtAs₂"
            component("platinum", 216216000L)
            component("arsenic", 432432000L)
        }

        meta {
            numericId           = 9212
            hashId              = 1491
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("platinum", "arsenic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Chocolate = material("chocolate") {
        appearance {
            color       = Rgba(100, 50, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 23
            electrons    = 23
            neutrons     = 29
            mass         = 52L
            density      = 0.8024632929
            meltingPoint = 313L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "(Cocoa)(C₁₂H₂₂O₁₁)"
            component("cocoa", 324324000L)
            component("sugar", 324324000L)
        }

        meta {
            numericId           = 9783
            hashId              = 905
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 1")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val GreenFluorite = material("green_fluorite") {
        name = "Green Fluorite"

        appearance {
            color       = Rgba(37, 168, 35, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "yellow_fluorite", "blue_fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8439
            hashId              = 652
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val BrownAventurine = material("brown_aventurine") {
        name = "Brown Aventurine"

        appearance {
            color       = Rgba(185, 110, 35, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("green_aventurine", "yellow_aventurine", "black_aventurine", "blue_aventurine", "red_aventurine")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8446
            hashId              = 989
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Potentia - 1")
            reRegisteredTo("any_aventurine")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Lazurite = material("lazurite") {
        appearance {
            color       = Rgba(100, 120, 255, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 13
            mass         = 26L
            density      = 1.115473586
            meltingPoint = 1352L
            boilingPoint = 2218L
            plasmaPoint  = 221871L
        }

        processing {
            oreMultiplier           = 5
            byProduct("sodalite", "lapis")
        }

        composition {
            formula = "(Al₂O₃)₆,₅(SiO₂)₂Ca₈Na₈"
            component("alumina", 138996000L)
            component("silicon_dioxide", 138996000L)
            component("calcium", 185328000L)
            component("sodium", 185328000L)
        }

        meta {
            numericId           = 8330
            hashId              = 1041
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val PotassiumCarbonate = material("potassium_carbonate") {
        name = "Potassium Carbonate"

        appearance {
            color       = Rgba(230, 225, 225, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 23L
            density      = 0.6658811667
            meltingPoint = 1164L
            boilingPoint = 2328L
            plasmaPoint  = 232800L
        }

        composition {
            formula = "K₂(CO₃)"
            component("potassium", 216216000L)
            component("carbon_trioxide", 432432000L)
        }

        meta {
            numericId           = 8020
            hashId              = 711
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Andradite = material("andradite") {
        appearance {
            color       = Rgba(150, 120, 0, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 1.3686974
            meltingPoint = 1258L
            boilingPoint = 2052L
            plasmaPoint  = 205295L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 7.0f
        }

        processing {
            byProduct("almandine", "grossular", "pyrope", "spessartine", "uvarovite")
        }

        composition {
            formula = "Ca₃Fe₂(SiO₂)₃O₆"
            component("calcium", 97297200L)
            component("iron", 64864800L)
            component("silicon_dioxide", 291891600L)
            component("oxygen", 194594400L)
        }

        meta {
            numericId           = 9102
            hashId              = 965
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 1")
            aspect("Tutamen - 1")
            reRegisteredTo("garnet_yellow")
            reRegisteredTo("any_garnet")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val RedJasper = material("red_jasper") {
        name = "Red Jasper"

        appearance {
            color       = Rgba(200, 80, 80, 150)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.142990667
            meltingPoint = 1927L
            boilingPoint = 3191L
            plasmaPoint  = 319133L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("ocean_jasper", "rainforest_jasper", "blue_jasper", "green_jasper", "yellow_jasper")
        }

        composition {
            formula = "(SiO₂)₂,₃Fe"
            component("silicon_dioxide", 432432000L)
            component("iron", 216216000L)
        }

        meta {
            numericId           = 8309
            hashId              = 969
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Metallum - 1")
            reRegisteredTo("any_jasper")
            reRegisteredTo("jasper")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Gravitite = material("gravitite") {
        appearance {
            color       = Rgba(182, 91, 159, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 396
            electrons    = 396
            neutrons     = 1354
            mass         = 1749L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 9.0f
        }

        processing {
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄GtMa"
            component("carbon", 2594592000L)
            component("gravitonium", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8294
            hashId              = 937
            originalMod         = "aether"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Volatus - 4")
            reRegisteredTo("any_diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val FrozenIron = material("frozen_iron") {
        name = "Frozen Iron"

        appearance {
            color       = Rgba(235, 235, 255, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 1811L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "iron" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 6.0f
        }

        processing {
            forgingTarget         = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8758
            hashId              = 1343
            originalMod         = "meteors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Gelum - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Coltan = material("coltan") {
        appearance {
            color       = Rgba(105, 83, 66, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 23
            electrons    = 23
            neutrons     = 30
            mass         = 54L
            density      = 4.084250375
            meltingPoint = 889L
            boilingPoint = 1690L
            plasmaPoint  = 169149L
        }

        processing {
            byProduct("columbite", "tantalite", "pyrolusite", "ilmenite")
        }

        composition {
            formula = "((Ta₂O₅)(MnO₂))((Nb₂O₅)(MnO₂))"
            component("tantalite", 324324000L)
            component("columbite", 324324000L)
        }

        meta {
            numericId           = 9247
            hashId              = 1478
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("manganese", "niobium", "tantalum")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val OceanJasper = material("ocean_jasper") {
        name = "Ocean Jasper"

        appearance {
            color       = Rgba(139, 115, 86, 150)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.142990667
            meltingPoint = 1927L
            boilingPoint = 3191L
            plasmaPoint  = 319133L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("red_jasper", "rainforest_jasper", "blue_jasper", "green_jasper", "yellow_jasper")
            generifyingTarget      = "red_jasper" amount 648648000L
        }

        composition {
            formula = "(SiO₂)₂,₃Fe"
            component("silicon_dioxide", 432432000L)
            component("iron", 216216000L)
        }

        meta {
            numericId           = 8425
            hashId              = 971
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Metallum - 1")
            reRegisteredTo("any_jasper")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val YellowAventurine = material("yellow_aventurine") {
        name = "Yellow Aventurine"

        appearance {
            color       = Rgba(200, 179, 121, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("green_aventurine", "brown_aventurine", "black_aventurine", "blue_aventurine", "red_aventurine")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8447
            hashId              = 990
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Potentia - 1")
            reRegisteredTo("any_aventurine")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Kyanite = material("kyanite") {
        appearance {
            color       = Rgba(110, 110, 250, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.966593125
            meltingPoint = 2210L
            boilingPoint = 3238L
            plasmaPoint  = 323875L
        }

        processing {
            byProduct("quartzite", "lepidolite", "spodumene")
        }

        composition {
            formula = "(Al₂O₃)(SiO₂)"
            component("alumina", 405405000L)
            component("silicon_dioxide", 243243000L)
        }

        meta {
            numericId           = 9166
            hashId              = 1504
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("aluminium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Pentlandite = material("pentlandite") {
        appearance {
            color       = Rgba(165, 150, 5, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 22
            electrons    = 22
            neutrons     = 23
            mass         = 45L
            density      = 5.690823523
            meltingPoint = 1097L
            boilingPoint = 2024L
            plasmaPoint  = 202411L
        }

        fluids {
            smeltingTarget    = "nickel" amount 216216000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("hematite", "sulfur", "cobaltite", "sperrylite", "gypsum")
        }

        composition {
            formula = "Ni₉S₈"
            component("nickel", 343401882L)
            component("sulfur", 305246117L)
        }

        meta {
            numericId           = 9145
            hashId              = 1445
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("nickel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val StannicChloride = material("stannic_chloride") {
        name = "Stannic Chloride"

        appearance {
            color       = Rgba(210, 250, 250, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 23
            electrons    = 23
            neutrons     = 28
            mass         = 51L
            density      = 1.4599712
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "SnCl₄"
            component("tin", 129729600L)
            component("chlorine", 518918400L)
        }

        meta {
            numericId           = 8402
            hashId              = 719
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Stolzite = material("stolzite") {
        appearance {
            color       = Rgba(55, 50, 35, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 30
            electrons    = 30
            neutrons     = 44
            mass         = 75L
            density      = 5.099619333
            meltingPoint = 1273L
            boilingPoint = 1665L
            plasmaPoint  = 166533L
        }

        fluids {
            smeltingTarget    = "tungsten_trioxide" amount 432432000L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tungstate", "lead")
        }

        composition {
            formula = "Pb(WO₃)O"
            component("lead", 108108000L)
            component("tungsten_trioxide", 432432000L)
            component("oxygen", 108108000L)
        }

        meta {
            numericId           = 9193
            hashId              = 1464
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("raspite")
            sourceOf("tungsten", "lead")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Hematite = material("hematite") {
        appearance {
            color       = Rgba(145, 90, 90, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.1504574
            meltingPoint = 1207L
            boilingPoint = 2414L
            plasmaPoint  = 241400L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("ilmenite", "granitic_mineral_sand", "pyrolusite", "clay_red")
        }

        composition {
            formula = "Fe₂O₃"
            component("iron", 259459200L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 9104
            hashId              = 630
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("banded_iron")
            reRegisteredTo("iron_oxide")
            sourceOf("iron")
            alloyRef("iron")
            alloyRef("ferrite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val DragonEye = material("dragon_eye") {
        name = "Dragon Eye"

        appearance {
            color       = Rgba(164, 95, 83, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("hematite", "tiger_eye", "cats_eye", "hawks_eye", "black_eye", "tiger_iron")
            generifyingTarget      = "tiger_eye" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8432
            hashId              = 980
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Terra - 1")
            reRegisteredTo("red_tiger_eye")
            reRegisteredTo("any_tiger_eye")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Morganite = material("morganite") {
        appearance {
            color       = Rgba(255, 200, 200, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            byProduct("alumina", "beryllium", "emerald", "aquamarine", "goshenite", "bixbite", "heliodor", "maxixe")
            generifyingTarget      = "emerald" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("alumina", 111835862L)
            component("beryllium", 67101517L)
            component("silicon_dioxide", 402609103L)
            component("oxygen", 67101517L)
        }

        meta {
            numericId           = 8324
            hashId              = 940
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Tempestas - 2")
            reRegisteredTo("any_emerald")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Dolomite = material("dolomite") {
        appearance {
            color       = Rgba(225, 205, 205, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 18L
            density      = 0.7820574
            meltingPoint = 1117L
            plasmaPoint  = 300000L
        }

        fluids {
            smeltingTarget    = "calcite" amount 324324000L
        }

        composition {
            formula = "(Ca(CO₃))(Mg(CO₃))"
            component("calcite", 324324000L)
            component("magnesium_carbonate", 324324000L)
        }

        meta {
            numericId           = 9163
            hashId              = 793
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_calcite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Glass = material("glass") {
        appearance {
            color       = Rgba(250, 250, 250, 35)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1200L
            boilingPoint = 2400L
            plasmaPoint  = 240000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8001
            hashId              = 609
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            reRegisteredTo("any_silicon_dioxide")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.COOL2CRYSTAL,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
        )

    }

    val YellowJasper = material("yellow_jasper") {
        name = "Yellow Jasper"

        appearance {
            color       = Rgba(156, 128, 39, 150)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.142990667
            meltingPoint = 1927L
            boilingPoint = 3191L
            plasmaPoint  = 319133L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("red_jasper", "ocean_jasper", "rainforest_jasper", "blue_jasper", "green_jasper")
            generifyingTarget      = "red_jasper" amount 648648000L
        }

        composition {
            formula = "(SiO₂)₂,₃Fe"
            component("silicon_dioxide", 432432000L)
            component("iron", 216216000L)
        }

        meta {
            numericId           = 8429
            hashId              = 975
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Metallum - 1")
            reRegisteredTo("any_jasper")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val GrayVitriol = material("gray_vitriol") {
        name = "Gray Vitriol"

        appearance {
            color       = Rgba(111, 111, 111, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 25L
            density      = 1.585452667
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "MnSO₄"
            component("manganese", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8410
            hashId              = 732
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Phosphorus = material("phosphorus") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 15
            mass         = 31L
            density      = 1.07005728
            meltingPoint = 829L
            boilingPoint = 1374L
            plasmaPoint  = 137420L
        }

        processing {
            oreMultiplier           = 3
            byProduct("phosphorite", "apatite", "yellow_fluorite", "phosphate", "red_phosphorus", "white_phosphorus")
        }

        composition {
            formula = "Ca₃(PO₄)₂,₅"
            component("calcium", 389188800L)
            component("phosphate", 259459200L)
        }

        meta {
            numericId           = 8208
            hashId              = 856
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("phosphorous")
            reRegisteredTo("any_phosphorus")
            sourceOf("phosphor")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Eudialyte = material("eudialyte") {
        appearance {
            color       = Rgba(155, 96, 114, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 12
            mass         = 23L
            density      = 0.9999431065
            meltingPoint = 1444L
            boilingPoint = 2454L
            plasmaPoint  = 245425L
        }

        processing {
            oreMultiplier           = 5
            byProduct("zircon", "rare_earth", "hafnium", "lead")
        }

        composition {
            formula = "(Zr(SiO₂)O₂)₃(MnO₂)₃Na₁₅Ca₆Cl₂(SiO₂)₂₅O₁₂"
            component("zircon", 89127206L)
            component("pyrolusite", 14854534L)
            component("sodium", 74272671L)
            component("calcium", 29709068L)
            component("chlorine", 9903022L)
            component("silicon_dioxide", 371363358L)
            component("oxygen", 59418137L)
        }

        meta {
            numericId           = 8421
            hashId              = 1040
            originalMod         = "tropicraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Charcoal = material("charcoal") {
        appearance {
            color       = Rgba(100, 70, 70, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 0.929
            meltingPoint = 1700L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 324324000L
        }

        processing {
            burningTarget         = "ashes" amount 162162000L
        }

        composition {
            formula = "C"
            component("carbon", 648648000L)
        }

        meta {
            numericId           = 8336
            hashId              = 1044
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 1600L
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
            aspect("Ignis - 2")
            reRegisteredTo("any_coal_carbon")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MagentaFluorite = material("magenta_fluorite") {
        name = "Magenta Fluorite"

        appearance {
            color       = Rgba(204, 88, 255, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "pink_fluorite", "blue_fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8444
            hashId              = 657
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val AluminiumFluoride = material("aluminium_fluoride") {
        name = "Aluminium Fluoride"

        appearance {
            color       = Rgba(200, 190, 190, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.675772
            meltingPoint = 1560L
            boilingPoint = 3120L
            plasmaPoint  = 312000L
        }

        composition {
            formula = "AlF₃"
            component("aluminium", 162162000L)
            component("fluorine", 486486000L)
        }

        meta {
            numericId           = 8010
            hashId              = 623
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val RedPhosphorus = material("red_phosphorus") {
        name = "Red Phosphorus"

        appearance {
            color       = Rgba(119, 4, 14, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 15
            mass         = 31L
            density      = 1.07005728
            meltingPoint = 829L
            boilingPoint = 1374L
            plasmaPoint  = 137420L
        }

        processing {
            oreMultiplier           = 3
            byProduct("phosphorite", "apatite", "red_fluorite", "phosphate", "blue_phosphorus", "white_phosphorus")
            generifyingTarget      = "phosphorus" amount 648648000L
        }

        composition {
            formula = "Ca₃(PO₄)₂,₅"
            component("calcium", 389188800L)
            component("phosphate", 259459200L)
        }

        meta {
            numericId           = 8459
            hashId              = 859
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_phosphorus")
            sourceOf("phosphor")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val GreenAventurine = material("green_aventurine") {
        name = "Green Aventurine"

        appearance {
            color       = Rgba(66, 189, 133, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("brown_aventurine", "yellow_aventurine", "black_aventurine", "blue_aventurine", "red_aventurine")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8448
            hashId              = 987
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Potentia - 1")
            reRegisteredTo("any_aventurine")
            reRegisteredTo("aventurine")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val PotassiumFluoride = material("potassium_fluoride") {
        name = "Potassium Fluoride"

        appearance {
            color       = Rgba(200, 64, 225, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 0.431848
            meltingPoint = 1131L
            boilingPoint = 2262L
            plasmaPoint  = 226200L
        }

        composition {
            formula = "KF"
            component("potassium", 324324000L)
            component("fluorine", 324324000L)
        }

        meta {
            numericId           = 8036
            hashId              = 713
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Palygorskite = material("palygorskite") {
        name = "Palygorskite Clay"

        appearance {
            color       = Rgba(114, 157, 179, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 22L
            density      = 1.4148955
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            smeltingTarget    = "ceramic" amount 648648000L
        }

        processing {
            byProduct("kaolinite", "bentonite")
            generifyingTarget      = "clay" amount 648648000L
        }

        composition {
            formula = "Mg(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₉"
            component("magnesium", 36036000L)
            component("clay", 648648000L)
        }

        meta {
            numericId           = 9154
            hashId              = 849
            originalMod         = "PFAAGeologica"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("fullers_earth")
            reRegisteredTo("any_clay")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Lignite = material("lignite") {
        name = "Lignite Coal"

        appearance {
            color       = Rgba(100, 70, 70, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 10
            mass         = 20L
            density      = 0.865
            meltingPoint = 1384L
            boilingPoint = 1870L
            plasmaPoint  = 145600L
        }

        processing {
            byProduct("coal", "sulfur", "germanium")
            burningTarget         = "dark_ashes" amount 162162000L
        }

        composition {
            formula = "C₂(H₂O)₄,₃(Dark Ashes)"
            component("carbon", 185328000L)
            component("water", 370656000L)
            component("dark_ashes", 92664000L)
        }

        meta {
            numericId           = 8337
            hashId              = 1051
            originalMod         = "UndergroundBiomes"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 800L
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CarbonDioxide = material("carbon_dioxide") {
        name = "Carbon Dioxide"

        appearance {
            color       = Rgba(40, 40, 40, 15)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 14L
            density      = 0.7566193333
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "CO₂"
            component("carbon", 216216000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9836
            hashId              = 590
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Trona = material("trona") {
        appearance {
            color       = Rgba(135, 135, 95, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 10
            mass         = 23L
            density      = 1.7022145
            meltingPoint = 698L
            boilingPoint = 1310L
            plasmaPoint  = 131050L
        }

        processing {
            byProduct("mirabilite", "gypsum", "sodium_hydrogencarbonate")
        }

        composition {
            formula = "(Na₂(CO₃))(H₂O)₂"
            component("sodium_carbonate", 648648000L)
            component("water", 648648000L)
        }

        meta {
            numericId           = 9159
            hashId              = 1493
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val DuraniumHexachloride = material("duranium_hexachloride") {
        name = "Duranium Hexachloride"

        appearance {
            color       = Rgba(75, 175, 145, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 42
            mass         = 77L
            density      = 2.859897714
            meltingPoint = 318L
            boilingPoint = 560L
            plasmaPoint  = 56071L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("diduranium_trioxide", "salt", "sylvite")
        }

        composition {
            formula = "DnCl₆"
            component("duranium_elemental", 92664000L)
            component("chlorine", 555984000L)
        }

        meta {
            numericId           = 9200
            hashId              = 1510
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("duranium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val HydrogenBorate = material("hydrogen_borate") {
        name = "Hydrogen Borate"

        appearance {
            color       = Rgba(234, 234, 255, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 4
            mass         = 8L
            density      = 0.3349366629
            meltingPoint = 364L
            boilingPoint = 647L
            plasmaPoint  = 64714L
        }

        composition {
            formula = "H₃BO₃"
            component("hydrogen", 277992000L)
            component("boron", 92664000L)
            component("oxygen", 277992000L)
        }

        meta {
            numericId           = 8007
            hashId              = 611
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("boric_acid")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val OnyxRed = material("onyx_red") {
        name = "Red Onyx"

        appearance {
            color       = Rgba(255, 88, 77, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8415
            hashId              = 1001
            originalMod         = "voltzengine"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Lucrum - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Realgar = material("realgar") {
        appearance {
            color       = Rgba(157, 33, 35, 255)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 29
            mass         = 53L
            density      = 3.9215
            meltingPoint = 637L
            boilingPoint = 903L
            plasmaPoint  = 90350L
        }

        fluids {
            smeltingTarget    = "arsenic" amount 216216000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("cobaltite", "arsenopyrite")
        }

        composition {
            formula = "AsS"
            component("arsenic", 324324000L)
            component("sulfur", 324324000L)
        }

        meta {
            numericId           = 9109
            hashId              = 1440
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("arsenic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedFluorite = material("red_fluorite") {
        name = "Red Fluorite"

        appearance {
            color       = Rgba(226, 56, 65, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "pink_fluorite", "magenta_fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8436
            hashId              = 649
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Prometheum = material("prometheum") {
        appearance {
            color       = Rgba(90, 129, 86, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 30
            electrons    = 30
            neutrons     = 40
            mass         = 70L
            density      = 3.112245143
            meltingPoint = 1315L
            boilingPoint = 3273L
            plasmaPoint  = 327300L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 1
            durability = 512L
            speed      = 8.0f
        }

        processing {
            byProduct("cobaltite")
        }

        composition {
            formula = "Pm₃O₄"
            component("promethium", 277992000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8774
            hashId              = 1166
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Potentia - 1")
            alloyRef("iron")
            alloyRef("amordrine")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val FerricOxyhydroxide = material("ferric_oxyhydroxide") {
        name = "Ferric Oxyhydroxide"

        appearance {
            color       = Rgba(137, 62, 40, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 1.125508091
            meltingPoint = 1207L
            boilingPoint = 2414L
            plasmaPoint  = 241400L
        }

        fluids {
            smeltingTarget    = "hematite" amount 231660000L
        }

        composition {
            formula = "FeO₃H₃"
            component("iron", 92664000L)
            component("oxygen", 277992000L)
            component("hydrogen", 277992000L)
        }

        meta {
            numericId           = 8035
            hashId              = 635
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Bixbite = material("bixbite") {
        appearance {
            color       = Rgba(255, 80, 80, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            byProduct("alumina", "beryllium", "emerald", "aquamarine", "morganite", "goshenite", "heliodor", "maxixe")
            generifyingTarget      = "emerald" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("alumina", 111835862L)
            component("beryllium", 67101517L)
            component("silicon_dioxide", 402609103L)
            component("oxygen", 67101517L)
        }

        meta {
            numericId           = 8386
            hashId              = 943
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Sano - 2")
            reRegisteredTo("scarlet_emerald")
            reRegisteredTo("any_emerald")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Salt = material("salt") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 0.487107
            meltingPoint = 1074L
            boilingPoint = 1686L
            plasmaPoint  = 168600L
        }

        processing {
            byProduct("sylvite", "iodine_salt", "borax")
        }

        composition {
            formula = "NaCl"
            component("sodium", 324324000L)
            component("chlorine", 324324000L)
        }

        meta {
            numericId           = 8204
            hashId              = 664
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            reRegisteredTo("any_salt")
            sourceOf("sodium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val SodiumHydroxide = material("sodium_hydroxide") {
        name = "Sodium Hydroxide"

        appearance {
            color       = Rgba(220, 250, 220, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 13L
            density      = 0.32417296
            meltingPoint = 596L
            boilingPoint = 1661L
            plasmaPoint  = 166100L
        }

        composition {
            formula = "NaOH"
            component("sodium", 216216000L)
            component("oxygen", 216216000L)
            component("hydrogen", 216216000L)
        }

        meta {
            numericId           = 8268
            hashId              = 666
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val NitricAcid = material("nitric_acid") {
        name = "Nitric Acid"

        appearance {
            color       = Rgba(128, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 1.5
            meltingPoint = 231L
            boilingPoint = 356L
            plasmaPoint  = 35600L
        }

        composition {
            formula = "HNO₃"
            component("hydrogen", 129729600L)
            component("nitrogen", 129729600L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 9825
            hashId              = 588
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val WhitePhosphorus = material("white_phosphorus") {
        name = "White Phosphorus"

        appearance {
            color       = Rgba(236, 234, 221, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 15
            mass         = 31L
            density      = 1.07005728
            meltingPoint = 829L
            boilingPoint = 1374L
            plasmaPoint  = 137420L
        }

        processing {
            oreMultiplier           = 3
            byProduct("phosphorite", "apatite", "white_fluorite", "phosphate", "red_phosphorus", "blue_phosphorus")
            generifyingTarget      = "phosphorus" amount 648648000L
        }

        composition {
            formula = "Ca₃(PO₄)₂,₅"
            component("calcium", 389188800L)
            component("phosphate", 259459200L)
        }

        meta {
            numericId           = 8460
            hashId              = 860
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_phosphorus")
            sourceOf("phosphor")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Celestine = material("celestine") {
        appearance {
            color       = Rgba(200, 205, 240, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 16
            mass         = 30L
            density      = 0.7854526667
            meltingPoint = 275L
            boilingPoint = 455L
            plasmaPoint  = 45533L
        }

        fluids {
            smeltingTarget    = "strontium" amount 72072000L
        }

        processing {
            byProduct("strontium", "sulfur")
        }

        composition {
            formula = "SrSO₄"
            component("strontium", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9110
            hashId              = 1456
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("strontium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WhiteFluorite = material("white_fluorite") {
        name = "White Fluorite"

        appearance {
            color       = Rgba(180, 180, 180, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "black_fluorite", "fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8441
            hashId              = 654
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val OrangeSapphire = material("orange_sapphire") {
        name = "Orange Sapphire"

        appearance {
            color       = Rgba(220, 150, 50, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 14
            mass         = 27L
            density      = 2.393381167
            meltingPoint = 2180L
            boilingPoint = 3180L
            plasmaPoint  = 318083L
        }

        fluids {
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "ruby", "green_sapphire", "blue_sapphire")
            generifyingTarget      = "sapphire" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Cu"
            component("alumina", 540540000L)
            component("copper", 108108000L)
        }

        meta {
            numericId           = 8314
            hashId              = 953
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Permutatio - 1")
            reRegisteredTo("any_sapphire")
            sourceOf("sapphire", "aluminium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Tetrahedrite = material("tetrahedrite") {
        appearance {
            color       = Rgba(200, 32, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 31
            mass         = 57L
            density      = 5.955
            meltingPoint = 993L
            boilingPoint = 1956L
            plasmaPoint  = 195625L
        }

        fluids {
            smeltingTarget    = "copper" amount 162162000L
        }

        processing {
            byProduct("copper", "antimony", "zinc", "kesterite", "arsenic")
        }

        composition {
            formula = "Cu₃SbFeS₃"
            component("copper", 243243000L)
            component("antimony", 81081000L)
            component("iron", 81081000L)
            component("sulfur", 243243000L)
        }

        meta {
            numericId           = 9132
            hashId              = 1452
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("antimony", "iron", "copper")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Heliodor = material("heliodor") {
        appearance {
            color       = Rgba(255, 255, 150, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            byProduct("alumina", "beryllium", "emerald", "aquamarine", "morganite", "goshenite", "bixbite", "maxixe")
            generifyingTarget      = "emerald" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("alumina", 111835862L)
            component("beryllium", 67101517L)
            component("silicon_dioxide", 402609103L)
            component("oxygen", 67101517L)
        }

        meta {
            numericId           = 8384
            hashId              = 941
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Lux - 2")
            reRegisteredTo("any_emerald")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Spodumene = material("spodumene") {
        appearance {
            color       = Rgba(190, 170, 170, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.7899774
            meltingPoint = 1825L
            boilingPoint = 2905L
            plasmaPoint  = 290500L
        }

        processing {
            byProduct("alumina", "lithium_chloride")
        }

        composition {
            formula = "(Al₂O₃)Li₂(SiO₂)₄O"
            component("alumina", 162162000L)
            component("lithium", 64864800L)
            component("silicon_dioxide", 389188800L)
            component("oxygen", 32432400L)
        }

        meta {
            numericId           = 9146
            hashId              = 1498
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium", "aluminium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val VoidCrystal = material("void_crystal") {
        name = "Void"

        appearance {
            color       = Rgba(10, 10, 10, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 0.929
            meltingPoint = 1700L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            solidifyingTarget = "coal" amount 648648000L
            smeltingTarget    = "carbon" amount 324324000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 280L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "coal" amount 648648000L
            smashingTarget        = "coal" amount 648648000L
            cuttingTarget         = "coal" amount 648648000L
            workingTarget         = "coal" amount 648648000L
            forgingTarget         = "coal" amount 648648000L
            burningTarget         = "dark_ashes" amount 162162000L
            bendingTarget         = "coal" amount 648648000L
            compressingTarget     = "coal" amount 648648000L
            generifyingTarget      = "coal" amount 648648000L
        }

        composition {
            formula = "C"
            component("coal", 648648000L)
        }

        meta {
            numericId           = 8378
            hashId              = 1091
            originalMod         = "netherlicious"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Potentia - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cooperite = material("cooperite") {
        name = "Sheldonite"

        appearance {
            color       = Rgba(130, 160, 230, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 53
            electrons    = 53
            neutrons     = 76
            mass         = 130L
            density      = 14.56316667
            meltingPoint = 1677L
            boilingPoint = 3238L
            plasmaPoint  = 323883L
        }

        fluids {
            smeltingTarget    = "platinum" amount 216216000L
        }

        processing {
            byProduct("palladium", "nickel", "iridium")
        }

        composition {
            formula = "Pt₃NiPdS"
            component("platinum", 324324000L)
            component("nickel", 108108000L)
            component("palladium", 108108000L)
            component("sulfur", 108108000L)
        }

        meta {
            numericId           = 9116
            hashId              = 1450
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sheldonite")
            sourceOf("platinum", "nickel", "palladium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val GraniteBlack = material("granite_black") {
        name = "Black Granite"

        appearance {
            color       = Rgba(20, 20, 20, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.8436734239
            meltingPoint = 1500L
            plasmaPoint  = 300000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 64L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "(K₂Mg₆(Al₂O₃)₃F₄(SiO₂)₆)(K₂(Al₂O₃)(SiO₂)₆O)SiO₂"
            component("biotite", 216216000L)
            component("potassium_feldspar", 216216000L)
            component("flint", 216216000L)
        }

        meta {
            numericId           = 8508
            hashId              = 1397
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tutamen - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TigerEye = material("tiger_eye") {
        name = "Tiger Eye"

        appearance {
            color       = Rgba(142, 116, 61, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("hematite", "cats_eye", "dragon_eye", "hawks_eye", "black_eye", "tiger_iron")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8430
            hashId              = 976
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Terra - 1")
            reRegisteredTo("yellow_tiger_eye")
            reRegisteredTo("any_tiger_eye")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Granite = material("granite") {
        appearance {
            color       = Rgba(160, 120, 130, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.8436734239
            meltingPoint = 1500L
            plasmaPoint  = 300000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 64L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "(K₂Mg₆(Al₂O₃)₃F₄(SiO₂)₆)(K₂(Al₂O₃)(SiO₂)₆O)SiO₂"
            component("biotite", 216216000L)
            component("potassium_feldspar", 216216000L)
            component("flint", 216216000L)
        }

        meta {
            numericId           = 8518
            hashId              = 1398
            originalMod         = "etfuturum"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Uranium235Hexafluoride = material("uranium235_hexafluoride") {
        name = "Uranium-235 Hexafluoride"

        appearance {
            color       = Rgba(66, 98, 85, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 28
            mass         = 49L
            density      = 2.708596571
            meltingPoint = 100L
            boilingPoint = 329L
            plasmaPoint  = 32900L
        }

        composition {
            formula = "U-235F₆"
            component("uranium235", 92664000L)
            component("fluorine", 555984000L)
        }

        meta {
            numericId           = 9012
            hashId              = 740
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
            aspect("Perditio - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Smithsonite = material("smithsonite") {
        appearance {
            color       = Rgba(110, 223, 210, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 25L
            density      = 1.8810574
            meltingPoint = 930L
            boilingPoint = 1150L
            plasmaPoint  = 115000L
        }

        fluids {
            smeltingTarget    = "zinc" amount 108108000L
        }

        processing {
            byProduct("zinc", "bromargyrite")
        }

        composition {
            formula = "ZnCO₃"
            component("zinc", 129729600L)
            component("carbon", 129729600L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 9211
            hashId              = 1490
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("zinc")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val NitrogenMonoxide = material("nitrogen_monoxide") {
        name = "Nitrogen Monoxide"

        appearance {
            color       = Rgba(100, 175, 255, 15)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 0.0013398
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "NO"
            component("nitrogen", 324324000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 9837
            hashId              = 585
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Ferrite = material("ferrite") {
        appearance {
            color       = Rgba(120, 120, 130, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 12
            mass         = 23L
            density      = 2.1027145
            meltingPoint = 593L
            boilingPoint = 1218L
            plasmaPoint  = 121850L
        }

        composition {
            formula = "Li₂Fe₂O₄"
            component("lithium", 162162000L)
            component("iron", 162162000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 8005
            hashId              = 662
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium", "iron")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Chalk = material("chalk") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.7622574
            meltingPoint = 1612L
            plasmaPoint  = 300000L
        }

        fluids {
            smeltingTarget    = "calcite" amount 432432000L
        }

        composition {
            formula = "Ca(CO₃)"
            component("calcite", 648648000L)
        }

        meta {
            numericId           = 9112
            hashId              = 792
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_calcite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Cryolite = material("cryolite") {
        appearance {
            color       = Rgba(200, 190, 190, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.5621176
            meltingPoint = 1285L
            boilingPoint = 2570L
            plasmaPoint  = 257000L
        }

        composition {
            formula = "Na₃AlF₆"
            component("sodium", 194594400L)
            component("aluminium", 64864800L)
            component("fluorine", 389188800L)
        }

        meta {
            numericId           = 8009
            hashId              = 686
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("sodium", "fluorine")
        }

        tags(
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Lepidolite = material("lepidolite") {
        appearance {
            color       = Rgba(240, 50, 140, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 9
            mass         = 17L
            density      = 0.6034790909
            meltingPoint = 1162L
            boilingPoint = 1769L
            plasmaPoint  = 176918L
        }

        processing {
            byProduct("lithium_chloride", "caesium", "rubidium")
        }

        composition {
            formula = "(Al₂O₃)₂KLi₃F₂O₆"
            component("alumina", 294840000L)
            component("potassium", 29484000L)
            component("lithium", 88452000L)
            component("fluorine", 58968000L)
            component("oxygen", 176904000L)
        }

        meta {
            numericId           = 9149
            hashId              = 1499
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium", "aluminium", "potassium", "fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val DuraniumHexaiodide = material("duranium_hexaiodide") {
        name = "Duranium Hexaiodide"

        appearance {
            color       = Rgba(75, 125, 175, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 66
            electrons    = 66
            neutrons     = 90
            mass         = 156L
            density      = 7.082857143
            meltingPoint = 502L
            boilingPoint = 747L
            plasmaPoint  = 74757L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("diduranium_trioxide", "iodine_salt")
        }

        composition {
            formula = "DnI₆"
            component("duranium_elemental", 92664000L)
            component("iodine", 555984000L)
        }

        meta {
            numericId           = 9202
            hashId              = 1512
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("iodine", "duranium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val OilShale = material("oil_shale") {
        name = "Oil Shale"

        appearance {
            color       = Rgba(50, 50, 60, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.9050851861
            meltingPoint = 500L
            boilingPoint = 1000L
            plasmaPoint  = 100000L
        }

        processing {
            burningTarget         = "stone" amount 324324000L
            generifyingTarget      = "shale" amount 648648000L
        }

        composition {
            formula = "(Ca(CO₃))₂,₅SiO₂(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))"
            component("calcite", 324324000L)
            component("milky_quartz", 162162000L)
            component("clay", 162162000L)
        }

        meta {
            numericId           = 9853
            hashId              = 1137
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 400L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 2")
            aspect("Lux - 1")
            reRegisteredTo("oilshale")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Azurite = material("azurite") {
        appearance {
            color       = Rgba(109, 164, 247, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 22L
            density      = 2.294933533
            meltingPoint = 382L
            boilingPoint = 754L
            plasmaPoint  = 75426L
        }

        fluids {
            smeltingTarget    = "copper" amount 72072000L
        }

        processing {
            oreMultiplier           = 5
            byProduct("zircon", "malachite", "hafnium")
        }

        composition {
            formula = "Cu₃(CO₃)₂O(H₂O)"
            component("copper", 129729600L)
            component("carbon_trioxide", 345945600L)
            component("oxygen", 43243200L)
            component("water", 129729600L)
        }

        meta {
            numericId           = 8420
            hashId              = 1039
            originalMod         = "tropicraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ChloroauricAcid = material("chloroauric_acid") {
        name = "Chloroauric Acid"

        appearance {
            color       = Rgba(255, 200, 70, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 31
            mass         = 56L
            density      = 3.215824313
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "AuCl₄H"
            component("gold", 108108000L)
            component("chlorine", 432432000L)
            component("hydrogen", 108108000L)
        }

        meta {
            numericId           = 8400
            hashId              = 717
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Ceramic = material("ceramic") {
        appearance {
            color       = Rgba(220, 130, 70, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8183399444
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        composition {
            formula = "(Al₂O₃)(SiO₂)₄"
            component("alumina", 180180000L)
            component("silicon_dioxide", 432432000L)
        }

        meta {
            numericId           = 8225
            hashId              = 842
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            alloyRef("clay_compound")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Monazite = material("monazite") {
        appearance {
            color       = Rgba(50, 70, 50, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 34
            electrons    = 34
            neutrons     = 46
            mass         = 81L
            density      = 3.6860716
            meltingPoint = 700L
            boilingPoint = 1900L
            plasmaPoint  = 45000L
        }

        processing {
            oreMultiplier           = 2
            byProduct("thorium", "neodymium", "rare_earth")
        }

        composition {
            formula = "(Rare Earth)(PO₄)"
            component("rare_earth", 324324000L)
            component("phosphate", 324324000L)
        }

        meta {
            numericId           = 8338
            hashId              = 1120
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Nebrisum - 1")
            sourceOf("helium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val BlackEye = material("black_eye") {
        name = "Black Eye"

        appearance {
            color       = Rgba(66, 68, 66, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("hematite", "tiger_eye", "cats_eye", "dragon_eye", "hawks_eye", "tiger_iron")
            generifyingTarget      = "tiger_eye" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8434
            hashId              = 984
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Terra - 1")
            reRegisteredTo("any_tiger_eye")
            reRegisteredTo("black_tiger_eye")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val TungsticAcid = material("tungstic_acid") {
        name = "Tungstic Acid"

        appearance {
            color       = Rgba(188, 200, 0, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 20
            mass         = 35L
            density      = 2.750842251
            meltingPoint = 373L
            boilingPoint = 1746L
            plasmaPoint  = 174600L
        }

        fluids {
            smeltingTarget    = "tungsten_trioxide" amount 370656000L
        }

        composition {
            formula = "H₂WO₄"
            component("hydrogen", 185328000L)
            component("tungsten", 92664000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8027
            hashId              = 620
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tungsten")
        }

        tags(
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Gloomstone = material("gloomstone") {
        appearance {
            color       = Rgba(19, 250, 255, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        processing {
            oreMultiplier           = 4
            byProduct("redstone", "gold", "glowstone", "blue_fluorite")
            generifyingTarget      = "glowstone" amount 648648000L
        }

        composition {
            formula = "(Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He"
            component("phosphorite", 324324000L)
            component("gold", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("helium", 64864800L)
        }

        meta {
            numericId           = 8456
            hashId              = 1071
            originalMod         = "netherlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Sensus - 1")
            aspect("Spiritus - 1")
            reRegisteredTo("any_glowstone")
            alloyRef("energetic_alloy")
            alloyRef("lumium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Uranium238Hexafluoride = material("uranium238_hexafluoride") {
        name = "Uranium-238 Hexafluoride"

        appearance {
            color       = Rgba(66, 98, 85, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 28
            mass         = 49L
            density      = 2.708596571
            meltingPoint = 100L
            boilingPoint = 329L
            plasmaPoint  = 32900L
        }

        composition {
            formula = "U-238F₆"
            component("uranium", 92664000L)
            component("fluorine", 555984000L)
        }

        meta {
            numericId           = 9010
            hashId              = 738
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
            aspect("Perditio - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val BlackVitriol = material("black_vitriol") {
        name = "Black Vitriol"

        appearance {
            color       = Rgba(66, 66, 66, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 23
            mass         = 44L
            density      = 4.9705
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "FeS"
            component("iron", 324324000L)
            component("sulfur", 324324000L)
        }

        meta {
            numericId           = 8403
            hashId              = 720
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val SodiumNitrate = material("sodium_nitrate") {
        name = "Sodium Nitrate"

        appearance {
            color       = Rgba(230, 230, 230, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.19530752
            meltingPoint = 607L
            boilingPoint = 1214L
            plasmaPoint  = 121400L
        }

        processing {
            oreMultiplier           = 3
            byProduct("potassium_nitrate", "niter")
        }

        composition {
            formula = "NaNO₃"
            component("sodium", 129729600L)
            component("nitrogen", 129729600L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 8019
            hashId              = 665
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 2")
            sourceOf("niter", "potassium_nitrate", "potassium")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val TritaniumHexabromide = material("tritanium_hexabromide") {
        name = "Tritanium Hexabromide"

        appearance {
            color       = Rgba(55, 125, 155, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 47
            electrons    = 47
            neutrons     = 66
            mass         = 114L
            density      = 6.247428571
            meltingPoint = 512L
            boilingPoint = 732L
            plasmaPoint  = 73285L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tritanium_dioxide", "bromargyrite")
        }

        composition {
            formula = "TnBr₆"
            component("tritanium_elemental", 92664000L)
            component("bromine", 555984000L)
        }

        meta {
            numericId           = 9207
            hashId              = 1517
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("bromine", "tritanium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Steam = material("steam") {
        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 2
            mass         = 6L
            density      = 0.001
            meltingPoint = 273L
            boilingPoint = 373L
            plasmaPoint  = 37300L
        }

        composition {
            formula = "H₂O"
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9814
            hashId              = 572
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            aspect("Aer - 1")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Emeradic = material("emeradic") {
        appearance {
            color       = Rgba(0, 255, 0, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            solidifyingTarget = "emerald" amount 648648000L
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2200L
            speed      = 8.0f
        }

        processing {
            pulverTarget          = "emerald" amount 648648000L
            smashingTarget        = "emerald" amount 648648000L
            cuttingTarget         = "emerald" amount 648648000L
            workingTarget         = "emerald" amount 648648000L
            forgingTarget         = "emerald" amount 648648000L
            burningTarget         = "emerald" amount 0L
            bendingTarget         = "emerald" amount 648648000L
            compressingTarget     = "emerald" amount 648648000L
            generifyingTarget      = "emerald" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("emerald", 648648000L)
        }

        meta {
            numericId           = 8379
            hashId              = 1092
            originalMod         = "ActuallyAdditions"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            reRegisteredTo("any_emerald")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SodiumHydrogencarbonate = material("sodium_hydrogencarbonate") {
        name = "Soda"

        appearance {
            color       = Rgba(230, 235, 240, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 6
            mass         = 13L
            density      = 0.5403961467
            meltingPoint = 724L
            boilingPoint = 957L
            plasmaPoint  = 95766L
        }

        processing {
            byProduct("mirabilite", "gypsum", "trona")
        }

        composition {
            formula = "NaHCO₃"
            component("sodium", 108108000L)
            component("hydrogen", 108108000L)
            component("carbon", 108108000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 8039
            hashId              = 667
            originalMod         = "SaltMod"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("soda")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Aquamarine = material("aquamarine") {
        appearance {
            color       = Rgba(200, 220, 255, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            byProduct("alumina", "beryllium", "emerald", "morganite", "goshenite", "bixbite", "heliodor", "maxixe")
            generifyingTarget      = "emerald" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("alumina", 111835862L)
            component("beryllium", 67101517L)
            component("silicon_dioxide", 402609103L)
            component("oxygen", 67101517L)
        }

        meta {
            numericId           = 8323
            hashId              = 939
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Aqua - 2")
            reRegisteredTo("any_emerald")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val SodiumFluoride = material("sodium_fluoride") {
        name = "Sodium Fluoride"

        appearance {
            color       = Rgba(64, 200, 225, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.486348
            meltingPoint = 1266L
            boilingPoint = 2532L
            plasmaPoint  = 253200L
        }

        composition {
            formula = "NaF"
            component("sodium", 324324000L)
            component("fluorine", 324324000L)
        }

        meta {
            numericId           = 8037
            hashId              = 685
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val EnergiumCyan = material("energium_cyan") {
        name = "Cyan Energium"

        appearance {
            color       = Rgba(0, 255, 255, 255)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 26L
            density      = 2.175532308
            meltingPoint = 1875L
            boilingPoint = 3111L
            plasmaPoint  = 311111L
        }

        composition {
            formula = "((Al₂O₃))₄,₆(((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₅,₁₁Cu₃(SiO₂)Ar)₅,₁₀"
            component("sapphire", 288288000L)
            component("nikolite", 360360000L)
        }

        meta {
            numericId           = 8299
            hashId              = 1097
            originalMod         = "gregapi"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Potentia - 4")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.CRYSTALLISABLE,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ilmenite = material("ilmenite") {
        appearance {
            color       = Rgba(70, 55, 50, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 16
            mass         = 30L
            density      = 2.4836574
            meltingPoint = 782L
            boilingPoint = 1392L
            plasmaPoint  = 139280L
        }

        tool {
            types      = 0
            quality    = 2
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("rutile", "hematite", "magnesium_carbonate", "pyrolusite")
        }

        composition {
            formula = "FeTiO₃"
            component("iron", 129729600L)
            component("titanium", 129729600L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 9120
            hashId              = 1479
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("illmenite")
            reRegisteredTo("titanium_iron")
            sourceOf("iron", "titanium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val Zanite = material("zanite") {
        appearance {
            color       = Rgba(146, 73, 255, 127)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.8945755682
            meltingPoint = 1736L
            boilingPoint = 2618L
            plasmaPoint  = 261856L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 16.0f
        }

        processing {
            byProduct("opal", "ambrosium")
            generifyingTarget      = "tanzanite" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)₃(SiO₂)₆Ca₄(H₂O)O₄"
            component("alumina", 221130000L)
            component("silicon_dioxide", 265356000L)
            component("calcium", 58968000L)
            component("water", 44226000L)
            component("oxygen", 58968000L)
        }

        meta {
            numericId           = 8292
            hashId              = 997
            originalMod         = "aether"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Perfodio - 4")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Saltwater = material("saltwater") {
        appearance {
            color       = Rgba(255, 0, 255, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 5
            electrons    = 5
            neutrons     = 5
            mass         = 11L
            meltingPoint = 273L
            boilingPoint = 363L
            plasmaPoint  = 36300L
        }

        composition {
            formula = "(H₂O)(NaCl)"
            component("water", 486486000L)
            component("salt", 162162000L)
        }

        meta {
            numericId           = 9804
            hashId              = 687
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            reRegisteredTo("salt_water")
            reRegisteredTo("brine")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val BrownLimonite = material("brown_limonite") {
        name = "Brown Limonite"

        appearance {
            color       = Rgba(200, 100, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 22L
            density      = 1.96923697
            meltingPoint = 1523L
            boilingPoint = 3046L
            plasmaPoint  = 304600L
        }

        fluids {
            smeltingTarget    = "hematite" amount 324324000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("malachite", "yellow_limonite")
        }

        composition {
            formula = "FeHO₂"
            component("iron", 162162000L)
            component("hydrogen", 162162000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 9106
            hashId              = 1471
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Bentonite = material("bentonite") {
        name = "Bentonite Clay"

        appearance {
            color       = Rgba(255, 192, 4, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 1.336349553
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            smeltingTarget    = "ceramic" amount 648648000L
        }

        processing {
            byProduct("clay_red", "palygorskite")
            generifyingTarget      = "clay" amount 648648000L
        }

        composition {
            formula = "(NaOH)(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₉"
            component("sodium_hydroxide", 36036000L)
            component("clay", 648648000L)
        }

        meta {
            numericId           = 9153
            hashId              = 848
            originalMod         = "PFAAGeologica"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_clay")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Fluorite = material("fluorite") {
        appearance {
            color       = Rgba(225, 185, 140, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "green_fluorite", "orange_fluorite")
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 9215
            hashId              = 648
            originalMod         = "RotaryCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Phosphate = material("phosphate") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.3651432
            meltingPoint = 400L
            boilingPoint = 800L
            plasmaPoint  = 80000L
        }

        processing {
            byProduct("phosphorus", "apatite", "yellow_fluorite", "phosphorite", "red_phosphorus", "white_phosphorus")
        }

        composition {
            formula = "PO₄"
            component("phosphor", 129729600L)
            component("oxygen", 518918400L)
        }

        meta {
            numericId           = 8207
            hashId              = 617
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("phosphor")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Palis = material("palis") {
        appearance {
            color       = Rgba(0, 0, 255, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 26L
            density      = 1.241911173
            meltingPoint = 1335L
            boilingPoint = 2221L
            plasmaPoint  = 222252L
        }

        fluids {
            solidifyingTarget = "lapis" amount 648648000L
            smeltingTarget    = "lapis" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 300L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "lapis" amount 648648000L
            smashingTarget        = "lapis" amount 648648000L
            cuttingTarget         = "lapis" amount 648648000L
            workingTarget         = "lapis" amount 648648000L
            forgingTarget         = "lapis" amount 648648000L
            burningTarget         = "lapis" amount 0L
            bendingTarget         = "lapis" amount 648648000L
            compressingTarget     = "lapis" amount 648648000L
            generifyingTarget      = "lapis" amount 648648000L
        }

        composition {
            formula = "((Al₂O₃)₆,₅(SiO₂)₂Ca₈Na₈)₁₂,₂₈((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₂,₁₁(FeS₂)(Ca(CO₃))"
            component("lapis", 648648000L)
        }

        meta {
            numericId           = 8376
            hashId              = 1089
            originalMod         = "ActuallyAdditions"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Sensus - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bromargyrite = material("bromargyrite") {
        appearance {
            color       = Rgba(90, 45, 10, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 41
            electrons    = 41
            neutrons     = 52
            mass         = 93L
            density      = 6.8115
            meltingPoint = 749L
            boilingPoint = 1383L
            plasmaPoint  = 138350L
        }

        fluids {
            smeltingTarget    = "silver" amount 216216000L
        }

        processing {
            byProduct("pyrolusite", "silver", "chromite", "smithsonite")
        }

        composition {
            formula = "AgBr"
            component("silver", 324324000L)
            component("bromine", 324324000L)
        }

        meta {
            numericId           = 9210
            hashId              = 1489
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("bromine", "silver")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val LithiumHydroxide = material("lithium_hydroxide") {
        name = "Lithium Hydroxide"

        appearance {
            color       = Rgba(222, 202, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 4
            mass         = 7L
            density      = 0.1785062933
            meltingPoint = 735L
            boilingPoint = 1197L
            plasmaPoint  = 119700L
        }

        composition {
            formula = "LiOH"
            component("lithium", 216216000L)
            component("oxygen", 216216000L)
            component("hydrogen", 216216000L)
        }

        meta {
            numericId           = 8032
            hashId              = 663
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val SkyStone = material("sky_stone") {
        name = "Sky Stone"

        appearance {
            color       = Rgba(81, 92, 96, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 16
            mass         = 30L
            density      = 2.350979936
            meltingPoint = 2200L
            boilingPoint = 4400L
            plasmaPoint  = 440000L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 64L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "((SiO₂)₂,₃FeMg₂)₂,₅(Rare Earth)Fe(MgFe(SiO₂)₂O₄)₅,₆₄"
            component("peridot", 144144000L)
            component("rare_earth", 72072000L)
            component("meteoric_iron", 72072000L)
            component("obsidian", 360360000L)
        }

        meta {
            numericId           = 8528
            hashId              = 1369
            originalMod         = "appliedenergistics2"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Volatus - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Clay = material("clay") {
        appearance {
            color       = Rgba(200, 200, 220, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 1.318339944
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            smeltingTarget    = "ceramic" amount 648648000L
        }

        processing {
            byProduct("kaolinite", "palygorskite")
        }

        composition {
            formula = "((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O)"
            component("ceramic", 648648000L)
            component("water", 324324000L)
        }

        meta {
            numericId           = 8215
            hashId              = 845
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_clay")
            alloyRef("stellar_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Zeolite = material("zeolite") {
        appearance {
            color       = Rgba(240, 230, 230, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.8720595385
            meltingPoint = 1461L
            boilingPoint = 2289L
            plasmaPoint  = 228961L
        }

        processing {
            byProduct("pollucite", "salt")
        }

        composition {
            formula = "(Al₂O₃)Na₂(SiO₂)₄(H₂O)₂O"
            component("alumina", 124740000L)
            component("sodium", 49896000L)
            component("silicon_dioxide", 299376000L)
            component("water", 149688000L)
            component("oxygen", 24948000L)
        }

        meta {
            numericId           = 9165
            hashId              = 1469
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("sodium", "aluminium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Phosphorite = material("phosphorite") {
        appearance {
            color       = Rgba(50, 50, 65, 255)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 15
            mass         = 30L
            density      = 0.9774584
            meltingPoint = 758L
            boilingPoint = 1252L
            plasmaPoint  = 125222L
        }

        processing {
            byProduct("phosphorus", "apatite", "yellow_fluorite", "phosphate", "red_phosphorus", "white_phosphorus")
        }

        composition {
            formula = "Ca₅(PO₄)₃,₅F"
            component("calcium", 360360000L)
            component("phosphate", 216216000L)
            component("fluorine", 72072000L)
        }

        meta {
            numericId           = 8226
            hashId              = 862
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            sourceOf("phosphor", "fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Ammonia = material("ammonia") {
        appearance {
            color       = Rgba(114, 223, 232, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 1
            mass         = 4L
            density      = 0.00038006
            meltingPoint = 195L
            boilingPoint = 239L
            plasmaPoint  = 23900L
        }

        composition {
            formula = "NH₃"
            component("nitrogen", 162162000L)
            component("hydrogen", 486486000L)
        }

        meta {
            numericId           = 8025
            hashId              = 587
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val HydrogenPeroxide = material("hydrogen_peroxide") {
        name = "Hydrogen Peroxide"

        appearance {
            color       = Rgba(20, 20, 255, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 4
            mass         = 8L
            meltingPoint = 273L
            boilingPoint = 423L
            plasmaPoint  = 42300L
        }

        composition {
            formula = "H₂O₂"
            component("hydrogen", 324324000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 9809
            hashId              = 580
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val DuraniumHexafluoride = material("duranium_hexafluoride") {
        name = "Duranium Hexafluoride"

        appearance {
            color       = Rgba(25, 175, 125, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 28
            electrons    = 28
            neutrons     = 34
            mass         = 63L
            density      = 2.858596571
            meltingPoint = 216L
            boilingPoint = 428L
            plasmaPoint  = 42871L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("diduranium_trioxide", "pink_fluorite")
        }

        composition {
            formula = "DnF₆"
            component("duranium_elemental", 92664000L)
            component("fluorine", 555984000L)
        }

        meta {
            numericId           = 9199
            hashId              = 1509
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("duranium_elemental", "fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Basalt = material("basalt") {
        appearance {
            color       = Rgba(60, 50, 50, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 21
            mass         = 40L
            density      = 0.9429784125
            meltingPoint = 1673L
            boilingPoint = 3346L
            plasmaPoint  = 334600L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 32L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "((SiO₂)₂,₃FeMg₂)(Ca(CO₃))₃,₅SiO₂₈(Dark Ashes)₄"
            component("peridot", 40540500L)
            component("calcite", 121621500L)
            component("flint", 324324000L)
            component("dark_ashes", 162162000L)
        }

        meta {
            numericId           = 8505
            hashId              = 1386
            originalMod         = "netherlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Mica = material("mica") {
        appearance {
            color       = Rgba(195, 195, 205, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.8186254615
            meltingPoint = 1841L
            boilingPoint = 2797L
            plasmaPoint  = 279779L
        }

        processing {
            byProduct("vermiculite", "asbestos", "biotite", "perlite")
        }

        composition {
            formula = "(Al₂O₃)₃K₂(SiO₂)₆F₄"
            component("alumina", 249480000L)
            component("potassium", 33264000L)
            component("silicon_dioxide", 299376000L)
            component("fluorine", 66528000L)
        }

        meta {
            numericId           = 9158
            hashId              = 1503
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("aluminium", "potassium", "fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val SulfurTrioxide = material("sulfur_trioxide") {
        name = "Sulfur Trioxide"

        appearance {
            color       = Rgba(255, 220, 0, 120)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.51782175
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "SO₃"
            component("sulfur", 162162000L)
            component("oxygen", 486486000L)
        }

        meta {
            numericId           = 9835
            hashId              = 599
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sulphur_trioxide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val CyanVitriol = material("cyan_vitriol") {
        name = "Cyan Vitriol"

        appearance {
            color       = Rgba(111, 222, 222, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 25L
            density      = 1.830786
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "NiSO₄"
            component("nickel", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8408
            hashId              = 728
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("solution_nickel_sulfate")
            reRegisteredTo("solution_nickel_sulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val YellowDiamond = material("yellow_diamond") {
        name = "Yellow Diamond"

        appearance {
            color       = Rgba(240, 240, 0, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("graphite", "diamond")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8468
            hashId              = 932
            originalMod         = "ExtraPlanets"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Cobaltite = material("cobaltite") {
        appearance {
            color       = Rgba(80, 80, 250, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 29
            mass         = 55L
            density      = 5.567666667
            meltingPoint = 1014L
            boilingPoint = 1669L
            plasmaPoint  = 166900L
        }

        fluids {
            smeltingTarget    = "cobalt" amount 162162000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("cobalt", "realgar", "orange_fluorite", "pentlandite", "yellow_limonite")
        }

        composition {
            formula = "CoAsS"
            component("cobalt", 216216000L)
            component("arsenic", 216216000L)
            component("sulfur", 216216000L)
        }

        meta {
            numericId           = 9115
            hashId              = 1448
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("cobalt", "arsenic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val EnergiumRed = material("energium_red") {
        name = "Red Energium"

        appearance {
            color       = Rgba(255, 0, 0, 255)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 23
            electrons    = 23
            neutrons     = 30
            mass         = 53L
            density      = 3.926873139
            meltingPoint = 1320L
            boilingPoint = 2277L
            plasmaPoint  = 227777L
        }

        composition {
            formula = "((Al₂O₃))₄,₆((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₅,₁₀"
            component("sapphire", 288288000L)
            component("redstone", 360360000L)
        }

        meta {
            numericId           = 8298
            hashId              = 1096
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Potentia - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.CRYSTALLISABLE,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Marble = material("marble") {
        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.884225225
            meltingPoint = 1525L
            boilingPoint = 2795L
            plasmaPoint  = 279537L
        }

        fluids {
            smeltingTarget    = "calcite" amount 432432000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.5f
        }

        processing {
            byProduct("calcite")
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "Mg(Ca(CO₃))₇,₅"
            component("magnesium", 81081000L)
            component("calcite", 567567000L)
        }

        meta {
            numericId           = 8506
            hashId              = 1387
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perfodio - 1")
            reRegisteredTo("any_stone")
            reRegisteredTo("any_calcite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Lapis = material("lapis") {
        appearance {
            color       = Rgba(70, 70, 220, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 26L
            density      = 1.241911173
            meltingPoint = 1335L
            boilingPoint = 2221L
            plasmaPoint  = 222252L
        }

        processing {
            oreMultiplier           = 5
            byProduct("lazurite", "sodalite", "pyrite")
        }

        composition {
            formula = "((Al₂O₃)₆,₅(SiO₂)₂Ca₈Na₈)₁₂,₂₈((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₂,₁₁(FeS₂)(Ca(CO₃))"
            component("lazurite", 486486000L)
            component("sodalite", 81081000L)
            component("pyrite", 40540500L)
            component("calcite", 40540500L)
        }

        meta {
            numericId           = 8332
            hashId              = 1043
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val HydrosulfuricAcid = material("hydrosulfuric_acid") {
        name = "Hydrosulfuric Acid"

        appearance {
            color       = Rgba(241, 188, 133, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 5
            mass         = 11L
            density      = 0.68905992
            meltingPoint = 191L
            boilingPoint = 213L
            plasmaPoint  = 21300L
        }

        composition {
            formula = "H₂S"
            component("hydrogen", 432432000L)
            component("sulfur", 216216000L)
        }

        meta {
            numericId           = 8024
            hashId              = 601
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val NitroCarbon = material("nitro_carbon") {
        name = "Nitro Carbon"

        appearance {
            color       = Rgba(0, 75, 100, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 13L
            density      = 1.1341253
            meltingPoint = 1931L
            boilingPoint = 2188L
            plasmaPoint  = 218850L
        }

        composition {
            formula = "NC"
            component("nitrogen", 324324000L)
            component("carbon", 324324000L)
        }

        meta {
            numericId           = 9820
            hashId              = 744
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Datolite = material("datolite") {
        appearance {
            color       = Rgba(222, 255, 222, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 17L
            density      = 0.6907594311
            meltingPoint = 603L
            boilingPoint = 1107L
            plasmaPoint  = 110722L
        }

        composition {
            formula = "H₂Ca₂B₂Si₂O₁₀"
            component("hydrogen", 72072000L)
            component("calcium", 72072000L)
            component("boron", 72072000L)
            component("silicon", 72072000L)
            component("oxygen", 360360000L)
        }

        meta {
            numericId           = 8006
            hashId              = 613
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Magnetite = material("magnetite") {
        appearance {
            color       = Rgba(30, 30, 30, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 17
            mass         = 33L
            density      = 3.375388
            meltingPoint = 1811L
            boilingPoint = 3622L
            plasmaPoint  = 362200L
            hasMetallum  = true
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("hematite", "gold", "stone")
        }

        composition {
            formula = "Fe₃O₄"
            component("iron", 277992000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 9122
            hashId              = 1437
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            sourceOf("iron")
            alloyRef("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Emerald = material("emerald") {
        appearance {
            color       = Rgba(80, 255, 80, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            byProduct("alumina", "beryllium", "aquamarine", "morganite", "goshenite", "bixbite", "heliodor", "maxixe")
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("alumina", 111835862L)
            component("beryllium", 67101517L)
            component("silicon_dioxide", 402609103L)
            component("oxygen", 67101517L)
        }

        meta {
            numericId           = 8301
            hashId              = 938
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 5")
            reRegisteredTo("any_emerald")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val GlowstoneEnceladus = material("glowstone_enceladus") {
        name = "Enceladus Glowstone"

        appearance {
            color       = Rgba(0, 250, 250, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        processing {
            oreMultiplier           = 4
            byProduct("redstone", "gold", "glowstone")
            generifyingTarget      = "glowstone" amount 648648000L
        }

        composition {
            formula = "(Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He"
            component("phosphorite", 324324000L)
            component("gold", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("helium", 64864800L)
        }

        meta {
            numericId           = 8370
            hashId              = 1068
            originalMod         = "GalaxySpace"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Sensus - 1")
            aspect("Aqua - 1")
            reRegisteredTo("any_glowstone")
            alloyRef("energetic_alloy")
            alloyRef("lumium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Gypsum = material("gypsum") {
        appearance {
            color       = Rgba(240, 240, 240, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 13
            mass         = 28L
            density      = 1.602119333
            meltingPoint = 1730L
            plasmaPoint  = 300000L
        }

        processing {
            byProduct("trona", "mirabilite", "asbestos", "talc", "sulfur")
        }

        composition {
            formula = "(CaSO₄)(H₂O)₂"
            component("calcium_sulfate", 648648000L)
            component("water", 648648000L)
        }

        meta {
            numericId           = 9161
            hashId              = 642
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Wollastonite = material("wollastonite") {
        appearance {
            color       = Rgba(240, 240, 240, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 23L
            density      = 0.7747774
            meltingPoint = 1425L
            boilingPoint = 2301L
            plasmaPoint  = 230140L
        }

        processing {
            byProduct("hematite", "magnesium_carbonate", "pyrolusite")
        }

        composition {
            formula = "Ca(SiO₂)O"
            component("calcium", 129729600L)
            component("silicon_dioxide", 389188800L)
            component("oxygen", 129729600L)
        }

        meta {
            numericId           = 9164
            hashId              = 1468
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Pyrite = material("pyrite") {
        appearance {
            color       = Rgba(255, 230, 80, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 19
            electrons    = 19
            neutrons     = 20
            mass         = 40L
            density      = 4.002666667
            meltingPoint = 862L
            boilingPoint = 1522L
            plasmaPoint  = 152266L
            hasMetallum  = true
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("sulfur", "phosphorus", "hematite", "stannite", "selenium")
        }

        composition {
            formula = "FeS₂"
            component("iron", 216216000L)
            component("sulfur", 432432000L)
        }

        meta {
            numericId           = 9125
            hashId              = 798
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 1")
            aspect("Metallum - 1")
            aspect("Strontio - 1")
            sourceOf("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TitaniumTetrachloride = material("titanium_tetrachloride") {
        name = "Titanium Tetrachloride"

        appearance {
            color       = Rgba(233, 244, 222, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 19
            mass         = 37L
            density      = 0.9105712
            meltingPoint = 249L
            boilingPoint = 409L
            plasmaPoint  = 40900L
        }

        composition {
            formula = "TiCl₄"
            component("titanium", 129729600L)
            component("chlorine", 518918400L)
        }

        meta {
            numericId           = 8413
            hashId              = 627
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val SulfurDioxide = material("sulfur_dioxide") {
        name = "Sulfur Dioxide"

        appearance {
            color       = Rgba(255, 200, 0, 120)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 0.6899526667
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "SO₂"
            component("sulfur", 216216000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9834
            hashId              = 597
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sulphur_dioxide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val BlackAventurine = material("black_aventurine") {
        name = "Black Aventurine"

        appearance {
            color       = Rgba(50, 50, 50, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("green_aventurine", "brown_aventurine", "yellow_aventurine", "blue_aventurine", "red_aventurine")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8449
            hashId              = 991
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Potentia - 1")
            reRegisteredTo("any_aventurine")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val BluePhosphorus = material("blue_phosphorus") {
        name = "Blue Phosphorus"

        appearance {
            color       = Rgba(155, 227, 228, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 15
            mass         = 31L
            density      = 1.07005728
            meltingPoint = 829L
            boilingPoint = 1374L
            plasmaPoint  = 137420L
        }

        processing {
            oreMultiplier           = 3
            byProduct("phosphorite", "apatite", "blue_fluorite", "phosphate", "red_phosphorus", "white_phosphorus")
            generifyingTarget      = "phosphorus" amount 648648000L
        }

        composition {
            formula = "Ca₃(PO₄)₂,₅"
            component("calcium", 389188800L)
            component("phosphate", 259459200L)
        }

        meta {
            numericId           = 8458
            hashId              = 858
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_phosphorus")
            sourceOf("phosphor")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MartianVitriol = material("martian_vitriol") {
        name = "Martian Vitriol"

        appearance {
            color       = Rgba(222, 66, 222, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 22L
            density      = 1.220341556
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "Fe₂S₃O₁₂"
            component("iron", 72072000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8411
            hashId              = 733
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val BalasRuby = material("balas_ruby") {
        name = "Ruby"

        appearance {
            color       = Rgba(255, 100, 100, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 14
            mass         = 27L
            density      = 2.291959429
            meltingPoint = 785L
            boilingPoint = 1087L
            plasmaPoint  = 108728L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 7.0f
        }

        processing {
            byProduct("chromite", "spinel")
        }

        composition {
            formula = "Cr₂MgO₄"
            component("chromium", 185328000L)
            component("magnesium", 92664000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8303
            hashId              = 955
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Strontio - 2")
            reRegisteredTo("fools_ruby")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val ClayRed = material("clay_red") {
        name = "Red Clay"

        appearance {
            color       = Rgba(230, 40, 25, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 22L
            density      = 1.334331035
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            smeltingTarget    = "ceramic" amount 648648000L
        }

        processing {
            byProduct("bentonite", "clay_brown")
            generifyingTarget      = "clay" amount 648648000L
        }

        composition {
            formula = "(KOH)(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₉"
            component("potassium_hydroxide", 36036000L)
            component("clay", 648648000L)
        }

        meta {
            numericId           = 8455
            hashId              = 847
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_clay")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Goshenite = material("goshenite") {
        appearance {
            color       = Rgba(240, 240, 240, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            byProduct("alumina", "beryllium", "emerald", "aquamarine", "morganite", "bixbite", "heliodor", "maxixe")
            generifyingTarget      = "emerald" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("alumina", 111835862L)
            component("beryllium", 67101517L)
            component("silicon_dioxide", 402609103L)
            component("oxygen", 67101517L)
        }

        meta {
            numericId           = 8385
            hashId              = 942
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Vacuos - 2")
            reRegisteredTo("any_emerald")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Biotite = material("biotite") {
        appearance {
            color       = Rgba(20, 30, 20, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 0.9412087333
            meltingPoint = 1718L
            boilingPoint = 2606L
            plasmaPoint  = 260648L
        }

        processing {
            byProduct("mica", "vermiculite", "asbestos", "perlite")
        }

        composition {
            formula = "K₂Mg₆(Al₂O₃)₃F₄(SiO₂)₆"
            component("potassium", 28828800L)
            component("magnesium", 86486400L)
            component("alumina", 216216000L)
            component("fluorine", 57657600L)
            component("silicon_dioxide", 259459200L)
        }

        meta {
            numericId           = 9141
            hashId              = 800
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("aluminium", "argon", "potassium", "fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val PotassiumPyrosulfate = material("potassium_pyrosulfate") {
        name = "Potassium Pyrosulfate"

        appearance {
            color       = Rgba(255, 240, 240, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 23L
            density      = 0.5334548182
            meltingPoint = 598L
            boilingPoint = 1196L
            plasmaPoint  = 119600L
        }

        composition {
            formula = "K₂S₂O₇"
            component("potassium", 117936000L)
            component("sulfur", 117936000L)
            component("oxygen", 412776000L)
        }

        meta {
            numericId           = 8233
            hashId              = 709
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("potassium_pyrosulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val PurifiedVinteum = material("purified_vinteum") {
        name = "Purified Vinteum"

        appearance {
            color       = Rgba(230, 100, 255, 255)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = -1L
            density      = 0.0
            meltingPoint = 1L
            boilingPoint = 2L
            plasmaPoint  = 3L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 12.0f
        }

        composition {
            formula = "Ma"
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8327
            hashId              = 1016
            originalMod         = "arsmagica2"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ordo - 2")
            aspect("Praecantio - 6")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Peridot = material("peridot") {
        appearance {
            color       = Rgba(150, 255, 150, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 2.5809944
            meltingPoint = 1525L
            boilingPoint = 2460L
            plasmaPoint  = 246000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("obsidian", "magnesium_carbonate")
        }

        composition {
            formula = "(SiO₂)₂,₃FeMg₂"
            component("silicon_dioxide", 259459200L)
            component("iron", 129729600L)
            component("magnesium", 259459200L)
        }

        meta {
            numericId           = 8311
            hashId              = 1005
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 4")
            reRegisteredTo("olivine")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Almandine = material("almandine") {
        appearance {
            color       = Rgba(255, 0, 0, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 24L
            density      = 1.8011974
            meltingPoint = 1759L
            boilingPoint = 2745L
            plasmaPoint  = 274510L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 7.0f
        }

        processing {
            byProduct("grossular", "pyrope", "spessartine", "andradite", "uvarovite")
        }

        composition {
            formula = "(Al₂O₃)Fe₃(SiO₂)₃O₃"
            component("alumina", 162162000L)
            component("iron", 97297200L)
            component("silicon_dioxide", 291891600L)
            component("oxygen", 97297200L)
        }

        meta {
            numericId           = 9101
            hashId              = 957
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 1")
            aspect("Metallum - 1")
            reRegisteredTo("any_garnet")
            reRegisteredTo("garnet_red")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val TritaniumHexachloride = material("tritanium_hexachloride") {
        name = "Tritanium Hexachloride"

        appearance {
            color       = Rgba(55, 185, 155, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 3.574183429
            meltingPoint = 432L
            boilingPoint = 653L
            plasmaPoint  = 65314L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tritanium_dioxide", "salt", "sylvite")
        }

        composition {
            formula = "TnCl₆"
            component("tritanium_elemental", 92664000L)
            component("chlorine", 555984000L)
        }

        meta {
            numericId           = 9206
            hashId              = 1516
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tritanium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Alunite = material("alunite") {
        appearance {
            color       = Rgba(225, 180, 65, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 0.6758345511
            meltingPoint = 740L
            boilingPoint = 1114L
            plasmaPoint  = 111401L
        }

        processing {
            byProduct("quartzite")
        }

        composition {
            formula = "(Al₂O₃)₃(KOH)₂(SO₃)₄(H₂O)₅O₉"
            component("alumina", 159503606L)
            component("potassium_hydroxide", 63801442L)
            component("sulfur_trioxide", 170137180L)
            component("water", 159503606L)
            component("oxygen", 95702163L)
        }

        meta {
            numericId           = 9162
            hashId              = 1505
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("aluminium", "potassium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val PotassiumHydroxide = material("potassium_hydroxide") {
        name = "Potassium Hydroxide"

        appearance {
            color       = Rgba(250, 220, 220, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.2878396267
            meltingPoint = 633L
            boilingPoint = 1600L
            plasmaPoint  = 160000L
        }

        composition {
            formula = "KOH"
            component("potassium", 216216000L)
            component("oxygen", 216216000L)
            component("hydrogen", 216216000L)
        }

        meta {
            numericId           = 8015
            hashId              = 698
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val GlowstonePluto = material("glowstone_pluto") {
        name = "Pluto Glowstone"

        appearance {
            color       = Rgba(123, 150, 220, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        processing {
            oreMultiplier           = 4
            byProduct("redstone", "gold", "glowstone")
            generifyingTarget      = "glowstone" amount 648648000L
        }

        composition {
            formula = "(Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He"
            component("phosphorite", 324324000L)
            component("gold", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("helium", 64864800L)
        }

        meta {
            numericId           = 8372
            hashId              = 1070
            originalMod         = "GalaxySpace"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Sensus - 1")
            aspect("Gelum - 1")
            reRegisteredTo("any_glowstone")
            alloyRef("energetic_alloy")
            alloyRef("lumium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val OrangeFluorite = material("orange_fluorite") {
        name = "Orange Fluorite"

        appearance {
            color       = Rgba(255, 189, 88, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "yellow_fluorite", "red_fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8443
            hashId              = 656
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val HydrochloricAcid = material("hydrochloric_acid") {
        name = "Hydrochloric Acid"

        appearance {
            color       = Rgba(0, 255, 128, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.00165194
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "HCl"
            component("hydrogen", 324324000L)
            component("chlorine", 324324000L)
        }

        meta {
            numericId           = 9826
            hashId              = 581
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val ManganeseChloride = material("manganese_chloride") {
        name = "Manganese Chloride"

        appearance {
            color       = Rgba(255, 213, 213, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 19
            electrons    = 19
            neutrons     = 22
            mass         = 41L
            density      = 2.482142667
            meltingPoint = 927L
            boilingPoint = 1498L
            plasmaPoint  = 149800L
        }

        composition {
            formula = "MnCl₂"
            component("manganese", 216216000L)
            component("chlorine", 432432000L)
        }

        meta {
            numericId           = 8031
            hashId              = 629
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val BlueSapphire = material("blue_sapphire") {
        name = "Blue Sapphire"

        appearance {
            color       = Rgba(100, 100, 200, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 26L
            density      = 2.212381167
            meltingPoint = 2256L
            boilingPoint = 3230L
            plasmaPoint  = 323066L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "ruby", "green_sapphire", "purple_sapphire")
            generifyingTarget      = "sapphire" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Fe"
            component("alumina", 540540000L)
            component("iron", 108108000L)
        }

        meta {
            numericId           = 8328
            hashId              = 949
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Metallum - 1")
            reRegisteredTo("any_sapphire")
            sourceOf("sapphire", "aluminium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Gabbro = material("gabbro") {
        appearance {
            color       = Rgba(65, 60, 60, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 21
            mass         = 40L
            density      = 0.9429784125
            meltingPoint = 1673L
            boilingPoint = 3346L
            plasmaPoint  = 334600L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 32L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "((SiO₂)₂,₃FeMg₂)(Ca(CO₃))₃,₅SiO₂₈(Dark Ashes)₄"
            component("peridot", 40540500L)
            component("calcite", 121621500L)
            component("flint", 324324000L)
            component("dark_ashes", 162162000L)
        }

        meta {
            numericId           = 9176
            hashId              = 1385
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Stibnite = material("stibnite") {
        appearance {
            color       = Rgba(70, 70, 70, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 30
            electrons    = 30
            neutrons     = 37
            mass         = 67L
            density      = 3.9142
            meltingPoint = 823L
            boilingPoint = 1646L
            plasmaPoint  = 164600L
        }

        fluids {
            smeltingTarget    = "antimony" amount 162162000L
        }

        processing {
            byProduct("antimony", "realgar", "cinnabar", "galena", "arsenopyrite", "pyrite", "barite", "calcite")
        }

        composition {
            formula = "Sb₂S₃"
            component("antimony", 259459200L)
            component("sulfur", 389188800L)
        }

        meta {
            numericId           = 9131
            hashId              = 1444
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("antimony")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val LigniteCoke = material("lignite_coke") {
        name = "Lignite Coke"

        appearance {
            color       = Rgba(140, 100, 100, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 9
            mass         = 17L
            density      = 0.865
            meltingPoint = 2866L
            boilingPoint = 3866L
            plasmaPoint  = 290000L
        }

        processing {
            burningTarget         = "dark_ashes" amount 72072000L
        }

        composition {
            formula = "C₂(Dark Ashes)"
            component("carbon", 185328000L)
            component("dark_ashes", 92664000L)
        }

        meta {
            numericId           = 8365
            hashId              = 1052
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 1600L
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Talc = material("talc") {
        appearance {
            color       = Rgba(95, 145, 95, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 8
            mass         = 18L
            density      = 0.8356247143
            meltingPoint = 1313L
            boilingPoint = 2100L
            plasmaPoint  = 210085L
        }

        composition {
            formula = "Mg₃(SiO₂)₄(H₂O)O₃"
            component("magnesium", 92664000L)
            component("silicon_dioxide", 370656000L)
            component("water", 92664000L)
            component("oxygen", 92664000L)
        }

        meta {
            numericId           = 9169
            hashId              = 796
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("soapstone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Topaz = material("topaz") {
        appearance {
            color       = Rgba(255, 128, 0, 127)
            iconSet     = IconSet.GEM_HORIZONTAL
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.8258566923
            meltingPoint = 1431L
            boilingPoint = 2092L
            plasmaPoint  = 209223L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("blue_topaz")
        }

        composition {
            formula = "(Al₂O₃)(SiO₂)F₂(H₂O)"
            component("alumina", 249480000L)
            component("silicon_dioxide", 149688000L)
            component("fluorine", 99792000L)
            component("water", 149688000L)
        }

        meta {
            numericId           = 8306
            hashId              = 994
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Lucrum - 4")
            aspect("Potentia - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val BlueTopaz = material("blue_topaz") {
        name = "Blue Topaz"

        appearance {
            color       = Rgba(123, 150, 220, 127)
            iconSet     = IconSet.GEM_HORIZONTAL
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.8258566923
            meltingPoint = 1431L
            boilingPoint = 2092L
            plasmaPoint  = 209223L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("topaz")
            generifyingTarget      = "topaz" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)(SiO₂)F₂(H₂O)"
            component("alumina", 249480000L)
            component("silicon_dioxide", 149688000L)
            component("fluorine", 99792000L)
            component("water", 149688000L)
        }

        meta {
            numericId           = 8307
            hashId              = 995
            originalMod         = "arsmagica2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Lucrum - 4")
            aspect("Potentia - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val SodiumPersulfate = material("sodium_persulfate") {
        name = "Sodium Persulfate"

        appearance {
            color       = Rgba(130, 180, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 19L
            density      = 0.507286
            meltingPoint = 162L
            boilingPoint = 372L
            plasmaPoint  = 37216L
        }

        composition {
            formula = "NaSO₄"
            component("sodium", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9822
            hashId              = 673
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sodium_persulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val VolcanicAshes = material("volcanic_ashes") {
        name = "Volcanic Ashes"

        appearance {
            color       = Rgba(60, 50, 50, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 22L
            density      = 1.194171675
            meltingPoint = 1755L
            boilingPoint = 2887L
            plasmaPoint  = 288712L
        }

        processing {
            generifyingTarget      = "ashes" amount 648648000L
        }

        composition {
            formula = "SiO₂₆(Fe₂O₃)Mg"
            component("flint", 486486000L)
            component("hematite", 81081000L)
            component("magnesium", 81081000L)
        }

        meta {
            numericId           = 8202
            hashId              = 788
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 2")
            aspect("Perditio - 1")
            reRegisteredTo("volcanic_ash")
            reRegisteredTo("ash_volcanic")
            reRegisteredTo("ashes_volcanic")
            reRegisteredTo("any_ashes")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Uranium235Tetrafluoride = material("uranium235_tetrafluoride") {
        name = "Uranium-235 Tetrafluoride"

        appearance {
            color       = Rgba(86, 118, 105, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 35
            mass         = 61L
            density      = 3.7913568
            meltingPoint = 1309L
            boilingPoint = 1690L
            plasmaPoint  = 169000L
        }

        composition {
            formula = "U-235F₄"
            component("uranium235", 129729600L)
            component("fluorine", 518918400L)
        }

        meta {
            numericId           = 9011
            hashId              = 739
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
            aspect("Perditio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val Graphene = material("graphene") {
        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 2.267
            meltingPoint = 4300L
            boilingPoint = 4400L
            plasmaPoint  = 440000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 324324000L
        }

        processing {
            pulverTarget          = "carbon" amount 648648000L
            burningTarget         = "ashes" amount 162162000L
        }

        composition {
            formula = "C"
            component("carbon", 648648000L)
        }

        meta {
            numericId           = 9175
            hashId              = 1058
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_carbon")
            reRegisteredTo("any_coal_carbon")
        }

        tags(
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Flint = material("flint") {
        appearance {
            color       = Rgba(0, 32, 64, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 48L
            speed      = 2.5f
        }

        processing {
            byProduct("obsidian")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8002
            hashId              = 610
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_silicon_dioxide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SemiheavyWater = material("semiheavy_water") {
        name = "Semiheavy Water"

        appearance {
            color       = Rgba(200, 200, 155, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 6L
            density      = 1.054
            meltingPoint = 275L
            boilingPoint = 374L
            plasmaPoint  = 37400L
        }

        composition {
            formula = "HDO"
            component("hydrogen", 216216000L)
            component("deuterium", 216216000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9811
            hashId              = 569
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            aspect("Tempestas - 1")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val MagnesiumChloride = material("magnesium_chloride") {
        name = "Magnesium Chloride"

        appearance {
            color       = Rgba(235, 235, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 31L
            density      = 0.581476
            meltingPoint = 987L
            boilingPoint = 1685L
            plasmaPoint  = 168500L
        }

        composition {
            formula = "MgCl₂"
            component("magnesium", 216216000L)
            component("chlorine", 432432000L)
        }

        meta {
            numericId           = 8018
            hashId              = 636
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            reRegisteredTo("any_salt")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Anthracite = material("anthracite") {
        appearance {
            color       = Rgba(90, 90, 90, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 24L
            density      = 4.534
            meltingPoint = 1700L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 324324000L
        }

        processing {
            burningTarget         = "dark_ashes" amount 324324000L
        }

        composition {
            formula = "C₂"
            component("carbon", 1297296000L)
        }

        meta {
            numericId           = 8362
            hashId              = 1048
            originalMod         = "RotaryCraft"
            furnaceBurnTime     = 4800L
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 3")
            aspect("Ignis - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Graphite = material("graphite") {
        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 2.267
            meltingPoint = 1700L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 32L
            speed      = 5.0f
        }

        processing {
            byProduct("carbon")
            burningTarget         = "ashes" amount 162162000L
        }

        composition {
            formula = "C"
            component("carbon", 648648000L)
        }

        meta {
            numericId           = 9174
            hashId              = 853
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_carbon")
            reRegisteredTo("any_coal_carbon")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Prismane = material("prismane") {
        appearance {
            color       = Rgba(115, 110, 110, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 9.068
            meltingPoint = 3800L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        processing {
            burningTarget         = "dark_ashes" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8363
            hashId              = 1049
            originalMod         = "RotaryCraft"
            furnaceBurnTime     = 9600L
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 4")
            aspect("Ignis - 4")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Porcelain = material("porcelain") {
        appearance {
            color       = Rgba(235, 235, 245, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 19L
            density      = 0.8066228568
            meltingPoint = 1800L
            boilingPoint = 3600L
            plasmaPoint  = 360000L
        }

        composition {
            formula = "((Al₂O₃)(SiO₂)₄)₂,₁₈(SiO₂)(K₂(Al₂O₃)(SiO₂)₆O)"
            component("ceramic", 324324000L)
            component("silicon_dioxide", 162162000L)
            component("potassium_feldspar", 162162000L)
        }

        meta {
            numericId           = 8273
            hashId              = 852
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cinnabar = material("cinnabar") {
        appearance {
            color       = Rgba(150, 0, 0, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 48
            electrons    = 48
            neutrons     = 68
            mass         = 116L
            density      = 7.8003
            meltingPoint = 311L
            boilingPoint = 673L
            plasmaPoint  = 67300L
        }

        fluids {
            smeltingTarget    = "mercury" amount 216216000L
        }

        processing {
            byProduct("redstone", "sulfur", "glowstone", "selenium")
        }

        composition {
            formula = "HgS"
            component("mercury", 324324000L)
            component("sulfur", 324324000L)
        }

        meta {
            numericId           = 9114
            hashId              = 1441
            originalMod         = "Thaumcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("mercury")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.PULVERIZING_CINNABAR,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VanadiumPentoxide = material("vanadium_pentoxide") {
        name = "Vanadium Pentoxide"

        appearance {
            color       = Rgba(50, 50, 50, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 26L
            density      = 1.746735
            meltingPoint = 662L
            boilingPoint = 1115L
            plasmaPoint  = 111571L
        }

        fluids {
            smeltingTarget    = "vanadium" amount 92664000L
        }

        composition {
            formula = "V₂O₅"
            component("vanadium", 185328000L)
            component("oxygen", 463320000L)
        }

        meta {
            numericId           = 8234
            hashId              = 614
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("vanadium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Opal = material("opal") {
        appearance {
            color       = Rgba(0, 0, 255, 127)
            iconSet     = IconSet.OPAL
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("tanzanite")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8312
            hashId              = 1000
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Lucrum - 2")
            aspect("Auram - 1")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val GraniteRed = material("granite_red") {
        name = "Red Granite"

        appearance {
            color       = Rgba(160, 60, 70, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.8436734239
            meltingPoint = 1500L
            plasmaPoint  = 300000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 64L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "(K₂Mg₆(Al₂O₃)₃F₄(SiO₂)₆)(K₂(Al₂O₃)(SiO₂)₆O)SiO₂"
            component("biotite", 216216000L)
            component("potassium_feldspar", 216216000L)
            component("flint", 216216000L)
        }

        meta {
            numericId           = 8507
            hashId              = 1396
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tutamen - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SodiumCarbonate = material("sodium_carbonate") {
        name = "Sodium Carbonate"

        appearance {
            color       = Rgba(230, 230, 230, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 17L
            density      = 0.7022145
            meltingPoint = 1124L
            boilingPoint = 2248L
            plasmaPoint  = 224800L
        }

        composition {
            formula = "Na₂(CO₃)"
            component("sodium", 216216000L)
            component("carbon_trioxide", 432432000L)
        }

        meta {
            numericId           = 8013
            hashId              = 683
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Ruby = material("ruby") {
        appearance {
            color       = Rgba(255, 100, 100, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 25L
            density      = 2.0917145
            meltingPoint = 2317L
            boilingPoint = 3199L
            plasmaPoint  = 319900L
        }

        fluids {
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "orange_sapphire", "green_sapphire", "blue_sapphire")
            generifyingTarget      = "sapphire" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Cr"
            component("alumina", 540540000L)
            component("chromium", 108108000L)
        }

        meta {
            numericId           = 8302
            hashId              = 948
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Machina - 1")
            reRegisteredTo("any_sapphire")
            sourceOf("sapphire", "aluminium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val Sugar = material("sugar") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 3
            mass         = 7L
            density      = 0.6049265858
            meltingPoint = 459L
            boilingPoint = 918L
            plasmaPoint  = 91800L
        }

        composition {
            formula = "C₁₂H₂₂O₁₁"
            component("carbon", 172972800L)
            component("hydrogen", 317116800L)
            component("oxygen", 158558400L)
        }

        meta {
            numericId           = 9703
            hashId              = 593
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 1")
            aspect("Aqua - 1")
            aspect("Aer - 1")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Calcite = material("calcite") {
        appearance {
            color       = Rgba(250, 230, 220, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.7622574
            meltingPoint = 1612L
            plasmaPoint  = 300000L
        }

        processing {
            byProduct("malachite")
        }

        composition {
            formula = "Ca(CO₃)"
            component("calcium", 129729600L)
            component("carbon_trioxide", 518918400L)
        }

        meta {
            numericId           = 9107
            hashId              = 644
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("any_calcite")
            reRegisteredTo("valerite")
            reRegisteredTo("aragonite")
            reRegisteredTo("flux")
            alloyRef("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Perlite = material("perlite") {
        appearance {
            color       = Rgba(30, 20, 30, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 5
            electrons    = 5
            neutrons     = 4
            mass         = 10L
            density      = 1.223166125
            meltingPoint = 786L
            boilingPoint = 2186L
            plasmaPoint  = 218650L
        }

        processing {
            oreMultiplier           = 8
            byProduct("peridot", "magnesium_carbonate")
        }

        composition {
            formula = "(MgFe(SiO₂)₂O₄)(H₂O)"
            component("obsidian", 648648000L)
            component("water", 648648000L)
        }

        meta {
            numericId           = 9138
            hashId              = 1492
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Sodalite = material("sodalite") {
        appearance {
            color       = Rgba(20, 20, 255, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 22L
            density      = 0.8599858364
            meltingPoint = 1331L
            boilingPoint = 2206L
            plasmaPoint  = 220663L
        }

        processing {
            oreMultiplier           = 5
            byProduct("lazurite", "lapis")
        }

        composition {
            formula = "(Al₂O₃)₃,₅(SiO₂)Na₄Cl"
            component("alumina", 176904000L)
            component("silicon_dioxide", 176904000L)
            component("sodium", 235872000L)
            component("chlorine", 58968000L)
        }

        meta {
            numericId           = 8331
            hashId              = 1042
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Glycerol = material("glycerol") {
        appearance {
            color       = Rgba(0, 180, 180, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 6L
            density      = 1.5
            meltingPoint = 291L
            boilingPoint = 563L
            plasmaPoint  = 56300L
        }

        composition {
            formula = "C₃H₈O₃"
            component("carbon", 138996000L)
            component("hydrogen", 370656000L)
            component("oxygen", 138996000L)
        }

        meta {
            numericId           = 9828
            hashId              = 595
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Pinalite = material("pinalite") {
        appearance {
            color       = Rgba(55, 50, 35, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 50
            mass         = 86L
            density      = 4.844506636
            meltingPoint = 839L
            boilingPoint = 1327L
            plasmaPoint  = 132763L
        }

        fluids {
            smeltingTarget    = "tungsten_trioxide" amount 235872000L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tungstate", "lead")
        }

        composition {
            formula = "Pb₃(WO₃)Cl₂O₂"
            component("lead", 176904000L)
            component("tungsten_trioxide", 235872000L)
            component("chlorine", 117936000L)
            component("oxygen", 117936000L)
        }

        meta {
            numericId           = 9197
            hashId              = 1467
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tungsten", "lead")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Bischofite = material("bischofite") {
        appearance {
            color       = Rgba(99, 104, 118, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 20
            mass         = 43L
            density      = 2.581476
            meltingPoint = 511L
            boilingPoint = 810L
            plasmaPoint  = 81033L
        }

        composition {
            formula = "(MgCl₂)(H₂O)₂"
            component("magnesium_chloride", 648648000L)
            component("water", 1297296000L)
        }

        meta {
            numericId           = 9221
            hashId              = 1495
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val CoalCoke = material("coal_coke") {
        name = "Coal Coke"

        appearance {
            color       = Rgba(140, 140, 170, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 0.929
            meltingPoint = 1700L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            burningTarget         = "dark_ashes" amount 72072000L
        }

        composition {
            formula = "C"
            component("carbon", 648648000L)
        }

        meta {
            numericId           = 8349
            hashId              = 1046
            originalMod         = "Railcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 3200L
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 3")
            aspect("Ignis - 1")
            reRegisteredTo("any_coal_carbon")
            reRegisteredTo("coke")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tantalite = material("tantalite") {
        appearance {
            color       = Rgba(145, 80, 40, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 37
            mass         = 65L
            density      = 5.094750375
            meltingPoint = 956L
            boilingPoint = 1780L
            plasmaPoint  = 178074L
        }

        processing {
            byProduct("columbite", "coltan", "pyrolusite", "ilmenite")
        }

        composition {
            formula = "(Ta₂O₅)(MnO₂)"
            component("tantalum_pentoxide", 567567000L)
            component("pyrolusite", 81081000L)
        }

        meta {
            numericId           = 9148
            hashId              = 1476
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("manganese", "tantalum")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val TritaniumHexaiodide = material("tritanium_hexaiodide") {
        name = "Tritanium Hexaiodide"

        appearance {
            color       = Rgba(85, 185, 185, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 63
            electrons    = 63
            neutrons     = 91
            mass         = 155L
            density      = 7.797142857
            meltingPoint = 616L
            boilingPoint = 840L
            plasmaPoint  = 84000L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tritanium_dioxide", "iodine_salt")
        }

        composition {
            formula = "TnI₆"
            component("tritanium_elemental", 92664000L)
            component("iodine", 555984000L)
        }

        meta {
            numericId           = 9208
            hashId              = 1518
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("iodine", "tritanium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val FerricChloride = material("ferric_chloride") {
        name = "Ferric Chloride"

        appearance {
            color       = Rgba(180, 180, 120, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 19
            electrons    = 19
            neutrons     = 21
            mass         = 40L
            density      = 1.9709105
            meltingPoint = 580L
            boilingPoint = 589L
            plasmaPoint  = 58900L
        }

        composition {
            formula = "FeCl₃"
            component("iron", 162162000L)
            component("chlorine", 486486000L)
        }

        meta {
            numericId           = 8017
            hashId              = 634
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Lonsdaleite = material("lonsdaleite") {
        appearance {
            color       = Rgba(140, 130, 130, 255)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 48
            electrons    = 48
            neutrons     = 48
            mass         = 96L
            density      = 18.136
            meltingPoint = 3800L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        processing {
            burningTarget         = "dark_ashes" amount 1297296000L
        }

        composition {
            formula = "C₈"
            component("carbon", 5189184000L)
        }

        meta {
            numericId           = 8364
            hashId              = 1050
            originalMod         = "RotaryCraft"
            furnaceBurnTime     = 19200L
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 6")
            aspect("Ignis - 6")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RainforestJasper = material("rainforest_jasper") {
        name = "Rainforest Jasper"

        appearance {
            color       = Rgba(129, 123, 55, 150)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.142990667
            meltingPoint = 1927L
            boilingPoint = 3191L
            plasmaPoint  = 319133L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("red_jasper", "ocean_jasper", "blue_jasper", "green_jasper", "yellow_jasper")
            generifyingTarget      = "red_jasper" amount 648648000L
        }

        composition {
            formula = "(SiO₂)₂,₃Fe"
            component("silicon_dioxide", 432432000L)
            component("iron", 216216000L)
        }

        meta {
            numericId           = 8426
            hashId              = 972
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Metallum - 1")
            reRegisteredTo("any_jasper")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Scheelite = material("scheelite") {
        appearance {
            color       = Rgba(200, 140, 20, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 26
            mass         = 47L
            density      = 3.465952667
            meltingPoint = 1358L
            boilingPoint = 1621L
            plasmaPoint  = 162116L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("pyrolusite", "molybdenite", "calcite")
        }

        composition {
            formula = "Ca(WO₃)O"
            component("calcium", 108108000L)
            component("tungsten_trioxide", 432432000L)
            component("oxygen", 108108000L)
        }

        meta {
            numericId           = 9128
            hashId              = 1457
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("calcium_tungstate")
            sourceOf("tungsten")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Petrotheum = material("petrotheum") {
        appearance {
            color       = Rgba(86, 76, 82, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 33
            mass         = 59L
            density      = 4.000475282
            meltingPoint = 400L
            boilingPoint = 2000L
            plasmaPoint  = 200000L
        }

        composition {
            formula = "(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₉,₂(MgFe(SiO₂)₂O₄)₉,₆₄((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₉,₁₀(Basalz)"
            component("clay", 324324000L)
            component("obsidian", 324324000L)
            component("redstone", 324324000L)
            component("basalz", 36036000L)
        }

        meta {
            numericId           = 8245
            hashId              = 1139
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Praecantio - 2")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val TungstenTrioxide = material("tungsten_trioxide") {
        name = "Tungsten Trioxide"

        appearance {
            color       = Rgba(199, 211, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 33
            mass         = 57L
            density      = 4.81357175
            meltingPoint = 1746L
            boilingPoint = 1970L
            plasmaPoint  = 197000L
        }

        composition {
            formula = "WO₃"
            component("tungsten", 162162000L)
            component("oxygen", 486486000L)
        }

        meta {
            numericId           = 8026
            hashId              = 618
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("tungsten_oxide")
            sourceOf("tungsten")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val WaterDistilled = material("water_distilled") {
        name = "Distilled Water"

        appearance {
            color       = Rgba(110, 110, 255, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 2
            mass         = 6L
            meltingPoint = 273L
            boilingPoint = 373L
            plasmaPoint  = 37300L
        }

        composition {
            formula = "H₂O"
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9808
            hashId              = 579
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Mirabilite = material("mirabilite") {
        appearance {
            color       = Rgba(240, 250, 210, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 22
            electrons    = 22
            neutrons     = 18
            mass         = 45L
            density      = 4.859245143
            meltingPoint = 440L
            boilingPoint = 624L
            plasmaPoint  = 62443L
        }

        processing {
            byProduct("trona", "gypsum")
        }

        composition {
            formula = "(Na₂SO₄)(H₂O)₁₀"
            component("sodium_sulfate", 648648000L)
            component("water", 2779920000L)
        }

        meta {
            numericId           = 9157
            hashId              = 1494
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Pitchblende = material("pitchblende") {
        appearance {
            color       = Rgba(100, 110, 0, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 99
            electrons    = 99
            neutrons     = 150
            mass         = 249L
            density      = 15.9841148
            meltingPoint = 845L
            boilingPoint = 2333L
            plasmaPoint  = 233340L
        }

        fluids {
            smeltingTarget    = "uranium" amount 129729600L
        }

        processing {
            byProduct("lead", "radium", "rare_earth", "thorium")
        }

        composition {
            formula = "(UO₂)₃ThPb"
            component("uraninite", 389188800L)
            component("thorium", 129729600L)
            component("lead", 129729600L)
        }

        meta {
            numericId           = 9155
            hashId              = 1487
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("thorium", "uranium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val MethaneIce = material("methane_ice") {
        name = "Methane Ice"

        appearance {
            color       = Rgba(225, 200, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 2
            mass         = 7L
            density      = 1.226735952
            meltingPoint = 215L
            boilingPoint = 315L
            plasmaPoint  = 31533L
        }

        composition {
            formula = "(CH₄)(H₂O)₂,₃"
            component("methane", 324324000L)
            component("ice", 648648000L)
        }

        meta {
            numericId           = 9833
            hashId              = 743
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val PotassiumSulfide = material("potassium_sulfide") {
        name = "Potassium Sulfide"

        appearance {
            color       = Rgba(100, 220, 220, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 18
            mass         = 36L
            density      = 1.263666667
            meltingPoint = 353L
            boilingPoint = 927L
            plasmaPoint  = 92700L
        }

        composition {
            formula = "K₂S"
            component("potassium", 432432000L)
            component("sulfur", 216216000L)
        }

        meta {
            numericId           = 8272
            hashId              = 703
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("potassium_sulphide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Bastnasite = material("bastnasite") {
        appearance {
            color       = Rgba(200, 110, 45, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 16
            electrons    = 16
            neutrons     = 20
            mass         = 36L
            density      = 1.507163833
            meltingPoint = 847L
            boilingPoint = 1395L
            plasmaPoint  = 139516L
        }

        fluids {
            smeltingTarget    = "cerium" amount 72072000L
        }

        processing {
            oreMultiplier           = 3
            byProduct("monazite", "rare_earth", "neodymium")
        }

        composition {
            formula = "CeCFO₃"
            component("cerium", 108108000L)
            component("carbon", 108108000L)
            component("fluorine", 108108000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 9144
            hashId              = 1486
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("cerium", "fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val LithiumPerchlorate = material("lithium_perchlorate") {
        name = "Lithium Perchlorate"

        appearance {
            color       = Rgba(222, 244, 250, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 9
            mass         = 17L
            density      = 0.09048833333
            meltingPoint = 509L
            boilingPoint = 703L
            plasmaPoint  = 70300L
        }

        composition {
            formula = "LiClO₄"
            component("lithium", 108108000L)
            component("chlorine", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8034
            hashId              = 660
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Vulcanite = material("vulcanite") {
        appearance {
            color       = Rgba(255, 132, 72, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 40
            electrons    = 40
            neutrons     = 54
            mass         = 95L
            density      = 7.596
            meltingPoint = 1039L
            boilingPoint = 2048L
            plasmaPoint  = 204800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 3840L
            speed      = 5.0f
        }

        processing {
            byProduct("wolframite")
        }

        composition {
            formula = "CuTe"
            component("copper", 324324000L)
            component("tellurium", 324324000L)
        }

        meta {
            numericId           = 8776
            hashId              = 1167
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Vitreus - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val DiduraniumTrioxide = material("diduranium_trioxide") {
        name = "Diduranium Trioxide"

        appearance {
            color       = Rgba(45, 145, 145, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 62
            electrons    = 62
            neutrons     = 80
            mass         = 143L
            density      = 8.0008574
            meltingPoint = 512L
            boilingPoint = 1050L
            plasmaPoint  = 105040L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tritanium_dioxide", "trinium")
        }

        composition {
            formula = "Dn₂O₃"
            component("duranium_elemental", 259459200L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 9198
            hashId              = 1508
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("duranium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val BlueJasper = material("blue_jasper") {
        name = "Blue Jasper"

        appearance {
            color       = Rgba(60, 124, 151, 150)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.142990667
            meltingPoint = 1927L
            boilingPoint = 3191L
            plasmaPoint  = 319133L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("red_jasper", "ocean_jasper", "rainforest_jasper", "green_jasper", "yellow_jasper")
            generifyingTarget      = "red_jasper" amount 648648000L
        }

        composition {
            formula = "(SiO₂)₂,₃Fe"
            component("silicon_dioxide", 432432000L)
            component("iron", 216216000L)
        }

        meta {
            numericId           = 8427
            hashId              = 973
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Metallum - 1")
            reRegisteredTo("any_jasper")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Alexandrite = material("alexandrite") {
        appearance {
            color       = Rgba(200, 255, 170, 127)
            iconSet     = IconSet.OPAL
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 0.9771621333
            meltingPoint = 1319L
            boilingPoint = 2027L
            plasmaPoint  = 202733L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        composition {
            formula = "(Al₂O₃)BeO"
            component("alumina", 216216000L)
            component("beryllium", 216216000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 8388
            hashId              = 999
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Lucrum - 2")
            aspect("Auram - 1")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val TritaniumDioxide = material("tritanium_dioxide") {
        name = "Tritanium Dioxide"

        appearance {
            color       = Rgba(25, 185, 125, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 47
            electrons    = 47
            neutrons     = 71
            mass         = 118L
            density      = 8.334286
            meltingPoint = 702L
            boilingPoint = 1106L
            plasmaPoint  = 110600L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("diduranium_trioxide", "trinium")
        }

        composition {
            formula = "TnO₂"
            component("tritanium_elemental", 216216000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9204
            hashId              = 1514
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tritanium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val UraniumTetrafluoride = material("uranium_tetrafluoride") {
        name = "Uranium Tetrafluoride"

        appearance {
            color       = Rgba(86, 118, 105, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 36
            mass         = 62L
            density      = 3.7913568
            meltingPoint = 1309L
            boilingPoint = 1690L
            plasmaPoint  = 169000L
        }

        composition {
            formula = "UF₄"
            component("uranium", 129729600L)
            component("fluorine", 518918400L)
        }

        meta {
            numericId           = 9007
            hashId              = 735
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
            aspect("Perditio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val Wulfenite = material("wulfenite") {
        appearance {
            color       = Rgba(255, 128, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 35
            mass         = 61L
            density      = 3.594619333
            meltingPoint = 618L
            boilingPoint = 1215L
            plasmaPoint  = 121566L
        }

        fluids {
            smeltingTarget    = "molybdenum" amount 72072000L
        }

        processing {
            byProduct("powellite", "scheelite", "molybdenite", "galena")
        }

        composition {
            formula = "PbMoO₄"
            component("lead", 108108000L)
            component("molybdenum", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9136
            hashId              = 1485
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("molybdenum", "lead")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Kesterite = material("kesterite") {
        appearance {
            color       = Rgba(105, 155, 105, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 29
            mass         = 54L
            density      = 5.076125
            meltingPoint = 682L
            boilingPoint = 1574L
            plasmaPoint  = 157412L
        }

        fluids {
            smeltingTarget    = "copper" amount 72072000L
        }

        processing {
            byProduct("germanium", "pyrite", "stannite")
        }

        composition {
            formula = "Cu₂ZnSnS₄"
            component("copper", 162162000L)
            component("zinc", 81081000L)
            component("tin", 81081000L)
            component("sulfur", 324324000L)
        }

        meta {
            numericId           = 9213
            hashId              = 1453
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tin", "copper", "zinc")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BasalticMineralSand = material("basaltic_mineral_sand") {
        name = "Basaltic Mineral Sand"

        appearance {
            color       = Rgba(40, 50, 40, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 17
            mass         = 33L
            density      = 3.375388
            meltingPoint = 1811L
            boilingPoint = 3622L
            plasmaPoint  = 362200L
            hasMetallum  = true
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("hematite", "gold", "basalt")
        }

        composition {
            formula = "Fe₃O₄"
            component("iron", 277992000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 9003
            hashId              = 1438
            originalMod         = "PFAAGeologica"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            sourceOf("iron")
            alloyRef("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val GlowstoneProteus = material("glowstone_proteus") {
        name = "Proteus Glowstone"

        appearance {
            color       = Rgba(62, 62, 62, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        processing {
            oreMultiplier           = 4
            byProduct("redstone", "gold", "glowstone")
            generifyingTarget      = "glowstone" amount 648648000L
        }

        composition {
            formula = "(Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He"
            component("phosphorite", 324324000L)
            component("gold", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("helium", 64864800L)
        }

        meta {
            numericId           = 8371
            hashId              = 1069
            originalMod         = "GalaxySpace"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Sensus - 1")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_glowstone")
            alloyRef("energetic_alloy")
            alloyRef("lumium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val SiliconDioxide = material("silicon_dioxide") {
        name = "Silicon Dioxide"

        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        composition {
            formula = "SiO₂"
            component("silicon", 216216000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8000
            hashId              = 608
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            reRegisteredTo("any_silicon_dioxide")
            alloyRef("silicon")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val SodiumBisulfate = material("sodium_bisulfate") {
        name = "Sodium Bisulfate"

        appearance {
            color       = Rgba(240, 240, 255, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 17L
            density      = 0.4348294114
            meltingPoint = 141L
            boilingPoint = 321L
            plasmaPoint  = 32185L
        }

        composition {
            formula = "NaHSO₄"
            component("sodium", 92664000L)
            component("hydrogen", 92664000L)
            component("sulfur", 92664000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8230
            hashId              = 669
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sodium_hydrogen_sulphate")
            reRegisteredTo("sodium_bisulphate")
            reRegisteredTo("sodium_hydrogen_sulfate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val GlowstoneIo = material("glowstone_io") {
        name = "Io Glowstone"

        appearance {
            color       = Rgba(180, 20, 0, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        processing {
            oreMultiplier           = 4
            byProduct("redstone", "gold", "glowstone")
            generifyingTarget      = "glowstone" amount 648648000L
        }

        composition {
            formula = "(Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He"
            component("phosphorite", 324324000L)
            component("gold", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("helium", 64864800L)
        }

        meta {
            numericId           = 8369
            hashId              = 1067
            originalMod         = "GalaxySpace"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Sensus - 1")
            aspect("Ignis - 1")
            reRegisteredTo("any_glowstone")
            alloyRef("energetic_alloy")
            alloyRef("lumium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Spinel = material("spinel") {
        appearance {
            color       = Rgba(0, 100, 0, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 1.019959429
            meltingPoint = 1814L
            boilingPoint = 2529L
            plasmaPoint  = 252900L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "balas_ruby")
        }

        composition {
            formula = "(Al₂O₃)MgO"
            component("alumina", 463320000L)
            component("magnesium", 92664000L)
            component("oxygen", 92664000L)
        }

        meta {
            numericId           = 8326
            hashId              = 954
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 3")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Glyceryl = material("glyceryl") {
        appearance {
            color       = Rgba(0, 150, 150, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 5
            electrons    = 5
            neutrons     = 5
            mass         = 11L
            density      = 1.5
            meltingPoint = 287L
            boilingPoint = 323L
            plasmaPoint  = 32300L
        }

        composition {
            formula = "C₃H₅N₃O₉"
            component("carbon", 97297200L)
            component("hydrogen", 162162000L)
            component("nitrogen", 97297200L)
            component("oxygen", 291891600L)
        }

        meta {
            numericId           = 9821
            hashId              = 596
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Powellite = material("powellite") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 17
            mass         = 33L
            density      = 1.960952667
            meltingPoint = 704L
            boilingPoint = 1171L
            plasmaPoint  = 117150L
        }

        fluids {
            smeltingTarget    = "molybdenum" amount 72072000L
        }

        processing {
            byProduct("molybdenite", "scheelite")
        }

        composition {
            formula = "CaMoO₄"
            component("calcium", 108108000L)
            component("molybdenum", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9124
            hashId              = 1484
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("molybdenum")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val VitriolOfClay = material("vitriol_of_clay") {
        name = "Vitriol Of Clay"

        appearance {
            color       = Rgba(66, 222, 222, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 19L
            density      = 0.6831851752
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "(Al₂O₃)S₃O₉"
            component("alumina", 190778823L)
            component("sulfur", 114467294L)
            component("oxygen", 343401882L)
        }

        meta {
            numericId           = 8412
            hashId              = 734
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Chromite = material("chromite") {
        appearance {
            color       = Rgba(35, 20, 15, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.168530857
            meltingPoint = 912L
            boilingPoint = 1340L
            plasmaPoint  = 134028L
        }

        fluids {
            smeltingTarget    = "chromium" amount 144144000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("pyrolusite", "hematite", "magnesium_carbonate", "bromargyrite")
        }

        composition {
            formula = "FeCr₂O₄"
            component("iron", 92664000L)
            component("chromium", 185328000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 9113
            hashId              = 1483
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("chromium", "iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Shale = material("shale") {
        appearance {
            color       = Rgba(142, 142, 168, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.9050851861
            meltingPoint = 1802L
            boilingPoint = 3305L
            plasmaPoint  = 330500L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "(Ca(CO₃))₂,₅SiO₂(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))"
            component("calcite", 324324000L)
            component("milky_quartz", 162162000L)
            component("clay", 162162000L)
        }

        meta {
            numericId           = 9190
            hashId              = 1380
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cassiterite = material("cassiterite") {
        appearance {
            color       = Rgba(220, 220, 220, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 66
            electrons    = 66
            neutrons     = 84
            mass         = 150L
            density      = 7.289858
            meltingPoint = 757L
            boilingPoint = 1514L
            plasmaPoint  = 151400L
        }

        fluids {
            smeltingTarget    = "tin" amount 486486000L
        }

        processing {
            oreMultiplier           = 2
            byProduct("molybdenite", "wolframite", "white_fluorite", "arsenopyrite", "stannite", "sperrylite", "huebnerite", "apatite")
        }

        composition {
            formula = "SnO₂"
            component("tin", 648648000L)
            component("oxygen", 1297296000L)
        }

        meta {
            numericId           = 9108
            hashId              = 1433
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("cassiterite_sand")
            sourceOf("tin")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val SulfuricAcid = material("sulfuric_acid") {
        name = "Sulfuric Acid"

        appearance {
            color       = Rgba(255, 128, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 6
            mass         = 14L
            density      = 1.5
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "H₂SO₄"
            component("hydrogen", 185328000L)
            component("sulfur", 92664000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 9824
            hashId              = 602
            originalMod         = "factorization"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sulphuric_acid")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val GreenJasper = material("green_jasper") {
        name = "Green Jasper"

        appearance {
            color       = Rgba(91, 131, 108, 150)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.142990667
            meltingPoint = 1927L
            boilingPoint = 3191L
            plasmaPoint  = 319133L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("red_jasper", "ocean_jasper", "rainforest_jasper", "blue_jasper", "yellow_jasper")
            generifyingTarget      = "red_jasper" amount 648648000L
        }

        composition {
            formula = "(SiO₂)₂,₃Fe"
            component("silicon_dioxide", 432432000L)
            component("iron", 216216000L)
        }

        meta {
            numericId           = 8428
            hashId              = 974
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Metallum - 1")
            reRegisteredTo("any_jasper")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Methane = material("methane") {
        appearance {
            color       = Rgba(250, 200, 250, 15)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 1
            mass         = 3L
            density      = 0.453471904
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "CH₄"
            component("carbon", 129729600L)
            component("hydrogen", 518918400L)
        }

        meta {
            numericId           = 9832
            hashId              = 592
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val PotassiumFeldspar = material("potassium_feldspar") {
        name = "Potassium Feldspar"

        appearance {
            color       = Rgba(120, 40, 40, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 0.8123255385
            meltingPoint = 1853L
            boilingPoint = 2937L
            plasmaPoint  = 293707L
        }

        composition {
            formula = "K₂(Al₂O₃)(SiO₂)₆O"
            component("potassium", 49896000L)
            component("alumina", 124740000L)
            component("silicon_dioxide", 449064000L)
            component("oxygen", 24948000L)
        }

        meta {
            numericId           = 9140
            hashId              = 799
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Meteorite = material("meteorite") {
        appearance {
            color       = Rgba(222, 100, 222, 255)
            iconSet     = IconSet.SPACE
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2011L
            boilingPoint = 3334L
            plasmaPoint  = 333400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1200L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8757
            hashId              = 1342
            originalMod         = "meteors"
            hidden              = true
            handleMaterial      = ref("any_iron_or_steel")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            aspect("Alienis - 1")
            reRegisteredTo("any_iron")
            reRegisteredTo("any_iron_or_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val PotassiumNitrate = material("potassium_nitrate") {
        name = "Potassium Nitrate"

        appearance {
            color       = Rgba(230, 230, 230, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.17350752
            meltingPoint = 607L
            boilingPoint = 1214L
            plasmaPoint  = 121400L
        }

        processing {
            oreMultiplier           = 3
            byProduct("sodium_nitrate", "niter")
        }

        composition {
            formula = "KNO₃"
            component("potassium", 129729600L)
            component("nitrogen", 129729600L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 8205
            hashId              = 694
            originalMod         = "Railcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 2")
            reRegisteredTo("saltpeter")
            reRegisteredTo("nitrate")
            reRegisteredTo("salpeter")
            sourceOf("sodium", "niter", "sodium_nitrate")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val PotassiumPersulfate = material("potassium_persulfate") {
        name = "Potassium Persulfate"

        appearance {
            color       = Rgba(250, 180, 130, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 22L
            density      = 0.4891193333
            meltingPoint = 156L
            boilingPoint = 351L
            plasmaPoint  = 35150L
        }

        composition {
            formula = "KSO₄"
            component("potassium", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8022
            hashId              = 701
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("potassium_persulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val GreenDiamond = material("green_diamond") {
        name = "Green Diamond"

        appearance {
            color       = Rgba(0, 240, 0, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("graphite", "diamond")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8465
            hashId              = 929
            originalMod         = "ExtraPlanets"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val HawksEye = material("hawks_eye") {
        name = "Hawk's Eye"

        appearance {
            color       = Rgba(76, 94, 109, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("hematite", "tiger_eye", "cats_eye", "dragon_eye", "black_eye", "tiger_iron")
            generifyingTarget      = "tiger_eye" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8433
            hashId              = 982
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Terra - 1")
            reRegisteredTo("blue_tiger_eye")
            reRegisteredTo("any_tiger_eye")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val LiveRoot = material("live_root") {
        name = "Liveroot"

        appearance {
            color       = Rgba(220, 200, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 6L
            density      = 1.362
            meltingPoint = 1178L
            boilingPoint = 2465L
            plasmaPoint  = 246500L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        composition {
            formula = "(Wood)₃,₂₁Ma"
            component("wood", 648648000L)
            component("magic", 216216000L)
        }

        meta {
            numericId           = 8223
            hashId              = 819
            originalMod         = "TwilightForest"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 200L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Victus - 1")
            alloyRef("ironwood")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Spessartine = material("spessartine") {
        appearance {
            color       = Rgba(255, 100, 100, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 12
            mass         = 24L
            density      = 1.7360974
            meltingPoint = 1715L
            boilingPoint = 2625L
            plasmaPoint  = 262510L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 7.0f
        }

        processing {
            byProduct("almandine", "grossular", "pyrope", "andradite", "uvarovite")
        }

        composition {
            formula = "(Al₂O₃)Mn₃(SiO₂)₃O₃"
            component("alumina", 162162000L)
            component("manganese", 97297200L)
            component("silicon_dioxide", 291891600L)
            component("oxygen", 97297200L)
        }

        meta {
            numericId           = 9129
            hashId              = 963
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 1")
            aspect("Metallum - 1")
            reRegisteredTo("garnet")
            reRegisteredTo("any_garnet")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val TritaniumHexaastatide = material("tritanium_hexaastatide") {
        name = "Tritanium Hexaastatide"

        appearance {
            color       = Rgba(25, 125, 185, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 90
            electrons    = 90
            neutrons     = 134
            mass         = 225L
            density      = 9.571428571
            meltingPoint = 778L
            boilingPoint = 971L
            plasmaPoint  = 97114L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tritanium_dioxide", "astatine")
        }

        composition {
            formula = "TnAt₆"
            component("tritanium_elemental", 92664000L)
            component("astatine", 555984000L)
        }

        meta {
            numericId           = 9209
            hashId              = 1519
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("astatine", "tritanium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val GreenVitriol = material("green_vitriol") {
        name = "Green Vitriol"

        appearance {
            color       = Rgba(66, 222, 66, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 13
            mass         = 25L
            density      = 1.657786
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "FeSO₄"
            component("iron", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8405
            hashId              = 725
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val GarnetSand = material("garnet_sand") {
        name = "Garnet Sand"

        appearance {
            color       = Rgba(200, 100, 0, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 23L
            density      = 1.322364067
            meltingPoint = 1551L
            boilingPoint = 2412L
            plasmaPoint  = 241251L
        }

        composition {
            formula = "((Al₂O₃)Fe₃(SiO₂)₃O₃)(Ca₃Fe₂(SiO₂)₃O₆)((Al₂O₃)Ca₃(SiO₂)₃O₃)((Al₂O₃)Mg₃(SiO₂)₃O₃)((Al₂O₃)Mn₃(SiO₂)₃O₃)(Ca₃Cr₂(SiO₂)₃O₆)"
            component("almandine", 108108000L)
            component("andradite", 108108000L)
            component("grossular", 108108000L)
            component("pyrope", 108108000L)
            component("spessartine", 108108000L)
            component("uvarovite", 108108000L)
        }

        meta {
            numericId           = 9005
            hashId              = 1506
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val NiobiumPentoxide = material("niobium_pentoxide") {
        name = "Niobium Pentoxide"

        appearance {
            color       = Rgba(50, 64, 10, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 17
            electrons    = 17
            neutrons     = 20
            mass         = 38L
            density      = 2.449592143
            meltingPoint = 824L
            boilingPoint = 1497L
            plasmaPoint  = 149771L
        }

        composition {
            formula = "Nb₂O₅"
            component("niobium", 185328000L)
            component("oxygen", 463320000L)
        }

        meta {
            numericId           = 8461
            hashId              = 615
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("niobium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val PurpleDiamond = material("purple_diamond") {
        name = "Purple Diamond"

        appearance {
            color       = Rgba(120, 0, 240, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("graphite", "diamond")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8466
            hashId              = 930
            originalMod         = "ExtraPlanets"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val QuartzBlack = material("quartz_black") {
        name = "Black Quartz"

        appearance {
            color       = Rgba(20, 20, 20, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 16
            electrons    = 16
            neutrons     = 16
            mass         = 32L
            density      = 3.044486
            meltingPoint = 2893L
            boilingPoint = 3760L
            plasmaPoint  = 376000L
        }

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 32L
            speed      = 2.5f
        }

        processing {
            oreMultiplier           = 2
            byProduct("milky_quartz", "barite")
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "(SiO₂)C"
            component("silicon_dioxide", 648648000L)
            component("carbon", 648648000L)
        }

        meta {
            numericId           = 8374
            hashId              = 1084
            originalMod         = "ActuallyAdditions"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.Processing.CRYSTALLISABLE,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HydratedCoal = material("hydrated_coal") {
        name = "Hydrated Coal"

        appearance {
            color       = Rgba(70, 70, 100, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 1.054
            meltingPoint = 1541L
            boilingPoint = 3863L
            plasmaPoint  = 386366L
        }

        composition {
            formula = "C₈(H₂O)"
            component("coal", 648648000L)
            component("water", 81081000L)
        }

        meta {
            numericId           = 8335
            hashId              = 1057
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.COAL,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Butane = material("butane") {
        appearance {
            color       = Rgba(255, 40, 40, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        meta {
            numericId           = 9866
            hashId              = 762
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 36000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Redrock = material("redrock") {
        appearance {
            color       = Rgba(255, 80, 50, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.9090829587
            meltingPoint = 1802L
            boilingPoint = 3305L
            plasmaPoint  = 330500L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.5f
        }

        processing {
            byProduct("clay_red")
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "(Ca(CO₃))₂,₅SiO₂((KOH)(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₉)"
            component("calcite", 324324000L)
            component("flint", 162162000L)
            component("clay_red", 162162000L)
        }

        meta {
            numericId           = 8509
            hashId              = 1381
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
            reRegisteredTo("red_rock")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HydrogenFluoride = material("hydrogen_fluoride") {
        name = "Hydrogen Fluoride"

        appearance {
            color       = Rgba(0, 240, 240, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 5
            electrons    = 5
            neutrons     = 4
            mass         = 9L
            density      = 0.00089294
            meltingPoint = 189L
            boilingPoint = 292L
            plasmaPoint  = 29200L
        }

        composition {
            formula = "HF"
            component("hydrogen", 324324000L)
            component("fluorine", 324324000L)
        }

        meta {
            numericId           = 9829
            hashId              = 582
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Tanzanite = material("tanzanite") {
        appearance {
            color       = Rgba(64, 0, 200, 127)
            iconSet     = IconSet.GEM_HORIZONTAL
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.8945755682
            meltingPoint = 1736L
            boilingPoint = 2618L
            plasmaPoint  = 261856L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("opal")
        }

        composition {
            formula = "(Al₂O₃)₃(SiO₂)₆Ca₄(H₂O)O₄"
            component("alumina", 221130000L)
            component("silicon_dioxide", 265356000L)
            component("calcium", 58968000L)
            component("water", 44226000L)
            component("oxygen", 58968000L)
        }

        meta {
            numericId           = 8308
            hashId              = 996
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 5")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Malachite = material("malachite") {
        appearance {
            color       = Rgba(5, 95, 5, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 22L
            density      = 2.019432476
            meltingPoint = 325L
            boilingPoint = 669L
            plasmaPoint  = 66900L
        }

        fluids {
            smeltingTarget    = "copper" amount 108108000L
        }

        processing {
            oreMultiplier           = 5
            byProduct("copper", "brown_limonite", "calcite", "azurite", "arsenic")
        }

        composition {
            formula = "Cu₂(CO₃)H₂O₂"
            component("copper", 129729600L)
            component("carbon_trioxide", 259459200L)
            component("hydrogen", 129729600L)
            component("oxygen", 129729600L)
        }

        meta {
            numericId           = 9156
            hashId              = 1488
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("copper")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ferberite = material("ferberite") {
        appearance {
            color       = Rgba(55, 50, 35, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 28
            mass         = 50L
            density      = 4.521619333
            meltingPoint = 1474L
            boilingPoint = 1850L
            plasmaPoint  = 185066L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tungstate", "hematite")
        }

        composition {
            formula = "Fe(WO₃)O"
            component("iron", 108108000L)
            component("tungsten_trioxide", 432432000L)
            component("oxygen", 108108000L)
        }

        meta {
            numericId           = 9194
            hashId              = 1460
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("iron", "tungsten")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val HexafluorosilicicAcid = material("hexafluorosilicic_acid") {
        name = "Hexafluorosilicic Acid"

        appearance {
            color       = Rgba(190, 200, 190, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 1.5
            meltingPoint = 250L
            boilingPoint = 381L
            plasmaPoint  = 38100L
        }

        composition {
            formula = "H₂SiF₆"
            component("hydrogen", 144144000L)
            component("silicon", 72072000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8011
            hashId              = 606
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val IodineSalt = material("iodine_salt") {
        name = "Iodine Salt"

        appearance {
            color       = Rgba(240, 200, 240, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 19
            electrons    = 19
            neutrons     = 23
            mass         = 42L
            density      = 1.1592574
            meltingPoint = 300L
            boilingPoint = 370L
            plasmaPoint  = 37000L
        }

        processing {
            byProduct("salt", "sylvite")
        }

        composition {
            formula = "KIO₃"
            component("potassium", 129729600L)
            component("iodine", 129729600L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 8242
            hashId              = 690
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tempestas - 1")
            sourceOf("potassium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val ManaDiamond = material("mana_diamond") {
        name = "Mana Diamond"

        appearance {
            color       = Rgba(128, 255, 255, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 47L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 10.0f
        }

        processing {
            byProduct("graphite", "diamond")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄Ma"
            component("carbon", 2594592000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8278
            hashId              = 935
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magical_wood")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Praecantio - 2")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val BlueFluorite = material("blue_fluorite") {
        name = "Blue Fluorite"

        appearance {
            color       = Rgba(88, 172, 180, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "magenta_fluorite", "black_fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8438
            hashId              = 651
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val CalciumChloride = material("calcium_chloride") {
        name = "Calcium Chloride"

        appearance {
            color       = Rgba(235, 235, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 18
            mass         = 36L
            density      = 0.515476
            meltingPoint = 1048L
            boilingPoint = 2208L
            plasmaPoint  = 220800L
        }

        composition {
            formula = "CaCl₂"
            component("calcium", 216216000L)
            component("chlorine", 432432000L)
        }

        meta {
            numericId           = 8028
            hashId              = 639
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            reRegisteredTo("any_salt")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Diamond = material("diamond") {
        appearance {
            color       = Rgba(200, 255, 255, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("graphite", "pink_diamond")
            burningTarget         = "ashes" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8300
            hashId              = 927
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val GlowstoneCeres = material("glowstone_ceres") {
        name = "Ceres Glowstone"

        appearance {
            color       = Rgba(70, 90, 70, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        processing {
            oreMultiplier           = 4
            byProduct("redstone", "gold", "glowstone")
            generifyingTarget      = "glowstone" amount 648648000L
        }

        composition {
            formula = "(Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He"
            component("phosphorite", 324324000L)
            component("gold", 194594400L)
            component("silicon_dioxide", 64864800L)
            component("helium", 64864800L)
        }

        meta {
            numericId           = 8368
            hashId              = 1066
            originalMod         = "GalaxySpace"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 2")
            aspect("Sensus - 1")
            aspect("Herba - 1")
            reRegisteredTo("any_glowstone")
            alloyRef("energetic_alloy")
            alloyRef("lumium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val YellowSapphire = material("yellow_sapphire") {
        name = "Yellow Sapphire"

        appearance {
            color       = Rgba(220, 220, 50, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 15
            mass         = 30L
            density      = 1.657190833
            meltingPoint = 2294L
            boilingPoint = 3301L
            plasmaPoint  = 330166L
        }

        fluids {
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "ruby", "green_sapphire", "blue_sapphire")
            generifyingTarget      = "sapphire" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)(TiO₂)"
            component("alumina", 540540000L)
            component("rutile", 108108000L)
        }

        meta {
            numericId           = 8315
            hashId              = 952
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Tutamen - 1")
            reRegisteredTo("any_sapphire")
            sourceOf("sapphire", "aluminium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val PotassiumSulfite = material("potassium_sulfite") {
        name = "Potassium Sulfite"

        appearance {
            color       = Rgba(140, 190, 190, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 13
            mass         = 26L
            density      = 0.6325478333
            meltingPoint = 306L
            boilingPoint = 612L
            plasmaPoint  = 61200L
        }

        composition {
            formula = "K₂SO₃"
            component("potassium", 216216000L)
            component("sulfur", 108108000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 8021
            hashId              = 705
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("potassium_sulphite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Asbestos = material("asbestos") {
        appearance {
            color       = Rgba(230, 230, 230, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 0.8824001667
            meltingPoint = 915L
            boilingPoint = 1439L
            plasmaPoint  = 143983L
        }

        processing {
            byProduct("mica", "biotite", "talc", "jade")
        }

        composition {
            formula = "Mg₃(SiO₂)₂(H₂O)₂O₃"
            component("magnesium", 108108000L)
            component("silicon_dioxide", 216216000L)
            component("water", 216216000L)
            component("oxygen", 108108000L)
        }

        meta {
            numericId           = 9103
            hashId              = 794
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("chrysotile")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Limestone = material("limestone") {
        appearance {
            color       = Rgba(230, 200, 130, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.7622574
            meltingPoint = 1612L
            plasmaPoint  = 300000L
        }

        fluids {
            smeltingTarget    = "calcite" amount 324324000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.5f
        }

        processing {
            byProduct("calcite", "phosphorite")
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "Ca(CO₃)"
            component("calcite", 648648000L)
        }

        meta {
            numericId           = 9189
            hashId              = 1388
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
            reRegisteredTo("any_calcite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Kaolinite = material("kaolinite") {
        name = "Kaolinite Clay"

        appearance {
            color       = Rgba(245, 235, 235, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 23L
            density      = 1.4038955
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            smeltingTarget    = "ceramic" amount 648648000L
        }

        processing {
            byProduct("clay_brown", "clay")
            generifyingTarget      = "clay" amount 648648000L
        }

        composition {
            formula = "Ca(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₉"
            component("calcium", 36036000L)
            component("clay", 648648000L)
        }

        meta {
            numericId           = 9167
            hashId              = 851
            originalMod         = "PFAAGeologica"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_clay")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val LithiumChloride = material("lithium_chloride") {
        name = "Lithium Chloride"

        appearance {
            color       = Rgba(222, 222, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 11
            mass         = 21L
            density      = 0.268607
            meltingPoint = 880L
            boilingPoint = 1655L
            plasmaPoint  = 165500L
        }

        processing {
            byProduct("lithium")
        }

        composition {
            formula = "LiCl"
            component("lithium", 324324000L)
            component("chlorine", 324324000L)
        }

        meta {
            numericId           = 8029
            hashId              = 658
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            reRegisteredTo("any_salt")
            sourceOf("lithium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Pyrotheum = material("pyrotheum") {
        appearance {
            color       = Rgba(255, 200, 60, 255)
            iconSet     = IconSet.FIERY
        }

        physics {
            protons      = 30
            electrons    = 30
            neutrons     = 38
            mass         = 69L
            density      = 4.727722247
            meltingPoint = 3800L
            boilingPoint = 6400L
            plasmaPoint  = 640000L
        }

        composition {
            formula = "C₉S₉((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₉,₁₀(Blaze)"
            component("coal", 324324000L)
            component("sulfur", 324324000L)
            component("redstone", 324324000L)
            component("blaze", 36036000L)
        }

        meta {
            numericId           = 8212
            hashId              = 1141
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 24000L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Praecantio - 2")
            aspect("Ignis - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val DisulfuricAcid = material("disulfuric_acid") {
        name = "Disulfuric Acid"

        appearance {
            color       = Rgba(255, 150, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 1.5
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "H₂S₂O₇"
            component("hydrogen", 117936000L)
            component("sulfur", 117936000L)
            component("oxygen", 412776000L)
        }

        meta {
            numericId           = 9844
            hashId              = 604
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val ClayBrown = material("clay_brown") {
        name = "Brown Clay"

        appearance {
            color       = Rgba(230, 140, 75, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 1.328256961
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            smeltingTarget    = "ceramic" amount 648648000L
        }

        processing {
            byProduct("clay", "clay_red")
            generifyingTarget      = "clay" amount 648648000L
        }

        composition {
            formula = "(LiOH)(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₉"
            component("lithium_hydroxide", 36036000L)
            component("clay", 648648000L)
        }

        meta {
            numericId           = 8276
            hashId              = 846
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_clay")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Russellite = material("russellite") {
        appearance {
            color       = Rgba(55, 50, 35, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 31
            electrons    = 31
            neutrons     = 45
            mass         = 76L
            density      = 4.319174889
            meltingPoint = 914L
            boilingPoint = 1313L
            plasmaPoint  = 131377L
        }

        fluids {
            smeltingTarget    = "tungsten_trioxide" amount 288288000L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tungstate", "bismuth")
        }

        composition {
            formula = "Bi₂(WO₃)O₃"
            component("bismuth", 144144000L)
            component("tungsten_trioxide", 288288000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9196
            hashId              = 1466
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tungsten", "bismuth")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val EnderPearl = material("ender_pearl") {
        name = "Enderpearl"

        appearance {
            color       = Rgba(108, 220, 200, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 12
            mass         = 22L
            density      = 0.5304253
            meltingPoint = 2723L
            boilingPoint = 3785L
            plasmaPoint  = 378500L
        }

        tool {
            types      = 3
            quality    = 1
            durability = 16L
            speed      = 1.0f
        }

        composition {
            formula = "BeK₄N₅Ma₆"
            component("beryllium", 64864800L)
            component("potassium", 259459200L)
            component("nitrogen", 324324000L)
            component("magic", 389188800L)
        }

        meta {
            numericId           = 8318
            hashId              = 1031
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 4")
            aspect("Iter - 4")
            aspect("Praecantio - 2")
            reRegisteredTo("ender")
            alloyRef("vivid_alloy")
            alloyRef("pulsating_iron")
            alloyRef("vibrant_alloy")
            alloyRef("enderium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.PEARL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sugilite = material("sugilite") {
        appearance {
            color       = Rgba(153, 100, 196, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 22L
            density      = 1.027914552
            meltingPoint = 1644L
            boilingPoint = 2799L
            plasmaPoint  = 279982L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 9.0f
        }

        composition {
            formula = "KNa₂(MnO₂)₂Li₃(SiO₂)₁₂O₂"
            component("potassium", 14101043L)
            component("sodium", 28202086L)
            component("pyrolusite", 28202086L)
            component("lithium", 42303130L)
            component("silicon_dioxide", 507637565L)
            component("oxygen", 28202086L)
        }

        meta {
            numericId           = 8463
            hashId              = 1004
            originalMod         = "enderlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_iron_or_steel")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            aspect("Alienis - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val EnderEye = material("ender_eye") {
        name = "Endereye"

        appearance {
            color       = Rgba(160, 250, 230, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 18
            mass         = 32L
            density      = 0.6415364111
            meltingPoint = 3447L
            boilingPoint = 4978L
            plasmaPoint  = 497800L
        }

        tool {
            types      = 3
            quality    = 1
            durability = 16L
            speed      = 1.0f
        }

        composition {
            formula = "(BeK₄N₅Ma₆)₉,₁₀(Blaze)"
            component("ender_pearl", 648648000L)
            component("blaze", 72072000L)
        }

        meta {
            numericId           = 8319
            hashId              = 1033
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 4")
            aspect("Alienis - 4")
            aspect("Iter - 4")
            aspect("Praecantio - 3")
            aspect("Ignis - 2")
            alloyRef("melodic_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.PEARL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedAventurine = material("red_aventurine") {
        name = "Red Aventurine"

        appearance {
            color       = Rgba(116, 46, 33, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("green_aventurine", "brown_aventurine", "yellow_aventurine", "black_aventurine", "blue_aventurine")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8451
            hashId              = 993
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Potentia - 1")
            reRegisteredTo("any_aventurine")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Pumice = material("pumice") {
        appearance {
            color       = Rgba(220, 216, 127, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 16
            electrons    = 16
            neutrons     = 18
            mass         = 35L
            density      = 1.314240182
            meltingPoint = 1673L
            boilingPoint = 3346L
            plasmaPoint  = 334600L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 32L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "((SiO₂)₂,₃FeMg₂)₃,₅(Mg(CO₃))₂,₅SiO₂₄(Dark Ashes)₂"
            component("peridot", 176904000L)
            component("magnesium_carbonate", 117936000L)
            component("flint", 235872000L)
            component("dark_ashes", 117936000L)
        }

        meta {
            numericId           = 9000
            hashId              = 1384
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Maxixe = material("maxixe") {
        appearance {
            color       = Rgba(80, 80, 255, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            byProduct("alumina", "beryllium", "emerald", "aquamarine", "morganite", "goshenite", "bixbite", "heliodor")
            generifyingTarget      = "emerald" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Be₃(SiO₂)₆O₃"
            component("alumina", 111835862L)
            component("beryllium", 67101517L)
            component("silicon_dioxide", 402609103L)
            component("oxygen", 67101517L)
        }

        meta {
            numericId           = 8387
            hashId              = 945
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Radio - 2")
            reRegisteredTo("any_emerald")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val NitrogenDioxide = material("nitrogen_dioxide") {
        name = "Nitrogen Dioxide"

        appearance {
            color       = Rgba(120, 190, 255, 15)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 0.001369533333
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "NO₂"
            component("nitrogen", 216216000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9831
            hashId              = 586
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Alumina = material("alumina") {
        appearance {
            color       = Rgba(120, 195, 235, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 1.0800574
            meltingPoint = 2345L
            boilingPoint = 3250L
            plasmaPoint  = 325000L
        }

        processing {
            byProduct("bauxite", "alumina", "aluminium_hydroxide")
        }

        composition {
            formula = "Al₂O₃"
            component("aluminium", 259459200L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 8008
            hashId              = 621
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("natural_aluminum")
            sourceOf("aluminium")
            alloyRef("alumite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val SodiumSulfide = material("sodium_sulfide") {
        name = "Sodium Sulfide"

        appearance {
            color       = Rgba(220, 220, 100, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 1.336333333
            meltingPoint = 376L
            boilingPoint = 1009L
            plasmaPoint  = 100966L
        }

        composition {
            formula = "Na₂S"
            component("sodium", 432432000L)
            component("sulfur", 216216000L)
        }

        meta {
            numericId           = 9823
            hashId              = 675
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sodium_sulphide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Wolframite = material("wolframite") {
        appearance {
            color       = Rgba(55, 50, 35, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 19
            electrons    = 19
            neutrons     = 25
            mass         = 44L
            density      = 3.498952667
            meltingPoint = 1326L
            boilingPoint = 1555L
            plasmaPoint  = 155550L
        }

        tool {
            types      = 0
            quality    = 3
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tungstate", "hematite", "stannite", "magnesium_carbonate")
        }

        composition {
            formula = "Mg(WO₃)O"
            component("magnesium", 108108000L)
            component("tungsten_trioxide", 432432000L)
            component("oxygen", 108108000L)
        }

        meta {
            numericId           = 9217
            hashId              = 1459
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tungsten")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val TritiatedWater = material("tritiated_water") {
        name = "Tritiated Water"

        appearance {
            color       = Rgba(255, 100, 100, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 4
            mass         = 7L
            density      = 1.2112
            meltingPoint = 280L
            boilingPoint = 377L
            plasmaPoint  = 37700L
        }

        composition {
            formula = "T₂O"
            component("tritium", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9813
            hashId              = 571
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            aspect("Radio - 1")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val MagnesiumCarbonate = material("magnesium_carbonate") {
        name = "Magnesium Carbonate"

        appearance {
            color       = Rgba(240, 230, 230, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.8018574
            meltingPoint = 623L
            plasmaPoint  = 300000L
        }

        processing {
            byProduct("cobaltite", "pyrolusite")
        }

        composition {
            formula = "Mg(CO₃)"
            component("magnesium", 129729600L)
            component("carbon_trioxide", 518918400L)
        }

        meta {
            numericId           = 8016
            hashId              = 637
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("magnesite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Dioptase = material("dioptase") {
        appearance {
            color       = Rgba(0, 180, 180, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 19L
            density      = 1.786735875
            meltingPoint = 1023L
            boilingPoint = 1713L
            plasmaPoint  = 171300L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        composition {
            formula = "(SiO₂)CuO(H₂O)"
            component("silicon_dioxide", 243243000L)
            component("copper", 81081000L)
            component("oxygen", 81081000L)
            component("water", 243243000L)
        }

        meta {
            numericId           = 8325
            hashId              = 1008
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Permutatio - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val SaltedWater = material("salted_water") {
        name = "Salted Water"

        appearance {
            color       = Rgba(255, 0, 200, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 13L
            meltingPoint = 273L
            boilingPoint = 363L
            plasmaPoint  = 36300L
        }

        composition {
            formula = "(H₂O)(KCl)"
            component("water", 486486000L)
            component("sylvite", 162162000L)
        }

        meta {
            numericId           = 9815
            hashId              = 715
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            reRegisteredTo("saltedwater")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Molybdenite = material("molybdenite") {
        appearance {
            color       = Rgba(25, 25, 25, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 28
            mass         = 53L
            density      = 4.784666667
            meltingPoint = 1224L
            boilingPoint = 2115L
            plasmaPoint  = 211533L
        }

        fluids {
            smeltingTarget    = "molybdenum" amount 162162000L
        }

        processing {
            byProduct("powellite", "scheelite", "rhenium", "wulfenite", "osmium_elemental")
        }

        composition {
            formula = "MoS₂"
            component("molybdenum", 216216000L)
            component("sulfur", 432432000L)
        }

        meta {
            numericId           = 9123
            hashId              = 1442
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("molybdenum")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val UraniumHexafluoride = material("uranium_hexafluoride") {
        name = "Uranium Hexafluoride"

        appearance {
            color       = Rgba(66, 98, 85, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 28
            mass         = 49L
            density      = 2.708596571
            meltingPoint = 100L
            boilingPoint = 329L
            plasmaPoint  = 32900L
        }

        composition {
            formula = "UF₆"
            component("uranium", 92664000L)
            component("fluorine", 555984000L)
        }

        meta {
            numericId           = 9008
            hashId              = 736
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
            aspect("Perditio - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Barite = material("barite") {
        appearance {
            color       = Rgba(230, 235, 255, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 17
            electrons    = 17
            neutrons     = 21
            mass         = 38L
            density      = 0.9444526667
            meltingPoint = 1853L
            boilingPoint = 3706L
            plasmaPoint  = 370600L
        }

        fluids {
            smeltingTarget    = "barium" amount 72072000L
        }

        processing {
            byProduct("certus_quartz", "quartzite")
        }

        composition {
            formula = "BaSO₄"
            component("barium", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 9160
            hashId              = 1455
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("barium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val GreenSapphire = material("green_sapphire") {
        name = "Green Sapphire"

        appearance {
            color       = Rgba(100, 200, 130, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 1.1897145
            meltingPoint = 2108L
            boilingPoint = 2935L
            plasmaPoint  = 293550L
        }

        fluids {
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("alumina", "ruby", "yellow_sapphire", "blue_sapphire")
            generifyingTarget      = "sapphire" amount 648648000L
        }

        composition {
            formula = "(Al₂O₃)Mg"
            component("alumina", 540540000L)
            component("magnesium", 108108000L)
        }

        meta {
            numericId           = 8305
            hashId              = 950
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Sano - 1")
            reRegisteredTo("any_sapphire")
            sourceOf("sapphire", "aluminium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val CobaltHexahydrate = material("cobalt_hexahydrate") {
        name = "Cobalt Hexahydrate"

        appearance {
            color       = Rgba(80, 80, 250, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 13L
            density      = 2.122857143
            meltingPoint = 486L
            boilingPoint = 776L
            plasmaPoint  = 77685L
        }

        composition {
            formula = "Co(H₂O)₂"
            component("cobalt", 92664000L)
            component("water", 555984000L)
        }

        meta {
            numericId           = 8229
            hashId              = 742
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Komatiite = material("komatiite") {
        appearance {
            color       = Rgba(190, 190, 105, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 21
            mass         = 39L
            density      = 0.9874687667
            meltingPoint = 1673L
            boilingPoint = 3346L
            plasmaPoint  = 334600L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 32L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            formula = "((SiO₂)₂,₃FeMg₂)(Mg(CO₃))₂,₅SiO₂₆(Dark Ashes)₃"
            component("peridot", 54054000L)
            component("magnesium_carbonate", 108108000L)
            component("flint", 324324000L)
            component("dark_ashes", 162162000L)
        }

        meta {
            numericId           = 9177
            hashId              = 1383
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PinkVitriol = material("pink_vitriol") {
        name = "Pink Vitriol"

        appearance {
            color       = Rgba(222, 111, 111, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.6351193333
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "MgSO₄"
            component("magnesium", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8407
            hashId              = 727
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Garnierite = material("garnierite") {
        appearance {
            color       = Rgba(50, 200, 70, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 36
            electrons    = 36
            neutrons     = 38
            mass         = 74L
            density      = 8.913429
            meltingPoint = 891L
            boilingPoint = 1638L
            plasmaPoint  = 163800L
        }

        fluids {
            smeltingTarget    = "nickel" amount 486486000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("nickel", "sperrylite")
        }

        composition {
            formula = "NiO"
            component("nickel", 648648000L)
            component("oxygen", 648648000L)
        }

        meta {
            numericId           = 9118
            hashId              = 1435
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("nickel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Arsenopyrite = material("arsenopyrite") {
        appearance {
            color       = Rgba(250, 240, 30, 255)
            iconSet     = IconSet.CUBE_SHINY
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 29
            mass         = 54L
            density      = 5.239
            meltingPoint = 1028L
            boilingPoint = 1647L
            plasmaPoint  = 164700L
        }

        fluids {
            smeltingTarget    = "arsenic" amount 162162000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("gold", "realgar", "orange_fluorite", "cassiterite", "huebnerite")
        }

        composition {
            formula = "FeAsS"
            component("iron", 216216000L)
            component("arsenic", 216216000L)
            component("sulfur", 216216000L)
        }

        meta {
            numericId           = 9216
            hashId              = 1447
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("iron", "arsenic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CarbonMonoxide = material("carbon_monoxide") {
        name = "Carbon Monoxide"

        appearance {
            color       = Rgba(10, 10, 10, 15)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 14L
            density      = 1.1342145
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "CO"
            component("carbon", 324324000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 9838
            hashId              = 589
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val CarbonTrioxide = material("carbon_trioxide") {
        name = "Carbon Trioxide"

        appearance {
            color       = Rgba(45, 45, 45, 15)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 15L
            density      = 0.56782175
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "CO₃"
            component("carbon", 162162000L)
            component("oxygen", 486486000L)
        }

        meta {
            numericId           = 9843
            hashId              = 591
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val HeliumNeon = material("helium_neon") {
        name = "Helium-Neon"

        appearance {
            color       = Rgba(255, 0, 128, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 0.0005392
            meltingPoint = 12L
            boilingPoint = 15L
            plasmaPoint  = 1550L
        }

        composition {
            formula = "HeNe"
            component("helium", 324324000L)
            component("neon", 324324000L)
        }

        meta {
            numericId           = 9839
            hashId              = 583
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Adamantine = material("adamantine") {
        appearance {
            color       = Rgba(255, 0, 64, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 99
            electrons    = 99
            neutrons     = 253
            mass         = 352L
            density      = 5.724922694
            meltingPoint = 5225L
            boilingPoint = 14528L
            plasmaPoint  = 1452800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 5
            durability = 4500L
            speed      = 10.0f
        }

        processing {
            byProduct("granitic_mineral_sand")
        }

        composition {
            formula = "Ad₃O₄"
            component("adamantium", 277992000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8784
            hashId              = 1165
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 5")
            aspect("Praecantio - 5")
            sourceOf("adamantium")
            alloyRef("tartarite")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
        )

    }

    val Amethyst = material("amethyst") {
        appearance {
            color       = Rgba(166, 120, 241, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 14
            mass         = 27L
            density      = 2.1967888
            meltingPoint = 1951L
            boilingPoint = 3202L
            plasmaPoint  = 320280L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 128L
            speed      = 6.0f
        }

        composition {
            formula = "(SiO₂)₄,₃Fe"
            component("silicon_dioxide", 518918400L)
            component("iron", 129729600L)
        }

        meta {
            numericId           = 8313
            hashId              = 1007
            originalMod         = "BiomesOPlenty"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Lucrum - 6")
            reRegisteredTo("any_amethyst")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val ChloroplatinicAcid = material("chloroplatinic_acid") {
        name = "Chloroplatinic Acid"

        appearance {
            color       = Rgba(255, 70, 70, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 25
            mass         = 45L
            density      = 2.386607084
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "PtCl₆H₂"
            component("platinum", 72072000L)
            component("chlorine", 432432000L)
            component("hydrogen", 144144000L)
        }

        meta {
            numericId           = 8401
            hashId              = 718
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Obsidian = material("obsidian") {
        appearance {
            color       = Rgba(80, 50, 100, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.223166125
            meltingPoint = 1300L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            smeltingTarget    = "lava" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 32L
            speed      = 3.0f
        }

        processing {
            byProduct("peridot", "magnesium_carbonate")
        }

        composition {
            formula = "MgFe(SiO₂)₂O₄"
            component("magnesium", 10135125L)
            component("iron", 10135125L)
            component("silicon_dioxide", 60810750L)
            component("oxygen", 40540500L)
        }

        meta {
            numericId           = 8214
            hashId              = 1130
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tenebrae - 1")
            aspect("Ignis - 2")
            aspect("Terra - 2")
            alloyRef("alumite")
            alloyRef("obsidian_steel")
            alloyRef("end_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val LithiumChlorate = material("lithium_chlorate") {
        name = "Lithium Chlorate"

        appearance {
            color       = Rgba(222, 233, 250, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 9
            mass         = 18L
            density      = 0.1083002
            meltingPoint = 400L
            boilingPoint = 800L
            plasmaPoint  = 80000L
        }

        composition {
            formula = "LiClO₃"
            component("lithium", 129729600L)
            component("chlorine", 129729600L)
            component("oxygen", 389188800L)
        }

        meta {
            numericId           = 8033
            hashId              = 659
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("lithium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Stannite = material("stannite") {
        appearance {
            color       = Rgba(155, 145, 55, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 28
            mass         = 53L
            density      = 5.168625
            meltingPoint = 822L
            boilingPoint = 1818L
            plasmaPoint  = 181837L
        }

        fluids {
            smeltingTarget    = "copper" amount 72072000L
        }

        processing {
            byProduct("germanium", "pyrite", "kesterite")
        }

        composition {
            formula = "Cu₂FeSnS₄"
            component("copper", 162162000L)
            component("iron", 81081000L)
            component("tin", 81081000L)
            component("sulfur", 324324000L)
        }

        meta {
            numericId           = 9214
            hashId              = 1454
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tin", "iron", "copper")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlackFluorite = material("black_fluorite") {
        name = "Black Fluorite"

        appearance {
            color       = Rgba(48, 48, 48, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            smeltingTarget    = "fluorite" amount 648648000L
        }

        processing {
            byProduct("huebnerite", "yttrium", "cerium", "hematite", "sodium", "barium", "white_fluorite", "fluorite")
            generifyingTarget      = "fluorite" amount 648648000L
        }

        composition {
            formula = "CaF₂"
            component("calcium", 216216000L)
            component("fluorine", 432432000L)
        }

        meta {
            numericId           = 8440
            hashId              = 653
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Venemum - 2")
            reRegisteredTo("any_fluorite")
            sourceOf("fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val FerrousChloride = material("ferrous_chloride") {
        name = "Ferrous Chloride"

        appearance {
            color       = Rgba(199, 233, 199, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 22
            mass         = 42L
            density      = 2.626809333
            meltingPoint = 950L
            boilingPoint = 1296L
            plasmaPoint  = 129600L
        }

        composition {
            formula = "FeCl₂"
            component("iron", 216216000L)
            component("chlorine", 432432000L)
        }

        meta {
            numericId           = 8030
            hashId              = 633
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Diamantine = material("diamantine") {
        appearance {
            color       = Rgba(128, 128, 255, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            solidifyingTarget = "diamond" amount 648648000L
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1600L
            speed      = 10.0f
        }

        processing {
            pulverTarget          = "diamond" amount 648648000L
            smashingTarget        = "diamond" amount 648648000L
            cuttingTarget         = "diamond" amount 648648000L
            workingTarget         = "diamond" amount 648648000L
            forgingTarget         = "diamond" amount 648648000L
            burningTarget         = "ashes" amount 648648000L
            bendingTarget         = "diamond" amount 648648000L
            compressingTarget     = "diamond" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("diamond", 648648000L)
        }

        meta {
            numericId           = 8377
            hashId              = 1090
            originalMod         = "ActuallyAdditions"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 2")
            reRegisteredTo("any_diamond")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Pollucite = material("pollucite") {
        appearance {
            color       = Rgba(240, 210, 210, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 13
            mass         = 25L
            density      = 0.9414441538
            meltingPoint = 1455L
            boilingPoint = 2273L
            plasmaPoint  = 227330L
        }

        processing {
            byProduct("zeolite", "caesium", "rubidium")
        }

        composition {
            formula = "(Al₂O₃)Cs₂(SiO₂)₄(H₂O)₂O"
            component("alumina", 124740000L)
            component("caesium", 49896000L)
            component("silicon_dioxide", 299376000L)
            component("water", 149688000L)
            component("oxygen", 24948000L)
        }

        meta {
            numericId           = 9147
            hashId              = 1470
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("aluminium", "caesium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Grossular = material("grossular") {
        appearance {
            color       = Rgba(200, 100, 0, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 22L
            density      = 0.8510974
            meltingPoint = 1655L
            boilingPoint = 2538L
            plasmaPoint  = 253855L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 7.0f
        }

        processing {
            byProduct("almandine", "pyrope", "spessartine", "andradite", "uvarovite")
        }

        composition {
            formula = "(Al₂O₃)Ca₃(SiO₂)₃O₃"
            component("alumina", 162162000L)
            component("calcium", 97297200L)
            component("silicon_dioxide", 291891600L)
            component("oxygen", 97297200L)
        }

        meta {
            numericId           = 9119
            hashId              = 959
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 1")
            aspect("Volatus - 1")
            reRegisteredTo("garnet_orange")
            reRegisteredTo("any_garnet")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Yellorite = material("yellorite") {
        appearance {
            color       = Rgba(150, 140, 40, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 59
            electrons    = 59
            neutrons     = 71
            mass         = 130L
            density      = 1.002858
            meltingPoint = 369L
            boilingPoint = 1060L
            plasmaPoint  = 9333L
        }

        fluids {
            smeltingTarget    = "yellorium" amount 216216000L
        }

        processing {
            byProduct("lead", "radium", "rare_earth", "thorium")
        }

        composition {
            formula = "(Yellorium)O₂"
            component("yellorium", 648648000L)
            component("oxygen", 1297296000L)
        }

        meta {
            numericId           = 8724
            hashId              = 1296
            originalMod         = "BigReactors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val PotassiumSulfate = material("potassium_sulfate") {
        name = "Potassium Sulfate"

        appearance {
            color       = Rgba(140, 190, 190, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 24L
            density      = 0.542388
            meltingPoint = 1342L
            boilingPoint = 1962L
            plasmaPoint  = 196200L
        }

        composition {
            formula = "K₂SO₄"
            component("potassium", 185328000L)
            component("sulfur", 92664000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8271
            hashId              = 707
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("potassium_sulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Bone = material("bone") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 5L
            density      = 0.1925
            meltingPoint = 1115L
            boilingPoint = 1757L
            plasmaPoint  = 175700L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 64L
            speed      = 4.0f
        }

        processing {
            oreMultiplier           = 4
        }

        composition {
            formula = "Ca"
            component("calcium", 81081000L)
        }

        meta {
            numericId           = 8219
            hashId              = 873
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 2")
            aspect("Corpus - 1")
            reRegisteredTo("fossil")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlueAventurine = material("blue_aventurine") {
        name = "Blue Aventurine"

        appearance {
            color       = Rgba(67, 103, 138, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("green_aventurine", "brown_aventurine", "yellow_aventurine", "black_aventurine", "red_aventurine")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8450
            hashId              = 992
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Potentia - 1")
            reRegisteredTo("any_aventurine")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Glauconite = material("glauconite") {
        appearance {
            color       = Rgba(130, 180, 60, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 8
            mass         = 18L
            density      = 0.7890685592
            meltingPoint = 1166L
            boilingPoint = 1652L
            plasmaPoint  = 165247L
        }

        processing {
            byProduct("sodium", "alumina", "hematite")
        }

        composition {
            formula = "(Al₂O₃)₂KMg₂(H₂O)O₇"
            component("alumina", 282020869L)
            component("potassium", 28202086L)
            component("magnesium", 56404173L)
            component("water", 84606260L)
            component("oxygen", 197414608L)
        }

        meta {
            numericId           = 9150
            hashId              = 1500
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("glauconite_sand")
            sourceOf("aluminium", "potassium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val AmethystEnder = material("amethyst_ender") {
        name = "Ender Amethyst"

        appearance {
            color       = Rgba(210, 50, 210, 127)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 14
            mass         = 27L
            density      = 2.1967888
            meltingPoint = 1625L
            boilingPoint = 2669L
            plasmaPoint  = 266900L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2560L
            speed      = 10.0f
        }

        processing {
            generifyingTarget      = "amethyst" amount 648648000L
        }

        composition {
            formula = "(SiO₂)₄,₃FeMa"
            component("silicon_dioxide", 518918400L)
            component("iron", 129729600L)
            component("magic", 129729600L)
        }

        meta {
            numericId           = 8329
            hashId              = 1030
            originalMod         = "BiomesOPlenty"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_iron_or_steel")
            aspect("Vitreus - 4")
            aspect("Lucrum - 4")
            aspect("Alienis - 2")
            reRegisteredTo("any_amethyst")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val TritaniumHexafluoride = material("tritanium_hexafluoride") {
        name = "Tritanium Hexafluoride"

        appearance {
            color       = Rgba(85, 125, 125, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 36
            mass         = 61L
            density      = 3.572882286
            meltingPoint = 331L
            boilingPoint = 521L
            plasmaPoint  = 52114L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("tritanium_dioxide", "magenta_fluorite")
        }

        composition {
            formula = "TnF₆"
            component("tritanium_elemental", 92664000L)
            component("fluorine", 555984000L)
        }

        meta {
            numericId           = 9205
            hashId              = 1515
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("tritanium_elemental", "fluorine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val GraniticMineralSand = material("granitic_mineral_sand") {
        name = "Granitic Mineral Sand"

        appearance {
            color       = Rgba(40, 60, 60, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 17
            mass         = 33L
            density      = 3.375388
            meltingPoint = 1811L
            boilingPoint = 3622L
            plasmaPoint  = 362200L
            hasMetallum  = true
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("hematite", "gold", "granite_black")
        }

        composition {
            formula = "Fe₃O₄"
            component("iron", 277992000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 9004
            hashId              = 1439
            originalMod         = "PFAAGeologica"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            sourceOf("iron")
            alloyRef("iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val PotassiumBisulfate = material("potassium_bisulfate") {
        name = "Potassium Bisulfate"

        appearance {
            color       = Rgba(255, 240, 240, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 19L
            density      = 0.4192579829
            meltingPoint = 136L
            boilingPoint = 304L
            plasmaPoint  = 30414L
        }

        composition {
            formula = "KHSO₄"
            component("potassium", 92664000L)
            component("hydrogen", 92664000L)
            component("sulfur", 92664000L)
            component("oxygen", 370656000L)
        }

        meta {
            numericId           = 8232
            hashId              = 699
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("potassium_bisulphate")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val TigerIron = material("tiger_iron") {
        name = "Tiger Iron"

        appearance {
            color       = Rgba(106, 86, 66, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("hematite", "tiger_eye", "cats_eye", "dragon_eye", "hawks_eye", "black_eye")
            generifyingTarget      = "tiger_eye" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8435
            hashId              = 986
            originalMod         = "globbypotato_rockhounding"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lucrum - 1")
            aspect("Terra - 1")
            reRegisteredTo("any_tiger_eye")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Ethylene = material("ethylene") {
        appearance {
            color       = Rgba(64, 40, 100, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        meta {
            numericId           = 9868
            hashId              = 764
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Borax = material("borax") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 3
            mass         = 8L
            density      = 0.9607442517
            meltingPoint = 434L
            boilingPoint = 719L
            plasmaPoint  = 71934L
        }

        processing {
            oreMultiplier           = 2
            byProduct("boron", "salt")
        }

        composition {
            formula = "Na₂B₄(H₂O)₁₀O₇"
            component("sodium", 30169674L)
            component("boron", 60339348L)
            component("water", 452545116L)
            component("oxygen", 105593860L)
        }

        meta {
            numericId           = 9139
            hashId              = 1496
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("sodium", "boron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val SilverIodide = material("silver_iodide") {
        name = "Silver Iodide"

        appearance {
            color       = Rgba(240, 200, 100, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 67
            mass         = 117L
            density      = 7.7155
            meltingPoint = 831L
            boilingPoint = 1779L
            plasmaPoint  = 177900L
        }

        composition {
            formula = "AgI"
            component("silver", 324324000L)
            component("iodine", 324324000L)
        }

        meta {
            numericId           = 8243
            hashId              = 605
            originalMod         = "RotaryCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tempestas - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val SodiumAluminate = material("sodium_aluminate") {
        name = "Sodium Aluminate"

        appearance {
            color       = Rgba(230, 230, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.9179645
            meltingPoint = 1920L
            boilingPoint = 3840L
            plasmaPoint  = 384000L
        }

        composition {
            formula = "NaAlO₂"
            component("sodium", 162162000L)
            component("aluminium", 162162000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 8012
            hashId              = 684
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val DuraniumHexabromide = material("duranium_hexabromide") {
        name = "Duranium Hexabromide"

        appearance {
            color       = Rgba(45, 125, 175, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 65
            mass         = 116L
            density      = 5.533142857
            meltingPoint = 398L
            boilingPoint = 640L
            plasmaPoint  = 64042L
        }

        tool {
            types      = 0
            quality    = 4
            durability = 1L
            speed      = 1.0f
        }

        processing {
            byProduct("diduranium_trioxide", "bromargyrite")
        }

        composition {
            formula = "DnBr₆"
            component("duranium_elemental", 92664000L)
            component("bromine", 555984000L)
        }

        meta {
            numericId           = 9201
            hashId              = 1511
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("bromine", "duranium_elemental")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val Columbite = material("columbite") {
        appearance {
            color       = Rgba(65, 77, 14, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 23
            mass         = 44L
            density      = 3.073750375
            meltingPoint = 822L
            boilingPoint = 1601L
            plasmaPoint  = 160224L
        }

        processing {
            byProduct("tantalite", "coltan", "pyrolusite", "ilmenite")
        }

        composition {
            formula = "(Nb₂O₅)(MnO₂)"
            component("niobium_pentoxide", 567567000L)
            component("pyrolusite", 81081000L)
        }

        meta {
            numericId           = 9246
            hashId              = 1477
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            sourceOf("manganese", "niobium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val ElvenDragonstone = material("elven_dragonstone") {
        name = "Dragonstone"

        appearance {
            color       = Rgba(240, 140, 240, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 46L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 12.0f
        }

        processing {
            byProduct("graphite")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄Ma₂"
            component("carbon", 2594592000L)
            component("magic", 1297296000L)
        }

        meta {
            numericId           = 8279
            hashId              = 936
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magical_wood")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            aspect("Praecantio - 4")
            reRegisteredTo("any_diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val SodiumSulfite = material("sodium_sulfite") {
        name = "Sodium Sulfite"

        appearance {
            color       = Rgba(190, 190, 140, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.6688811667
            meltingPoint = 306L
            boilingPoint = 612L
            plasmaPoint  = 61200L
        }

        composition {
            formula = "Na₂SO₃"
            component("sodium", 216216000L)
            component("sulfur", 108108000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = 8269
            hashId              = 677
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("sodium_sulphite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Apatite = material("apatite") {
        appearance {
            color       = Rgba(120, 180, 250, 255)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 16
            electrons    = 16
            neutrons     = 16
            mass         = 32L
            density      = 0.9776270667
            meltingPoint = 771L
            boilingPoint = 1269L
            plasmaPoint  = 126933L
        }

        processing {
            oreMultiplier           = 4
            byProduct("phosphorite", "blue_phosphorus", "blue_fluorite", "phosphate")
        }

        composition {
            formula = "Ca₅(PO₄)₃,₅Cl"
            component("calcium", 360360000L)
            component("phosphate", 216216000L)
            component("chlorine", 72072000L)
        }

        meta {
            numericId           = 8209
            hashId              = 861
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            sourceOf("phosphor")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Propane = material("propane") {
        appearance {
            color       = Rgba(255, 20, 20, 255)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        meta {
            numericId           = 9865
            hashId              = 761
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 36000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val WhiteVitriol = material("white_vitriol") {
        name = "White Vitriol"

        appearance {
            color       = Rgba(222, 222, 222, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 13
            mass         = 26L
            density      = 1.534452667
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            formula = "ZnSO₄"
            component("zinc", 108108000L)
            component("sulfur", 108108000L)
            component("oxygen", 432432000L)
        }

        meta {
            numericId           = 8409
            hashId              = 731
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.ACID,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val QuartzSand = material("quartz_sand") {
        name = "Quartz Sand"

        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 216216000L
        }

        processing {
            byProduct("certus_quartz", "quartzite", "barite")
        }

        composition {
            formula = "SiO₂SiO₂"
            component("certus_quartz", 324324000L)
            component("milky_quartz", 324324000L)
        }

        meta {
            numericId           = 9006
            hashId              = 1507
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
        )

    }

    val RedDiamond = material("red_diamond") {
        name = "Red Diamond"

        appearance {
            color       = Rgba(240, 0, 0, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("graphite", "diamond")
            burningTarget         = "ashes" amount 648648000L
            generifyingTarget      = "diamond" amount 648648000L
        }

        composition {
            formula = "C₄"
            component("carbon", 2594592000L)
        }

        meta {
            numericId           = 8467
            hashId              = 931
            originalMod         = "ExtraPlanets"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
            reRegisteredTo("any_diamond")
            sourceOf("graphite", "diamond")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }
}
