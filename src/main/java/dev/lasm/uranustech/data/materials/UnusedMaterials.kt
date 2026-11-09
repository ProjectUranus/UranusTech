package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: UnusedMaterials
@Suppress("unused") object UnusedMaterials {
    fun init() = Unit

    val Vis = material("vis") {
        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = -1L
            density      = 0.0
            meltingPoint = 1L
            boilingPoint = 2L
            plasmaPoint  = 3L
        }

        composition {
            formula = "Ma"
            component("magic", 648648000L)
        }

        meta {
            numericId           = -1
            hashId              = 2087
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Auram - 2")
            aspect("Praecantio - 1")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Infinite = material("infinite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 551
            originalMod         = "gregapi"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Starconium = material("starconium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2093
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Unquadunium = material("unquadunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 141
            electrons    = 141
            neutrons     = 233
            mass         = 374L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqu"
        }

        meta {
            numericId           = 1410
            hashId              = 266
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val TerrasteelAlloyRaw = material("terrasteel_alloy_raw") {
        name = "Raw Terrasteel Alloy"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2083
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("raw_terrasteel_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tribiseptium = material("tribiseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 327
            electrons    = 327
            neutrons     = 1105
            mass         = 1432L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbs"
        }

        meta {
            numericId           = 3270
            hashId              = 466
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Hassium = material("hassium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 108
            electrons    = 108
            neutrons     = 169
            mass         = 277L
            density      = 40.7
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Hs"
        }

        meta {
            numericId           = 1080
            hashId              = 229
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.IRON_GROUP,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Triennennium = material("triennennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 399
            electrons    = 399
            neutrons     = 1465
            mass         = 1864L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tee"
        }

        meta {
            numericId           = 3990
            hashId              = 539
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tribiunium = material("tribiunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 321
            electrons    = 321
            neutrons     = 1075
            mass         = 1396L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbu"
        }

        meta {
            numericId           = 3210
            hashId              = 460
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexhexium = material("trihexhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 366
            electrons    = 366
            neutrons     = 1300
            mass         = 1666L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Thh"
        }

        meta {
            numericId           = 3660
            hashId              = 505
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triquadpentium = material("triquadpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 345
            electrons    = 345
            neutrons     = 1195
            mass         = 1540L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqp"
        }

        meta {
            numericId           = 3450
            hashId              = 484
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Cavenium = material("cavenium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2119
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val AdvancedAlloy = material("advanced_alloy") {
        name = "Advanced Alloy"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2150
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Biunennium = material("biunennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 219
            electrons    = 219
            neutrons     = 565
            mass         = 784L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bue"
        }

        meta {
            numericId           = 2190
            hashId              = 354
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val IrridantUranium = material("irridant_uranium") {
        name = "Irridant Uranium"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2098
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MagnetizedTungsten = material("magnetized_tungsten") {
        name = "Magnetized Tungsten"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2153
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Biennquadium = material("biennquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 294
            electrons    = 294
            neutrons     = 940
            mass         = 1234L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Beq"
        }

        meta {
            numericId           = 2940
            hashId              = 433
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triennquadium = material("triennquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 394
            electrons    = 394
            neutrons     = 1440
            mass         = 1834L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Teq"
        }

        meta {
            numericId           = 3940
            hashId              = 534
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Polonium = material("polonium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 84
            electrons    = 84
            neutrons     = 124
            mass         = 208L
            density      = 9.32
            meltingPoint = 527L
            boilingPoint = 1235L
            plasmaPoint  = 123500L
            hasMetallum  = true
        }

        composition {
            formula = "Po"
        }

        meta {
            numericId           = 840
            hashId              = 176
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Atomic.CHALCOGEN,
        )

    }

    val Bibioctium = material("bibioctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 228
            electrons    = 228
            neutrons     = 610
            mass         = 838L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbo"
        }

        meta {
            numericId           = 2280
            hashId              = 366
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bibihexium = material("bibihexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 226
            electrons    = 226
            neutrons     = 600
            mass         = 826L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbh"
        }

        meta {
            numericId           = 2260
            hashId              = 364
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Dysprosium = material("dysprosium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 66
            electrons    = 66
            neutrons     = 96
            mass         = 162L
            density      = 8.55
            meltingPoint = 1680L
            boilingPoint = 2840L
            plasmaPoint  = 284000L
            hasMetallum  = true
        }

        composition {
            formula = "Dy"
        }

        meta {
            numericId           = 660
            hashId              = 149
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Quantum = material("quantum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 549
            originalMod         = "gregapi"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Ordo - 8")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val DiamondCopper = material("diamond_copper") {
        name = "Diamond Copper"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2197
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Australium = material("australium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2144
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Unennoctium = material("unennoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 198
            electrons    = 198
            neutrons     = 460
            mass         = 658L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ueo"
        }

        meta {
            numericId           = 1980
            hashId              = 333
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Untriseptium = material("untriseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 137
            electrons    = 137
            neutrons     = 221
            mass         = 358L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uts"
        }

        meta {
            numericId           = 1370
            hashId              = 262
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennhexium = material("unennhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 196
            electrons    = 196
            neutrons     = 450
            mass         = 646L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ueh"
        }

        meta {
            numericId           = 1960
            hashId              = 331
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tripenttrium = material("tripenttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 353
            electrons    = 353
            neutrons     = 1235
            mass         = 1588L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpt"
        }

        meta {
            numericId           = 3530
            hashId              = 492
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bitritrium = material("bitritrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 233
            electrons    = 233
            neutrons     = 635
            mass         = 868L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Btt"
        }

        meta {
            numericId           = 2330
            hashId              = 371
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triquadnilium = material("triquadnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 340
            electrons    = 340
            neutrons     = 1170
            mass         = 1510L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqn"
        }

        meta {
            numericId           = 3400
            hashId              = 479
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Energized = material("energized") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2166
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Satinspar = material("satinspar") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2173
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biquadnilium = material("biquadnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 240
            electrons    = 240
            neutrons     = 670
            mass         = 910L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqn"
        }

        meta {
            numericId           = 2400
            hashId              = 379
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Eden = material("eden") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2160
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unquadquadium = material("unquadquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 144
            electrons    = 144
            neutrons     = 242
            mass         = 386L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqq"
        }

        meta {
            numericId           = 1440
            hashId              = 269
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triennnilium = material("triennnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 390
            electrons    = 390
            neutrons     = 1420
            mass         = 1810L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ten"
        }

        meta {
            numericId           = 3900
            hashId              = 530
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Pewter = material("pewter") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2113
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biennpentium = material("biennpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 295
            electrons    = 295
            neutrons     = 945
            mass         = 1240L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bep"
        }

        meta {
            numericId           = 2950
            hashId              = 434
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadbium = material("biquadbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 242
            electrons    = 242
            neutrons     = 680
            mass         = 922L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqb"
        }

        meta {
            numericId           = 2420
            hashId              = 381
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unseptpentium = material("unseptpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 175
            electrons    = 175
            neutrons     = 356
            mass         = 531L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Usp"
        }

        meta {
            numericId           = 1750
            hashId              = 305
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Itarius = material("itarius") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2180
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bibitrium = material("bibitrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 223
            electrons    = 223
            neutrons     = 585
            mass         = 808L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbt"
        }

        meta {
            numericId           = 2230
            hashId              = 361
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexoctium = material("trihexoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 368
            electrons    = 368
            neutrons     = 1310
            mass         = 1678L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tho"
        }

        meta {
            numericId           = 3680
            hashId              = 507
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Magnite = material("magnite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2123
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Mutation = material("mutation") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2194
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Goshen = material("goshen") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2178
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tourmaline = material("tourmaline") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2126
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unhexoctium = material("unhexoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 168
            electrons    = 168
            neutrons     = 328
            mass         = 496L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uho"
        }

        meta {
            numericId           = 1680
            hashId              = 295
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triennpentium = material("triennpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 395
            electrons    = 395
            neutrons     = 1445
            mass         = 1840L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tep"
        }

        meta {
            numericId           = 3950
            hashId              = 535
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val CaveniumRefined = material("cavenium_refined") {
        name = "Refined Cavenium"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2120
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("refined_cavenium")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tripentpentium = material("tripentpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 355
            electrons    = 355
            neutrons     = 1245
            mass         = 1600L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpp"
        }

        meta {
            numericId           = 3550
            hashId              = 494
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unpenttrium = material("unpenttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 153
            electrons    = 153
            neutrons     = 269
            mass         = 422L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Upt"
        }

        meta {
            numericId           = 1530
            hashId              = 280
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Einsteinium = material("einsteinium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 99
            electrons    = 99
            neutrons     = 153
            mass         = 252L
            density      = 8.84
            meltingPoint = 1133L
            boilingPoint = 1269L
            plasmaPoint  = 126900L
            hasMetallum  = true
        }

        composition {
            formula = "Es"
        }

        meta {
            numericId           = 990
            hashId              = 220
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Unpentquadium = material("unpentquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 154
            electrons    = 154
            neutrons     = 272
            mass         = 426L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Upq"
        }

        meta {
            numericId           = 1540
            hashId              = 281
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biunoctium = material("biunoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 218
            electrons    = 218
            neutrons     = 560
            mass         = 778L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Buo"
        }

        meta {
            numericId           = 2180
            hashId              = 353
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biseptnilium = material("biseptnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 270
            electrons    = 270
            neutrons     = 820
            mass         = 1090L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bsn"
        }

        meta {
            numericId           = 2700
            hashId              = 409
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triquadseptium = material("triquadseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 347
            electrons    = 347
            neutrons     = 1205
            mass         = 1552L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqs"
        }

        meta {
            numericId           = 3470
            hashId              = 486
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biunhexium = material("biunhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 216
            electrons    = 216
            neutrons     = 550
            mass         = 766L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Buh"
        }

        meta {
            numericId           = 2160
            hashId              = 351
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bibiennium = material("bibiennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 229
            electrons    = 229
            neutrons     = 615
            mass         = 844L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbe"
        }

        meta {
            numericId           = 2290
            hashId              = 367
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tribipentium = material("tribipentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 325
            electrons    = 325
            neutrons     = 1095
            mass         = 1420L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbp"
        }

        meta {
            numericId           = 3250
            hashId              = 464
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Untribium = material("untribium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 132
            electrons    = 132
            neutrons     = 206
            mass         = 338L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Utb"
        }

        meta {
            numericId           = 1320
            hashId              = 257
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennnilium = material("unennnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 190
            electrons    = 190
            neutrons     = 420
            mass         = 610L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uen"
        }

        meta {
            numericId           = 1900
            hashId              = 325
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexunium = material("trihexunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 361
            electrons    = 361
            neutrons     = 1275
            mass         = 1636L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Thu"
        }

        meta {
            numericId           = 3610
            hashId              = 500
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Lawrencium = material("lawrencium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 103
            electrons    = 103
            neutrons     = 159
            mass         = 262L
            density      = 0.0
            meltingPoint = 1900L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Lr"
        }

        meta {
            numericId           = 1030
            hashId              = 224
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.SCANDIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Curium = material("curium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 96
            electrons    = 96
            neutrons     = 153
            mass         = 249L
            density      = 13.51
            meltingPoint = 1613L
            boilingPoint = 3383L
            plasmaPoint  = 338300L
            hasMetallum  = true
        }

        composition {
            formula = "Cm"
        }

        meta {
            numericId           = 960
            hashId              = 217
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Triseptnilium = material("triseptnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 370
            electrons    = 370
            neutrons     = 1320
            mass         = 1690L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tsn"
        }

        meta {
            numericId           = 3700
            hashId              = 509
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Jet = material("jet") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2175
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tripentseptium = material("tripentseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 357
            electrons    = 357
            neutrons     = 1255
            mass         = 1612L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tps"
        }

        meta {
            numericId           = 3570
            hashId              = 496
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unbiquadium = material("unbiquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 124
            electrons    = 124
            neutrons     = 188
            mass         = 312L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ubq"
        }

        meta {
            numericId           = 1240
            hashId              = 247
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tripentquadium = material("tripentquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 354
            electrons    = 354
            neutrons     = 1240
            mass         = 1594L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpq"
        }

        meta {
            numericId           = 3540
            hashId              = 493
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biseptquadium = material("biseptquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 274
            electrons    = 274
            neutrons     = 840
            mass         = 1114L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bsq"
        }

        meta {
            numericId           = 2740
            hashId              = 413
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Ultimate = material("ultimate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 548
            originalMod         = "GalacticraftCore"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Trienntrium = material("trienntrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 393
            electrons    = 393
            neutrons     = 1435
            mass         = 1828L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tet"
        }

        meta {
            numericId           = 3930
            hashId              = 533
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val IridiumIron = material("iridium_iron") {
        name = "Iridiron"

        physics {
            protons      = 51
            electrons    = 51
            neutrons     = 72
            mass         = 124L
            density      = 15.217
            meltingPoint = 2265L
            boilingPoint = 3917L
            plasmaPoint  = 391750L
        }

        composition {
            component("iridium", 324324000L)
            component("iron", 324324000L)
        }

        meta {
            numericId           = -1
            hashId              = 2079
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Triquadquadium = material("triquadquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 344
            electrons    = 344
            neutrons     = 1190
            mass         = 1534L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqq"
        }

        meta {
            numericId           = 3440
            hashId              = 483
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biununium = material("biununium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 211
            electrons    = 211
            neutrons     = 525
            mass         = 736L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Buu"
        }

        meta {
            numericId           = 2110
            hashId              = 346
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tritrioctium = material("tritrioctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 338
            electrons    = 338
            neutrons     = 1160
            mass         = 1498L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tto"
        }

        meta {
            numericId           = 3380
            hashId              = 477
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Ryu = material("ryu") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2193
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biseptbium = material("biseptbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 272
            electrons    = 272
            neutrons     = 830
            mass         = 1102L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bsb"
        }

        meta {
            numericId           = 2720
            hashId              = 411
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triseptseptium = material("triseptseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 377
            electrons    = 377
            neutrons     = 1355
            mass         = 1732L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tss"
        }

        meta {
            numericId           = 3770
            hashId              = 517
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Ammonium = material("ammonium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2131
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bipentunium = material("bipentunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 251
            electrons    = 251
            neutrons     = 725
            mass         = 976L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpu"
        }

        meta {
            numericId           = 2510
            hashId              = 390
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexennium = material("trihexennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 369
            electrons    = 369
            neutrons     = 1315
            mass         = 1684L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "The"
        }

        meta {
            numericId           = 3690
            hashId              = 508
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Thulium = material("thulium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 69
            electrons    = 69
            neutrons     = 99
            mass         = 168L
            density      = 9.321
            meltingPoint = 1818L
            boilingPoint = 2223L
            plasmaPoint  = 222300L
            hasMetallum  = true
        }

        composition {
            formula = "Tm"
        }

        meta {
            numericId           = 690
            hashId              = 152
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Europium = material("europium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 63
            electrons    = 63
            neutrons     = 88
            mass         = 151L
            density      = 5.243
            meltingPoint = 1099L
            boilingPoint = 1802L
            plasmaPoint  = 180200L
            hasMetallum  = true
        }

        composition {
            formula = "Eu"
        }

        meta {
            numericId           = 630
            hashId              = 146
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
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

    val Biennunium = material("biennunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 291
            electrons    = 291
            neutrons     = 925
            mass         = 1216L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Beu"
        }

        meta {
            numericId           = 2910
            hashId              = 430
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadennium = material("biquadennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 249
            electrons    = 249
            neutrons     = 715
            mass         = 964L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqe"
        }

        meta {
            numericId           = 2490
            hashId              = 388
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bihexennium = material("bihexennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 269
            electrons    = 269
            neutrons     = 815
            mass         = 1084L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhe"
        }

        meta {
            numericId           = 2690
            hashId              = 408
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Apalachia = material("apalachia") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2162
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bitrioctium = material("bitrioctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 238
            electrons    = 238
            neutrons     = 660
            mass         = 898L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bto"
        }

        meta {
            numericId           = 2380
            hashId              = 376
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Erbium = material("erbium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 68
            electrons    = 68
            neutrons     = 99
            mass         = 167L
            density      = 9.066
            meltingPoint = 1802L
            boilingPoint = 3141L
            plasmaPoint  = 314100L
            hasMetallum  = true
        }

        composition {
            formula = "Er"
        }

        meta {
            numericId           = 680
            hashId              = 151
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Triseptpentium = material("triseptpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 375
            electrons    = 375
            neutrons     = 1345
            mass         = 1720L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tsp"
        }

        meta {
            numericId           = 3750
            hashId              = 515
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unhexquadium = material("unhexquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 164
            electrons    = 164
            neutrons     = 312
            mass         = 476L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhq"
        }

        meta {
            numericId           = 1640
            hashId              = 291
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tribibium = material("tribibium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 322
            electrons    = 322
            neutrons     = 1080
            mass         = 1402L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbb"
        }

        meta {
            numericId           = 3220
            hashId              = 461
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Realmite = material("realmite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2157
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Rupee = material("rupee") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2155
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unsepttrium = material("unsepttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 173
            electrons    = 173
            neutrons     = 348
            mass         = 521L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ust"
        }

        meta {
            numericId           = 1730
            hashId              = 300
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Cream = material("cream") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2169
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Triseptennium = material("triseptennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 379
            electrons    = 379
            neutrons     = 1365
            mass         = 1744L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tse"
        }

        meta {
            numericId           = 3790
            hashId              = 519
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bitrinilium = material("bitrinilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 230
            electrons    = 230
            neutrons     = 620
            mass         = 850L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Btn"
        }

        meta {
            numericId           = 2300
            hashId              = 368
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Superconductor = material("superconductor") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 550
            originalMod         = "rocketscience"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Electrum - 8")
        }

        tags(
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Triquadunium = material("triquadunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 341
            electrons    = 341
            neutrons     = 1175
            mass         = 1516L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqu"
        }

        meta {
            numericId           = 3410
            hashId              = 480
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennseptium = material("unennseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 197
            electrons    = 197
            neutrons     = 455
            mass         = 652L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ues"
        }

        meta {
            numericId           = 1970
            hashId              = 332
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Copernicium = material("copernicium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 112
            electrons    = 112
            neutrons     = 173
            mass         = 285L
            density      = 23.7
            meltingPoint = 150L
            boilingPoint = 357L
            plasmaPoint  = 35700L
            hasMetallum  = true
        }

        composition {
            formula = "Cn"
        }

        meta {
            numericId           = 1120
            hashId              = 233
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ZINC_GROUP,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Bioctbium = material("bioctbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 282
            electrons    = 282
            neutrons     = 880
            mass         = 1162L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bob"
        }

        meta {
            numericId           = 2820
            hashId              = 421
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Arcanium = material("arcanium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2165
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biseptennium = material("biseptennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 279
            electrons    = 279
            neutrons     = 865
            mass         = 1144L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bse"
        }

        meta {
            numericId           = 2790
            hashId              = 418
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Dark = material("dark") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2189
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Nobelium = material("nobelium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 102
            electrons    = 102
            neutrons     = 157
            mass         = 259L
            density      = 0.0
            meltingPoint = 1100L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "No"
        }

        meta {
            numericId           = 1020
            hashId              = 223
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Biunnilium = material("biunnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 210
            electrons    = 210
            neutrons     = 520
            mass         = 730L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bun"
        }

        meta {
            numericId           = 2100
            hashId              = 345
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val DuraSteel = material("dura_steel") {
        name = "High-Speed Steel"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2149
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Data = material("data") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 545
            originalMod         = "gregtech"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Verticium = material("verticium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2143
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Triquadennium = material("triquadennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 349
            electrons    = 349
            neutrons     = 1215
            mass         = 1564L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqe"
        }

        meta {
            numericId           = 3490
            hashId              = 488
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Thallium = material("thallium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 81
            electrons    = 81
            neutrons     = 123
            mass         = 204L
            density      = 11.85
            meltingPoint = 577L
            boilingPoint = 1746L
            plasmaPoint  = 174600L
            hasMetallum  = true
        }

        composition {
            formula = "Tl"
        }

        meta {
            numericId           = 810
            hashId              = 173
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Atomic.ICOSAGEN,
            MaterialTag.Properties.UNUSED_MATERIAL,
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

    val Bitripentium = material("bitripentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 235
            electrons    = 235
            neutrons     = 645
            mass         = 880L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Btp"
        }

        meta {
            numericId           = 2350
            hashId              = 373
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biseptunium = material("biseptunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 271
            electrons    = 271
            neutrons     = 825
            mass         = 1096L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bsu"
        }

        meta {
            numericId           = 2710
            hashId              = 410
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Seaborgium = material("seaborgium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 106
            electrons    = 106
            neutrons     = 165
            mass         = 271L
            density      = 35.0
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Sg"
        }

        meta {
            numericId           = 1060
            hashId              = 227
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.CHROMIUM_GROUP,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Unbibium = material("unbibium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 122
            electrons    = 122
            neutrons     = 184
            mass         = 306L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ubb"
        }

        meta {
            numericId           = 1220
            hashId              = 245
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Legendary = material("legendary") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2181
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unseptoctium = material("unseptoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 178
            electrons    = 178
            neutrons     = 368
            mass         = 546L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uso"
        }

        meta {
            numericId           = 1780
            hashId              = 308
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trisepttrium = material("trisepttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 373
            electrons    = 373
            neutrons     = 1335
            mass         = 1708L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tst"
        }

        meta {
            numericId           = 3730
            hashId              = 513
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Nihonium = material("nihonium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 113
            electrons    = 113
            neutrons     = 171
            mass         = 284L
            density      = 16.0
            meltingPoint = 700L
            boilingPoint = 1400L
            plasmaPoint  = 140000L
            hasMetallum  = true
        }

        composition {
            formula = "Nh"
        }

        meta {
            numericId           = 1130
            hashId              = 234
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ICOSAGEN,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Biniltrium = material("biniltrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 203
            electrons    = 203
            neutrons     = 485
            mass         = 688L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bnt"
        }

        meta {
            numericId           = 2030
            hashId              = 338
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Alfium = material("alfium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2192
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Triquadhexium = material("triquadhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 346
            electrons    = 346
            neutrons     = 1200
            mass         = 1546L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqh"
        }

        meta {
            numericId           = 3460
            hashId              = 485
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bipentquadium = material("bipentquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 254
            electrons    = 254
            neutrons     = 740
            mass         = 994L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpq"
        }

        meta {
            numericId           = 2540
            hashId              = 393
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Mortum = material("mortum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2164
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biuntrium = material("biuntrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 213
            electrons    = 213
            neutrons     = 535
            mass         = 748L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "But"
        }

        meta {
            numericId           = 2130
            hashId              = 348
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unpenthexium = material("unpenthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 156
            electrons    = 156
            neutrons     = 280
            mass         = 436L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uph"
        }

        meta {
            numericId           = 1560
            hashId              = 283
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unoctnilium = material("unoctnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 180
            electrons    = 180
            neutrons     = 376
            mass         = 556L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uon"
        }

        meta {
            numericId           = 1800
            hashId              = 310
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val CrystalFlux = material("crystal_flux") {
        name = "Crystal Flux"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2102
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tribihexium = material("tribihexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 326
            electrons    = 326
            neutrons     = 1100
            mass         = 1426L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbh"
        }

        meta {
            numericId           = 3260
            hashId              = 465
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Untrihexium = material("untrihexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 136
            electrons    = 136
            neutrons     = 218
            mass         = 354L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uth"
        }

        meta {
            numericId           = 1360
            hashId              = 261
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Mendelevium = material("mendelevium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 101
            electrons    = 101
            neutrons     = 157
            mass         = 258L
            density      = 0.0
            meltingPoint = 1100L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Md"
        }

        meta {
            numericId           = 1010
            hashId              = 222
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Good = material("good") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 543
            originalMod         = "gregtech"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val CMBSteel = material("cmb_steel") {
        name = "CMB Steel"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2148
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Promethium = material("promethium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 61
            electrons    = 61
            neutrons     = 83
            mass         = 144L
            density      = 7.26
            meltingPoint = 1315L
            boilingPoint = 3273L
            plasmaPoint  = 327300L
            hasMetallum  = true
        }

        composition {
            formula = "Pm"
        }

        meta {
            numericId           = 610
            hashId              = 144
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val TNT = material("tnt") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2082
            originalMod         = "minecraft"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Perditio - 3")
            aspect("Ignis - 1")
        }

        tags(
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Trisepthexium = material("trisepthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 376
            electrons    = 376
            neutrons     = 1350
            mass         = 1726L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tsh"
        }

        meta {
            numericId           = 3760
            hashId              = 516
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biseptoctium = material("biseptoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 278
            electrons    = 278
            neutrons     = 860
            mass         = 1138L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bso"
        }

        meta {
            numericId           = 2780
            hashId              = 417
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triunnilium = material("triunnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 310
            electrons    = 310
            neutrons     = 1020
            mass         = 1330L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tun"
        }

        meta {
            numericId           = 3100
            hashId              = 449
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triunpentium = material("triunpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 315
            electrons    = 315
            neutrons     = 1045
            mass         = 1360L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tup"
        }

        meta {
            numericId           = 3150
            hashId              = 454
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triunseptium = material("triunseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 317
            electrons    = 317
            neutrons     = 1055
            mass         = 1372L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tus"
        }

        meta {
            numericId           = 3170
            hashId              = 456
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Petroleum = material("petroleum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2112
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tritrihexium = material("tritrihexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 336
            electrons    = 336
            neutrons     = 1150
            mass         = 1486L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tth"
        }

        meta {
            numericId           = 3360
            hashId              = 475
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bienntrium = material("bienntrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 293
            electrons    = 293
            neutrons     = 935
            mass         = 1228L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bet"
        }

        meta {
            numericId           = 2930
            hashId              = 432
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Flerovium298 = material("flerovium298") {
        name = "Flerovium-298"

        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 114
            electrons    = 114
            neutrons     = 184
            mass         = 298L
            density      = 14.0
            meltingPoint = 340L
            boilingPoint = 420L
            plasmaPoint  = 42000L
            hasMetallum  = true
        }

        composition {
            formula = "Fl-298"
        }

        meta {
            numericId           = 1148
            hashId              = 236
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Trihexnilium = material("trihexnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 360
            electrons    = 360
            neutrons     = 1270
            mass         = 1630L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Thn"
        }

        meta {
            numericId           = 3600
            hashId              = 499
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triennseptium = material("triennseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 397
            electrons    = 397
            neutrons     = 1455
            mass         = 1852L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tes"
        }

        meta {
            numericId           = 3970
            hashId              = 537
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Advanced = material("advanced") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 544
            originalMod         = "IC2"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Skythern = material("skythern") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2163
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Binilnilium = material("binilnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 200
            electrons    = 200
            neutrons     = 470
            mass         = 670L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bnn"
        }

        meta {
            numericId           = 2000
            hashId              = 335
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Netheryte = material("netheryte") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2159
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tripentennium = material("tripentennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 359
            electrons    = 359
            neutrons     = 1265
            mass         = 1624L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpe"
        }

        meta {
            numericId           = 3590
            hashId              = 498
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Elite = material("elite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 546
            originalMod         = "Mekanism"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unseptseptium = material("unseptseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 177
            electrons    = 177
            neutrons     = 364
            mass         = 541L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uss"
        }

        meta {
            numericId           = 1770
            hashId              = 307
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triennoctium = material("triennoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 398
            electrons    = 398
            neutrons     = 1460
            mass         = 1858L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Teo"
        }

        meta {
            numericId           = 3980
            hashId              = 538
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val RubberTreeSap = material("rubber_tree_sap") {
        name = "Rubber Tree Sap"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2184
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biseptpentium = material("biseptpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 275
            electrons    = 275
            neutrons     = 845
            mass         = 1120L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bsp"
        }

        meta {
            numericId           = 2750
            hashId              = 414
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unbiunium = material("unbiunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 121
            electrons    = 121
            neutrons     = 182
            mass         = 303L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ubu"
        }

        meta {
            numericId           = 1210
            hashId              = 244
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Selenite = material("selenite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2174
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val InfusedTeslatite = material("infused_teslatite") {
        name = "Teslatite"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2097
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Triunoctium = material("triunoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 318
            electrons    = 318
            neutrons     = 1060
            mass         = 1378L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tuo"
        }

        meta {
            numericId           = 3180
            hashId              = 457
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Mercassium = material("mercassium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 1
            durability = 64L
            speed      = 6.0f
        }

        meta {
            numericId           = -1
            hashId              = 2089
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Trinilquadium = material("trinilquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 304
            electrons    = 304
            neutrons     = 990
            mass         = 1294L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tnq"
        }

        meta {
            numericId           = 3040
            hashId              = 443
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadoctium = material("biquadoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 248
            electrons    = 248
            neutrons     = 710
            mass         = 958L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqo"
        }

        meta {
            numericId           = 2480
            hashId              = 387
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bihexhexium = material("bihexhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 266
            electrons    = 266
            neutrons     = 800
            mass         = 1066L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhh"
        }

        meta {
            numericId           = 2660
            hashId              = 405
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biunbium = material("biunbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 212
            electrons    = 212
            neutrons     = 530
            mass         = 742L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bub"
        }

        meta {
            numericId           = 2120
            hashId              = 347
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Berkelium = material("berkelium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 97
            electrons    = 97
            neutrons     = 152
            mass         = 249L
            density      = 14.79
            meltingPoint = 1259L
            boilingPoint = 2900L
            plasmaPoint  = 290000L
            hasMetallum  = true
        }

        composition {
            formula = "Bk"
        }

        meta {
            numericId           = 970
            hashId              = 218
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Tritriquadium = material("tritriquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 334
            electrons    = 334
            neutrons     = 1140
            mass         = 1474L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ttq"
        }

        meta {
            numericId           = 3340
            hashId              = 473
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bibiquadium = material("bibiquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 224
            electrons    = 224
            neutrons     = 590
            mass         = 814L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbq"
        }

        meta {
            numericId           = 2240
            hashId              = 362
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bibinilium = material("bibinilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 220
            electrons    = 220
            neutrons     = 570
            mass         = 790L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbn"
        }

        meta {
            numericId           = 2200
            hashId              = 355
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biocthexium = material("biocthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 286
            electrons    = 286
            neutrons     = 900
            mass         = 1186L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Boh"
        }

        meta {
            numericId           = 2860
            hashId              = 425
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Infitite = material("infitite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2122
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unhexhexium = material("unhexhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 166
            electrons    = 166
            neutrons     = 320
            mass         = 486L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhh"
        }

        meta {
            numericId           = 1660
            hashId              = 293
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Lodestone = material("lodestone") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2106
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unobtainium = material("unobtainium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2147
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Samarium = material("samarium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 62
            electrons    = 62
            neutrons     = 88
            mass         = 150L
            density      = 7.52
            meltingPoint = 1345L
            boilingPoint = 2067L
            plasmaPoint  = 206700L
            hasMetallum  = true
        }

        composition {
            formula = "Sm"
        }

        meta {
            numericId           = 620
            hashId              = 145
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Untriunium = material("untriunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 131
            electrons    = 131
            neutrons     = 203
            mass         = 334L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Utu"
        }

        meta {
            numericId           = 1310
            hashId              = 256
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unquadoctium = material("unquadoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 148
            electrons    = 148
            neutrons     = 254
            mass         = 402L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqo"
        }

        meta {
            numericId           = 1480
            hashId              = 274
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biniloctium = material("biniloctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 208
            electrons    = 208
            neutrons     = 510
            mass         = 718L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bno"
        }

        meta {
            numericId           = 2080
            hashId              = 343
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triseptquadium = material("triseptquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 374
            electrons    = 374
            neutrons     = 1340
            mass         = 1714L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tsq"
        }

        meta {
            numericId           = 3740
            hashId              = 514
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Mimichite = material("mimichite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2103
            priorityPrefixIndex = 1
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tripentoctium = material("tripentoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 358
            electrons    = 358
            neutrons     = 1260
            mass         = 1618L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpo"
        }

        meta {
            numericId           = 3580
            hashId              = 497
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bitumen = material("bitumen") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2132
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unpentpentium = material("unpentpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 155
            electrons    = 155
            neutrons     = 276
            mass         = 431L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Upp"
        }

        meta {
            numericId           = 1550
            hashId              = 282
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Painite = material("painite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2111
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bipenthexium = material("bipenthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 256
            electrons    = 256
            neutrons     = 750
            mass         = 1006L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bph"
        }

        meta {
            numericId           = 2560
            hashId              = 395
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Daffergon = material("daffergon") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2140
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Primitive = material("primitive") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 541
            originalMod         = "gregtech"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 1")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tripentnilium = material("tripentnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 350
            electrons    = 350
            neutrons     = 1220
            mass         = 1570L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpn"
        }

        meta {
            numericId           = 3500
            hashId              = 489
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triocttrium = material("triocttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 383
            electrons    = 383
            neutrons     = 1385
            mass         = 1768L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tot"
        }

        meta {
            numericId           = 3830
            hashId              = 523
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Potash = material("potash") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2114
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Trioctnilium = material("trioctnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 380
            electrons    = 380
            neutrons     = 1370
            mass         = 1750L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ton"
        }

        meta {
            numericId           = 3800
            hashId              = 520
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexseptium = material("trihexseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 367
            electrons    = 367
            neutrons     = 1305
            mass         = 1672L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ths"
        }

        meta {
            numericId           = 3670
            hashId              = 506
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Binilennium = material("binilennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 209
            electrons    = 209
            neutrons     = 515
            mass         = 724L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bne"
        }

        meta {
            numericId           = 2090
            hashId              = 344
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unoctquadium = material("unoctquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 184
            electrons    = 184
            neutrons     = 392
            mass         = 576L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uoq"
        }

        meta {
            numericId           = 1840
            hashId              = 314
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexpentium = material("trihexpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 365
            electrons    = 365
            neutrons     = 1295
            mass         = 1660L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Thp"
        }

        meta {
            numericId           = 3650
            hashId              = 504
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Demonite = material("demonite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2138
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unseptnilium = material("unseptnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 170
            electrons    = 170
            neutrons     = 336
            mass         = 506L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Usn"
        }

        meta {
            numericId           = 1700
            hashId              = 297
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Chrysocolla = material("chrysocolla") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2136
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Triunquadium = material("triunquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 314
            electrons    = 314
            neutrons     = 1040
            mass         = 1354L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tuq"
        }

        meta {
            numericId           = 3140
            hashId              = 453
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val InfusedGold = material("infused_gold") {
        name = "Infused Gold"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2139
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Agate = material("agate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2130
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unbiseptium = material("unbiseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 127
            electrons    = 127
            neutrons     = 194
            mass         = 321L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ubs"
        }

        meta {
            numericId           = 1270
            hashId              = 252
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Invisium = material("invisium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2105
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Trioctennium = material("trioctennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 389
            electrons    = 389
            neutrons     = 1415
            mass         = 1804L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Toe"
        }

        meta {
            numericId           = 3890
            hashId              = 529
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Lutetium = material("lutetium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 71
            electrons    = 71
            neutrons     = 103
            mass         = 174L
            density      = 9.84
            meltingPoint = 1925L
            boilingPoint = 3675L
            plasmaPoint  = 367500L
            hasMetallum  = true
        }

        composition {
            formula = "Lu"
        }

        meta {
            numericId           = 710
            hashId              = 154
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.SCANDIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Unquadnilium = material("unquadnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 140
            electrons    = 140
            neutrons     = 230
            mass         = 370L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqn"
        }

        meta {
            numericId           = 1400
            hashId              = 265
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unpentseptium = material("unpentseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 157
            electrons    = 157
            neutrons     = 284
            mass         = 441L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ups"
        }

        meta {
            numericId           = 1570
            hashId              = 284
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tar = material("tar") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2117
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Gadolinium = material("gadolinium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 64
            electrons    = 64
            neutrons     = 93
            mass         = 157L
            density      = 7.895
            meltingPoint = 1585L
            boilingPoint = 3546L
            plasmaPoint  = 354600L
            hasMetallum  = true
        }

        composition {
            formula = "Gd"
        }

        meta {
            numericId           = 640
            hashId              = 147
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Unpentunium = material("unpentunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 151
            electrons    = 151
            neutrons     = 263
            mass         = 414L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Upu"
        }

        meta {
            numericId           = 1510
            hashId              = 277
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bipentpentium = material("bipentpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 255
            electrons    = 255
            neutrons     = 745
            mass         = 1000L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpp"
        }

        meta {
            numericId           = 2550
            hashId              = 394
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Basic = material("basic") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 542
            originalMod         = "Mekanism"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bipentseptium = material("bipentseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 257
            electrons    = 257
            neutrons     = 755
            mass         = 1012L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bps"
        }

        meta {
            numericId           = 2570
            hashId              = 396
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tripentbium = material("tripentbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 352
            electrons    = 352
            neutrons     = 1230
            mass         = 1582L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpb"
        }

        meta {
            numericId           = 3520
            hashId              = 491
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tritribium = material("tritribium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 332
            electrons    = 332
            neutrons     = 1130
            mass         = 1462L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ttb"
        }

        meta {
            numericId           = 3320
            hashId              = 471
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unocttrium = material("unocttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 183
            electrons    = 183
            neutrons     = 388
            mass         = 571L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uot"
        }

        meta {
            numericId           = 1830
            hashId              = 313
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triuntrium = material("triuntrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 313
            electrons    = 313
            neutrons     = 1035
            mass         = 1348L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tut"
        }

        meta {
            numericId           = 3130
            hashId              = 452
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Neutronium = material("neutronium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 6
            durability = 81920L
            speed      = 6.0f
        }

        composition {
            formula = "Nt"
        }

        meta {
            numericId           = -1
            hashId              = 540
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Coral = material("coral") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2135
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unquadbium = material("unquadbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 142
            electrons    = 142
            neutrons     = 236
            mass         = 378L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqb"
        }

        meta {
            numericId           = 1420
            hashId              = 267
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bihextrium = material("bihextrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 263
            electrons    = 263
            neutrons     = 785
            mass         = 1048L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bht"
        }

        meta {
            numericId           = 2630
            hashId              = 402
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bioctquadium = material("bioctquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 284
            electrons    = 284
            neutrons     = 890
            mass         = 1174L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Boq"
        }

        meta {
            numericId           = 2840
            hashId              = 423
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Flerovium = material("flerovium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 114
            electrons    = 114
            neutrons     = 175
            mass         = 289L
            density      = 14.0
            meltingPoint = 340L
            boilingPoint = 420L
            plasmaPoint  = 42000L
            hasMetallum  = true
        }

        composition {
            formula = "Fl"
        }

        meta {
            numericId           = 1140
            hashId              = 235
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.CRYSTALLOGEN,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val EnrichedCopper = material("enriched_copper") {
        name = "Enriched Copper"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2196
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Adamite = material("adamite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2129
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Livermorium = material("livermorium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 116
            electrons    = 116
            neutrons     = 177
            mass         = 293L
            density      = 12.9
            meltingPoint = 708L
            boilingPoint = 1085L
            plasmaPoint  = 108500L
            hasMetallum  = true
        }

        composition {
            formula = "Lv"
        }

        meta {
            numericId           = 1160
            hashId              = 238
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Atomic.CHALCOGEN,
        )

    }

    val Triocthexium = material("triocthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 386
            electrons    = 386
            neutrons     = 1400
            mass         = 1786L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Toh"
        }

        meta {
            numericId           = 3860
            hashId              = 526
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tennantite = material("tennantite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2191
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bibipentium = material("bibipentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 225
            electrons    = 225
            neutrons     = 595
            mass         = 820L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbp"
        }

        meta {
            numericId           = 2250
            hashId              = 363
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val MutatedIron = material("mutated_iron") {
        name = "Mutated Iron"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2182
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Untritrium = material("untritrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 133
            electrons    = 133
            neutrons     = 209
            mass         = 342L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Utt"
        }

        meta {
            numericId           = 1330
            hashId              = 258
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Wildwood = material("wildwood") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2161
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Oganesson = material("oganesson") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 118
            electrons    = 118
            neutrons     = 176
            mass         = 294L
            density      = 5.0
            meltingPoint = 258L
            boilingPoint = 263L
            plasmaPoint  = 26300L
            hasMetallum  = true
        }

        composition {
            formula = "Og"
        }

        meta {
            numericId           = 1180
            hashId              = 241
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Unhexunium = material("unhexunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 161
            electrons    = 161
            neutrons     = 300
            mass         = 461L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhu"
        }

        meta {
            numericId           = 1610
            hashId              = 288
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trinilhexium = material("trinilhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 306
            electrons    = 306
            neutrons     = 1000
            mass         = 1306L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tnh"
        }

        meta {
            numericId           = 3060
            hashId              = 445
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val IrridantReinforced = material("irridant_reinforced") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2099
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bioctunium = material("bioctunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 281
            electrons    = 281
            neutrons     = 875
            mass         = 1156L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bou"
        }

        meta {
            numericId           = 2810
            hashId              = 420
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bihexquadium = material("bihexquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 264
            electrons    = 264
            neutrons     = 790
            mass         = 1054L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhq"
        }

        meta {
            numericId           = 2640
            hashId              = 403
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triennunium = material("triennunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 391
            electrons    = 391
            neutrons     = 1425
            mass         = 1816L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Teu"
        }

        meta {
            numericId           = 3910
            hashId              = 531
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biennoctium = material("biennoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 298
            electrons    = 298
            neutrons     = 960
            mass         = 1258L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Beo"
        }

        meta {
            numericId           = 2980
            hashId              = 437
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennbium = material("unennbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 192
            electrons    = 192
            neutrons     = 430
            mass         = 622L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ueb"
        }

        meta {
            numericId           = 1920
            hashId              = 327
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trioctoctium = material("trioctoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 388
            electrons    = 388
            neutrons     = 1410
            mass         = 1798L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Too"
        }

        meta {
            numericId           = 3880
            hashId              = 528
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triniloctium = material("triniloctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 308
            electrons    = 308
            neutrons     = 1010
            mass         = 1318L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tno"
        }

        meta {
            numericId           = 3080
            hashId              = 447
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Draconic = material("draconic") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2096
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Euphemium = material("euphemium") {
        appearance {
            color       = Rgba(255, 150, 255, 255)
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2154
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Unseptennium = material("unseptennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 179
            electrons    = 179
            neutrons     = 372
            mass         = 551L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Use"
        }

        meta {
            numericId           = 1790
            hashId              = 309
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Phoenixite = material("phoenixite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 1
            durability = 64L
            speed      = 6.0f
        }

        meta {
            numericId           = -1
            hashId              = 2091
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Bipenttrium = material("bipenttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 253
            electrons    = 253
            neutrons     = 735
            mass         = 988L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpt"
        }

        meta {
            numericId           = 2530
            hashId              = 392
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennquadium = material("unennquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 194
            electrons    = 194
            neutrons     = 440
            mass         = 634L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ueq"
        }

        meta {
            numericId           = 1940
            hashId              = 329
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Untriennium = material("untriennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 139
            electrons    = 139
            neutrons     = 227
            mass         = 366L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ute"
        }

        meta {
            numericId           = 1390
            hashId              = 264
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trinilunium = material("trinilunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 301
            electrons    = 301
            neutrons     = 975
            mass         = 1276L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tnu"
        }

        meta {
            numericId           = 3010
            hashId              = 440
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Arlemite = material("arlemite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2156
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Microcline = material("microcline") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2176
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biennhexium = material("biennhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 296
            electrons    = 296
            neutrons     = 950
            mass         = 1246L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Beh"
        }

        meta {
            numericId           = 2960
            hashId              = 435
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tritriunium = material("tritriunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 331
            electrons    = 331
            neutrons     = 1125
            mass         = 1456L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ttu"
        }

        meta {
            numericId           = 3310
            hashId              = 470
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexquadium = material("trihexquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 364
            electrons    = 364
            neutrons     = 1290
            mass         = 1654L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Thq"
        }

        meta {
            numericId           = 3640
            hashId              = 503
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val ObsidianFlux = material("obsidian_flux") {
        name = "Obsidian Flux"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2101
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tellurium = material("tellurium") {
        appearance {
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 52
            electrons    = 52
            neutrons     = 75
            mass         = 127L
            density      = 6.232
            meltingPoint = 722L
            boilingPoint = 1261L
            plasmaPoint  = 126100L
            hasMetallum  = true
        }

        composition {
            formula = "Te"
        }

        meta {
            numericId           = 520
            hashId              = 132
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Electrum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Atomic.CHALCOGEN,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.ItemGenerator.MOLTEN,
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

    val Unoctbium = material("unoctbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 182
            electrons    = 182
            neutrons     = 384
            mass         = 566L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uob"
        }

        meta {
            numericId           = 1820
            hashId              = 312
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triquadtrium = material("triquadtrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 343
            electrons    = 343
            neutrons     = 1185
            mass         = 1528L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqt"
        }

        meta {
            numericId           = 3430
            hashId              = 482
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bloodstone = material("bloodstone") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2133
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Fairy = material("fairy") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2198
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Trioctquadium = material("trioctquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 384
            electrons    = 384
            neutrons     = 1390
            mass         = 1774L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Toq"
        }

        meta {
            numericId           = 3840
            hashId              = 524
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Meitnerium = material("meitnerium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 109
            electrons    = 109
            neutrons     = 167
            mass         = 276L
            density      = 37.4
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Mt"
        }

        meta {
            numericId           = 1090
            hashId              = 230
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.COBALT_GROUP,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Citrine = material("citrine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2134
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Pokefennium = material("pokefennium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2199
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unquadennium = material("unquadennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 149
            electrons    = 149
            neutrons     = 257
            mass         = 406L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqe"
        }

        meta {
            numericId           = 1490
            hashId              = 275
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biennennium = material("biennennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 299
            electrons    = 299
            neutrons     = 965
            mass         = 1264L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bee"
        }

        meta {
            numericId           = 2990
            hashId              = 438
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val DarkStone = material("dark_stone") {
        name = "Dark Stone"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2137
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unquadtrium = material("unquadtrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 143
            electrons    = 143
            neutrons     = 239
            mass         = 382L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqt"
        }

        meta {
            numericId           = 1430
            hashId              = 268
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Sweet = material("sweet") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2171
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bitriseptium = material("bitriseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 237
            electrons    = 237
            neutrons     = 655
            mass         = 892L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bts"
        }

        meta {
            numericId           = 2370
            hashId              = 375
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Rutherfordium = material("rutherfordium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 104
            electrons    = 104
            neutrons     = 161
            mass         = 265L
            density      = 23.2
            meltingPoint = 2400L
            boilingPoint = 5800L
            plasmaPoint  = 580000L
            hasMetallum  = true
        }

        composition {
            formula = "Rf"
        }

        meta {
            numericId           = 1040
            hashId              = 225
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.TITANIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Ununennium = material("ununennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 119
            electrons    = 119
            neutrons     = 178
            mass         = 297L
            density      = 0.0
            meltingPoint = 290L
            boilingPoint = 903L
            plasmaPoint  = 90300L
            hasMetallum  = true
        }

        composition {
            formula = "Uue"
        }

        meta {
            numericId           = 1190
            hashId              = 242
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Trioctpentium = material("trioctpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 385
            electrons    = 385
            neutrons     = 1395
            mass         = 1780L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Top"
        }

        meta {
            numericId           = 3850
            hashId              = 525
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biseptseptium = material("biseptseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 277
            electrons    = 277
            neutrons     = 855
            mass         = 1132L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bss"
        }

        meta {
            numericId           = 2770
            hashId              = 416
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bibiseptium = material("bibiseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 227
            electrons    = 227
            neutrons     = 605
            mass         = 832L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bbs"
        }

        meta {
            numericId           = 2270
            hashId              = 365
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bitribium = material("bitribium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 232
            electrons    = 232
            neutrons     = 630
            mass         = 862L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Btb"
        }

        meta {
            numericId           = 2320
            hashId              = 370
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trinilpentium = material("trinilpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 305
            electrons    = 305
            neutrons     = 995
            mass         = 1300L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tnp"
        }

        meta {
            numericId           = 3050
            hashId              = 444
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tritrinilium = material("tritrinilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 330
            electrons    = 330
            neutrons     = 1120
            mass         = 1450L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ttn"
        }

        meta {
            numericId           = 3300
            hashId              = 469
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Terbium = material("terbium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 65
            electrons    = 65
            neutrons     = 93
            mass         = 158L
            density      = 8.229
            meltingPoint = 1629L
            boilingPoint = 3503L
            plasmaPoint  = 350300L
            hasMetallum  = true
        }

        composition {
            formula = "Tb"
        }

        meta {
            numericId           = 650
            hashId              = 148
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Thyrium = material("thyrium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2094
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Weidanium = material("weidanium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2142
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Sylvite = material("sylvite") {
        appearance {
            color       = Rgba(240, 200, 200, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 19
            mass         = 37L
            density      = 0.432607
            meltingPoint = 1040L
            boilingPoint = 1690L
            plasmaPoint  = 169000L
        }

        processing {
            byProduct("iodine_salt", "salt")
        }

        composition {
            formula = "KCl"
            component("potassium", 324324000L)
            component("chlorine", 324324000L)
        }

        meta {
            numericId           = 8203
            hashId              = 691
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Fames - 1")
            reRegisteredTo("rock_salt")
            reRegisteredTo("sylvine")
            reRegisteredTo("any_salt")
            sourceOf("potassium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.Compounds.DECOMPOSABLE,
        )

    }

    val Binilpentium = material("binilpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 205
            electrons    = 205
            neutrons     = 495
            mass         = 700L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bnp"
        }

        meta {
            numericId           = 2050
            hashId              = 340
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tripentunium = material("tripentunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 351
            electrons    = 351
            neutrons     = 1225
            mass         = 1576L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tpu"
        }

        meta {
            numericId           = 3510
            hashId              = 490
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Praseodymium = material("praseodymium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 59
            electrons    = 59
            neutrons     = 81
            mass         = 140L
            density      = 6.773
            meltingPoint = 1208L
            boilingPoint = 3793L
            plasmaPoint  = 379300L
            hasMetallum  = true
        }

        composition {
            formula = "Pr"
        }

        meta {
            numericId           = 590
            hashId              = 142
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.LANTHANIDE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Triunennium = material("triunennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 319
            electrons    = 319
            neutrons     = 1065
            mass         = 1384L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tue"
        }

        meta {
            numericId           = 3190
            hashId              = 458
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trinilseptium = material("trinilseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 307
            electrons    = 307
            neutrons     = 1005
            mass         = 1312L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tns"
        }

        meta {
            numericId           = 3070
            hashId              = 446
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Soulium = material("soulium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2190
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unbitrium = material("unbitrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 123
            electrons    = 123
            neutrons     = 186
            mass         = 309L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ubt"
        }

        meta {
            numericId           = 1230
            hashId              = 246
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadunium = material("biquadunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 241
            electrons    = 241
            neutrons     = 675
            mass         = 916L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqu"
        }

        meta {
            numericId           = 2410
            hashId              = 380
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bioctpentium = material("bioctpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 285
            electrons    = 285
            neutrons     = 895
            mass         = 1180L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bop"
        }

        meta {
            numericId           = 2850
            hashId              = 424
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bioctseptium = material("bioctseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 287
            electrons    = 287
            neutrons     = 905
            mass         = 1192L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bos"
        }

        meta {
            numericId           = 2870
            hashId              = 426
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unenntrium = material("unenntrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 193
            electrons    = 193
            neutrons     = 435
            mass         = 628L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uet"
        }

        meta {
            numericId           = 1930
            hashId              = 328
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trioctseptium = material("trioctseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 387
            electrons    = 387
            neutrons     = 1405
            mass         = 1792L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tos"
        }

        meta {
            numericId           = 3870
            hashId              = 527
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tritriseptium = material("tritriseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 337
            electrons    = 337
            neutrons     = 1155
            mass         = 1492L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tts"
        }

        meta {
            numericId           = 3370
            hashId              = 476
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unhexbium = material("unhexbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 162
            electrons    = 162
            neutrons     = 304
            mass         = 466L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhb"
        }

        meta {
            numericId           = 1620
            hashId              = 289
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unseptbium = material("unseptbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 172
            electrons    = 172
            neutrons     = 344
            mass         = 516L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Usb"
        }

        meta {
            numericId           = 1720
            hashId              = 299
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennpentium = material("unennpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 195
            electrons    = 195
            neutrons     = 445
            mass         = 640L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uep"
        }

        meta {
            numericId           = 1950
            hashId              = 330
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Luminite = material("luminite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2107
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Binilseptium = material("binilseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 207
            electrons    = 207
            neutrons     = 505
            mass         = 712L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bns"
        }

        meta {
            numericId           = 2070
            hashId              = 342
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Untrioctium = material("untrioctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 138
            electrons    = 138
            neutrons     = 224
            mass         = 362L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uto"
        }

        meta {
            numericId           = 1380
            hashId              = 263
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val OsmiumTetroxide = material("osmium_tetroxide") {
        name = "Osmium Tetroxide"

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 29
            mass         = 50L
            density      = 4.5231432
            meltingPoint = 704L
            boilingPoint = 1129L
            plasmaPoint  = 112900L
        }

        composition {
            component("osmium_elemental", 129729600L)
            component("oxygen", 518918400L)
        }

        meta {
            numericId           = -1
            hashId              = 2076
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Saturnite = material("saturnite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2151
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Joshen = material("joshen") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2179
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tribiquadium = material("tribiquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 324
            electrons    = 324
            neutrons     = 1090
            mass         = 1414L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbq"
        }

        meta {
            numericId           = 3240
            hashId              = 463
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unhexennium = material("unhexennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 169
            electrons    = 169
            neutrons     = 332
            mass         = 501L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhe"
        }

        meta {
            numericId           = 1690
            hashId              = 296
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihexbium = material("trihexbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 362
            electrons    = 362
            neutrons     = 1280
            mass         = 1642L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Thb"
        }

        meta {
            numericId           = 3620
            hashId              = 501
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Mawsitsit = material("mawsitsit") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2109
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unoctennium = material("unoctennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 189
            electrons    = 189
            neutrons     = 415
            mass         = 604L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uoe"
        }

        meta {
            numericId           = 1890
            hashId              = 324
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val LimePure = material("lime_pure") {
        name = "Pure Lime"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2081
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tritripentium = material("tritripentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 335
            electrons    = 335
            neutrons     = 1145
            mass         = 1480L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ttp"
        }

        meta {
            numericId           = 3350
            hashId              = 474
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Gelatine = material("gelatine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2172
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Dubnium = material("dubnium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 105
            electrons    = 105
            neutrons     = 163
            mass         = 268L
            density      = 29.3
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Db"
        }

        meta {
            numericId           = 1050
            hashId              = 226
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.VANADIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Schrabidium = material("schrabidium") {
        appearance {
            color       = Rgba(50, 255, 255, 255)
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2145
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Processing.MELTING,
        )

    }

    val Californium = material("californium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 98
            electrons    = 98
            neutrons     = 153
            mass         = 251L
            density      = 15.1
            meltingPoint = 1173L
            boilingPoint = 1743L
            plasmaPoint  = 174300L
            hasMetallum  = true
        }

        composition {
            formula = "Cf"
        }

        meta {
            numericId           = 980
            hashId              = 219
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Bitrihexium = material("bitrihexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 236
            electrons    = 236
            neutrons     = 650
            mass         = 886L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bth"
        }

        meta {
            numericId           = 2360
            hashId              = 374
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biennseptium = material("biennseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 297
            electrons    = 297
            neutrons     = 955
            mass         = 1252L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bes"
        }

        meta {
            numericId           = 2970
            hashId              = 436
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trihextrium = material("trihextrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 363
            electrons    = 363
            neutrons     = 1285
            mass         = 1648L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tht"
        }

        meta {
            numericId           = 3630
            hashId              = 502
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val IridiumIronReinforced = material("iridium_iron_reinforced") {
        name = "Reinforced Iridiron"

        physics {
            protons      = 51
            electrons    = 51
            neutrons     = 72
            mass         = 124L
            density      = 15.217
            meltingPoint = 2265L
            boilingPoint = 3917L
            plasmaPoint  = 391750L
        }

        composition {
            component("iridium", 324324000L)
            component("iron", 324324000L)
        }

        meta {
            numericId           = -1
            hashId              = 2080
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tribioctium = material("tribioctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 328
            electrons    = 328
            neutrons     = 1110
            mass         = 1438L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbo"
        }

        meta {
            numericId           = 3280
            hashId              = 467
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Zectium = material("zectium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2095
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Unsepthexium = material("unsepthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 176
            electrons    = 176
            neutrons     = 360
            mass         = 536L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ush"
        }

        meta {
            numericId           = 1760
            hashId              = 306
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Moscovium = material("moscovium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 115
            electrons    = 115
            neutrons     = 174
            mass         = 289L
            density      = 13.5
            meltingPoint = 700L
            boilingPoint = 1400L
            plasmaPoint  = 140000L
            hasMetallum  = true
        }

        composition {
            formula = "Mc"
        }

        meta {
            numericId           = 1150
            hashId              = 237
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Atomic.PNICTOGEN,
        )

    }

    val TerrasteelAlloyStrengthened = material("terrasteel_alloy_strengthened") {
        name = "Strengthened Terrasteel Alloy"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2085
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("strengthened_terrasteel_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Antimatter = material("antimatter") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2092
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Atomic.ANTIMATTER,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unpentoctium = material("unpentoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 158
            electrons    = 158
            neutrons     = 288
            mass         = 446L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Upo"
        }

        meta {
            numericId           = 1580
            hashId              = 285
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trioctunium = material("trioctunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 381
            electrons    = 381
            neutrons     = 1375
            mass         = 1756L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tou"
        }

        meta {
            numericId           = 3810
            hashId              = 521
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trinilnilium = material("trinilnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 300
            electrons    = 300
            neutrons     = 970
            mass         = 1270L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tnn"
        }

        meta {
            numericId           = 3000
            hashId              = 439
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trinilbium = material("trinilbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 302
            electrons    = 302
            neutrons     = 980
            mass         = 1282L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tnb"
        }

        meta {
            numericId           = 3020
            hashId              = 441
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadquadium = material("biquadquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 244
            electrons    = 244
            neutrons     = 690
            mass         = 934L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqq"
        }

        meta {
            numericId           = 2440
            hashId              = 383
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biennbium = material("biennbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 292
            electrons    = 292
            neutrons     = 930
            mass         = 1222L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Beb"
        }

        meta {
            numericId           = 2920
            hashId              = 431
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triseptoctium = material("triseptoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 378
            electrons    = 378
            neutrons     = 1360
            mass         = 1738L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tso"
        }

        meta {
            numericId           = 3780
            hashId              = 518
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bipentbium = material("bipentbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 252
            electrons    = 252
            neutrons     = 730
            mass         = 982L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpb"
        }

        meta {
            numericId           = 2520
            hashId              = 391
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triununium = material("triununium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 311
            electrons    = 311
            neutrons     = 1025
            mass         = 1336L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tuu"
        }

        meta {
            numericId           = 3110
            hashId              = 450
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Reiium = material("reiium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2141
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Triennbium = material("triennbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 392
            electrons    = 392
            neutrons     = 1430
            mass         = 1822L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Teb"
        }

        meta {
            numericId           = 3920
            hashId              = 532
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biunquadium = material("biunquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 214
            electrons    = 214
            neutrons     = 540
            mass         = 754L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Buq"
        }

        meta {
            numericId           = 2140
            hashId              = 349
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bihexnilium = material("bihexnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 260
            electrons    = 260
            neutrons     = 770
            mass         = 1030L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhn"
        }

        meta {
            numericId           = 2600
            hashId              = 399
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Hexcite = material("hexcite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2124
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Binilbium = material("binilbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 202
            electrons    = 202
            neutrons     = 480
            mass         = 682L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bnb"
        }

        meta {
            numericId           = 2020
            hashId              = 337
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biunpentium = material("biunpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 215
            electrons    = 215
            neutrons     = 545
            mass         = 760L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bup"
        }

        meta {
            numericId           = 2150
            hashId              = 350
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Turquoise = material("turquoise") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2127
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Untripentium = material("untripentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 135
            electrons    = 135
            neutrons     = 215
            mass         = 350L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Utp"
        }

        meta {
            numericId           = 1350
            hashId              = 260
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bisepthexium = material("bisepthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 276
            electrons    = 276
            neutrons     = 850
            mass         = 1126L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bsh"
        }

        meta {
            numericId           = 2760
            hashId              = 415
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tritriennium = material("tritriennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 339
            electrons    = 339
            neutrons     = 1165
            mass         = 1504L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tte"
        }

        meta {
            numericId           = 3390
            hashId              = 478
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bioctnilium = material("bioctnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 280
            electrons    = 280
            neutrons     = 870
            mass         = 1150L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bon"
        }

        meta {
            numericId           = 2800
            hashId              = 419
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unbiennium = material("unbiennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 129
            electrons    = 129
            neutrons     = 198
            mass         = 327L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ube"
        }

        meta {
            numericId           = 1290
            hashId              = 254
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triunbium = material("triunbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 312
            electrons    = 312
            neutrons     = 1030
            mass         = 1342L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tub"
        }

        meta {
            numericId           = 3120
            hashId              = 451
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Binilquadium = material("binilquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 204
            electrons    = 204
            neutrons     = 490
            mass         = 694L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bnq"
        }

        meta {
            numericId           = 2040
            hashId              = 339
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennunium = material("unennunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 191
            electrons    = 191
            neutrons     = 425
            mass         = 616L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ueu"
        }

        meta {
            numericId           = 1910
            hashId              = 326
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bohrium = material("bohrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 107
            electrons    = 107
            neutrons     = 163
            mass         = 270L
            density      = 37.1
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Bh"
        }

        meta {
            numericId           = 1070
            hashId              = 228
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.MANGANESE_GROUP,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Triquadoctium = material("triquadoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 348
            electrons    = 348
            neutrons     = 1210
            mass         = 1558L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqo"
        }

        meta {
            numericId           = 3480
            hashId              = 487
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unhexpentium = material("unhexpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 165
            electrons    = 165
            neutrons     = 316
            mass         = 481L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhp"
        }

        meta {
            numericId           = 1650
            hashId              = 292
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadtrium = material("biquadtrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 243
            electrons    = 243
            neutrons     = 685
            mass         = 928L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqt"
        }

        meta {
            numericId           = 2430
            hashId              = 382
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadhexium = material("biquadhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 246
            electrons    = 246
            neutrons     = 700
            mass         = 946L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqh"
        }

        meta {
            numericId           = 2460
            hashId              = 385
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unseptunium = material("unseptunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 171
            electrons    = 171
            neutrons     = 340
            mass         = 511L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Usu"
        }

        meta {
            numericId           = 1710
            hashId              = 298
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Protactinium = material("protactinium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 91
            electrons    = 91
            neutrons     = 138
            mass         = 229L
            density      = 15.37
            meltingPoint = 1841L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
            hasMetallum  = true
        }

        composition {
            formula = "Pa"
        }

        meta {
            numericId           = 910
            hashId              = 188
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Triunhexium = material("triunhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 316
            electrons    = 316
            neutrons     = 1050
            mass         = 1366L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tuh"
        }

        meta {
            numericId           = 3160
            hashId              = 455
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Dull = material("dull") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2188
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Tapazite = material("tapazite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2125
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bihexbium = material("bihexbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 262
            electrons    = 262
            neutrons     = 780
            mass         = 1042L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhb"
        }

        meta {
            numericId           = 2620
            hashId              = 401
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unhexseptium = material("unhexseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 167
            electrons    = 167
            neutrons     = 324
            mass         = 491L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhs"
        }

        meta {
            numericId           = 1670
            hashId              = 294
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val HOPGraphite = material("hop_graphite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2195
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unhexnilium = material("unhexnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 160
            electrons    = 160
            neutrons     = 296
            mass         = 456L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uhn"
        }

        meta {
            numericId           = 1600
            hashId              = 287
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triennhexium = material("triennhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 396
            electrons    = 396
            neutrons     = 1450
            mass         = 1846L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Teh"
        }

        meta {
            numericId           = 3960
            hashId              = 536
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bipentennium = material("bipentennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 259
            electrons    = 259
            neutrons     = 765
            mass         = 1024L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpe"
        }

        meta {
            numericId           = 2590
            hashId              = 398
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val IronSharp = material("iron_sharp") {
        name = "Sharp Iron"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2100
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bioctoctium = material("bioctoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 288
            electrons    = 288
            neutrons     = 910
            mass         = 1198L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Boo"
        }

        meta {
            numericId           = 2880
            hashId              = 427
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bisepttrium = material("bisepttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 273
            electrons    = 273
            neutrons     = 835
            mass         = 1108L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bst"
        }

        meta {
            numericId           = 2730
            hashId              = 412
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Voidstone = material("voidstone") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2088
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
            aspect("Vacuos - 1")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bihexunium = material("bihexunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 261
            electrons    = 261
            neutrons     = 775
            mass         = 1036L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhu"
        }

        meta {
            numericId           = 2610
            hashId              = 400
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val RyuDragonRyder = material("ryu_dragon_ryder") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2116
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unoctunium = material("unoctunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 181
            electrons    = 181
            neutrons     = 380
            mass         = 561L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uou"
        }

        meta {
            numericId           = 1810
            hashId              = 311
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unquadhexium = material("unquadhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 146
            electrons    = 146
            neutrons     = 248
            mass         = 394L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqh"
        }

        meta {
            numericId           = 1460
            hashId              = 272
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bitriquadium = material("bitriquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 234
            electrons    = 234
            neutrons     = 640
            mass         = 874L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Btq"
        }

        meta {
            numericId           = 2340
            hashId              = 372
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tribiennium = material("tribiennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 329
            electrons    = 329
            neutrons     = 1115
            mass         = 1444L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbe"
        }

        meta {
            numericId           = 3290
            hashId              = 468
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bihexoctium = material("bihexoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 268
            electrons    = 268
            neutrons     = 810
            mass         = 1078L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bho"
        }

        meta {
            numericId           = 2680
            hashId              = 407
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Binilunium = material("binilunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 201
            electrons    = 201
            neutrons     = 475
            mass         = 676L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bnu"
        }

        meta {
            numericId           = 2010
            hashId              = 336
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unpentennium = material("unpentennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 159
            electrons    = 159
            neutrons     = 292
            mass         = 451L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Upe"
        }

        meta {
            numericId           = 1590
            hashId              = 286
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triseptunium = material("triseptunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 371
            electrons    = 371
            neutrons     = 1325
            mass         = 1696L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tsu"
        }

        meta {
            numericId           = 3710
            hashId              = 510
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tribitrium = material("tribitrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 323
            electrons    = 323
            neutrons     = 1085
            mass         = 1408L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbt"
        }

        meta {
            numericId           = 3230
            hashId              = 462
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Magma = material("magma") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2108
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Master = material("master") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 547
            originalMod         = "gregtech"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unhextrium = material("unhextrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 163
            electrons    = 163
            neutrons     = 308
            mass         = 471L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uht"
        }

        meta {
            numericId           = 1630
            hashId              = 290
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tribinilium = material("tribinilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 320
            electrons    = 320
            neutrons     = 1070
            mass         = 1390L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tbn"
        }

        meta {
            numericId           = 3200
            hashId              = 459
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unennennium = material("unennennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 199
            electrons    = 199
            neutrons     = 465
            mass         = 664L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uee"
        }

        meta {
            numericId           = 1990
            hashId              = 334
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tripenthexium = material("tripenthexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 356
            electrons    = 356
            neutrons     = 1250
            mass         = 1606L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tph"
        }

        meta {
            numericId           = 3560
            hashId              = 495
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Nether = material("nether") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2110
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Binilhexium = material("binilhexium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 206
            electrons    = 206
            neutrons     = 500
            mass         = 706L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bnh"
        }

        meta {
            numericId           = 2060
            hashId              = 341
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biunseptium = material("biunseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 217
            electrons    = 217
            neutrons     = 555
            mass         = 772L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bus"
        }

        meta {
            numericId           = 2170
            hashId              = 352
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Reinforced = material("reinforced") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2167
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Randomite = material("randomite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2115
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Wimalite = material("wimalite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2128
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Francium = material("francium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 87
            electrons    = 87
            neutrons     = 134
            mass         = 221L
            density      = 1.87
            meltingPoint = 300L
            boilingPoint = 950L
            plasmaPoint  = 95000L
            hasMetallum  = true
        }

        composition {
            formula = "Fr"
        }

        meta {
            numericId           = 870
            hashId              = 181
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.ALKALI_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Darmstadtium = material("darmstadtium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 110
            electrons    = 110
            neutrons     = 171
            mass         = 281L
            density      = 34.8
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Ds"
        }

        meta {
            numericId           = 1100
            hashId              = 231
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.NICKEL_GROUP,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Biennnilium = material("biennnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 290
            electrons    = 290
            neutrons     = 920
            mass         = 1210L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ben"
        }

        meta {
            numericId           = 2900
            hashId              = 429
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Fermium = material("fermium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 100
            electrons    = 100
            neutrons     = 157
            mass         = 257L
            density      = 0.0
            meltingPoint = 1125L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Fm"
        }

        meta {
            numericId           = 1000
            hashId              = 221
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Unpentnilium = material("unpentnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 150
            electrons    = 150
            neutrons     = 260
            mass         = 410L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Upn"
        }

        meta {
            numericId           = 1500
            hashId              = 276
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 3")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Cluster = material("cluster") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2170
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Roentgenium = material("roentgenium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 111
            electrons    = 111
            neutrons     = 169
            mass         = 280L
            density      = 28.7
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        composition {
            formula = "Rg"
        }

        meta {
            numericId           = 1110
            hashId              = 232
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.COPPER_GROUP,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Cocaine = material("cocaine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2186
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val TarPitch = material("tar_pitch") {
        name = "Tar Pitch"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2118
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biocttrium = material("biocttrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 283
            electrons    = 283
            neutrons     = 885
            mass         = 1168L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bot"
        }

        meta {
            numericId           = 2830
            hashId              = 422
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Osmonium = material("osmonium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 1
            durability = 64L
            speed      = 6.0f
        }

        meta {
            numericId           = -1
            hashId              = 2090
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Untrinilium = material("untrinilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 130
            electrons    = 130
            neutrons     = 200
            mass         = 330L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Utn"
        }

        meta {
            numericId           = 1300
            hashId              = 255
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val GraveyardDirt = material("graveyard_dirt") {
        name = "Graveyard Dirt"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2185
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Biquadseptium = material("biquadseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 247
            electrons    = 247
            neutrons     = 705
            mass         = 952L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqs"
        }

        meta {
            numericId           = 2470
            hashId              = 386
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trioctbium = material("trioctbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 382
            electrons    = 382
            neutrons     = 1380
            mass         = 1762L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tob"
        }

        meta {
            numericId           = 3820
            hashId              = 522
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 7")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Biquadpentium = material("biquadpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 245
            electrons    = 245
            neutrons     = 695
            mass         = 940L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bqp"
        }

        meta {
            numericId           = 2450
            hashId              = 384
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unbioctium = material("unbioctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 128
            electrons    = 128
            neutrons     = 196
            mass         = 324L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ubo"
        }

        meta {
            numericId           = 1280
            hashId              = 253
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Trinilennium = material("trinilennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 309
            electrons    = 309
            neutrons     = 1015
            mass         = 1324L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tne"
        }

        meta {
            numericId           = 3090
            hashId              = 448
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Serpentine = material("serpentine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2177
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val IridiumSodiumOxide = material("iridium_sodium_oxide") {
        name = "Iridium Sodium Oxide"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2078
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val SodiumPeroxide = material("sodium_peroxide") {
        name = "Sodium Peroxide"

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 19L
            density      = 0.4862145
            meltingPoint = 212L
            boilingPoint = 623L
            plasmaPoint  = 62300L
        }

        composition {
            component("sodium", 324324000L)
            component("oxygen", 324324000L)
        }

        meta {
            numericId           = -1
            hashId              = 2077
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Scandium = material("scandium") {
        appearance {
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 24
            mass         = 45L
            density      = 2.989
            meltingPoint = 1814L
            boilingPoint = 3109L
            plasmaPoint  = 310900L
            hasMetallum  = true
        }

        composition {
            formula = "Sc"
        }

        meta {
            numericId           = 210
            hashId              = 94
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Gelum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.SCANDIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Bitriunium = material("bitriunium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 231
            electrons    = 231
            neutrons     = 625
            mass         = 856L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Btu"
        }

        meta {
            numericId           = 2310
            hashId              = 369
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 4")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bipentoctium = material("bipentoctium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 258
            electrons    = 258
            neutrons     = 760
            mass         = 1018L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpo"
        }

        meta {
            numericId           = 2580
            hashId              = 397
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Tritritrium = material("tritritrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 333
            electrons    = 333
            neutrons     = 1135
            mass         = 1468L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Ttt"
        }

        meta {
            numericId           = 3330
            hashId              = 472
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Dineutronium = material("dineutronium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2152
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bihexseptium = material("bihexseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 267
            electrons    = 267
            neutrons     = 805
            mass         = 1072L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhs"
        }

        meta {
            numericId           = 2670
            hashId              = 406
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triniltrium = material("triniltrium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 303
            electrons    = 303
            neutrons     = 985
            mass         = 1288L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tnt"
        }

        meta {
            numericId           = 3030
            hashId              = 442
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bipentnilium = material("bipentnilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 250
            electrons    = 250
            neutrons     = 720
            mass         = 970L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bpn"
        }

        meta {
            numericId           = 2500
            hashId              = 389
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bioctennium = material("bioctennium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 289
            electrons    = 289
            neutrons     = 915
            mass         = 1204L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Boe"
        }

        meta {
            numericId           = 2890
            hashId              = 428
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Mud = material("mud") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2168
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Untriquadium = material("untriquadium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 134
            electrons    = 134
            neutrons     = 212
            mass         = 346L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Utq"
        }

        meta {
            numericId           = 1340
            hashId              = 259
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Witheria = material("witheria") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2183
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Vile = material("vile") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2187
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Bihexpentium = material("bihexpentium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 265
            electrons    = 265
            neutrons     = 795
            mass         = 1060L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Bhp"
        }

        meta {
            numericId           = 2650
            hashId              = 404
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 5")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Unbinilium = material("unbinilium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 120
            electrons    = 120
            neutrons     = 180
            mass         = 300L
            density      = 0.0
            meltingPoint = 953L
            boilingPoint = 1973L
            plasmaPoint  = 197300L
            hasMetallum  = true
        }

        composition {
            formula = "Ubn"
        }

        meta {
            numericId           = 1200
            hashId              = 243
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Unquadseptium = material("unquadseptium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 147
            electrons    = 147
            neutrons     = 251
            mass         = 398L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Uqs"
        }

        meta {
            numericId           = 1470
            hashId              = 273
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 2")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Triquadbium = material("triquadbium") {
        appearance {
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 342
            electrons    = 342
            neutrons     = 1180
            mass         = 1522L
            density      = 0.0
            plasmaPoint  = 300000L
        }

        composition {
            formula = "Tqb"
        }

        meta {
            numericId           = 3420
            hashId              = 481
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Radio - 6")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Bloodgem = material("bloodgem") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2158
            originalMod         = "divinerpg"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Infernal = material("infernal") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2104
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Starmetal = material("starmetal") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2146
            originalMod         = "hbm"
            priorityPrefixIndex = 3
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }
}
