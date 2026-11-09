package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: ChalcogenMaterials
@Suppress("unused") object ChalcogenMaterials {
    fun init() = Unit

    val Oxygen = material("oxygen") {
        appearance {
            color       = Rgba(0, 100, 200, 15)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.001429
            meltingPoint = 54L
            boilingPoint = 90L
            plasmaPoint  = 9000L
        }

        composition {
            formula = "O₂"
        }

        meta {
            numericId           = 80
            hashId              = 77
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
            MaterialTag.Atomic.CHALCOGEN,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Selenium = material("selenium") {
        appearance {
            color       = Rgba(111, 20, 20, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 34
            electrons    = 34
            neutrons     = 45
            mass         = 79L
            density      = 4.809
            meltingPoint = 453L
            boilingPoint = 958L
            plasmaPoint  = 95800L
        }

        processing {
            byProduct("pyrite", "galena", "sphalerite", "indium", "gallium", "cadmium")
        }

        composition {
            formula = "Se₈"
        }

        meta {
            numericId           = 340
            hashId              = 112
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Spiritus - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.POLYATOMIC_NONMETAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.CHALCOGEN,
        )

    }

    val Sulfur = material("sulfur") {
        appearance {
            color       = Rgba(234, 234, 0, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 16
            electrons    = 16
            neutrons     = 16
            mass         = 32L
            density      = 2.067
            meltingPoint = 388L
            boilingPoint = 717L
            plasmaPoint  = 71700L
        }

        processing {
            byProduct("pyrite", "sphalerite", "cinnabar", "chalcopyrite", "arsenopyrite", "galena", "stibnite", "gypsum")
        }

        composition {
            formula = "S₈"
        }

        meta {
            numericId           = 160
            hashId              = 87
            originalMod         = "Railcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 1000L
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ignis - 1")
            reRegisteredTo("sulphur")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.POLYATOMIC_NONMETAL,
            MaterialTag.Processing.MELTING,
            MaterialTag.Atomic.CHALCOGEN,
        )

    }
}
