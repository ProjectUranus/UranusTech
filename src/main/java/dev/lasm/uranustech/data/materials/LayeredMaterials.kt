package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: LayeredMaterials
@Suppress("unused") object LayeredMaterials {
    fun init() = Unit

    val SteelMagnetic = material("steel_magnetic") {
        name = "Magnetic Steel"

        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.MAGNETIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2046L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "steel" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "steel" amount 648648000L
            smashingTarget        = "steel" amount 648648000L
            workingTarget         = "steel" amount 648648000L
            forgingTarget         = "steel" amount 648648000L
            bendingTarget         = "steel" amount 648648000L
            compressingTarget     = "steel" amount 648648000L
            generifyingTarget      = "steel" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("steel", 648648000L)
        }

        meta {
            numericId           = 8646
            hashId              = 1218
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Ordo - 1")
            aspect("Magneto - 1")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.LAYERED,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val NeodymiumMagnetic = material("neodymium_magnetic") {
        name = "Magnetic Neodymium"

        appearance {
            color       = Rgba(100, 100, 100, 255)
            iconSet     = IconSet.MAGNETIC
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

        fluids {
            smeltingTarget    = "neodymium" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "neodymium" amount 648648000L
            smashingTarget        = "neodymium" amount 648648000L
            workingTarget         = "neodymium" amount 648648000L
            forgingTarget         = "neodymium" amount 648648000L
            bendingTarget         = "iron" amount 648648000L
            compressingTarget     = "neodymium" amount 648648000L
            generifyingTarget      = "neodymium" amount 648648000L
        }

        composition {
            formula = "Nd"
            component("neodymium", 648648000L)
        }

        meta {
            numericId           = 8647
            hashId              = 1219
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Magneto - 3")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.LAYERED,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val IronMagnetic = material("iron_magnetic") {
        name = "Magnetic Iron"

        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.MAGNETIC
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

        fluids {
            smeltingTarget    = "iron" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "iron" amount 648648000L
            smashingTarget        = "iron" amount 648648000L
            workingTarget         = "iron" amount 648648000L
            forgingTarget         = "iron" amount 648648000L
            bendingTarget         = "iron" amount 648648000L
            compressingTarget     = "iron" amount 648648000L
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8645
            hashId              = 1217
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.LAYERED,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }
}
