package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: DiatomicNonmetalMaterials
@Suppress("unused") object DiatomicNonmetalMaterials {
    fun init() = Unit

    val Hydrogen = material("hydrogen") {
        appearance {
            color       = Rgba(0, 0, 255, 15)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 1
            electrons    = 1
            neutrons     = 0
            mass         = 1L
            density      = 8.988e-05
            meltingPoint = 14L
            boilingPoint = 20L
            plasmaPoint  = 2000L
        }

        composition {
            formula = "H₂"
        }

        meta {
            numericId           = 10
            hashId              = 61
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 1")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Deuterium = material("deuterium") {
        appearance {
            color       = Rgba(255, 255, 0, 15)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 1
            electrons    = 1
            neutrons     = 1
            mass         = 2L
            density      = 8.988e-05
            meltingPoint = 14L
            boilingPoint = 20L
            plasmaPoint  = 2000L
        }

        composition {
            formula = "D₂"
        }

        meta {
            numericId           = 11
            hashId              = 62
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
        }

        tags(
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Tritium = material("tritium") {
        appearance {
            color       = Rgba(255, 0, 0, 15)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 1
            electrons    = 1
            neutrons     = 2
            mass         = 3L
            density      = 8.988e-05
            meltingPoint = 14L
            boilingPoint = 20L
            plasmaPoint  = 2000L
        }

        composition {
            formula = "T₂"
        }

        meta {
            numericId           = 12
            hashId              = 63
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 3")
        }

        tags(
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }
}
