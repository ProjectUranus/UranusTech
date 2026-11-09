package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: AlkaliMetalMaterials
@Suppress("unused") object AlkaliMetalMaterials {
    fun init() = Unit

    val Rubidium = material("rubidium") {
        appearance {
            color       = Rgba(240, 30, 30, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 37
            electrons    = 37
            neutrons     = 48
            mass         = 85L
            density      = 1.532
            meltingPoint = 312L
            boilingPoint = 961L
            plasmaPoint  = 96100L
            hasMetallum  = true
        }

        composition {
            formula = "Rb"
        }

        meta {
            numericId           = 370
            hashId              = 115
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Vitreus - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALI_METAL,
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

    val Potassium = material("potassium") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 19
            electrons    = 19
            neutrons     = 20
            mass         = 39L
            density      = 0.862
            meltingPoint = 336L
            boilingPoint = 1032L
            plasmaPoint  = 103200L
        }

        composition {
            formula = "K"
        }

        meta {
            numericId           = 190
            hashId              = 91
            originalMod         = "Railcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Potentia - 1")
            reRegisteredTo("kalium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALI_METAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Lithium6 = material("lithium6") {
        name = "Lithium-6"

        appearance {
            color       = Rgba(230, 225, 255, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 6L
            density      = 0.534
            meltingPoint = 453L
            boilingPoint = 1560L
            plasmaPoint  = 156000L
        }

        composition {
            formula = "Li-6"
        }

        meta {
            numericId           = 31
            hashId              = 67
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 2000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Potentia - 1")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALI_METAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Caesium = material("caesium") {
        appearance {
            color       = Rgba(128, 98, 11, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 55
            electrons    = 55
            neutrons     = 77
            mass         = 132L
            density      = 1.873
            meltingPoint = 301L
            boilingPoint = 944L
            plasmaPoint  = 94400L
            hasMetallum  = true
        }

        composition {
            formula = "Cs"
        }

        meta {
            numericId           = 550
            hashId              = 135
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALI_METAL,
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

    val Lithium = material("lithium") {
        appearance {
            color       = Rgba(225, 220, 255, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 4
            mass         = 7L
            density      = 0.534
            meltingPoint = 453L
            boilingPoint = 1560L
            plasmaPoint  = 156000L
        }

        processing {
            byProduct("lithium_chloride")
        }

        composition {
            formula = "Li"
        }

        meta {
            numericId           = 30
            hashId              = 66
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 2000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Potentia - 2")
            alloyRef("desh")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALI_METAL,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Sodium = material("sodium") {
        appearance {
            color       = Rgba(0, 0, 150, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 11
            mass         = 22L
            density      = 0.971
            meltingPoint = 370L
            boilingPoint = 1156L
            plasmaPoint  = 115600L
        }

        composition {
            formula = "Na"
        }

        meta {
            numericId           = 110
            hashId              = 80
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 4000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Lux - 1")
            reRegisteredTo("natrium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALI_METAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
