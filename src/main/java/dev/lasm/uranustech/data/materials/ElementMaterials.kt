package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: ElementMaterials
@Suppress("unused") object ElementMaterials {
    fun init() = Unit

    val Gravitonium = material("gravitonium") {
        appearance {
            color       = Rgba(0, 50, 0, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 372
            electrons    = 372
            neutrons     = 1330
            mass         = 1702L
            density      = 1768.866761
            meltingPoint = 112L
            boilingPoint = 1275L
            plasmaPoint  = 127500L
        }

        composition {
            formula = "Gt"
        }

        meta {
            numericId           = 3720
            hashId              = 511
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 10")
            aspect("Potentia - 10")
            reRegisteredTo("triseptbium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Atlarus = material("atlarus") {
        appearance {
            color       = Rgba(204, 179, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 221
            electrons    = 221
            neutrons     = 575
            mass         = 796L
            density      = 21.24625421
            meltingPoint = 3276L
            boilingPoint = 11524L
            plasmaPoint  = 1152400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 4480L
            speed      = 4.0f
        }

        processing {
            byProduct("rutile")
        }

        composition {
            formula = "Atl"
        }

        meta {
            numericId           = 2210
            hashId              = 356
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Cognitio - 1")
            reRegisteredTo("bibiunium")
            alloyRef("tartarite")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Vibranium = material("vibranium") {
        appearance {
            color       = Rgba(200, 128, 255, 100)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 152
            electrons    = 152
            neutrons     = 266
            mass         = 418L
            density      = 3.23978365
            meltingPoint = 4852L
            boilingPoint = 9415L
            plasmaPoint  = 941500L
        }

        tool {
            types      = 3
            quality    = 15
            durability = 512L
            speed      = 1000.0f
        }

        composition {
            formula = "Vb"
        }

        meta {
            numericId           = 1520
            hashId              = 278
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 1
            handleMaterial      = ref("vibranium_steel")
            aspect("Vitreus - 10")
            aspect("Sensus - 10")
            reRegisteredTo("unpentbium")
            alloyRef("vibranium_steel")
            alloyRef("vibranium_silver")
            alloyRef("vibramantium")
        }

        tags(MaterialTag.ItemGenerator.simpleGem())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.TRANSPARENT,
        )

    }

    val Magic = material("magic") {
        appearance {
            color       = Rgba(255, 0, 255, 0)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = -1L
            density      = 0.0
            meltingPoint = 0L
            boilingPoint = 0L
            plasmaPoint  = 0L
        }

        tool {
            types      = 3
            quality    = 5
            durability = 5120L
            speed      = 10.0f
        }

        composition {
            formula = "Ma"
        }

        meta {
            numericId           = 4000
            hashId              = 60
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Adamantium = material("adamantium") {
        appearance {
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 222
            electrons    = 222
            neutrons     = 580
            mass         = 802L
            density      = 13.35624762
            meltingPoint = 5225L
            boilingPoint = 14528L
            plasmaPoint  = 1452800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 5
            durability = 5120L
            speed      = 10.0f
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "adamantine" amount 648648000L
        }

        composition {
            formula = "Ad"
        }

        meta {
            numericId           = 2220
            hashId              = 358
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 10")
            aspect("Praecantio - 10")
            reRegisteredTo("adamant")
            reRegisteredTo("bibibium")
            alloyRef("vibramantium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val MacGuffium = material("mac_guffium") {
        name = "Mac-Guffium"

        appearance {
            color       = Rgba(200, 50, 150, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 239
            electrons    = 239
            neutrons     = 665
            mass         = 904L
            density      = 3.122
            meltingPoint = 200L
            boilingPoint = 1000L
            plasmaPoint  = 100000L
        }

        composition {
            formula = "Mcg"
        }

        meta {
            numericId           = 2390
            hashId              = 377
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Alienis - 8")
            aspect("Permutatio - 8")
            aspect("Spiritus - 8")
            aspect("Auram - 8")
            aspect("Vitium - 8")
            aspect("Radio - 8")
            aspect("Magneto - 8")
            aspect("Electrum - 8")
            aspect("Nebrisum - 8")
            aspect("Strontio - 8")
            reRegisteredTo("bitriennium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.CONTAINERS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
        )

    }
}
