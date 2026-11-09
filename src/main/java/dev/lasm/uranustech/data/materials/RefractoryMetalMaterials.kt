package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: RefractoryMetalMaterials
@Suppress("unused") object RefractoryMetalMaterials {
    fun init() = Unit

    val Tantalum = material("tantalum") {
        appearance {
            color       = Rgba(120, 120, 140, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 73
            electrons    = 73
            neutrons     = 107
            mass         = 180L
            density      = 16.654
            meltingPoint = 3290L
            boilingPoint = 5731L
            plasmaPoint  = 573100L
            hasMetallum  = true
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "tantalite" amount 648648000L
        }

        composition {
            formula = "Ta"
        }

        meta {
            numericId           = 730
            hashId              = 156
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Vinculum - 1")
            reRegisteredTo("tantalium")
            alloyRef("tantalum_hafnium_carbide")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.VANADIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Vanadium = material("vanadium") {
        appearance {
            color       = Rgba(50, 50, 50, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 23
            electrons    = 23
            neutrons     = 28
            mass         = 51L
            density      = 6.11
            meltingPoint = 2183L
            boilingPoint = 3680L
            plasmaPoint  = 368000L
            hasMetallum  = true
        }

        composition {
            formula = "V"
        }

        meta {
            numericId           = 230
            hashId              = 97
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Electrum - 1")
            alloyRef("vanadium_steel")
            alloyRef("hssg")
            alloyRef("vanadium_gallium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Atomic.VANADIUM_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Titanium = material("titanium") {
        appearance {
            color       = Rgba(220, 160, 240, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 22
            electrons    = 22
            neutrons     = 26
            mass         = 48L
            density      = 4.54
            meltingPoint = 1941L
            boilingPoint = 3560L
            plasmaPoint  = 356000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2560L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "rutile" amount 648648000L
        }

        composition {
            formula = "Ti"
        }

        meta {
            numericId           = 220
            hashId              = 95
            originalMod         = "Mariculture"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 1")
            reRegisteredTo("titan")
            alloyRef("trinitanium")
            alloyRef("titanium_iridium")
            alloyRef("titanium_aluminide")
            alloyRef("titanium_gold")
            alloyRef("niobium_titanium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.TITANIUM_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.NEVER_FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Molybdenum = material("molybdenum") {
        appearance {
            color       = Rgba(180, 180, 220, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 42
            electrons    = 42
            neutrons     = 53
            mass         = 95L
            density      = 10.22
            meltingPoint = 2896L
            boilingPoint = 4912L
            plasmaPoint  = 491200L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 7.0f
        }

        processing {
            byProduct("powellite", "scheelite", "rhenium", "wulfenite", "osmium_elemental")
        }

        composition {
            formula = "Mo"
        }

        meta {
            numericId           = 420
            hashId              = 121
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            alloyRef("ultimet")
            alloyRef("hssg")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.CHROMIUM_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Tungsten = material("tungsten") {
        appearance {
            color       = Rgba(50, 50, 50, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 74
            electrons    = 74
            neutrons     = 109
            mass         = 183L
            density      = 19.25
            meltingPoint = 3695L
            boilingPoint = 5828L
            plasmaPoint  = 582800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 5120L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "scheelite" amount 648648000L
            reversingTarget        = ref("any_tungsten")
        }

        composition {
            formula = "W"
        }

        meta {
            numericId           = 740
            hashId              = 158
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Tutamen - 1")
            reRegisteredTo("wolfram")
            reRegisteredTo("eln_tungsten")
            reRegisteredTo("any_tungsten")
            reRegisteredTo("wolframium")
            alloyRef("tungstensteel")
            alloyRef("tungsten_carbide")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.CHROMIUM_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.NEVER_FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Hafnium = material("hafnium") {
        appearance {
            color       = Rgba(140, 140, 150, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 72
            electrons    = 72
            neutrons     = 106
            mass         = 178L
            density      = 13.31
            meltingPoint = 2506L
            boilingPoint = 4876L
            plasmaPoint  = 487600L
            hasMetallum  = true
        }

        processing {
            byProduct("zircon")
        }

        composition {
            formula = "Hf"
        }

        meta {
            numericId           = 720
            hashId              = 155
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            alloyRef("tantalum_hafnium_carbide")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Atomic.TITANIUM_GROUP,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Zirconium = material("zirconium") {
        appearance {
            color       = Rgba(200, 255, 255, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 40
            electrons    = 40
            neutrons     = 51
            mass         = 91L
            density      = 6.506
            meltingPoint = 2128L
            boilingPoint = 4682L
            plasmaPoint  = 468200L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("rutile", "hafnium")
        }

        composition {
            formula = "Zr"
        }

        meta {
            numericId           = 400
            hashId              = 118
            originalMod         = "tropicraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Vitreus - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.TRANSPARENT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.TITANIUM_GROUP,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.LENSES,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Niobium = material("niobium") {
        appearance {
            color       = Rgba(190, 180, 200, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 41
            electrons    = 41
            neutrons     = 53
            mass         = 94L
            density      = 8.57
            meltingPoint = 2750L
            boilingPoint = 5017L
            plasmaPoint  = 501700L
            hasMetallum  = true
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "columbite" amount 648648000L
        }

        composition {
            formula = "Nb"
        }

        meta {
            numericId           = 410
            hashId              = 119
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ignis - 1")
            reRegisteredTo("columbium")
            alloyRef("desh")
            alloyRef("niobium_titanium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.VANADIUM_GROUP,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Chromium = material("chromium") {
        appearance {
            color       = Rgba(255, 230, 230, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 28
            mass         = 52L
            density      = 7.15
            meltingPoint = 2180L
            boilingPoint = 2944L
            plasmaPoint  = 294400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 11.0f
        }

        processing {
            byProduct("chromite", "hematite", "magnesium_carbonate")
        }

        composition {
            formula = "Cr"
        }

        meta {
            numericId           = 240
            hashId              = 98
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Machina - 1")
            reRegisteredTo("chrome")
            alloyRef("stainless_steel")
            alloyRef("ultimet")
            alloyRef("hssg")
            alloyRef("nichrome")
            alloyRef("kanthal")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_FIRESTONE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Atomic.TRANSITION_METAL,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.CHROMIUM_GROUP,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.REFRACTORY_METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
