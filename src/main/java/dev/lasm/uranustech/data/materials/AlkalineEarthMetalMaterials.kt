package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: AlkalineEarthMetalMaterials
@Suppress("unused") object AlkalineEarthMetalMaterials {
    fun init() = Unit

    val Beryllium8 = material("beryllium8") {
        name = "Beryllium-8"

        appearance {
            color       = Rgba(110, 200, 110, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 4
            mass         = 8L
            density      = 1.85
            meltingPoint = 1560L
            boilingPoint = 2742L
            plasmaPoint  = 274200L
            hasMetallum  = true
        }

        composition {
            formula = "Be-8"
        }

        meta {
            numericId           = 42
            hashId              = 70
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Beryllium7 = material("beryllium7") {
        name = "Beryllium-7"

        appearance {
            color       = Rgba(110, 190, 110, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 3
            mass         = 7L
            density      = 1.85
            meltingPoint = 1560L
            boilingPoint = 2742L
            plasmaPoint  = 274200L
            hasMetallum  = true
        }

        composition {
            formula = "Be-7"
        }

        meta {
            numericId           = 41
            hashId              = 69
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Strontium = material("strontium") {
        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 38
            electrons    = 38
            neutrons     = 49
            mass         = 87L
            density      = 2.64
            meltingPoint = 1050L
            boilingPoint = 1655L
            plasmaPoint  = 165500L
            hasMetallum  = true
        }

        composition {
            formula = "Sr"
        }

        meta {
            numericId           = 380
            hashId              = 116
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Strontio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
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

    val Calcium = material("calcium") {
        appearance {
            color       = Rgba(255, 245, 245, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 20
            electrons    = 20
            neutrons     = 20
            mass         = 40L
            density      = 1.54
            meltingPoint = 1115L
            boilingPoint = 1757L
            plasmaPoint  = 175700L
        }

        composition {
            formula = "Ca"
        }

        meta {
            numericId           = 200
            hashId              = 93
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Sano - 1")
            aspect("Tutamen - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
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

    val Radium = material("radium") {
        appearance {
            color       = Rgba(255, 255, 205, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 88
            electrons    = 88
            neutrons     = 138
            mass         = 226L
            density      = 5.5
            meltingPoint = 973L
            boilingPoint = 2010L
            plasmaPoint  = 201000L
            hasMetallum  = true
        }

        composition {
            formula = "Ra"
        }

        meta {
            numericId           = 880
            hashId              = 182
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
            reRegisteredTo("radium226")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Beryllium = material("beryllium") {
        appearance {
            color       = Rgba(100, 180, 100, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 4
            electrons    = 4
            neutrons     = 5
            mass         = 9L
            density      = 1.85
            meltingPoint = 1560L
            boilingPoint = 2742L
            plasmaPoint  = 274200L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 2
            durability = 64L
            speed      = 14.0f
        }

        processing {
            byProduct("alumina", "emerald", "aquamarine", "morganite", "goshenite", "bixbite", "heliodor", "maxixe")
        }

        composition {
            formula = "Be"
        }

        meta {
            numericId           = 40
            hashId              = 68
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            sourceOf("aluminium", "beryllium", "emerald")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Magnesium = material("magnesium") {
        appearance {
            color       = Rgba(255, 200, 200, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 24L
            density      = 1.738
            meltingPoint = 923L
            boilingPoint = 1363L
            plasmaPoint  = 136300L
            hasMetallum  = true
        }

        processing {
            byProduct("peridot", "magnesium_carbonate")
        }

        composition {
            formula = "Mg"
        }

        meta {
            numericId           = 120
            hashId              = 82
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 800L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Sano - 1")
            alloyRef("magnalium")
            alloyRef("duranium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
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

    val Barium = material("barium") {
        appearance {
            color       = Rgba(131, 130, 76, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 56
            electrons    = 56
            neutrons     = 81
            mass         = 137L
            density      = 3.594
            boilingPoint = 2170L
            plasmaPoint  = 217000L
        }

        composition {
            formula = "Ba"
        }

        meta {
            numericId           = 560
            hashId              = 136
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vinculum - 3")
            alloyRef("yttrium_barium_cuprate")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALINE_EARTH_METAL,
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
}
