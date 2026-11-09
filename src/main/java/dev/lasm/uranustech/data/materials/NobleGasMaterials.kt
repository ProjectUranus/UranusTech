package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: NobleGasMaterials
@Suppress("unused") object NobleGasMaterials {
    fun init() = Unit

    val Radon = material("radon") {
        appearance {
            color       = Rgba(255, 0, 255, 15)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 86
            electrons    = 86
            neutrons     = 134
            mass         = 220L
            density      = 0.00973
            meltingPoint = 202L
            boilingPoint = 211L
            plasmaPoint  = 21100L
        }

        composition {
            formula = "Rn"
        }

        meta {
            numericId           = 860
            hashId              = 180
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 2")
            aspect("Radio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.NOBLE_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Krypton = material("krypton") {
        appearance {
            color       = Rgba(128, 255, 128, 15)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 36
            electrons    = 36
            neutrons     = 48
            mass         = 84L
            density      = 0.003733
            meltingPoint = 115L
            boilingPoint = 119L
            plasmaPoint  = 11900L
        }

        composition {
            formula = "Kr"
        }

        meta {
            numericId           = 360
            hashId              = 114
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 3")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.NOBLE_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Helium = material("helium") {
        appearance {
            color       = Rgba(255, 255, 120, 15)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.0001785
            meltingPoint = 1L
            boilingPoint = 4L
            plasmaPoint  = 400L
        }

        composition {
            formula = "He"
        }

        meta {
            numericId           = 20
            hashId              = 64
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 2")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.NOBLE_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Helium3 = material("helium3") {
        name = "Helium-3"

        appearance {
            color       = Rgba(255, 255, 140, 15)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 1
            mass         = 3L
            density      = 0.0001785
            meltingPoint = 1L
            boilingPoint = 4L
            plasmaPoint  = 400L
        }

        composition {
            formula = "He-3"
        }

        meta {
            numericId           = 21
            hashId              = 65
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 3")
        }

        tags(
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.NOBLE_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Argon = material("argon") {
        appearance {
            color       = Rgba(0, 255, 0, 15)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 22
            mass         = 40L
            density      = 0.0017837
            meltingPoint = 83L
            boilingPoint = 87L
            plasmaPoint  = 8700L
        }

        composition {
            formula = "Ar"
        }

        meta {
            numericId           = 180
            hashId              = 90
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 3")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.NOBLE_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Xenon = material("xenon") {
        appearance {
            color       = Rgba(0, 255, 255, 15)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 54
            electrons    = 54
            neutrons     = 77
            mass         = 131L
            density      = 0.005887
            meltingPoint = 161L
            boilingPoint = 165L
            plasmaPoint  = 16500L
        }

        composition {
            formula = "Xe"
        }

        meta {
            numericId           = 540
            hashId              = 134
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 3")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.NOBLE_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Neon = material("neon") {
        appearance {
            color       = Rgba(250, 180, 180, 15)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.0008999
            meltingPoint = 24L
            boilingPoint = 27L
            plasmaPoint  = 2700L
        }

        composition {
            formula = "Ne"
        }

        meta {
            numericId           = 100
            hashId              = 79
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aer - 3")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.NOBLE_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }
}
