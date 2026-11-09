package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: CoatedMaterials
@Suppress("unused") object CoatedMaterials {
    fun init() = Unit

    val WoodPolished = material("wood_polished") {
        name = "Polished Wood"

        appearance {
            color       = Rgba(60, 30, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            pulverTarget          = "wood" amount 648648000L
            smashingTarget        = "wood" amount 648648000L
            cuttingTarget         = "wood" amount 648648000L
            workingTarget         = "wood" amount 648648000L
            forgingTarget         = "wood" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "wood" amount 648648000L
            compressingTarget     = "wood" amount 648648000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            formula = "C₆(H₂O)₅"
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8267
            hashId              = 806
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Fabrico - 1")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_treated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.COATED,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WoodTreated = material("wood_treated") {
        name = "Treated Wood"

        appearance {
            color       = Rgba(80, 40, 0, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 24L
            speed      = 3.0f
        }

        processing {
            pulverTarget          = "wood" amount 648648000L
            smashingTarget        = "wood" amount 648648000L
            cuttingTarget         = "wood" amount 648648000L
            workingTarget         = "wood" amount 648648000L
            forgingTarget         = "wood" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "wood" amount 648648000L
            compressingTarget     = "wood" amount 648648000L
            generifyingTarget      = "wood" amount 648648000L
        }

        composition {
            formula = "C₆(H₂O)₅"
            component("carbon", 185328000L)
            component("water", 463320000L)
        }

        meta {
            numericId           = 8222
            hashId              = 804
            originalMod         = "ImmersiveEngineering"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 100L
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Arbor - 1")
            aspect("Fabrico - 1")
            reRegisteredTo("wood_sealed")
            reRegisteredTo("any_wood")
            reRegisteredTo("any_treated_wood")
            reRegisteredTo("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.WOOD,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Compounds.COATED,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }
}
