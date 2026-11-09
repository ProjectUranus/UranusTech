package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: TransitionMetalMaterials
@Suppress("unused") object TransitionMetalMaterials {
    fun init() = Unit

    val Cobalt = material("cobalt") {
        appearance {
            color       = Rgba(80, 80, 250, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 32
            mass         = 59L
            density      = 8.86
            meltingPoint = 1768L
            boilingPoint = 3200L
            plasmaPoint  = 320000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 5.0f
        }

        processing {
            byProduct("cobaltite", "realgar", "orange_fluorite", "pentlandite", "yellow_limonite")
        }

        composition {
            formula = "Co"
        }

        meta {
            numericId           = 270
            hashId              = 102
            originalMod         = "TConstruct"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            alloyRef("ultimet")
            alloyRef("manyullyn")
            alloyRef("hsse")
            alloyRef("cobalt_brass")
            alloyRef("desh")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.COBALT_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Zinc = material("zinc") {
        appearance {
            color       = Rgba(250, 240, 240, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 30
            electrons    = 30
            neutrons     = 35
            mass         = 65L
            density      = 7.134
            meltingPoint = 692L
            boilingPoint = 1180L
            plasmaPoint  = 118000L
            hasMetallum  = true
        }

        processing {
            byProduct("tin", "gallium")
        }

        composition {
            formula = "Zn"
        }

        meta {
            numericId           = 300
            hashId              = 107
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Sano - 1")
            alloyRef("brass")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Atomic.ZINC_GROUP,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
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

    val Yttrium = material("yttrium") {
        appearance {
            color       = Rgba(220, 250, 220, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 39
            electrons    = 39
            neutrons     = 50
            mass         = 89L
            density      = 4.469
            meltingPoint = 1799L
            boilingPoint = 3609L
            plasmaPoint  = 360900L
            hasMetallum  = true
        }

        composition {
            formula = "Y"
        }

        meta {
            numericId           = 390
            hashId              = 117
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            alloyRef("yttrium_barium_cuprate")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.SCANDIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Technetium = material("technetium") {
        appearance {
            color       = Rgba(66, 66, 99, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            density      = 11.5
            meltingPoint = 2430L
            boilingPoint = 4538L
            plasmaPoint  = 453800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 1
            durability = 1280L
            speed      = 10.0f
        }

        composition {
            formula = "Tc"
        }

        meta {
            numericId           = 430
            hashId              = 122
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
            reRegisteredTo("gregorium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.MANGANESE_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Manganese = material("manganese") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 30
            mass         = 55L
            density      = 7.44
            meltingPoint = 1519L
            boilingPoint = 2334L
            plasmaPoint  = 233400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        processing {
            byProduct("pyrolusite", "hematite", "chromite")
        }

        composition {
            formula = "Mn"
        }

        meta {
            numericId           = 250
            hashId              = 100
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            alloyRef("stainless_steel")
            alloyRef("hsse")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.MANGANESE_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Nickel = material("nickel") {
        appearance {
            color       = Rgba(250, 250, 200, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 28
            electrons    = 28
            neutrons     = 30
            mass         = 58L
            density      = 8.912
            meltingPoint = 1728L
            boilingPoint = 3186L
            plasmaPoint  = 318600L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 2
            durability = 64L
            speed      = 6.0f
        }

        processing {
            byProduct("cobaltite", "cooperite", "hematite", "pentlandite")
        }

        composition {
            formula = "Ni"
        }

        meta {
            numericId           = 280
            hashId              = 105
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ignis - 1")
            alloyRef("ultimet")
            alloyRef("invar")
            alloyRef("constantan")
            alloyRef("meteoric_black_steel")
            alloyRef("black_steel")
            alloyRef("nichrome")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.NICKEL_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Iron = material("iron") {
        appearance {
            colorSolid  = Rgba(200, 200, 200, 255)
            colorLiquid = Rgba(255, 64, 32, 255)
            colorGas    = Rgba(200, 200, 200, 255)
            colorPlasma = Rgba(200, 200, 200, 255)
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
            durability = 256L
            speed      = 6.0f
        }

        processing {
            oreMultiplier           = 3
            crushingTarget        = "hematite" amount 648648000L
            reversingTarget        = ref("any_iron_or_steel")
        }

        composition {
            formula = "Fe"
        }

        meta {
            numericId           = 260
            hashId              = 101
            originalMod         = "minecraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            reRegisteredTo("any_iron")
            reRegisteredTo("any_iron_or_steel")
            alloyRef("wrought_iron")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.IRON_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.NEVER_FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Cobalt60 = material("cobalt60") {
        name = "Cobalt-60"

        appearance {
            color       = Rgba(90, 90, 250, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 33
            mass         = 60L
            density      = 8.86
            meltingPoint = 1768L
            boilingPoint = 3200L
            plasmaPoint  = 320000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 5.0f
        }

        processing {
            byProduct("cobaltite", "realgar", "orange_fluorite", "pentlandite", "yellow_limonite")
        }

        composition {
            formula = "Co-60"
        }

        meta {
            numericId           = 278
            hashId              = 103
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Instrumentum - 1")
            aspect("Radio - 1")
            reRegisteredTo("co60")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_PERSULFATE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.COBALT_GROUP,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Cadmium = material("cadmium") {
        appearance {
            color       = Rgba(50, 50, 60, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 48
            electrons    = 48
            neutrons     = 64
            mass         = 112L
            density      = 8.69
            meltingPoint = 594L
            boilingPoint = 1040L
            plasmaPoint  = 104000L
            hasMetallum  = true
        }

        processing {
            byProduct("chalcopyrite", "sphalerite", "selenium")
        }

        composition {
            formula = "Cd"
        }

        meta {
            numericId           = 480
            hashId              = 128
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Potentia - 1")
            aspect("Venemum - 1")
            alloyRef("cd_in_ag_alloy")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ZINC_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
