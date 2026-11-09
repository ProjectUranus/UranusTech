package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: HalogenMaterials
@Suppress("unused") object HalogenMaterials {
    fun init() = Unit

    val Iodine = material("iodine") {
        appearance {
            color       = Rgba(255, 240, 240, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 53
            electrons    = 53
            neutrons     = 74
            mass         = 127L
            density      = 4.93
            meltingPoint = 386L
            boilingPoint = 457L
            plasmaPoint  = 45700L
        }

        composition {
            formula = "I₂"
        }

        meta {
            numericId           = 530
            hashId              = 133
            originalMod         = "Forestry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 2")
            aspect("Tempestas - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.Atomic.HALOGEN,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Chlorine = material("chlorine") {
        appearance {
            color       = Rgba(0, 240, 255, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 17
            electrons    = 17
            neutrons     = 18
            mass         = 35L
            density      = 0.003214
            meltingPoint = 171L
            boilingPoint = 239L
            plasmaPoint  = 23900L
        }

        composition {
            formula = "Cl₂"
        }

        meta {
            numericId           = 170
            hashId              = 89
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Aqua - 2")
            aspect("Pannus - 1")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.Atomic.HALOGEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Farnsium = material("farnsium") {
        appearance {
            color       = Rgba(60, 70, 80, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 117
            electrons    = 117
            neutrons     = 177
            mass         = 294L
            density      = 7.2
            meltingPoint = 673L
            boilingPoint = 823L
            plasmaPoint  = 82300L
            hasMetallum  = true
        }

        composition {
            formula = "Fa"
        }

        meta {
            numericId           = 1170
            hashId              = 239
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
            reRegisteredTo("tennessine")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.HALOGEN,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Fluorine = material("fluorine") {
        appearance {
            color       = Rgba(64, 192, 0, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.001696
            meltingPoint = 53L
            boilingPoint = 85L
            plasmaPoint  = 8500L
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "fluorite" amount 648648000L
        }

        composition {
            formula = "F₂"
        }

        meta {
            numericId           = 90
            hashId              = 78
            originalMod         = "RotaryCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perditio - 2")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.Atomic.HALOGEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.GASES,
        )

    }

    val Astatine = material("astatine") {
        appearance {
            color       = Rgba(33, 33, 33, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 85
            electrons    = 85
            neutrons     = 124
            mass         = 209L
            density      = 7.0
            meltingPoint = 575L
            boilingPoint = 610L
            plasmaPoint  = 61000L
        }

        composition {
            formula = "At"
        }

        meta {
            numericId           = 850
            hashId              = 177
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Potentia - 2")
            aspect("Radio - 1")
            reRegisteredTo("astatine209")
            reRegisteredTo("at209")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.ItemGenerator.CONTAINERS_GAS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Atomic.HALOGEN,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.GASES,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Bromine = material("bromine") {
        appearance {
            color       = Rgba(80, 10, 10, 255)
            iconSet     = IconSet.FLUID
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 45
            mass         = 80L
            density      = 3.122
            meltingPoint = 265L
            boilingPoint = 332L
            plasmaPoint  = 33200L
            hasMetallum  = true
        }

        composition {
            formula = "Br₂"
        }

        meta {
            numericId           = 350
            hashId              = 113
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Aqua - 1")
            aspect("Tempestas - 1")
        }

        tags(
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.NONMETAL,
            MaterialTag.ItemGenerator.CONTAINERS_FLUID,
            MaterialTag.Atomic.DIATOMIC_NONMETAL,
            MaterialTag.ItemGenerator.LIQUID,
            MaterialTag.Atomic.HALOGEN,
            MaterialTag.Processing.MELTING,
            MaterialTag.Atomic.ELEMENT,
        )

    }
}
