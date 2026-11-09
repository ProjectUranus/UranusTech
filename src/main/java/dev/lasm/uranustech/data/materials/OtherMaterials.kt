package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: OtherMaterials
@Suppress("unused") object OtherMaterials {
    fun init() = Unit

    val Cragrock = material("cragrock") {
        appearance {
            color       = Rgba(93, 96, 107, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 1400L
            boilingPoint = 2800L
            plasmaPoint  = 280000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 4.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8524
            hashId              = 1375
            originalMod         = "thebetweenlands"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Venemum - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BETWEENLANDS,
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

    val SaturnRock = material("saturn_rock") {
        name = "Saturn"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9259
            hashId              = 1421
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Prismarine = material("prismarine") {
        name = "Light Prismarine"

        appearance {
            color       = Rgba(110, 178, 165, 255)
            iconSet     = IconSet.PRISMARINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 48L
            speed      = 4.0f
        }

        meta {
            numericId           = 9219
            hashId              = 1132
            originalMod         = "etfuturum"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tempestas - 1")
            reRegisteredTo("any_stone")
            reRegisteredTo("any_prismarine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Infinity = material("infinity") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100000L
            boilingPoint = 200000L
            plasmaPoint  = 20000000L
        }

        tool {
            types      = 3
            quality    = 15
            durability = 1000000000L
            speed      = 1000000000.0f
        }

        meta {
            numericId           = 8801
            hashId              = 1355
            originalMod         = "Avaritia"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 10")
            aspect("Nebrisum - 10")
            aspect("Permutatio - 10")
            aspect("Magneto - 10")
            aspect("Praecantio - 10")
            aspect("Auram - 10")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Red = material("red") {
        appearance {
            color       = Rgba(255, 0, 0, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8251
            hashId              = 553
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val ArcaneCompound = material("arcane_compound") {
        name = "Arcane Compound"

        appearance {
            color       = Rgba(180, 140, 50, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            smeltingTarget    = "arcane_ashes" amount 1297296000L
        }

        meta {
            numericId           = 8366
            hashId              = 1019
            originalMod         = "arsmagica2"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Praecantio - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Moonstone = material("moonstone") {
        appearance {
            color       = Rgba(210, 210, 255, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 512L
            speed      = 14.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8452
            hashId              = 1020
            originalMod         = "arsmagica2"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            aspect("Praecantio - 1")
            aspect("Vacuos - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Almond = material("almond") {
        appearance {
            color       = Rgba(200, 160, 140, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9714
            hashId              = 913
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Bedrockium = material("bedrockium") {
        appearance {
            color       = Rgba(88, 88, 88, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
            hasMetallum  = true
        }

        meta {
            numericId           = 8795
            hashId              = 1350
            originalMod         = "ExtraUtilities"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Terra - 10")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
        )

    }

    val Sunstone = material("sunstone") {
        appearance {
            color       = Rgba(255, 150, 0, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 512L
            speed      = 14.0f
        }

        processing {
            oreMultiplier           = 4
        }

        meta {
            numericId           = 8453
            hashId              = 1021
            originalMod         = "arsmagica2"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Ignis - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WaxSoulful = material("wax_soulful") {
        name = "Soulful Wax"

        appearance {
            color       = Rgba(90, 40, 10, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        processing {
            generifyingTarget      = "wax" amount 648648000L
        }

        meta {
            numericId           = 8281
            hashId              = 836
            originalMod         = "MagicBees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Spiritus - 1")
            reRegisteredTo("any_wax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val DominicanAmber = material("dominican_amber") {
        name = "Blue Amber"

        appearance {
            color       = Rgba(80, 80, 240, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 473L
            boilingPoint = 946L
            plasmaPoint  = 94600L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 384L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 2
            generifyingTarget      = "amber" amount 648648000L
        }

        meta {
            numericId           = 8422
            hashId              = 1012
            originalMod         = "fossil"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Vinculum - 2")
            aspect("Sensus - 2")
            reRegisteredTo("any_amber")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Ardite = material("ardite") {
        appearance {
            color       = Rgba(200, 120, 20, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 3
            durability = 64L
            speed      = 6.0f
        }

        processing {
            byProduct("galena", "stibnite")
        }

        meta {
            numericId           = 8707
            hashId              = 1280
            originalMod         = "TConstruct"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Strontio - 1")
            alloyRef("manyullyn")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Gneiss = material("gneiss") {
        appearance {
            color       = Rgba(255, 201, 134, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 24L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9170
            hashId              = 1393
            originalMod         = "erebus"
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

    val Carminite = material("carminite") {
        appearance {
            color       = Rgba(150, 0, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 384L
            speed      = 7.0f
        }

        meta {
            numericId           = 8470
            hashId              = 1009
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Permutatio - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val InfusedFire = material("infused_fire") {
        name = "Infused Fire"

        appearance {
            color       = Rgba(255, 0, 0, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8353
            hashId              = 1101
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Ignis - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Epidote = material("epidote") {
        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9182
            hashId              = 1136
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Air = material("air") {
        appearance {
            color       = Rgba(169, 208, 245, 15)
            iconSet     = IconSet.GAS
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 14L
            density      = 0.0012
            meltingPoint = 100L
            boilingPoint = 200L
            plasmaPoint  = 20000L
        }

        composition {
            formula = "N₄₀O₁₁Ar"
            component("nitrogen", 498960000L)
            component("oxygen", 137214000L)
            component("argon", 12474000L)
        }

        meta {
            numericId           = 9830
            hashId              = 584
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            alloyRef("meteoric_steel")
            alloyRef("steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Lemurite = material("lemurite") {
        appearance {
            color       = Rgba(219, 219, 219, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 24L
            density      = 1.738
            meltingPoint = 1179L
            boilingPoint = 2358L
            plasmaPoint  = 235800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            byProduct("magnesium_carbonate")
        }

        meta {
            numericId           = 8764
            hashId              = 1151
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Motus - 1")
            alloyRef("shadow_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val ErisRock = material("eris_rock") {
        name = "Eris"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9269
            hashId              = 1431
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Scabyst = material("scabyst") {
        appearance {
            color       = Rgba(110, 165, 165, 127)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8288
            hashId              = 1027
            originalMod         = "thebetweenlands"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Sano - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Blaze = material("blaze") {
        appearance {
            color       = Rgba(255, 200, 0, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 4000L
            boilingPoint = 8000L
            plasmaPoint  = 800000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        meta {
            numericId           = 8211
            hashId              = 840
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 4800L
            handleMaterial      = ref("any_blaze")
            aspect("Praecantio - 2")
            aspect("Ignis - 4")
            reRegisteredTo("any_blaze")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Betweenstone = material("betweenstone") {
        appearance {
            color       = Rgba(100, 160, 110, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            boilingPoint = 2000L
            plasmaPoint  = 200000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 4.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8519
            hashId              = 1373
            originalMod         = "thebetweenlands"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BETWEENLANDS,
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

    val SeaWater = material("sea_water") {
        name = "Sea Water"

        appearance {
            color       = Rgba(90, 90, 255, 255)
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
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9806
            hashId              = 577
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tempestas - 2")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
        )

    }

    val HempOil = material("hemp_oil") {
        name = "Hemp Oil"

        appearance {
            color       = Rgba(196, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9873
            hashId              = 770
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val PetrifiedWood = material("petrified_wood") {
        name = "Petrified Wood"

        appearance {
            color       = Rgba(110, 50, 35, 255)
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

        tool {
            types      = 1
            quality    = 1
            durability = 24L
            speed      = 2.0f
        }

        composition {
            component("wood", 648648000L)
        }

        meta {
            numericId           = 8277
            hashId              = 820
            originalMod         = "erebus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 50L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Terra - 1")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AbyssalOat = material("abyssal_oat") {
        name = "Abyssal Oat"

        appearance {
            color       = Rgba(133, 62, 25, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9719
            hashId              = 896
            originalMod         = "netherlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour")
            reRegisteredTo("abyssal_oats")
            reRegisteredTo("any_flour_or_grains")
            reRegisteredTo("any_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Chimerite = material("chimerite") {
        appearance {
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 10.0f
        }

        processing {
            oreMultiplier           = 3
            generifyingTarget      = "vinteum" amount 648648000L
        }

        meta {
            numericId           = 8454
            hashId              = 1022
            originalMod         = "arsmagica2"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 3")
            aspect("Permutatio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val InfusedEntropy = material("infused_entropy") {
        name = "Infused Entropy"

        appearance {
            color       = Rgba(62, 62, 62, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 64L
            speed      = 32.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8356
            hashId              = 1104
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Perditio - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Endium = material("endium") {
        appearance {
            color       = Rgba(169, 215, 254, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 12.0f
        }

        processing {
            byProduct("wolframite", "sperrylite", "coltan", "trinium")
        }

        meta {
            numericId           = 8736
            hashId              = 1322
            originalMod         = "HardcoreEnderExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("endstone")
            aspect("Metallum - 1")
            aspect("Alienis - 3")
            reRegisteredTo("hee_endium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val ChargedCertusQuartz = material("charged_certus_quartz") {
        name = "Charged Certus Quartz"

        appearance {
            color       = Rgba(210, 210, 230, 255)
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

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 32L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 2
            byProduct("milky_quartz", "barite")
            pulverTarget          = "certus_quartz" amount 648648000L
            generifyingTarget      = "certus_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8348
            hashId              = 1086
            originalMod         = "appliedenergistics2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
            aspect("Vitreus - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.GLOWING,
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

    val Efrine = material("efrine") {
        appearance {
            color       = Rgba(80, 107, 72, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2246L
            boilingPoint = 3334L
            plasmaPoint  = 333400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 500L
            speed      = 9.0f
        }

        processing {
            byProduct("soulsand", "beryllium", "pentlandite", "zircon", "green_fluorite")
        }

        meta {
            numericId           = 8747
            hashId              = 1333
            originalMod         = "netherlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Gelum - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Properties.WITHER_PROOF,
        )

    }

    val MarsStone = material("mars_stone") {
        name = "Mars"

        appearance {
            color       = Rgba(189, 77, 77, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8515
            hashId              = 1367
            originalMod         = "GalacticraftCore"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.MOLTEN,
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

    val WaxPlant = material("wax_plant") {
        name = "Plant Wax"

        appearance {
            color       = Rgba(210, 250, 210, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        processing {
            generifyingTarget      = "wax" amount 648648000L
        }

        meta {
            numericId           = 8239
            hashId              = 833
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 1")
            reRegisteredTo("any_wax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ethanol = material("ethanol") {
        appearance {
            color       = Rgba(255, 128, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9842
            hashId              = 749
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 72000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val FishRaw = material("fish_raw") {
        name = "Raw Fishmeal"

        appearance {
            color       = Rgba(255, 150, 100, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 477L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        fluids {
            smeltingTarget    = "fish_cooked" amount 648648000L
        }

        processing {
            forgingTarget         = "fish_cooked" amount 648648000L
        }

        meta {
            numericId           = 9712
            hashId              = 887
            originalMod         = "Mariculture"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.MEAT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Umber = material("umber") {
        name = "Umberstone"

        appearance {
            color       = Rgba(111, 77, 11, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 987L
            boilingPoint = 1974L
            plasmaPoint  = 197400L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8517
            hashId              = 1379
            originalMod         = "erebus"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Bestia - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Petrol = material("petrol") {
        appearance {
            color       = Rgba(255, 0, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9864
            hashId              = 759
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 72000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 1")
            reRegisteredTo("gasoline")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Eclogite = material("eclogite") {
        appearance {
            color       = Rgba(90, 40, 40, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        processing {
            byProduct("rutile")
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9191
            hashId              = 1410
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

    val Leather = material("leather") {
        appearance {
            color       = Rgba(141, 65, 37, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            smeltingTarget    = "ashes" amount 72072000L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 8241
            hashId              = 880
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Pannus - 1")
            aspect("Tutamen - 1")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Ashes = material("ashes") {
        appearance {
            color       = Rgba(120, 120, 120, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8200
            hashId              = 782
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32003"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perditio - 1")
            reRegisteredTo("ash")
            reRegisteredTo("any_ashes")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Mazestone = material("mazestone") {
        appearance {
            color       = Rgba(110, 120, 110, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8526
            hashId              = 1377
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Iter - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CertusQuartz = material("certus_quartz") {
        name = "Certus Quartz"

        appearance {
            color       = Rgba(210, 210, 230, 255)
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

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 32L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 2
            byProduct("milky_quartz", "barite")
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8347
            hashId              = 1085
            originalMod         = "appliedenergistics2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.QUARTZ,
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

    val TritonRock = material("triton_rock") {
        name = "Triton"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9267
            hashId              = 1429
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val NeptuneRock = material("neptune_rock") {
        name = "Neptune"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9266
            hashId              = 1428
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Soulsand = material("soulsand") {
        appearance {
            color       = Rgba(100, 100, 80, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
        }

        processing {
            byProduct("coal", "nether_quartz", "niter", "gloomstone")
        }

        meta {
            numericId           = 8101
            hashId              = 1116
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Spiritus - 1")
            aspect("Vinculum - 1")
            alloyRef("soularium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
        )

    }

    val Kepler22bRock = material("kepler22b_rock") {
        name = "Kepler22b"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9270
            hashId              = 1432
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Brown = material("brown") {
        appearance {
            color       = Rgba(96, 64, 0, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8253
            hashId              = 555
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Wax = material("wax") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        meta {
            numericId           = 8235
            hashId              = 821
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perditio - 1")
            reRegisteredTo("any_wax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Rye = material("rye") {
        appearance {
            color       = Rgba(255, 230, 180, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9705
            hashId              = 892
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour")
            reRegisteredTo("any_flour_or_grains")
            reRegisteredTo("any_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Dacite = material("dacite") {
        appearance {
            color       = Rgba(131, 131, 131, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9187
            hashId              = 1407
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

    val Amber = material("amber") {
        appearance {
            color       = Rgba(255, 180, 0, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 473L
            boilingPoint = 946L
            plasmaPoint  = 94600L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 4.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8310
            hashId              = 1010
            originalMod         = "Thaumcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Vinculum - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val SpaceStone = material("space_stone") {
        name = "Space"

        appearance {
            color       = Rgba(99, 99, 99, 255)
            iconSet     = IconSet.SPACE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8512
            hashId              = 1364
            originalMod         = "GalacticraftCore"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
            sourceOf("helium", "helium3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.MOLTEN,
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

    val Breeze = material("breeze") {
        appearance {
            color       = Rgba(170, 155, 203, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        meta {
            numericId           = 8471
            hashId              = 841
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_blaze")
            aspect("Praecantio - 2")
            aspect("Volatus - 4")
            reRegisteredTo("any_blaze")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Coffee = material("coffee") {
        appearance {
            color       = Rgba(150, 75, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9784
            hashId              = 906
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Motus - 1")
            reRegisteredTo("coffee_dust")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Barley = material("barley") {
        appearance {
            color       = Rgba(196, 255, 196, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9704
            hashId              = 891
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour")
            reRegisteredTo("any_flour_or_grains")
            reRegisteredTo("any_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Blizz = material("blizz") {
        appearance {
            color       = Rgba(33, 200, 234, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        meta {
            numericId           = 8210
            hashId              = 839
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_blaze")
            aspect("Praecantio - 2")
            aspect("Gelum - 4")
            reRegisteredTo("any_blaze")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WaxAmnesic = material("wax_amnesic") {
        name = "Amnesic Wax"

        appearance {
            color       = Rgba(180, 70, 250, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        processing {
            generifyingTarget      = "wax" amount 648648000L
        }

        meta {
            numericId           = 8280
            hashId              = 835
            originalMod         = "MagicBees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Strontio - 1")
            reRegisteredTo("any_wax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Curry = material("curry") {
        appearance {
            color       = Rgba(240, 190, 100, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9789
            hashId              = 919
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
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val IapetusRock = material("iapetus_rock") {
        name = "Iapetus"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9263
            hashId              = 1425
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Tallow = material("tallow") {
        name = "Magic Tallow"

        appearance {
            color       = Rgba(220, 200, 100, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        meta {
            numericId           = 8244
            hashId              = 879
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 2")
            aspect("Humanus - 1")
            aspect("Praecantio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val Sanguinite = material("sanguinite") {
        appearance {
            color       = Rgba(185, 0, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 80
            electrons    = 80
            neutrons     = 120
            mass         = 200L
            density      = 13.5336
            meltingPoint = 3104L
            boilingPoint = 6208L
            plasmaPoint  = 620800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 4480L
            speed      = 3.0f
        }

        processing {
            byProduct("mercury")
        }

        meta {
            numericId           = 8771
            hashId              = 1158
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Sano - 1")
            reRegisteredTo("fettelite")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Lime = material("lime") {
        appearance {
            color       = Rgba(128, 255, 128, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8260
            hashId              = 562
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Blitz = material("blitz") {
        appearance {
            color       = Rgba(250, 219, 0, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        meta {
            numericId           = 8248
            hashId              = 838
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_blaze")
            aspect("Praecantio - 2")
            aspect("Aer - 4")
            reRegisteredTo("any_blaze")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Corn = material("corn") {
        appearance {
            color       = Rgba(250, 240, 111, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9708
            hashId              = 898
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour")
            reRegisteredTo("any_flour_or_grains")
            reRegisteredTo("any_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Holystone = material("holystone") {
        appearance {
            color       = Rgba(172, 172, 172, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            byProduct("ambrosium")
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8522
            hashId              = 1370
            originalMod         = "aether"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Lux - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Magenta = material("magenta") {
        appearance {
            color       = Rgba(255, 0, 255, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8263
            hashId              = 565
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val ClayBrick = material("clay_brick") {
        name = "Clay Brick"

        appearance {
            color       = Rgba(183, 90, 64, 255)
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

        fluids {
            solidifyingTarget = "ceramic" amount 648648000L
            smeltingTarget    = "ceramic" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "ceramic" amount 648648000L
            smashingTarget        = "ceramic" amount 0L
            cuttingTarget         = "ceramic" amount 648648000L
            workingTarget         = "ceramic" amount 648648000L
            forgingTarget         = "ceramic" amount 0L
            burningTarget         = "ceramic" amount 0L
            bendingTarget         = "ceramic" amount 0L
            compressingTarget     = "ceramic" amount 0L
        }

        composition {
            formula = "(Al₂O₃)(SiO₂)₄"
            component("ceramic", 648648000L)
        }

        meta {
            numericId           = 9243
            hashId              = 843
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("brick")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val UUAmplifier = material("uu_amplifier") {
        name = "UU-Amplifier"

        appearance {
            color       = Rgba(196, 0, 255, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 50L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9884
            hashId              = 779
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val CrudeOil = material("crude_oil") {
        name = "Crude Oil"

        appearance {
            color       = Rgba(10, 10, 10, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9852
            hashId              = 753
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 12000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
        )

    }

    val Unstable = material("unstable") {
        appearance {
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8805
            hashId              = 1356
            originalMod         = "ExtraUtilities"
            furnaceBurnTime     = 128L
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perditio - 4")
            reRegisteredTo("unstableingot")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.Properties.EXPLODES_IN_NONVANILLA_CRAFTING_GRID,
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Blue = material("blue") {
        appearance {
            color       = Rgba(0, 0, 255, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8254
            hashId              = 556
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val PhobosRock = material("phobos_rock") {
        name = "Phobos"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9249
            hashId              = 1411
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val VenusRock = material("venus_rock") {
        name = "Venus"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9251
            hashId              = 1413
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Nutmeg = material("nutmeg") {
        appearance {
            color       = Rgba(240, 220, 180, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9786
            hashId              = 909
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Sand = material("sand") {
        appearance {
            color       = Rgba(250, 250, 200, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
        }

        fluids {
            smeltingTarget    = "glass" amount 648648000L
        }

        processing {
            forgingTarget         = "glass" amount 648648000L
        }

        meta {
            numericId           = 8100
            hashId              = 1112
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("any_sand")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Firestone = material("firestone") {
        appearance {
            color       = Rgba(200, 20, 0, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 3000L
            boilingPoint = 3700L
            plasmaPoint  = 370000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 6.0f
        }

        processing {
            byProduct("nether_quartz", "void_quartz", "red_phosphorus", "red_fluorite")
        }

        meta {
            numericId           = 8342
            hashId              = 1060
            originalMod         = "Railcraft"
            handleMaterial      = ref("any_blaze")
            aspect("Ignis - 8")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.BURNING,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val PlatinumGroupSludge = material("platinum_group_sludge") {
        name = "Platinum Group Sludge"

        appearance {
            color       = Rgba(50, 50, 80, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 78
            electrons    = 78
            neutrons     = 117
            mass         = 195L
            density      = 21.46
        }

        meta {
            numericId           = 8103
            hashId              = 1118
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Limus - 2")
            aspect("Nebrisum - 2")
            sourceOf("osmium_elemental", "iridium", "platinum", "ruthenium", "rhodium", "palladium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
        )

    }

    val Oat = material("oat") {
        appearance {
            color       = Rgba(240, 240, 222, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9707
            hashId              = 894
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour")
            reRegisteredTo("any_flour_or_grains")
            reRegisteredTo("oats")
            reRegisteredTo("any_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Nougat = material("nougat") {
        appearance {
            color       = Rgba(240, 200, 150, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9718
            hashId              = 916
            originalMod         = "candycraftmod"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val AquaMiddle = material("aqua_middle") {
        name = "Aqua Middle"

        appearance {
            color       = Rgba(50, 50, 240, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8284
            hashId              = 1025
            originalMod         = "thebetweenlands"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lux - 2")
            aspect("Aqua - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val NutOil = material("nut_oil") {
        name = "Nut Oil"

        appearance {
            color       = Rgba(235, 173, 70, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9876
            hashId              = 773
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Diorite = material("diorite") {
        appearance {
            color       = Rgba(240, 240, 240, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.5f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8511
            hashId              = 1400
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
            MaterialTag.Properties.UNBURNABLE,
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

    val PEZ = material("pez") {
        appearance {
            color       = Rgba(210, 210, 210, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 3
            durability = 512L
            speed      = 8.0f
        }

        meta {
            numericId           = 9716
            hashId              = 914
            originalMod         = "candycraftmod"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Migmatite = material("migmatite") {
        appearance {
            color       = Rgba(70, 40, 40, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9181
            hashId              = 1405
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

    val Continuum = material("continuum") {
        appearance {
            color       = Rgba(222, 129, 40, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 4.0f
        }

        meta {
            numericId           = 8295
            hashId              = 1029
            originalMod         = "aether"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Nebrisum - 4")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val OberonRock = material("oberon_rock") {
        name = "Oberon"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9262
            hashId              = 1424
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Chert = material("chert") {
        appearance {
            color       = Rgba(105, 10, 10, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
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

        meta {
            numericId           = 9186
            hashId              = 1406
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

    val Peat = material("peat") {
        appearance {
            color       = Rgba(64, 40, 14, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 324324000L
        }

        meta {
            numericId           = 8360
            hashId              = 1055
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 2000L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
            aspect("Ignis - 2")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val SeedOil = material("seed_oil") {
        name = "Seed Oil"

        appearance {
            color       = Rgba(196, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9872
            hashId              = 769
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Carmot = material("carmot") {
        appearance {
            color       = Rgba(217, 205, 140, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 30
            electrons    = 30
            neutrons     = 35
            mass         = 65L
            density      = 7.134
            meltingPoint = 1178L
            boilingPoint = 2356L
            plasmaPoint  = 235600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 1
            durability = 128L
            speed      = 16.0f
        }

        processing {
            byProduct("zinc")
        }

        meta {
            numericId           = 8770
            hashId              = 1157
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Nebrisum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Frezarite = material("frezarite") {
        appearance {
            iconSet     = IconSet.NETHERSTAR
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 4.0f
        }

        meta {
            numericId           = 8391
            hashId              = 1035
            originalMod         = "meteors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Gelum - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeatRotten = material("meat_rotten") {
        name = "Rotten Meat"

        appearance {
            color       = Rgba(255, 150, 100, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 477L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        meta {
            numericId           = 9710
            hashId              = 885
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 1")
            aspect("Mortuus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.MEAT,
            MaterialTag.Properties.ROTTEN,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Peanut = material("peanut") {
        appearance {
            color       = Rgba(240, 210, 160, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9795
            hashId              = 910
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Butter = material("butter") {
        appearance {
            color       = Rgba(230, 230, 100, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 313L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        composition {
            component("milk", 648648000L)
        }

        meta {
            numericId           = 9798
            hashId              = 921
            originalMod         = "Growthcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 3")
        }

        tags(
            MaterialTag.Properties.FOOD,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Oriharukon = material("oriharukon") {
        appearance {
            color       = Rgba(220, 220, 240, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 2560L
            speed      = 8.0f
        }

        meta {
            numericId           = 8754
            hashId              = 1339
            originalMod         = "GalaxySpace"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Machina - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Snow = material("snow") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.FINE
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
            smeltingTarget    = "water" amount 648648000L
        }

        composition {
            formula = "H₂O"
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9801
            hashId              = 573
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Gelum - 1")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Blutonium = material("blutonium") {
        appearance {
            color       = Rgba(60, 60, 180, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            byProduct("lead", "radium", "rare_earth")
        }

        meta {
            numericId           = 8716
            hashId              = 1293
            originalMod         = "BigReactors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Pistachio = material("pistachio") {
        appearance {
            color       = Rgba(200, 250, 140, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9797
            hashId              = 912
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val RedMeteor = material("red_meteor") {
        name = "Red Meteor"

        appearance {
            color       = Rgba(255, 60, 60, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 8.0f
        }

        meta {
            numericId           = 8392
            hashId              = 1036
            originalMod         = "meteors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Alienis - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PrismarineDark = material("prismarine_dark") {
        name = "Dark Prismarine"

        appearance {
            color       = Rgba(88, 125, 108, 255)
            iconSet     = IconSet.PRISMARINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 48L
            speed      = 4.0f
        }

        meta {
            numericId           = 9220
            hashId              = 1133
            originalMod         = "etfuturum"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tempestas - 1")
            reRegisteredTo("any_stone")
            reRegisteredTo("any_prismarine")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Pink = material("pink") {
        appearance {
            color       = Rgba(255, 192, 192, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8259
            hashId              = 561
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Oil = material("oil") {
        appearance {
            color       = Rgba(10, 10, 10, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9850
            hashId              = 750
            originalMod         = "BuildCraft|Core"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 12000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Slate = material("slate") {
        appearance {
            color       = Rgba(148, 151, 156, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
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

        meta {
            numericId           = 9222
            hashId              = 1408
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

    val Draconium = material("draconium") {
        appearance {
            color       = Rgba(150, 50, 250, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 4500L
            boilingPoint = 9000L
            plasmaPoint  = 900000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5000L
            speed      = 16.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8791
            hashId              = 1351
            originalMod         = "DraconicEvolution"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
        )

    }

    val Fuel = material("fuel") {
        name = "Fuel Oil"

        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9860
            hashId              = 754
            originalMod         = "BuildCraft|Core"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 72000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 1")
            reRegisteredTo("fuel_oil")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val WaxParaffin = material("wax_paraffin") {
        name = "Paraffin Wax"

        appearance {
            color       = Rgba(210, 210, 250, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 400L
            boilingPoint = 800L
            plasmaPoint  = 80000L
        }

        processing {
            generifyingTarget      = "wax" amount 648648000L
        }

        meta {
            numericId           = 8238
            hashId              = 830
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fabrico - 1")
            reRegisteredTo("paraffinwax")
            reRegisteredTo("any_wax")
            reRegisteredTo("paraffin_wax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Paper = material("paper") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.PAPER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 8216
            hashId              = 863
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 25L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Cognitio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Forcicium = material("forcicium") {
        appearance {
            color       = Rgba(50, 50, 70, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            byProduct("thorium", "neodymium", "rare_earth")
        }

        meta {
            numericId           = 8344
            hashId              = 1122
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val PeanutWood = material("peanut_wood") {
        name = "Peanut Wood"

        appearance {
            color       = Rgba(120, 60, 0, 255)
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

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            formula = "C₆(H₂O)₅"
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8227
            hashId              = 816
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            reRegisteredTo("peanutwood")
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
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val JupiterRock = material("jupiter_rock") {
        name = "Jupiter"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9254
            hashId              = 1416
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val HexoriumBlue = material("hexorium_blue") {
        name = "Blue Hexorium"

        appearance {
            color       = Rgba(0, 0, 128, 127)
            iconSet     = IconSet.HEX
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 4
            byProduct("hexorium_white", "hexorium_black")
        }

        meta {
            numericId           = 9228
            hashId              = 1110
            originalMod         = "hexcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Sensus - 4")
            reRegisteredTo("hexorium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Latex = material("latex") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 150L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9886
            hashId              = 781
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 1")
            aspect("Limus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val AncientDebris = material("ancient_debris") {
        name = "Ancient Debris"

        appearance {
            color       = Rgba(110, 80, 90, 255)
            iconSet     = IconSet.SPACE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2011L
            boilingPoint = 3334L
            plasmaPoint  = 333400L
            hasMetallum  = true
        }

        tool {
            types      = 0
            quality    = 3
            durability = 16L
            speed      = 1.0f
        }

        processing {
            byProduct("soulsand", "efrine", "huebnerite", "firestone")
        }

        meta {
            numericId           = 8744
            hashId              = 1329
            originalMod         = "netheriteplus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 2")
            reRegisteredTo("ancient")
            alloyRef("netherite")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Properties.WITHER_PROOF,
        )

    }

    val BlackEndSand = material("black_end_sand") {
        name = "Black End Sand"

        appearance {
            color       = Rgba(40, 60, 60, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
        }

        fluids {
            smeltingTarget    = "glass" amount 648648000L
        }

        processing {
            forgingTarget         = "glass" amount 648648000L
        }

        meta {
            numericId           = 8106
            hashId              = 1115
            originalMod         = "enderlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_silicon_dioxide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
        )

    }

    val MoonStone = material("moon_stone") {
        name = "Moon"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8513
            hashId              = 1365
            originalMod         = "GalacticraftCore"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.MOLTEN,
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

    val CallistoRock = material("callisto_rock") {
        name = "Callisto"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9258
            hashId              = 1420
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Andesite = material("andesite") {
        appearance {
            color       = Rgba(191, 191, 191, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.5f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9188
            hashId              = 1399
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

    val Ludicrite = material("ludicrite") {
        appearance {
            color       = Rgba(180, 120, 150, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            byProduct("lead", "radium", "rare_earth")
        }

        meta {
            numericId           = 8723
            hashId              = 1295
            originalMod         = "BigReactors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val FryingOilHot = material("frying_oil_hot") {
        name = "Hot Frying Oil"

        appearance {
            color       = Rgba(200, 196, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9880
            hashId              = 775
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 1")
            aspect("Ignis - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val WaxRefractory = material("wax_refractory") {
        name = "Refractory Wax"

        appearance {
            color       = Rgba(250, 50, 50, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2600L
            boilingPoint = 5200L
            plasmaPoint  = 520000L
        }

        processing {
            generifyingTarget      = "wax" amount 648648000L
        }

        meta {
            numericId           = 8237
            hashId              = 827
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Gelum - 1")
            reRegisteredTo("any_wax")
            reRegisteredTo("refractory_wax")
            reRegisteredTo("refractorywax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CeresRock = material("ceres_rock") {
        name = "Ceres"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9253
            hashId              = 1415
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Pitstone = material("pitstone") {
        appearance {
            color       = Rgba(40, 50, 30, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 1200L
            boilingPoint = 2400L
            plasmaPoint  = 240000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 4.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8520
            hashId              = 1374
            originalMod         = "thebetweenlands"
            hidden              = true
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
            MaterialTag.Properties.BETWEENLANDS,
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

    val RheaRock = material("rhea_rock") {
        name = "Rhea"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9260
            hashId              = 1422
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Potato = material("potato") {
        appearance {
            color       = Rgba(240, 240, 164, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9709
            hashId              = 899
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour")
            reRegisteredTo("any_flour_or_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val WhaleOil = material("whale_oil") {
        name = "Whale Oil"

        appearance {
            color       = Rgba(51, 40, 23, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9887
            hashId              = 768
            originalMod         = "steamcraft2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Empty = material("empty") {
        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = 0L
            density      = 0.0
        }

        meta {
            numericId           = 0
            hashId              = 54
            originalMod         = "minecraft"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.EMPTY,
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Chili = material("chili") {
        appearance {
            color       = Rgba(200, 0, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9781
            hashId              = 903
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val RedQuartz = material("red_quartz") {
        name = "Red Quartz"

        appearance {
            color       = Rgba(255, 210, 210, 255)
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
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8395
            hashId              = 1077
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Machina - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
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

    val HolyWater = material("holy_water") {
        name = "Holy Water"

        appearance {
            color       = Rgba(120, 120, 255, 255)
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
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9805
            hashId              = 576
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            aspect("Auram - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Basalz = material("basalz") {
        appearance {
            color       = Rgba(100, 81, 81, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        meta {
            numericId           = 8247
            hashId              = 837
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_blaze")
            aspect("Praecantio - 2")
            aspect("Terra - 4")
            reRegisteredTo("any_blaze")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeatRaw = material("meat_raw") {
        name = "Raw Meat"

        appearance {
            color       = Rgba(255, 100, 100, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 477L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        fluids {
            smeltingTarget    = "meat_cooked" amount 648648000L
        }

        processing {
            forgingTarget         = "meat_cooked" amount 648648000L
        }

        meta {
            numericId           = 9700
            hashId              = 884
            originalMod         = "MineFactoryReloaded"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.MEAT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Lava = material("lava") {
        appearance {
            color       = Rgba(255, 64, 0, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            density      = 0.223166125
            meltingPoint = 1300L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            liquidUnit = 5837832000L
            solidifyingTarget = "obsidian" amount 648648000L
        }

        meta {
            numericId           = 9810
            hashId              = 745
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            alloyRef("alumite")
            alloyRef("obsidian_steel")
            alloyRef("end_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.Processing.MELTING,
        )

    }

    val Syrmorite = material("syrmorite") {
        appearance {
            color       = Rgba(80, 80, 199, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 1337L
            boilingPoint = 3129L
            plasmaPoint  = 312900L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 1
            durability = 500L
            speed      = 6.0f
        }

        processing {
            byProduct("stannite", "tetrahedrite", "beryllium")
        }

        meta {
            numericId           = 8785
            hashId              = 1345
            originalMod         = "thebetweenlands"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Mortuus - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Rubracium = material("rubracium") {
        appearance {
            color       = Rgba(151, 45, 45, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 74
            electrons    = 74
            neutrons     = 109
            mass         = 183L
            density      = 19.25
            meltingPoint = 1847L
            boilingPoint = 3694L
            plasmaPoint  = 369400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            byProduct("chromite")
        }

        meta {
            numericId           = 8762
            hashId              = 1149
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            alloyRef("haderoth")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val GoldenAmber = material("golden_amber") {
        name = "Golden Amber"

        appearance {
            color       = Rgba(255, 230, 80, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 473L
            boilingPoint = 946L
            plasmaPoint  = 94600L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 384L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 2
            generifyingTarget      = "amber" amount 648648000L
        }

        meta {
            numericId           = 8469
            hashId              = 1011
            originalMod         = "aether"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Vinculum - 2")
            aspect("Volatus - 2")
            reRegisteredTo("any_amber")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val RedSand = material("red_sand") {
        name = "Red Sand"

        appearance {
            color       = Rgba(170, 86, 35, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "glass" amount 648648000L
        }

        processing {
            forgingTarget         = "glass" amount 648648000L
        }

        meta {
            numericId           = 8104
            hashId              = 1113
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("any_sand")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Aredrite = material("aredrite") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 82
            electrons    = 82
            neutrons     = 125
            mass         = 207L
            density      = 11.342
            meltingPoint = 2240L
            boilingPoint = 4480L
            plasmaPoint  = 448000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1440L
            speed      = 6.0f
        }

        processing {
            byProduct("galena", "stibnite")
            generifyingTarget      = "ardite" amount 648648000L
        }

        meta {
            numericId           = 8701
            hashId              = 1152
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Strontio - 1")
            reRegisteredTo("ardaite")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Cyan = material("cyan") {
        appearance {
            color       = Rgba(0, 255, 255, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8256
            hashId              = 558
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val CosmicNeutronium = material("cosmic_neutronium") {
        name = "Cosmic Neutronium"

        appearance {
            color       = Rgba(30, 10, 40, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100000L
            boilingPoint = 200000L
            plasmaPoint  = 20000000L
        }

        tool {
            types      = 3
            quality    = 10
            durability = 100000L
            speed      = 50.0f
        }

        meta {
            numericId           = 8800
            hashId              = 1354
            originalMod         = "Avaritia"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 10")
            aspect("Nebrisum - 10")
            aspect("Radio - 10")
            aspect("Tenebrae - 10")
            aspect("Terra - 10")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val EuropaRock = material("europa_rock") {
        name = "Europa"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9256
            hashId              = 1418
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Licorice = material("licorice") {
        appearance {
            color       = Rgba(30, 30, 30, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 128L
            speed      = 6.0f
        }

        meta {
            numericId           = 9717
            hashId              = 915
            originalMod         = "candycraftmod"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Concrete = material("concrete") {
        appearance {
            color       = Rgba(100, 100, 100, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 500L
            boilingPoint = 1000L
            plasmaPoint  = 100000L
        }

        fluids {
            smeltingTarget    = "stone" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 32L
            speed      = 2.5f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        composition {
            component("stone", 648648000L)
        }

        meta {
            numericId           = 8501
            hashId              = 1125
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

    val Honeydew = material("honeydew") {
        appearance {
            color       = Rgba(210, 100, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 273L
            boilingPoint = 373L
            plasmaPoint  = 37300L
        }

        meta {
            numericId           = 9793
            hashId              = 924
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val SlimyBone = material("slimy_bone") {
        name = "Slimy Bone"

        appearance {
            color       = Rgba(230, 250, 230, 255)
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
            durability = 128L
            speed      = 5.0f
        }

        composition {
            formula = "Ca"
            component("calcium", 81081000L)
        }

        meta {
            numericId           = 8287
            hashId              = 875
            originalMod         = "thebetweenlands"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 2")
            aspect("Limus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeatCooked = material("meat_cooked") {
        name = "Cooked Meat"

        appearance {
            color       = Rgba(150, 60, 20, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 477L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        meta {
            numericId           = 9701
            hashId              = 882
            originalMod         = "MineFactoryReloaded"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 2")
            reRegisteredTo("meat")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.MEAT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Dynamite = material("dynamite") {
        appearance {
            color       = Rgba(111, 131, 111, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 4
            mass         = 9L
            density      = 1.431
            meltingPoint = 343L
            boilingPoint = 411L
            plasmaPoint  = 41150L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        composition {
            formula = "(C₃H₅N₃O₉)(Wood)"
            component("glyceryl", 324324000L)
            component("wood", 324324000L)
        }

        meta {
            numericId           = 8249
            hashId              = 877
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perditio - 4")
            aspect("Ignis - 3")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val ShadowIron = material("shadow_iron") {
        name = "Shadow Iron"

        appearance {
            color       = Rgba(95, 76, 63, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2011L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 6.0f
        }

        processing {
            byProduct("hematite")
        }

        meta {
            numericId           = 8670
            hashId              = 1164
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tenebrae - 1")
            alloyRef("iron")
            alloyRef("shadow_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Tea = material("tea") {
        appearance {
            color       = Rgba(100, 250, 100, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9792
            hashId              = 925
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Quartzite = material("quartzite") {
        appearance {
            color       = Rgba(230, 205, 205, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 1.7f
        }

        processing {
            byProduct("certus_quartz", "barite", "hematite")
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9180
            hashId              = 1395
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            reRegisteredTo("any_stone")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Milk = material("milk") {
        appearance {
            color       = Rgba(254, 254, 254, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 273L
            boilingPoint = 373L
            plasmaPoint  = 37300L
        }

        meta {
            numericId           = 9790
            hashId              = 920
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val LightGray = material("light_gray") {
        name = "Light Gray"

        appearance {
            color       = Rgba(192, 192, 192, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8257
            hashId              = 559
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Indigo = material("indigo") {
        appearance {
            color       = Rgba(255, 128, 255, 255)
            iconSet     = IconSet.LEAF
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8228
            hashId              = 881
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Emery = material("emery") {
        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9183
            hashId              = 801
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
        )

    }

    val Grayschist = material("grayschist") {
        name = "Gray Schist"

        appearance {
            color       = Rgba(145, 140, 145, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 24L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9244
            hashId              = 1391
            originalMod         = "enhancedbiomes"
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

    val Ectoplasm = material("ectoplasm") {
        appearance {
            color       = Rgba(220, 255, 255, 200)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 400L
            plasmaPoint  = 300000L
        }

        meta {
            numericId           = 8373
            hashId              = 1059
            originalMod         = "RandomThings"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Spiritus - 4")
            alloyRef("spectre_iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.LIQUID,
        )

    }

    val FishOil = material("fish_oil") {
        name = "Fish Oil"

        appearance {
            color       = Rgba(255, 196, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9871
            hashId              = 767
            originalMod         = "Mariculture"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val TitaniaRock = material("titania_rock") {
        name = "Titania"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9265
            hashId              = 1427
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Mint = material("mint") {
        appearance {
            color       = Rgba(150, 250, 150, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9794
            hashId              = 926
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Kreknorite = material("kreknorite") {
        appearance {
            color       = Rgba(128, 0, 0, 255)
            iconSet     = IconSet.SPACE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2446L
            boilingPoint = 3534L
            plasmaPoint  = 353400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1200L
            speed      = 8.0f
        }

        meta {
            numericId           = 8759
            hashId              = 1344
            originalMod         = "meteors"
            furnaceBurnTime     = 3600L
            hidden              = true
            handleMaterial      = ref("any_iron_or_steel")
            aspect("Metallum - 2")
            aspect("Ignis - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val PepperBlack = material("pepper_black") {
        name = "Black Pepper"

        appearance {
            color       = Rgba(40, 40, 40, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9788
            hashId              = 917
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            reRegisteredTo("pepper")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Cheese = material("cheese") {
        appearance {
            color       = Rgba(255, 234, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 320L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9780
            hashId              = 902
            originalMod         = "GalacticraftCore"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Eximite = material("eximite") {
        appearance {
            color       = Rgba(124, 90, 150, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 30
            mass         = 55L
            density      = 7.44
            meltingPoint = 2758L
            boilingPoint = 5516L
            plasmaPoint  = 551600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2560L
            speed      = 5.0f
        }

        processing {
            byProduct("palladium")
        }

        meta {
            numericId           = 8773
            hashId              = 1161
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Iter - 1")
            alloyRef("desichalkos")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val NetherBrick = material("nether_brick") {
        name = "Nether Brick"

        appearance {
            color       = Rgba(100, 0, 0, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1800L
            plasmaPoint  = 300000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 24L
            speed      = 2.0f
        }

        processing {
            pulverTarget          = "netherrack" amount 648648000L
            generifyingTarget      = "netherrack" amount 648648000L
        }

        meta {
            numericId           = 8503
            hashId              = 1127
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 1")
            reRegisteredTo("any_stone")
            reRegisteredTo("brick_nether")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.UNBURNABLE,
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

    val White = material("white") {
        appearance {
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8265
            hashId              = 567
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val CrimsonMiddle = material("crimson_middle") {
        name = "Crimson Middle"

        appearance {
            color       = Rgba(240, 50, 50, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8282
            hashId              = 1023
            originalMod         = "thebetweenlands"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lux - 2")
            aspect("Ignis - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VoidQuartz = material("void_quartz") {
        name = "Void Quartz"

        appearance {
            color       = Rgba(183, 120, 212, 255)
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

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 48L
            speed      = 2.5f
        }

        processing {
            oreMultiplier           = 2
            byProduct("barite", "efrine", "nether_quartz", "magenta_fluorite")
            generifyingTarget      = "nether_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8457
            hashId              = 1074
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Vacuos - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
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

    val MoonTurf = material("moon_turf") {
        name = "Moon Turf"

        appearance {
            color       = Rgba(207, 207, 207, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8514
            hashId              = 1366
            originalMod         = "GalacticraftCore"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
            sourceOf("helium", "helium3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val InfusedBalance = material("infused_balance") {
        name = "Infused Balance"

        appearance {
            color       = Rgba(252, 252, 252, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 256L
            speed      = 32.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8358
            hashId              = 1106
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Ordo - 1")
            aspect("Perditio - 1")
            aspect("Ignis - 1")
            aspect("Aer - 1")
            aspect("Aqua - 1")
            aspect("Terra - 1")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val FishRotten = material("fish_rotten") {
        name = "Rotten Fishmeal"

        appearance {
            color       = Rgba(220, 200, 100, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 477L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        meta {
            numericId           = 9713
            hashId              = 888
            originalMod         = "Mariculture"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 1")
            aspect("Mortuus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.MEAT,
            MaterialTag.Properties.ROTTEN,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Ambrosium = material("ambrosium") {
        appearance {
            color       = Rgba(244, 242, 96, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 16L
            speed      = 4.0f
        }

        processing {
            byProduct("holystone")
        }

        meta {
            numericId           = 8293
            hashId              = 1028
            originalMod         = "aether"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lux - 2")
            aspect("Praecantio - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val NitroFuel = material("nitro_fuel") {
        name = "Nitro-Fuel"

        appearance {
            color       = Rgba(200, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 45
            mass         = 80L
            density      = 1.1
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        composition {
            component("glyceryl", 129729600L)
            component("fuel", 518918400L)
        }

        meta {
            numericId           = 9861
            hashId              = 756
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 72000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val SmokeyQuartz = material("smokey_quartz") {
        name = "Smokey Quartz"

        appearance {
            color       = Rgba(20, 20, 20, 255)
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
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8397
            hashId              = 1079
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
            reRegisteredTo("quartz_smoky")
            reRegisteredTo("smoky_quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
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

    val RareEarth = material("rare_earth") {
        name = "Rare Earth"

        appearance {
            color       = Rgba(128, 128, 100, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 60
            electrons    = 60
            neutrons     = 84
            mass         = 144L
            density      = 7.007
        }

        meta {
            numericId           = 9100
            hashId              = 1119
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Nebrisum - 1")
            sourceOf("cadmium", "yttrium", "caesium", "lanthanium", "cerium", "neodymium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
        )

    }

    val Castlerock = material("castlerock") {
        appearance {
            color       = Rgba(198, 185, 186, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8527
            hashId              = 1378
            originalMod         = "TwilightForest"
            hidden              = true
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
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ElvenQuartz = material("elven_quartz") {
        name = "Elven Quartz"

        appearance {
            color       = Rgba(210, 255, 210, 255)
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

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 64L
            speed      = 2.5f
        }

        processing {
            oreMultiplier           = 2
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8399
            hashId              = 1083
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Alienis - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
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

    val Diesel = material("diesel") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9863
            hashId              = 758
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 72000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Livingrock = material("livingrock") {
        appearance {
            color       = Rgba(195, 205, 195, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 1800L
            boilingPoint = 3600L
            plasmaPoint  = 360000L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8521
            hashId              = 1371
            originalMod         = "Botania"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Victus - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val FishCooked = material("fish_cooked") {
        name = "Cooked Fishmeal"

        appearance {
            color       = Rgba(150, 120, 20, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 477L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        meta {
            numericId           = 9711
            hashId              = 886
            originalMod         = "Mariculture"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Corpus - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.MEAT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val MercuryRock = material("mercury_rock") {
        name = "Mercury"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9252
            hashId              = 1414
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Cyanite = material("cyanite") {
        appearance {
            color       = Rgba(50, 110, 150, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            byProduct("lead", "radium", "rare_earth")
        }

        meta {
            numericId           = 8717
            hashId              = 1294
            originalMod         = "BigReactors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val ArcaneAshes = material("arcane_ashes") {
        name = "Arcane Ashes"

        appearance {
            color       = Rgba(150, 50, 180, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8367
            hashId              = 1017
            originalMod         = "arsmagica2"
            hidden              = true
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Praecantio - 1")
            aspect("Ignis - 1")
            reRegisteredTo("arcane_ash")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.MAGICAL,
        )

    }

    val Dilithium = material("dilithium") {
        appearance {
            color       = Rgba(153, 255, 255, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "dolamide" amount 648648000L
        }

        meta {
            numericId           = 8317
            hashId              = 1037
            originalMod         = "mo"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.CRYSTALLISABLE,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Aerotheum = material("aerotheum") {
        appearance {
            color       = Rgba(250, 226, 83, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 37
            mass         = 67L
            density      = 3.705219007
            meltingPoint = 299L
            boilingPoint = 300L
            plasmaPoint  = 30000L
        }

        composition {
            component("sand", 324324000L)
            component("potassium_nitrate", 324324000L)
            component("redstone", 324324000L)
            component("blitz", 36036000L)
        }

        meta {
            numericId           = 8246
            hashId              = 1140
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Praecantio - 2")
            aspect("Aer - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Deepslate = material("deepslate") {
        appearance {
            color       = Rgba(57, 59, 61, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 32L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9248
            hashId              = 1409
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

    val Glue = material("glue") {
        appearance {
            color       = Rgba(200, 196, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 150L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9881
            hashId              = 776
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Limus - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val BioFuel = material("bio_fuel") {
        name = "Bio Diesel"

        appearance {
            color       = Rgba(200, 128, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9841
            hashId              = 748
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 72000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Asphalt = material("asphalt") {
        appearance {
            color       = Rgba(88, 88, 99, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8266
            hashId              = 878
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            aspect("Iter - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
        )

    }

    val Gunpowder = material("gunpowder") {
        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 1.69907688
            meltingPoint = 2148L
            boilingPoint = 2632L
            plasmaPoint  = 263275L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        composition {
            formula = "C₂S(NaNO₃)"
            component("carbon", 324324000L)
            component("sulfur", 162162000L)
            component("sodium_nitrate", 162162000L)
        }

        meta {
            numericId           = 8220
            hashId              = 876
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perditio - 3")
            aspect("Ignis - 4")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val UUMatter = material("uu_matter") {
        name = "UU-Matter"

        appearance {
            color       = Rgba(96, 0, 128, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 50L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9885
            hashId              = 780
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Infuscolium = material("infuscolium") {
        appearance {
            color       = Rgba(146, 33, 86, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.96
            meltingPoint = 1828L
            boilingPoint = 3656L
            plasmaPoint  = 365600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            byProduct("malachite")
        }

        meta {
            numericId           = 8761
            hashId              = 1148
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Praecantio - 1")
            alloyRef("black_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val SluiceSand = material("sluice_sand") {
        name = "Sluice Sand"

        appearance {
            color       = Rgba(165, 165, 120, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
        }

        meta {
            numericId           = 8102
            hashId              = 1117
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            aspect("Lucrum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val DeepIron = material("deep_iron") {
        name = "Deep Iron"

        appearance {
            color       = Rgba(73, 91, 105, 255)
            iconSet     = IconSet.METALLIC
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

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 6.0f
        }

        processing {
            byProduct("hematite")
        }

        meta {
            numericId           = 8641
            hashId              = 1163
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            alloyRef("iron")
            alloyRef("black_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val DarkIron = material("dark_iron") {
        name = "Dark Iron"

        appearance {
            color       = Rgba(55, 40, 60, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2246L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 384L
            speed      = 7.0f
        }

        processing {
            byProduct("hematite")
        }

        composition {
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8648
            hashId              = 1220
            originalMod         = "factorization"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ignis - 1")
            reRegisteredTo("fz_dark_iron")
            reRegisteredTo("fz_dark_iron")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Kerosine = material("kerosine") {
        appearance {
            color       = Rgba(0, 0, 255, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9862
            hashId              = 757
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 72000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Volatus - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Cryotheum = material("cryotheum") {
        appearance {
            color       = Rgba(100, 220, 255, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 32
            mass         = 58L
            density      = 3.427587118
            meltingPoint = 40L
            boilingPoint = 1000L
            plasmaPoint  = 100000L
        }

        composition {
            component("snow", 72072000L)
            component("potassium_nitrate", 324324000L)
            component("redstone", 324324000L)
            component("blizz", 36036000L)
        }

        meta {
            numericId           = 8213
            hashId              = 1142
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Praecantio - 2")
            aspect("Gelum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Green = material("green") {
        appearance {
            color       = Rgba(0, 255, 0, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8252
            hashId              = 554
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val BlazeQuartz = material("blaze_quartz") {
        name = "Blaze Quartz"

        appearance {
            color       = Rgba(255, 230, 200, 255)
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
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8396
            hashId              = 1078
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Ignis - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
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

    val Biomass = material("biomass") {
        appearance {
            color       = Rgba(0, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 200L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9840
            hashId              = 746
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 6000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 2")
            reRegisteredTo("bio_mass")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Greywacke = material("greywacke") {
        appearance {
            color       = Rgba(176, 176, 176, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9173
            hashId              = 1402
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

    val IoRock = material("io_rock") {
        name = "Io"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9255
            hashId              = 1417
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val WaterDirty = material("water_dirty") {
        name = "Dirty Water"

        appearance {
            color       = Rgba(70, 150, 200, 255)
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
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9807
            hashId              = 578
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
        )

    }

    val Kimberlite = material("kimberlite") {
        appearance {
            color       = Rgba(100, 70, 10, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 24L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9218
            hashId              = 1394
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

    val NetherQuartz = material("nether_quartz") {
        name = "Nether Quartz"

        appearance {
            color       = Rgba(230, 210, 210, 255)
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
            byProduct("barite", "efrine", "void_quartz", "white_fluorite")
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8346
            hashId              = 1073
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.QUARTZ,
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

    val TitanRock = material("titan_rock") {
        name = "Titan"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9261
            hashId              = 1423
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val PigIron = material("pig_iron") {
        name = "Pig Iron"

        appearance {
            color       = Rgba(200, 180, 180, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2011L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "wrought_iron" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 6.0f
        }

        processing {
            byProduct("hematite")
            pulverTarget          = "iron" amount 648648000L
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("wrought_iron", 648648000L)
        }

        meta {
            numericId           = 8642
            hashId              = 1214
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_iron")
            reRegisteredTo("any_iron_or_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Ceruclase = material("ceruclase") {
        appearance {
            color       = Rgba(140, 189, 208, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 51
            electrons    = 51
            neutrons     = 70
            mass         = 121L
            density      = 6.685
            meltingPoint = 1867L
            boilingPoint = 3734L
            plasmaPoint  = 373400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1280L
            speed      = 6.0f
        }

        processing {
            byProduct("cobaltite")
        }

        meta {
            numericId           = 8765
            hashId              = 1154
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tempestas - 1")
            alloyRef("inolashite")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Ignatius = material("ignatius") {
        appearance {
            color       = Rgba(255, 169, 83, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 68
            mass         = 118L
            density      = 7.287
            meltingPoint = 1978L
            boilingPoint = 3956L
            plasmaPoint  = 395600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 12.0f
        }

        processing {
            byProduct("selenium", "indium")
        }

        meta {
            numericId           = 8775
            hashId              = 1162
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ignis - 1")
            alloyRef("iron")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val SunnyQuartz = material("sunny_quartz") {
        name = "Sunny Quartz"

        appearance {
            color       = Rgba(255, 255, 200, 255)
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
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8393
            hashId              = 1075
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Lux - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
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

    val Blueschist = material("blueschist") {
        name = "Blue Schist"

        appearance {
            color       = Rgba(105, 105, 190, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 24L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9184
            hashId              = 1390
            originalMod         = "UndergroundBiomes"
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

    val Black = material("black") {
        appearance {
            color       = Rgba(32, 32, 32, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8250
            hashId              = 552
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Deadrock = material("deadrock") {
        appearance {
            color       = Rgba(153, 153, 168, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 1800L
            boilingPoint = 3600L
            plasmaPoint  = 360000L
        }

        tool {
            types      = 1
            quality    = 2
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8523
            hashId              = 1372
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.UNBURNABLE,
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

    val InfusedAir = material("infused_air") {
        name = "Infused Air"

        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8352
            hashId              = 1100
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Aer - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Jade = material("jade") {
        appearance {
            color       = Rgba(100, 255, 125, 255)
            iconSet     = IconSet.LAPIS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 8.0f
        }

        processing {
            byProduct("mica", "biotite", "talc", "asbestos")
        }

        meta {
            numericId           = 8321
            hashId              = 1014
            originalMod         = "erebus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 6")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.RANDOM_SMALL_GEM_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val GanymedeRock = material("ganymede_rock") {
        name = "Ganymede"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9257
            hashId              = 1419
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Valonite = material("valonite") {
        appearance {
            color       = Rgba(255, 205, 240, 127)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2560L
            speed      = 9.0f
        }

        meta {
            numericId           = 8285
            hashId              = 1026
            originalMod         = "thebetweenlands"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 4")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.BETWEENLANDS,
        )

    }

    val Netherrack = material("netherrack") {
        appearance {
            color       = Rgba(200, 0, 0, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1500L
            plasmaPoint  = 300000L
        }

        fluids {
            smeltingTarget    = "nether_brick" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 8L
            speed      = 2.0f
        }

        processing {
            byProduct("sulfur")
        }

        meta {
            numericId           = 8502
            hashId              = 1126
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tofu = material("tofu") {
        appearance {
            color       = Rgba(222, 222, 222, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 422L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9778
            hashId              = 900
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            aspect("Herba - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Stone = material("stone") {
        appearance {
            colorSolid  = Rgba(205, 205, 205, 255)
            colorLiquid = Rgba(192, 96, 64, 255)
            colorGas    = Rgba(205, 205, 205, 255)
            colorPlasma = Rgba(205, 205, 205, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1100L
            boilingPoint = 2200L
            plasmaPoint  = 220000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        processing {
            reversingTarget        = ref("any_stone")
        }

        meta {
            numericId           = 8500
            hashId              = 1124
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
            alloyRef("clay_compound")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.UNRECYCLABLE,
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

    val Cinnamon = material("cinnamon") {
        appearance {
            color       = Rgba(122, 83, 53, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9785
            hashId              = 908
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val ConstructionFoam = material("construction_foam") {
        name = "C-Foam"

        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 500L
            boilingPoint = 2000L
            plasmaPoint  = 200000L
        }

        meta {
            numericId           = 9883
            hashId              = 778
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.Processing.MELTING,
        )

    }

    val Greenstone = material("greenstone") {
        appearance {
            color       = Rgba(52, 252, 52, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9172
            hashId              = 1134
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Lubricant = material("lubricant") {
        appearance {
            color       = Rgba(255, 196, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 150L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9882
            hashId              = 777
            originalMod         = "RotaryCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 1")
            aspect("Machina - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Craponite = material("craponite") {
        appearance {
            color       = Rgba(255, 170, 185, 127)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        meta {
            numericId           = 8322
            hashId              = 1013
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lucrum - 3")
            aspect("Strontio - 2")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val HexoriumGreen = material("hexorium_green") {
        name = "Green Hexorium"

        appearance {
            color       = Rgba(0, 128, 0, 127)
            iconSet     = IconSet.HEX
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 4
            byProduct("hexorium_white", "hexorium_black")
        }

        meta {
            numericId           = 9226
            hashId              = 1109
            originalMod         = "hexcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Sensus - 4")
            reRegisteredTo("hexorium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val DarkAshes = material("dark_ashes") {
        name = "Dark Ashes"

        appearance {
            color       = Rgba(50, 50, 50, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            generifyingTarget      = "ashes" amount 648648000L
        }

        meta {
            numericId           = 8201
            hashId              = 784
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 1")
            aspect("Perditio - 1")
            reRegisteredTo("dark_ash")
            reRegisteredTo("ash_dark")
            reRegisteredTo("ashes_dark")
            reRegisteredTo("any_ashes")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val WaxBee = material("wax_bee") {
        name = "Bees Wax"

        appearance {
            color       = Rgba(250, 220, 110, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        processing {
            generifyingTarget      = "wax" amount 648648000L
        }

        meta {
            numericId           = 8236
            hashId              = 822
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Bestia - 1")
            reRegisteredTo("any_wax")
            reRegisteredTo("bees_wax")
            reRegisteredTo("beeswax")
            reRegisteredTo("bee_wax")
            reRegisteredTo("beewax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Rice = material("rice") {
        appearance {
            color       = Rgba(252, 252, 240, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9706
            hashId              = 893
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour_or_grains")
            reRegisteredTo("any_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val FreshWater = material("fresh_water") {
        name = "Fresh Water"

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
            numericId           = 9803
            hashId              = 575
            originalMod         = "gregapi"
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
        )

    }

    val Bluestone = material("bluestone") {
        appearance {
            color       = Rgba(52, 52, 252, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9185
            hashId              = 1135
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Purple = material("purple") {
        appearance {
            color       = Rgba(128, 0, 128, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8255
            hashId              = 557
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val OilSand = material("oil_sand") {
        name = "Oil Sand"

        appearance {
            color       = Rgba(10, 10, 10, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9851
            hashId              = 751
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 6000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Mortuus - 2")
            aspect("Lux - 1")
            reRegisteredTo("oilsands")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
        )

    }

    val InfusedVis = material("infused_vis") {
        name = "Infused Vis"

        appearance {
            color       = Rgba(255, 0, 255, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8351
            hashId              = 1099
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Auram - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val DarkMatter = material("dark_matter") {
        name = "Dark Matter"

        appearance {
            color       = Rgba(40, 20, 40, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 5
            durability = 12800L
            speed      = 20.0f
        }

        meta {
            numericId           = 8381
            hashId              = 1094
            originalMod         = "ProjectE"
            hidden              = true
            handleMaterial      = ref("diamond")
            aspect("Potentia - 10")
            aspect("Tenebrae - 10")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Vyroxeres = material("vyroxeres") {
        appearance {
            color       = Rgba(85, 224, 1, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.96
            meltingPoint = 2348L
            boilingPoint = 4696L
            plasmaPoint  = 469600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 768L
            speed      = 9.0f
        }

        processing {
            byProduct("iridium")
        }

        meta {
            numericId           = 8772
            hashId              = 1160
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Venemum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val GreenMiddle = material("green_middle") {
        name = "Green Middle"

        appearance {
            color       = Rgba(50, 240, 50, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8283
            hashId              = 1024
            originalMod         = "thebetweenlands"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lux - 2")
            aspect("Herba - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WhiteEndSand = material("white_end_sand") {
        name = "White End Sand"

        appearance {
            color       = Rgba(230, 250, 250, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
        }

        fluids {
            smeltingTarget    = "glass" amount 648648000L
        }

        processing {
            forgingTarget         = "glass" amount 648648000L
        }

        meta {
            numericId           = 8105
            hashId              = 1114
            originalMod         = "enderlicious"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_silicon_dioxide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
        )

    }

    val Yellow = material("yellow") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8261
            hashId              = 563
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val ManaQuartz = material("mana_quartz") {
        name = "Mana Quartz"

        appearance {
            color       = Rgba(210, 210, 255, 255)
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

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 64L
            speed      = 2.5f
        }

        processing {
            oreMultiplier           = 2
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8398
            hashId              = 1082
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Praecantio - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
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

    val NetherStar = material("nether_star") {
        name = "Nether Star"

        appearance {
            iconSet     = IconSet.NETHERSTAR
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 3896L
            boilingPoint = 5127L
            plasmaPoint  = 512700L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5120L
            speed      = 8.0f
        }

        meta {
            numericId           = 8320
            hashId              = 1034
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            alloyRef("stellar_alloy")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.MELTING,
        )

    }

    val SunflowerOil = material("sunflower_oil") {
        name = "Sunflower Oil"

        appearance {
            color       = Rgba(216, 189, 17, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9875
            hashId              = 772
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Pinkschist = material("pinkschist") {
        name = "Pink Schist"

        appearance {
            color       = Rgba(220, 195, 195, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 24L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9245
            hashId              = 1392
            originalMod         = "PFAAGeologica"
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

    val Kalendrite = material("kalendrite") {
        appearance {
            color       = Rgba(170, 91, 189, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 78
            electrons    = 78
            neutrons     = 117
            mass         = 195L
            density      = 21.46
            meltingPoint = 2679L
            boilingPoint = 5358L
            plasmaPoint  = 535800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2560L
            speed      = 5.0f
        }

        processing {
            byProduct("osmium_elemental")
        }

        meta {
            numericId           = 8768
            hashId              = 1156
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            alloyRef("amordrine")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Templerock = material("templerock") {
        appearance {
            color       = Rgba(171, 158, 106, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 1600L
            boilingPoint = 3200L
            plasmaPoint  = 320000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8525
            hashId              = 1376
            originalMod         = "thebetweenlands"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vinculum - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Blackstone = material("blackstone") {
        appearance {
            color       = Rgba(30, 20, 20, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 64L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9223
            hashId              = 1401
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
            MaterialTag.Processing.UNRECYCLABLE,
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

    val Fluix = material("fluix") {
        appearance {
            color       = Rgba(120, 70, 140, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 34
            mass         = 62L
            density      = 3.951652692
            meltingPoint = 1490L
            boilingPoint = 2646L
            plasmaPoint  = 264666L
        }

        fluids {
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        processing {
            oreMultiplier           = 2
        }

        composition {
            formula = "(SiO₂)₂,₃((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))"
            component("silicon_dioxide", 648648000L)
            component("redstone", 324324000L)
        }

        meta {
            numericId           = 8389
            hashId              = 1087
            originalMod         = "appliedenergistics2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
            aspect("Vitreus - 1")
            aspect("Lux - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.Processing.CRYSTALLISABLE,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val InfusedWater = material("infused_water") {
        name = "Infused Water"

        appearance {
            color       = Rgba(0, 0, 255, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8355
            hashId              = 1103
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Aqua - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val SaltedButter = material("salted_butter") {
        name = "Salted Butter"

        appearance {
            color       = Rgba(230, 230, 110, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 57
            electrons    = 57
            neutrons     = 69
            mass         = 126L
            density      = 1.487107
            meltingPoint = 313L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        composition {
            component("milk", 648648000L)
            component("salt", 648648000L)
        }

        meta {
            numericId           = 9799
            hashId              = 922
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 3")
        }

        tags(
            MaterialTag.Properties.FOOD,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Greenschist = material("greenschist") {
        name = "Green Schist"

        appearance {
            color       = Rgba(105, 190, 105, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 24L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9171
            hashId              = 1389
            originalMod         = "UndergroundBiomes"
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

    val Oureclase = material("oureclase") {
        appearance {
            color       = Rgba(183, 98, 21, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 28
            electrons    = 28
            neutrons     = 30
            mass         = 58L
            density      = 8.912
            meltingPoint = 2789L
            boilingPoint = 5578L
            plasmaPoint  = 557800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1920L
            speed      = 6.0f
        }

        processing {
            byProduct("pentlandite")
        }

        meta {
            numericId           = 8767
            hashId              = 1155
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Aer - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val HexoriumBlack = material("hexorium_black") {
        name = "Black Hexorium"

        appearance {
            color       = Rgba(32, 32, 32, 127)
            iconSet     = IconSet.HEX
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 512L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 3
            byProduct("hexorium_red", "hexorium_green", "hexorium_blue")
        }

        meta {
            numericId           = 9224
            hashId              = 1107
            originalMod         = "hexcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Tenebrae - 4")
            reRegisteredTo("hexorium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val LinOil = material("lin_oil") {
        name = "Lin Oil"

        appearance {
            color       = Rgba(196, 255, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9874
            hashId              = 771
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Iffesal = material("iffesal") {
        appearance {
            color       = Rgba(14, 25, 171, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            hasMetallum  = true
        }

        meta {
            numericId           = 8743
            hashId              = 1328
            originalMod         = "alfheim"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Praecantio - 4")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.MAGICAL,
        )

    }

    val Bedrock = material("bedrock") {
        appearance {
            colorSolid  = Rgba(64, 64, 64, 255)
            colorLiquid = Rgba(128, 96, 64, 255)
            colorGas    = Rgba(64, 64, 64, 255)
            colorPlasma = Rgba(64, 64, 64, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 222
            electrons    = 222
            neutrons     = 580
            mass         = 802L
            density      = 13.35624762
            meltingPoint = 4000L
            boilingPoint = 8000L
            plasmaPoint  = 800000L
        }

        tool {
            types      = 1
            quality    = 5
            durability = 2048L
            speed      = 8.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8599
            hashId              = 1131
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 5")
            sourceOf("atlarus", "adamantium", "rare_earth")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedMatter = material("red_matter") {
        name = "Red Matter"

        appearance {
            color       = Rgba(255, 0, 0, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 6
            durability = 25600L
            speed      = 30.0f
        }

        meta {
            numericId           = 8382
            hashId              = 1095
            originalMod         = "ProjectE"
            hidden              = true
            handleMaterial      = ref("dark_matter")
            aspect("Potentia - 10")
            aspect("Lux - 10")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val LightBlue = material("light_blue") {
        name = "Light Blue"

        appearance {
            color       = Rgba(128, 128, 255, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8262
            hashId              = 564
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Wheat = material("wheat") {
        appearance {
            color       = Rgba(255, 255, 196, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            burningTarget         = "ashes" amount 72072000L
        }

        meta {
            numericId           = 9702
            hashId              = 889
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Messis - 2")
            reRegisteredTo("any_flour")
            reRegisteredTo("any_flour_or_grains")
            reRegisteredTo("flour")
            reRegisteredTo("any_grains")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Adamantite = material("adamantite") {
        appearance {
            color       = Rgba(255, 255, 190, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2560L
            speed      = 6.0f
        }

        meta {
            numericId           = 8755
            hashId              = 1340
            originalMod         = "GalaxySpace"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val SoylentGreen = material("soylent_green") {
        name = "Emerald Green"

        appearance {
            color       = Rgba(0, 222, 0, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 422L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        meta {
            numericId           = 9779
            hashId              = 901
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            aspect("Corpus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val InfusedOrder = material("infused_order") {
        name = "Infused Order"

        appearance {
            color       = Rgba(252, 252, 252, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8357
            hashId              = 1105
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Ordo - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val PlutoRock = material("pluto_rock") {
        name = "Pluto"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9268
            hashId              = 1430
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Ice = material("ice") {
        appearance {
            color       = Rgba(200, 200, 255, 255)
            iconSet     = IconSet.CUBE_SHINY
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
            smeltingTarget    = "water" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 4L
            speed      = 2.0f
        }

        composition {
            formula = "H₂O"
            component("hydrogen", 432432000L)
            component("oxygen", 216216000L)
        }

        meta {
            numericId           = 9802
            hashId              = 574
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Gelum - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.COOL2CRYSTAL,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val LavenderQuartz = material("lavender_quartz") {
        name = "Lavender Quartz"

        appearance {
            color       = Rgba(255, 200, 255, 255)
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
            generifyingTarget      = "milky_quartz" amount 648648000L
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8394
            hashId              = 1076
            originalMod         = "Botania"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            aspect("Sensus - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
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

    val WaxMagic = material("wax_magic") {
        name = "Magic Wax"

        appearance {
            color       = Rgba(200, 80, 200, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        processing {
            generifyingTarget      = "wax" amount 648648000L
        }

        meta {
            numericId           = 8240
            hashId              = 834
            originalMod         = "MagicBees"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Praecantio - 1")
            reRegisteredTo("any_wax")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.FURNACE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Cocoa = material("cocoa") {
        appearance {
            color       = Rgba(190, 95, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9782
            hashId              = 904
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Yellorium = material("yellorium") {
        appearance {
            color       = Rgba(140, 130, 20, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            byProduct("lead", "radium", "rare_earth")
        }

        meta {
            numericId           = 8715
            hashId              = 1292
            originalMod         = "BigReactors"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Octine = material("octine") {
        appearance {
            color       = Rgba(255, 128, 32, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2934L
            boilingPoint = 3634L
            plasmaPoint  = 363400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 900L
            speed      = 8.0f
        }

        processing {
            byProduct("pentlandite", "huebnerite", "zircon")
        }

        meta {
            numericId           = 8786
            hashId              = 1346
            originalMod         = "thebetweenlands"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Mortuus - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Marshmallow = material("marshmallow") {
        appearance {
            color       = Rgba(255, 220, 220, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "wood" amount 648648000L
        }

        meta {
            numericId           = 9715
            hashId              = 818
            originalMod         = "candycraftmod"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Gray = material("gray") {
        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8258
            hashId              = 560
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val InfusedDull = material("infused_dull") {
        name = "Infused Dull"

        appearance {
            color       = Rgba(100, 100, 100, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 32.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8350
            hashId              = 1098
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Vacuos - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val PeatBituminous = material("peat_bituminous") {
        name = "Bituminous Peat"

        appearance {
            color       = Rgba(80, 40, 10, 255)
            iconSet     = IconSet.LIGNITE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8361
            hashId              = 1056
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 2400L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 3")
            aspect("Ignis - 3")
            aspect("Perditio - 3")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.INGOTS,
        )

    }

    val Force = material("force") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 128L
            speed      = 10.0f
        }

        meta {
            numericId           = 8343
            hashId              = 1121
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 4")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val DeimosRock = material("deimos_rock") {
        name = "Deimos"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9250
            hashId              = 1412
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Rhyolite = material("rhyolite") {
        appearance {
            color       = Rgba(121, 121, 121, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9179
            hashId              = 1404
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

    val HexoriumWhite = material("hexorium_white") {
        name = "White Hexorium"

        appearance {
            color       = Rgba(224, 224, 224, 127)
            iconSet     = IconSet.HEX
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 384L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 3
            byProduct("hexorium_red", "hexorium_green", "hexorium_blue")
        }

        meta {
            numericId           = 9239
            hashId              = 1111
            originalMod         = "hexcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Lux - 4")
            reRegisteredTo("hexorium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val Dolamide = material("dolamide") {
        appearance {
            color       = Rgba(188, 100, 122, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            byProduct("dilithium", "diduranium_trioxide", "duranium_hexafluoride", "duranium_hexabromide")
        }

        meta {
            numericId           = 8753
            hashId              = 1338
            originalMod         = "mo"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 3")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
        )

    }

    val Orange = material("orange") {
        appearance {
            color       = Rgba(255, 128, 0, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8264
            hashId              = 566
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sensus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Hazelnut = material("hazelnut") {
        appearance {
            color       = Rgba(240, 200, 140, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 9796
            hashId              = 911
            originalMod         = "BinnieCore"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Honey = material("honey") {
        appearance {
            color       = Rgba(250, 200, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 273L
            boilingPoint = 373L
            plasmaPoint  = 37300L
        }

        meta {
            numericId           = 9791
            hashId              = 923
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
        )

    }

    val Endstone = material("endstone") {
        appearance {
            color       = Rgba(217, 222, 158, 255)
            iconSet     = IconSet.STONE
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
            quality    = 1
            durability = 16L
            speed      = 3.0f
        }

        processing {
            byProduct("helium3", "beryllium")
            generifyingTarget      = "white_end_sand" amount 648648000L
        }

        meta {
            numericId           = 8504
            hashId              = 1129
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_stone")
            sourceOf("helium", "helium3")
            alloyRef("end_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MilkyQuartz = material("milky_quartz") {
        name = "Milky Quartz"

        appearance {
            color       = Rgba(210, 210, 210, 255)
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
            byProduct("certus_quartz", "barite")
        }

        composition {
            formula = "SiO₂"
            component("silicon_dioxide", 648648000L)
        }

        meta {
            numericId           = 8445
            hashId              = 1072
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 1")
            aspect("Vitreus - 1")
            reRegisteredTo("any_silicon_dioxide")
            reRegisteredTo("quartz")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.QUARTZ,
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

    val OliveOil = material("olive_oil") {
        name = "Olive Oil"

        appearance {
            color       = Rgba(63, 146, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9877
            hashId              = 774
            originalMod         = "harvestcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Herba - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
        )

    }

    val Meutoite = material("meutoite") {
        appearance {
            color       = Rgba(95, 82, 105, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 28
            electrons    = 28
            neutrons     = 30
            mass         = 58L
            density      = 8.912
            meltingPoint = 1837L
            boilingPoint = 3674L
            plasmaPoint  = 367400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            byProduct("vanadium_pentoxide")
        }

        meta {
            numericId           = 8763
            hashId              = 1150
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 1")
            alloyRef("desichalkos")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val UranusRock = material("uranus_rock") {
        name = "Uranus"

        appearance {
            color       = Rgba(189, 189, 189, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 128L
            speed      = 5.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 9264
            hashId              = 1426
            originalMod         = "ExtraPlanets"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Alduorite = material("alduorite") {
        appearance {
            color       = Rgba(159, 180, 180, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 13
            mass         = 26L
            density      = 2.698
            meltingPoint = 1567L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            byProduct("cadmium")
        }

        meta {
            numericId           = 8760
            hashId              = 1146
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Permutatio - 1")
            reRegisteredTo("adluorite")
            alloyRef("inolashite")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Siltstone = material("siltstone") {
        appearance {
            color       = Rgba(250, 205, 205, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
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

        meta {
            numericId           = 9178
            hashId              = 1403
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

    val Forcillium = material("forcillium") {
        appearance {
            color       = Rgba(50, 50, 70, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            byProduct("thorium", "neodymium", "rare_earth")
        }

        meta {
            numericId           = 8345
            hashId              = 1123
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val MarsSand = material("mars_sand") {
        name = "Mars Sand"

        appearance {
            color       = Rgba(207, 66, 66, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 3.0f
        }

        processing {
            generifyingTarget      = "stone" amount 648648000L
        }

        meta {
            numericId           = 8516
            hashId              = 1368
            originalMod         = "GalacticraftCore"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 1")
            reRegisteredTo("any_stone")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.STONE,
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

    val Creosote = material("creosote") {
        appearance {
            color       = Rgba(128, 64, 0, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 100L
            boilingPoint = 400L
            plasmaPoint  = 40000L
        }

        meta {
            numericId           = 9870
            hashId              = 765
            originalMod         = "Railcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 2")
            aspect("Lux - 1")
            reRegisteredTo("creosote_oil")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.ItemGenerator.LIQUID,
        )

    }

    val HexoriumRed = material("hexorium_red") {
        name = "Red Hexorium"

        appearance {
            color       = Rgba(128, 0, 0, 127)
            iconSet     = IconSet.HEX
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 256L
            speed      = 5.0f
        }

        processing {
            oreMultiplier           = 4
            byProduct("hexorium_white", "hexorium_black")
        }

        meta {
            numericId           = 9225
            hashId              = 1108
            originalMod         = "hexcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 3")
            aspect("Sensus - 4")
            reRegisteredTo("hexorium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Processing.BLACKLISTED_SMELTER,
            MaterialTag.Processing.CRYSTALLISABLE,
        )

    }

    val InfusedEarth = material("infused_earth") {
        name = "Infused Earth"

        appearance {
            color       = Rgba(0, 255, 0, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
        }

        meta {
            numericId           = 8354
            hashId              = 1102
            originalMod         = "Thaumcraft"
            hidden              = true
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_magic_iron")
            aspect("Praecantio - 1")
            aspect("Terra - 2")
            reRegisteredTo("any_thaumic_crystal")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.TRANSPARENT,
        )

    }
}
