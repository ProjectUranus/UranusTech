package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: MetalMaterials
@Suppress("unused") object MetalMaterials {
    fun init() = Unit

    val Ethaxium = material("ethaxium") {
        appearance {
            color       = Rgba(160, 170, 150, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 188
            electrons    = 188
            neutrons     = 410
            mass         = 598L
            density      = 30.0
            meltingPoint = 3000L
            boilingPoint = 6000L
            plasmaPoint  = 600000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 6400L
            speed      = 20.0f
        }

        composition {
            formula = "Etx"
        }

        meta {
            numericId           = 1880
            hashId              = 322
            originalMod         = "abyssalcraft"
            hidden              = true
            aspect("Metallum - 3")
            aspect("Vitium - 2")
            reRegisteredTo("unoctoctium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Trinium = material("trinium") {
        appearance {
            color       = Rgba(234, 234, 234, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 126
            electrons    = 126
            neutrons     = 192
            mass         = 318L
            density      = 1.06874
            meltingPoint = 2645L
            boilingPoint = 4523L
            plasmaPoint  = 452300L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 2560L
            speed      = 12.0f
        }

        processing {
            byProduct("tin", "rutile", "hematite", "duranium_hexaiodide")
        }

        composition {
            formula = "Ke"
        }

        meta {
            numericId           = 1260
            hashId              = 250
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Tutamen - 1")
            aspect("Vitreus - 1")
            reRegisteredTo("unbihexium")
            alloyRef("trinitanium")
            alloyRef("trinaquadalloy")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Dreadium = material("dreadium") {
        appearance {
            color       = Rgba(170, 0, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 187
            electrons    = 187
            neutrons     = 405
            mass         = 592L
            density      = 25.0
            meltingPoint = 2500L
            boilingPoint = 5000L
            plasmaPoint  = 500000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 4800L
            speed      = 16.0f
        }

        composition {
            formula = "Dr"
        }

        meta {
            numericId           = 1870
            hashId              = 320
            originalMod         = "abyssalcraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Tenebrae - 2")
            reRegisteredTo("unoctseptium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val DuraniumElemental = material("duranium_elemental") {
        name = "Elemental Duranium"

        appearance {
            color       = Rgba(75, 175, 175, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 145
            electrons    = 145
            neutrons     = 190
            mass         = 335L
            density      = 20.0
            meltingPoint = 1200L
            boilingPoint = 2491L
            plasmaPoint  = 249100L
            hasMetallum  = true
        }

        processing {
            byProduct("tritanium_dioxide", "trinium")
        }

        composition {
            formula = "Dn"
        }

        meta {
            numericId           = 1450
            hashId              = 270
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 1")
            reRegisteredTo("unquadpentium")
            alloyRef("duranium")
            alloyRef("tritanium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Atomic.METAL,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Coralium = material("coralium") {
        appearance {
            color       = Rgba(20, 160, 110, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 186
            electrons    = 186
            neutrons     = 400
            mass         = 586L
            density      = 20.0
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 3200L
            speed      = 12.0f
        }

        composition {
            formula = "Cor"
        }

        meta {
            numericId           = 1860
            hashId              = 317
            originalMod         = "abyssalcraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Perditio - 2")
            reRegisteredTo("unocthexium")
            reRegisteredTo("liquified_coralium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Abyssalnite = material("abyssalnite") {
        appearance {
            color       = Rgba(90, 40, 170, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 185
            electrons    = 185
            neutrons     = 396
            mass         = 581L
            density      = 15.0
            meltingPoint = 1500L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1600L
            speed      = 8.0f
        }

        composition {
            formula = "An"
        }

        meta {
            numericId           = 1850
            hashId              = 315
            originalMod         = "abyssalcraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Vacuos - 2")
            reRegisteredTo("unoctpentium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val TritaniumElemental = material("tritanium_elemental") {
        name = "Elemental Tritanium"

        appearance {
            color       = Rgba(55, 155, 155, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 125
            electrons    = 125
            neutrons     = 198
            mass         = 323L
            density      = 25.0
            meltingPoint = 2000L
            boilingPoint = 3138L
            plasmaPoint  = 313800L
            hasMetallum  = true
        }

        processing {
            byProduct("diduranium_trioxide", "trinium")
        }

        composition {
            formula = "Tn"
        }

        meta {
            numericId           = 1250
            hashId              = 248
            originalMod         = "mo"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 2")
            aspect("Vitreus - 1")
            reRegisteredTo("unbipentium")
            alloyRef("tritanium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Atomic.METAL,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
        )

    }

    val Naquadah = material("naquadah") {
        appearance {
            colorSolid  = Rgba(50, 50, 50, 255)
            colorLiquid = Rgba(0, 255, 0, 255)
            colorGas    = Rgba(50, 50, 50, 255)
            colorPlasma = Rgba(50, 50, 50, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 174
            electrons    = 174
            neutrons     = 352
            mass         = 526L
            density      = 21.0
            meltingPoint = 1500L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1280L
            speed      = 6.0f
        }

        processing {
            byProduct("duranium_hexachloride", "tritanium_hexafluoride")
        }

        composition {
            formula = "Nq"
        }

        meta {
            numericId           = 1740
            hashId              = 301
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Radio - 1")
            aspect("Nebrisum - 1")
            reRegisteredTo("unseptquadium")
            alloyRef("trinaquadalloy")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Naquadria = material("naquadria") {
        appearance {
            colorSolid  = Rgba(30, 30, 30, 255)
            colorLiquid = Rgba(128, 255, 128, 255)
            colorGas    = Rgba(30, 30, 30, 255)
            colorPlasma = Rgba(30, 30, 30, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 174
            electrons    = 174
            neutrons     = 348
            mass         = 522L
            density      = 20.0
            meltingPoint = 1500L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 512L
            speed      = 1.0f
        }

        processing {
            oreMultiplier           = 4
            byProduct("naquadah", "tritanium_hexafluoride")
            crushingTarget        = "naquadah" amount 648648000L
        }

        composition {
            formula = "Nq-522"
        }

        meta {
            numericId           = 1742
            hashId              = 304
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 4")
            aspect("Radio - 3")
            aspect("Nebrisum - 3")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val NaquadahEnriched = material("naquadah_enriched") {
        name = "Enriched Naquadah"

        appearance {
            colorSolid  = Rgba(60, 60, 60, 255)
            colorLiquid = Rgba(64, 255, 64, 255)
            colorGas    = Rgba(60, 60, 60, 255)
            colorPlasma = Rgba(60, 60, 60, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 174
            electrons    = 174
            neutrons     = 354
            mass         = 528L
            density      = 22.0
            meltingPoint = 1500L
            plasmaPoint  = 300000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1280L
            speed      = 6.0f
        }

        processing {
            oreMultiplier           = 2
            byProduct("naquadah", "duranium_hexafluoride")
            crushingTarget        = "naquadah" amount 648648000L
        }

        composition {
            formula = "Nq-528"
        }

        meta {
            numericId           = 1741
            hashId              = 303
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Radio - 2")
            aspect("Nebrisum - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
