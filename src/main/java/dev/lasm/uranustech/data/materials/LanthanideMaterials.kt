package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: LanthanideMaterials
@Suppress("unused") object LanthanideMaterials {
    fun init() = Unit

    val Ytterbium = material("ytterbium") {
        appearance {
            color       = Rgba(167, 167, 167, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 70
            electrons    = 70
            neutrons     = 103
            mass         = 173L
            density      = 6.965
            meltingPoint = 1097L
            boilingPoint = 1469L
            plasmaPoint  = 146900L
            hasMetallum  = true
        }

        composition {
            formula = "Yb"
        }

        meta {
            numericId           = 700
            hashId              = 153
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Lanthanium = material("lanthanium") {
        appearance {
            color       = Rgba(93, 117, 117, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 57
            electrons    = 57
            neutrons     = 81
            mass         = 138L
            density      = 6.145
            meltingPoint = 1193L
            boilingPoint = 3737L
            plasmaPoint  = 373700L
            hasMetallum  = true
        }

        composition {
            formula = "La"
        }

        meta {
            numericId           = 570
            hashId              = 137
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            reRegisteredTo("lantanium")
            reRegisteredTo("lantanum")
            reRegisteredTo("lanthanum")
            alloyRef("desh")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Holmium = material("holmium") {
        appearance {
            color       = Rgba(196, 150, 159, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 67
            electrons    = 67
            neutrons     = 97
            mass         = 164L
            density      = 8.795
            meltingPoint = 1734L
            boilingPoint = 2993L
            plasmaPoint  = 299300L
            hasMetallum  = true
        }

        composition {
            formula = "Ho"
        }

        meta {
            numericId           = 670
            hashId              = 150
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 4")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Cerium = material("cerium") {
        appearance {
            color       = Rgba(255, 255, 190, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 58
            electrons    = 58
            neutrons     = 82
            mass         = 140L
            density      = 6.77
            meltingPoint = 1068L
            boilingPoint = 3716L
            plasmaPoint  = 371600L
            hasMetallum  = true
        }

        composition {
            formula = "Ce"
        }

        meta {
            numericId           = 580
            hashId              = 141
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            alloyRef("desh")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Neodymium = material("neodymium") {
        appearance {
            color       = Rgba(100, 100, 100, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 60
            electrons    = 60
            neutrons     = 84
            mass         = 144L
            density      = 7.007
            meltingPoint = 1297L
            boilingPoint = 3347L
            plasmaPoint  = 334700L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        processing {
            byProduct("monazite", "rare_earth")
        }

        composition {
            formula = "Nd"
        }

        meta {
            numericId           = 600
            hashId              = 143
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 2")
            alloyRef("desh")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
