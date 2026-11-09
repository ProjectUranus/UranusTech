package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: IcosagenMaterials
@Suppress("unused") object IcosagenMaterials {
    fun init() = Unit

    val Boron11 = material("boron11") {
        name = "Boron-11"

        appearance {
            color       = Rgba(240, 240, 240, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 5
            electrons    = 5
            neutrons     = 6
            mass         = 11L
            density      = 2.34
            meltingPoint = 2349L
            boilingPoint = 4200L
            plasmaPoint  = 420000L
            hasMetallum  = true
        }

        composition {
            formula = "B-11"
        }

        meta {
            numericId           = 51
            hashId              = 72
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Vitreus - 1")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ICOSAGEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Gallium = material("gallium") {
        appearance {
            color       = Rgba(220, 220, 255, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 31
            electrons    = 31
            neutrons     = 39
            mass         = 70L
            density      = 5.907
            meltingPoint = 302L
            boilingPoint = 2477L
            plasmaPoint  = 247700L
            hasMetallum  = true
        }

        processing {
            byProduct("zinc", "selenium")
        }

        composition {
            formula = "Ga"
        }

        meta {
            numericId           = 310
            hashId              = 108
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Electrum - 1")
            alloyRef("vanadium_gallium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Atomic.ICOSAGEN,
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

    val Boron = material("boron") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 5
            electrons    = 5
            neutrons     = 5
            mass         = 10L
            density      = 2.34
            meltingPoint = 2349L
            boilingPoint = 4200L
            plasmaPoint  = 420000L
            hasMetallum  = true
        }

        composition {
            formula = "B"
        }

        meta {
            numericId           = 50
            hashId              = 71
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Vitreus - 1")
            aspect("Electrum - 1")
            alloyRef("desh")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ICOSAGEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Atomic.METALLOID,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Indium = material("indium") {
        appearance {
            color       = Rgba(64, 0, 128, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 49
            electrons    = 49
            neutrons     = 65
            mass         = 114L
            density      = 7.31
            meltingPoint = 429L
            boilingPoint = 2345L
            plasmaPoint  = 234500L
            hasMetallum  = true
        }

        processing {
            byProduct("selenium")
        }

        composition {
            formula = "In"
        }

        meta {
            numericId           = 490
            hashId              = 129
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            alloyRef("cd_in_ag_alloy")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ICOSAGEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Aluminium = material("aluminium") {
        appearance {
            color       = Rgba(128, 200, 240, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 13
            mass         = 26L
            density      = 2.698
            meltingPoint = 933L
            boilingPoint = 2792L
            plasmaPoint  = 279200L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 2
            durability = 128L
            speed      = 10.0f
        }

        processing {
            oreMultiplier           = 2
            crushingTarget        = "alumina" amount 648648000L
        }

        composition {
            formula = "Al"
        }

        meta {
            numericId           = 130
            hashId              = 83
            originalMod         = "TConstruct"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Volatus - 1")
            reRegisteredTo("aluminum")
            alloyRef("magnalium")
            alloyRef("alumite")
            alloyRef("titanium_aluminide")
            alloyRef("cobalt_brass")
            alloyRef("aluminium_brass")
            alloyRef("kanthal")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Properties.SOFT,
            MaterialTag.Atomic.POST_TRANSITION_METAL,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Atomic.ICOSAGEN,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.FUSION_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
