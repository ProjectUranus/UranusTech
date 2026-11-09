package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: PreciousMetalMaterials
@Suppress("unused") object PreciousMetalMaterials {
    fun init() = Unit

    val Iridium = material("iridium") {
        appearance {
            colorSolid  = Rgba(240, 240, 245, 255)
            colorLiquid = Rgba(255, 128, 200, 255)
            colorGas    = Rgba(240, 240, 245, 255)
            colorPlasma = Rgba(240, 240, 245, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 77
            electrons    = 77
            neutrons     = 115
            mass         = 192L
            density      = 22.56
            meltingPoint = 2719L
            boilingPoint = 4701L
            plasmaPoint  = 470100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5120L
            speed      = 6.0f
        }

        processing {
            byProduct("platinum", "osmium_elemental", "rhodium")
        }

        composition {
            formula = "Ir"
        }

        meta {
            numericId           = 770
            hashId              = 164
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Nebrisum - 1")
            aspect("Machina - 1")
            alloyRef("titanium_iridium")
            alloyRef("hsss")
            alloyRef("osmiridium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.COBALT_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Atomic.PLATINUM_GROUP,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Rhenium = material("rhenium") {
        appearance {
            color       = Rgba(255, 255, 200, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 75
            electrons    = 75
            neutrons     = 111
            mass         = 186L
            density      = 21.02
            meltingPoint = 3459L
            boilingPoint = 5869L
            plasmaPoint  = 586900L
            hasMetallum  = true
        }

        processing {
            byProduct("chalcopyrite", "molybdenite")
        }

        composition {
            formula = "Re"
        }

        meta {
            numericId           = 750
            hashId              = 162
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.MANGANESE_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val OsmiumElemental = material("osmium_elemental") {
        name = "Osmium"

        appearance {
            color       = Rgba(50, 50, 255, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 76
            electrons    = 76
            neutrons     = 114
            mass         = 190L
            density      = 22.61
            meltingPoint = 3306L
            boilingPoint = 5285L
            plasmaPoint  = 528500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1280L
            speed      = 16.0f
        }

        processing {
            byProduct("iridium", "platinum", "ruthenium")
        }

        composition {
            formula = "Os"
        }

        meta {
            numericId           = 760
            hashId              = 163
            originalMod         = "gravisuite"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Nebrisum - 2")
            aspect("Machina - 1")
            alloyRef("osmiridium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.IRON_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Atomic.PLATINUM_GROUP,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Rhodium = material("rhodium") {
        appearance {
            color       = Rgba(144, 144, 144, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 45
            electrons    = 45
            neutrons     = 58
            mass         = 103L
            density      = 12.41
            meltingPoint = 2237L
            boilingPoint = 3968L
            plasmaPoint  = 396800L
            hasMetallum  = true
        }

        composition {
            formula = "Rh"
        }

        meta {
            numericId           = 450
            hashId              = 125
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Nebrisum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.COBALT_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Atomic.PLATINUM_GROUP,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Gold = material("gold") {
        appearance {
            color       = Rgba(255, 230, 80, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 79
            electrons    = 79
            neutrons     = 117
            mass         = 196L
            density      = 19.282
            meltingPoint = 1337L
            boilingPoint = 3129L
            plasmaPoint  = 312900L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 12.5f
        }

        processing {
            byProduct("copper", "nickel", "cinnabar")
        }

        composition {
            formula = "Au"
        }

        meta {
            numericId           = 790
            hashId              = 166
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 2")
            alloyRef("angmallen")
            alloyRef("gold_inductive")
            alloyRef("netherite")
            alloyRef("black_bronze")
            alloyRef("titanium_gold")
            alloyRef("hepatizon")
            alloyRef("soularium")
            alloyRef("electrum")
            alloyRef("rose_gold")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.COPPER_GROUP,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.NOBLE_METAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Copper = material("copper") {
        appearance {
            color       = Rgba(255, 130, 90, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.96
            meltingPoint = 1357L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 0
            durability = 64L
            speed      = 4.0f
        }

        processing {
            byProduct("cobaltite", "gold", "nickel", "malachite", "arsenic")
            reversingTarget        = ref("any_copper")
        }

        composition {
            formula = "Cu"
        }

        meta {
            numericId           = 290
            hashId              = 106
            originalMod         = "etfuturum"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Permutatio - 1")
            reRegisteredTo("any_copper")
            alloyRef("red_alloy")
            alloyRef("brass")
            alloyRef("signalum")
            alloyRef("bronze")
            alloyRef("black_bronze")
            alloyRef("annealed_copper")
            alloyRef("yttrium_barium_cuprate")
            alloyRef("arsenic_copper")
            alloyRef("constantan")
            alloyRef("sterling_silver")
            alloyRef("rose_gold")
            alloyRef("aluminium_brass")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.COPPER_GROUP,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.NOBLE_METAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Platinum = material("platinum") {
        appearance {
            color       = Rgba(100, 180, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 78
            electrons    = 78
            neutrons     = 117
            mass         = 195L
            density      = 21.46
            meltingPoint = 2041L
            boilingPoint = 4098L
            plasmaPoint  = 409800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 15.0f
        }

        processing {
            byProduct("nickel", "iridium", "palladium")
        }

        composition {
            formula = "Pt"
        }

        meta {
            numericId           = 780
            hashId              = 165
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Nebrisum - 1")
            alloyRef("celenegil")
            alloyRef("enderium_base")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.NICKEL_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Atomic.PLATINUM_GROUP,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Gold198 = material("gold198") {
        name = "Gold-198"

        appearance {
            color       = Rgba(255, 230, 80, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 79
            electrons    = 79
            neutrons     = 119
            mass         = 198L
            density      = 19.282
            meltingPoint = 1337L
            boilingPoint = 3129L
            plasmaPoint  = 312900L
            hasMetallum  = true
        }

        composition {
            formula = "Au-198"
        }

        meta {
            numericId           = 791
            hashId              = 167
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
            reRegisteredTo("gol198")
            reRegisteredTo("au198")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Atomic.COPPER_GROUP,
            MaterialTag.Atomic.NOBLE_METAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Palladium = material("palladium") {
        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 46
            electrons    = 46
            neutrons     = 60
            mass         = 106L
            density      = 12.02
            meltingPoint = 1828L
            boilingPoint = 3236L
            plasmaPoint  = 323600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 8.0f
        }

        composition {
            formula = "Pd"
        }

        meta {
            numericId           = 460
            hashId              = 126
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Nebrisum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.NICKEL_GROUP,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Atomic.PLATINUM_GROUP,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Mercury = material("mercury") {
        appearance {
            color       = Rgba(230, 220, 220, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 80
            electrons    = 80
            neutrons     = 120
            mass         = 200L
            density      = 13.5336
            meltingPoint = 234L
            boilingPoint = 629L
            plasmaPoint  = 62900L
            hasMetallum  = true
        }

        composition {
            formula = "Hg"
        }

        meta {
            numericId           = 800
            hashId              = 170
            originalMod         = "Thaumcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Aqua - 1")
            aspect("Venemum - 1")
            reRegisteredTo("quicksilver")
            reRegisteredTo("quick_silver")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.PULVERIZING_CINNABAR,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Atomic.ZINC_GROUP,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Silver = material("silver") {
        appearance {
            color       = Rgba(220, 220, 255, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 47
            electrons    = 47
            neutrons     = 60
            mass         = 107L
            density      = 10.501
            meltingPoint = 1234L
            boilingPoint = 2435L
            plasmaPoint  = 243500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 10.0f
        }

        processing {
            byProduct("lead", "sulfur", "bromargyrite")
        }

        composition {
            formula = "Ag"
        }

        meta {
            numericId           = 470
            hashId              = 127
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            alloyRef("blue_alloy")
            alloyRef("cd_in_ag_alloy")
            alloyRef("vibranium_silver")
            alloyRef("signalum")
            alloyRef("lumium")
            alloyRef("black_bronze")
            alloyRef("enderium_base")
            alloyRef("energetic_silver")
            alloyRef("electrum")
            alloyRef("sterling_silver")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.COPPER_GROUP,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.NOBLE_METAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Ruthenium = material("ruthenium") {
        appearance {
            color       = Rgba(155, 155, 155, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 44
            electrons    = 44
            neutrons     = 57
            mass         = 101L
            density      = 12.37
            meltingPoint = 2607L
            boilingPoint = 4423L
            plasmaPoint  = 442300L
            hasMetallum  = true
        }

        composition {
            formula = "Ru"
        }

        meta {
            numericId           = 440
            hashId              = 124
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Nebrisum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.IRON_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.PRECIOUS_METAL,
            MaterialTag.Atomic.PLATINUM_GROUP,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
