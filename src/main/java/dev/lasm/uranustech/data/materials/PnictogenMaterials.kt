package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: PnictogenMaterials
@Suppress("unused") object PnictogenMaterials {
    fun init() = Unit

    val Arsenic = material("arsenic") {
        appearance {
            color       = Rgba(103, 103, 86, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 33
            electrons    = 33
            neutrons     = 42
            mass         = 75L
            density      = 5.776
            meltingPoint = 887L
            boilingPoint = 1090L
            plasmaPoint  = 109000L
            hasMetallum  = true
        }

        composition {
            formula = "As"
        }

        meta {
            numericId           = 330
            hashId              = 111
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Venemum - 2")
            alloyRef("arsenic_copper")
            alloyRef("arsenic_bronze")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Atomic.PNICTOGEN,
        )

    }

    val Phosphor = material("phosphor") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 15
            mass         = 30L
            density      = 1.82
            meltingPoint = 317L
            boilingPoint = 550L
            plasmaPoint  = 55000L
        }

        processing {
            byProduct("phosphorus", "apatite", "yellow_fluorite", "phosphate", "red_phosphorus", "white_phosphorus")
        }

        composition {
            formula = "P₄"
        }

        meta {
            numericId           = 150
            hashId              = 86
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 1000L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 2")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.POLYATOMIC_NONMETAL,
            MaterialTag.Atomic.PNICTOGEN,
        )

    }

    val Antimony = material("antimony") {
        appearance {
            color       = Rgba(220, 220, 240, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 51
            electrons    = 51
            neutrons     = 70
            mass         = 121L
            density      = 6.685
            meltingPoint = 903L
            boilingPoint = 1860L
            plasmaPoint  = 186000L
            hasMetallum  = true
        }

        processing {
            byProduct("zinc", "realgar", "cinnabar", "galena", "arsenopyrite", "pyrite", "barite", "calcite")
        }

        composition {
            formula = "Sb"
        }

        meta {
            numericId           = 510
            hashId              = 131
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Aqua - 1")
            alloyRef("battery_alloy")
            alloyRef("soldering_alloy")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Atomic.PNICTOGEN,
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

    val Nitrogen = material("nitrogen") {
        appearance {
            color       = Rgba(0, 150, 200, 15)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 7
            electrons    = 7
            neutrons     = 7
            mass         = 14L
            density      = 0.0012506
            meltingPoint = 63L
            boilingPoint = 77L
            plasmaPoint  = 7700L
        }

        composition {
            formula = "N₂"
        }

        meta {
            numericId           = 70
            hashId              = 76
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 1")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
            MaterialTag.Atomic.PNICTOGEN,
        )

    }

    val Bismuth = material("bismuth") {
        appearance {
            color       = Rgba(100, 160, 160, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 83
            electrons    = 83
            neutrons     = 125
            mass         = 208L
            density      = 9.807
            meltingPoint = 544L
            boilingPoint = 1837L
            plasmaPoint  = 183700L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 1
            durability = 64L
            speed      = 6.0f
        }

        processing {
            byProduct("russellite", "galena", "kesterite")
        }

        composition {
            formula = "Bi"
        }

        meta {
            numericId           = 830
            hashId              = 175
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            alloyRef("bismuth_bronze")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Atomic.PNICTOGEN,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
