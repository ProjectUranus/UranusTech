package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: AlloyMaterials
@Suppress("unused") object AlloyMaterials {
    fun init() = Unit

    val MeteoflameBlueSteel = material("meteoflame_blue_steel") {
        name = "Meteoflame Blue Steel"

        appearance {
            color       = Rgba(95, 95, 135, 255)
            iconSet     = IconSet.FIERY
        }

        physics {
            protons      = 31
            electrons    = 31
            neutrons     = 38
            mass         = 68L
            density      = 8.724785
            meltingPoint = 2877L
            boilingPoint = 3577L
            plasmaPoint  = 357700L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1408L
            speed      = 13.0f
        }

        processing {
            generifyingTarget      = "meteoric_blue_steel" amount 648648000L
        }

        composition {
            formula = "((CuAg₄)(Bi(Cu₃Zn))Fe₂(Ni(Cu₃(AgAu))Fe₃)₄,₅)Ma"
            component("meteoric_blue_steel", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8695
            hashId              = 1264
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_blaze")
            aspect("Metallum - 2")
            aspect("Ignis - 3")
            aspect("Praecantio - 1")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_blue_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val NikolineAlloy = material("nikoline_alloy") {
        name = "Nikoline Alloy"

        appearance {
            color       = Rgba(50, 90, 140, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 2.3296
            meltingPoint = 1593L
            boilingPoint = 3269L
            plasmaPoint  = 326900L
            hasMetallum  = true
        }

        composition {
            formula = "Si(((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₅,₁₁Cu₃(SiO₂)Ar)"
            component("silicon", 648648000L)
            component("nikolite", 648648000L)
        }

        meta {
            numericId           = 8737
            hashId              = 1237
            originalMod         = "Redpower"
            hidden              = true
            priorityPrefixIndex = 5
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Potentia - 1")
            reRegisteredTo("teslatine_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val GoldInductive = material("gold_inductive") {
        name = "Inductive Alloy"

        appearance {
            color       = Rgba(255, 150, 75, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 57
            electrons    = 57
            neutrons     = 82
            mass         = 140L
            density      = 12.81516669
            meltingPoint = 918L
            boilingPoint = 2314L
            plasmaPoint  = 231450L
            hasMetallum  = true
        }

        composition {
            formula = "Au((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))"
            component("gold", 324324000L)
            component("redstone", 324324000L)
        }

        meta {
            numericId           = 8604
            hashId              = 1185
            originalMod         = "RotaryCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            alloyRef("energetic_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ElectrotineAlloy = material("electrotine_alloy") {
        name = "Electrotine Alloy"

        appearance {
            color       = Rgba(100, 180, 255, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 1400L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
        }

        composition {
            formula = "Fe(((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₅,₁₁Cu₃(SiO₂)Ar)₈,₁₀"
            component("wrought_iron", 648648000L)
            component("nikolite", 5189184000L)
        }

        meta {
            numericId           = 8658
            hashId              = 1239
            originalMod         = "ProjRed|Core"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Electrum - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Signalum = material("signalum") {
        appearance {
            color       = Rgba(255, 64, 0, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 33
            electrons    = 33
            neutrons     = 40
            mass         = 74L
            density      = 9.34525
            meltingPoint = 1353L
            boilingPoint = 2735L
            plasmaPoint  = 273500L
            hasMetallum  = true
        }

        composition {
            formula = "CuAg₂(Cu((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₄,₁₀)₅"
            component("copper", 81081000L)
            component("silver", 162162000L)
            component("red_alloy", 405405000L)
        }

        meta {
            numericId           = 8708
            hashId              = 1286
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlackBronze = material("black_bronze") {
        name = "Black Bronze"

        appearance {
            color       = Rgba(100, 50, 125, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 42
            electrons    = 42
            neutrons     = 55
            mass         = 98L
            density      = 11.3326
            meltingPoint = 1328L
            boilingPoint = 2813L
            plasmaPoint  = 281380L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 12.0f
        }

        composition {
            formula = "Cu₃(AgAu)"
            component("copper", 389188800L)
            component("electrum", 259459200L)
        }

        meta {
            numericId           = 8611
            hashId              = 1192
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            alloyRef("meteoric_black_steel")
            alloyRef("black_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val FlamascusSteel = material("flamascus_steel") {
        name = "Flamascus Steel"

        appearance {
            color       = Rgba(110, 110, 110, 255)
            iconSet     = IconSet.FIERY
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 32
            mass         = 59L
            density      = 8.3812
            meltingPoint = 2996L
            boilingPoint = 3696L
            plasmaPoint  = 369600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1280L
            speed      = 12.0f
        }

        processing {
            generifyingTarget      = "damascus_steel" amount 648648000L
        }

        composition {
            formula = "(Fe₅₀VW)Ma"
            component("damascus_steel", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8697
            hashId              = 1266
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_blaze")
            aspect("Metallum - 2")
            aspect("Ignis - 3")
            aspect("Praecantio - 1")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            aspect("Telum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val NiflheimPower = material("niflheim_power") {
        name = "Niflheim Power"

        appearance {
            color       = Rgba(94, 94, 174, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 54
            mass         = 102L
            density      = 11.404
            meltingPoint = 2811L
            boilingPoint = 5134L
            plasmaPoint  = 513400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2048L
            speed      = 18.0f
        }

        composition {
            formula = "(Elementium)(C₄Ma₂)"
            component("elvorium", 648648000L)
        }

        meta {
            numericId           = 8741
            hashId              = 1326
            originalMod         = "alfheim"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Gelum - 2")
            aspect("Potentia - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlackSteel = material("black_steel") {
        name = "Black Steel"

        appearance {
            color       = Rgba(90, 90, 90, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 35
            mass         = 64L
            density      = 8.77332
            meltingPoint = 1838L
            boilingPoint = 3080L
            plasmaPoint  = 308036L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 768L
            speed      = 6.5f
        }

        composition {
            formula = "Ni(Cu₃(AgAu))Fe₃"
            component("nickel", 129729600L)
            component("black_bronze", 129729600L)
            component("steel", 389188800L)
        }

        meta {
            numericId           = 8631
            hashId              = 1198
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_black_steel")
            alloyRef("red_steel")
            alloyRef("blue_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MelodicAlloy = material("melodic_alloy") {
        name = "Melodic Alloy"

        appearance {
            color       = Rgba(138, 92, 138, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 87
            electrons    = 87
            neutrons     = 94
            mass         = 180L
            density      = 13.31001266
            meltingPoint = 2372L
            boilingPoint = 4412L
            plasmaPoint  = 441233L
            hasMetallum  = true
        }

        composition {
            formula = "((Endstone)(Fe(MgFe(SiO₂)₂O₄)₉,₆₄)(MgFe(SiO₂)₂O₄)₉,₆₄)((BeK₄N₅Ma₆)₉,₁₀(Blaze))"
            component("end_steel", 648648000L)
            component("ender_eye", 648648000L)
        }

        meta {
            numericId           = 8809
            hashId              = 1311
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Sensus - 1")
            alloyRef("stellar_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ShadowSteel = material("shadow_steel") {
        name = "Shadow Steel"

        appearance {
            color       = Rgba(136, 115, 98, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 19
            electrons    = 19
            neutrons     = 21
            mass         = 40L
            density      = 4.806
            meltingPoint = 1595L
            boilingPoint = 2746L
            plasmaPoint  = 274600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 768L
            speed      = 6.0f
        }

        composition {
            formula = "(Shadow Iron)(Lemurite)"
            component("shadow_iron", 324324000L)
            component("lemurite", 324324000L)
        }

        meta {
            numericId           = 8671
            hashId              = 1174
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tenebrae - 1")
            aspect("Telum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedAlloy = material("red_alloy") {
        name = "Red Alloy"

        appearance {
            color       = Rgba(200, 0, 0, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.96
            meltingPoint = 1400L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
        }

        composition {
            formula = "Cu((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₄,₁₀"
            component("copper", 648648000L)
            component("redstone", 2594592000L)
        }

        meta {
            numericId           = 8660
            hashId              = 1232
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 3")
            alloyRef("purple_alloy")
            alloyRef("signalum")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ArsenicBronze = material("arsenic_bronze") {
        name = "Arsenic Bronze"

        appearance {
            color       = Rgba(200, 200, 222, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 33
            electrons    = 33
            neutrons     = 42
            mass         = 75L
            density      = 7.9886
            meltingPoint = 1070L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 480L
            speed      = 6.0f
        }

        composition {
            formula = "As(Cu₃Sn)"
            component("arsenic", 129729600L)
            component("bronze", 518918400L)
        }

        meta {
            numericId           = 8615
            hashId              = 1196
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Venemum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeteoflameRedSteel = material("meteoflame_red_steel") {
        name = "Meteoflame Red Steel"

        appearance {
            color       = Rgba(135, 95, 95, 255)
            iconSet     = IconSet.FIERY
        }

        physics {
            protons      = 33
            electrons    = 33
            neutrons     = 41
            mass         = 74L
            density      = 9.5702975
            meltingPoint = 2971L
            boilingPoint = 3671L
            plasmaPoint  = 367100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1536L
            speed      = 14.0f
        }

        processing {
            generifyingTarget      = "meteoric_red_steel" amount 648648000L
        }

        composition {
            formula = "((CuAu₄)(Cu₃Zn)Fe₂(Ni(Cu₃(AgAu))Fe₃)₄,₅)Ma"
            component("meteoric_red_steel", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8696
            hashId              = 1265
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_blaze")
            aspect("Metallum - 2")
            aspect("Ignis - 3")
            aspect("Praecantio - 1")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_red_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Mingrade = material("mingrade") {
        name = "Red Copper"

        appearance {
            color       = Rgba(255, 80, 20, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 41
            mass         = 73L
            density      = 7.654166692
            meltingPoint = 1400L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
        }

        composition {
            formula = "Cu((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))"
            component("copper", 324324000L)
            component("redstone", 324324000L)
        }

        meta {
            numericId           = 8804
            hashId              = 1235
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 2")
            alloyRef("red_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ElectrumFlux = material("electrum_flux") {
        name = "Electrum Flux"

        appearance {
            color       = Rgba(255, 255, 120, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 63
            electrons    = 63
            neutrons     = 88
            mass         = 151L
            density      = 14.8915
            meltingPoint = 761L
            boilingPoint = 1927L
            plasmaPoint  = 192733L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 14.0f
        }

        composition {
            formula = "(AgAu)((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₂,₁₀"
            component("electrum", 648648000L)
            component("redstone", 1297296000L)
        }

        meta {
            numericId           = 8711
            hashId              = 1240
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Permutatio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TitaniumIridium = material("titanium_iridium") {
        name = "Iritanium"

        appearance {
            color       = Rgba(220, 220, 255, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 49
            electrons    = 49
            neutrons     = 70
            mass         = 120L
            density      = 13.55
            meltingPoint = 2330L
            boilingPoint = 4130L
            plasmaPoint  = 413050L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 7680L
            speed      = 8.0f
        }

        composition {
            formula = "IrTi"
            component("iridium", 324324000L)
            component("titanium", 324324000L)
        }

        meta {
            numericId           = 8793
            hashId              = 1361
            originalMod         = "advancedRocketry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 1")
            aspect("Machina - 1")
            reRegisteredTo("iritanium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Amordrine = material("amordrine") {
        appearance {
            color       = Rgba(169, 141, 177, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 54
            electrons    = 54
            neutrons     = 78
            mass         = 132L
            density      = 12.28612257
            meltingPoint = 1997L
            boilingPoint = 4315L
            plasmaPoint  = 431550L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 3328L
            speed      = 7.0f
        }

        composition {
            formula = "(Pm₃O₄)(Kalendrite)"
            component("prometheum", 324324000L)
            component("kalendrite", 324324000L)
        }

        meta {
            numericId           = 8783
            hashId              = 1179
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Desh = material("desh") {
        appearance {
            color       = Rgba(40, 40, 40, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 34
            electrons    = 34
            neutrons     = 47
            mass         = 82L
            density      = 5.412333333
            meltingPoint = 1540L
            boilingPoint = 3634L
            plasmaPoint  = 363488L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 4.0f
        }

        processing {
            byProduct("dolamide", "duranium_hexaiodide", "duranium_hexachloride", "duranium_hexaastatide", "columbite", "cobaltite", "monazite", "lithium_chloride")
        }

        composition {
            formula = "B₂La₂NdNbCoCeLi"
            component("boron", 144144000L)
            component("lanthanium", 144144000L)
            component("neodymium", 72072000L)
            component("niobium", 72072000L)
            component("cobalt", 72072000L)
            component("cerium", 72072000L)
            component("lithium", 72072000L)
        }

        meta {
            numericId           = 8750
            hashId              = 1334
            originalMod         = "GalacticraftCore"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            aspect("Metallum - 2")
            aspect("Alienis - 1")
            aspect("Telum - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Mithril = material("mithril") {
        appearance {
            color       = Rgba(100, 140, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 78
            electrons    = 78
            neutrons     = 117
            mass         = 194L
            density      = 21.46
            meltingPoint = 2041L
            boilingPoint = 4098L
            plasmaPoint  = 409800L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 14.0f
        }

        processing {
            byProduct("platinum")
            generifyingTarget      = "platinum" amount 648648000L
        }

        composition {
            formula = "Pt₂Ma"
            component("platinum", 648648000L)
            component("magic", 324324000L)
        }

        meta {
            numericId           = 8678
            hashId              = 1171
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 3")
            aspect("Praecantio - 1")
            reRegisteredTo("mythril")
            alloyRef("haderoth")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val MeteoricBlueSteel = material("meteoric_blue_steel") {
        name = "Meteoric Blue Steel"

        appearance {
            color       = Rgba(95, 95, 135, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 31
            electrons    = 31
            neutrons     = 38
            mass         = 69L
            density      = 8.724785
            meltingPoint = 1827L
            boilingPoint = 3077L
            plasmaPoint  = 307748L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1408L
            speed      = 8.5f
        }

        processing {
            generifyingTarget      = "blue_steel" amount 648648000L
        }

        composition {
            formula = "(CuAg₄)(Bi(Cu₃Zn))Fe₂(Ni(Cu₃(AgAu))Fe₃)₄,₅"
            component("sterling_silver", 81081000L)
            component("bismuth_bronze", 81081000L)
            component("meteoric_steel", 162162000L)
            component("meteoric_black_steel", 324324000L)
        }

        meta {
            numericId           = 8691
            hashId              = 1230
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_blue_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
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

    val ObsidianRefined = material("obsidian_refined") {
        name = "Refined Obsidian"

        appearance {
            color       = Rgba(120, 90, 140, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 26
            mass         = 52L
            density      = 3.753166125
            meltingPoint = 2750L
            boilingPoint = 4150L
            plasmaPoint  = 415000L
        }

        fluids {
            solidifyingTarget = "obsidian" amount 648648000L
            smeltingTarget    = "lava" amount 648648000L
        }

        tool {
            types      = 2
            quality    = 3
            durability = 512L
            speed      = 8.0f
        }

        processing {
            pulverTarget          = "obsidian" amount 648648000L
            smashingTarget        = "obsidian" amount 648648000L
            cuttingTarget         = "obsidian" amount 648648000L
            workingTarget         = "obsidian" amount 648648000L
            forgingTarget         = "obsidian" amount 648648000L
            burningTarget         = "obsidian" amount 0L
            bendingTarget         = "obsidian" amount 648648000L
            compressingTarget     = "obsidian" amount 648648000L
        }

        composition {
            formula = "(MgFe(SiO₂)₂O₄)(C₄)"
            component("obsidian", 648648000L)
            component("diamond", 648648000L)
        }

        meta {
            numericId           = 8714
            hashId              = 1291
            originalMod         = "Mekanism"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 4")
            aspect("Ignis - 4")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedstoneAlloy = material("redstone_alloy") {
        name = "Redstone Alloy"

        appearance {
            color       = Rgba(140, 50, 50, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 2.3296
            meltingPoint = 1093L
            boilingPoint = 2519L
            plasmaPoint  = 251900L
            hasMetallum  = true
        }

        composition {
            formula = "Si((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))"
            component("silicon", 648648000L)
            component("redstone", 648648000L)
        }

        meta {
            numericId           = 8733
            hashId              = 1236
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            priorityPrefixIndex = 5
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Machina - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ObsidianSteel = material("obsidian_steel") {
        name = "Obsidian Steel"

        appearance {
            color       = Rgba(60, 60, 60, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 44
            electrons    = 44
            neutrons     = 48
            mass         = 92L
            density      = 9.882495125
            meltingPoint = 1374L
            boilingPoint = 3913L
            plasmaPoint  = 391340L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "Fe(MgFe(SiO₂)₂O₄)₉,₆₄"
            component("steel", 648648000L)
            component("obsidian", 5837832000L)
        }

        meta {
            numericId           = 8731
            hashId              = 1298
            originalMod         = "Techguns"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Tenebrae - 1")
            reRegisteredTo("dark_steel")
            alloyRef("end_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlueAlloy = material("blue_alloy") {
        name = "Blue Alloy"

        appearance {
            color       = Rgba(100, 180, 255, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 47
            electrons    = 47
            neutrons     = 60
            mass         = 107L
            density      = 10.501
            meltingPoint = 1400L
            boilingPoint = 2435L
            plasmaPoint  = 243500L
        }

        composition {
            formula = "Ag(((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₅,₁₁Cu₃(SiO₂)Ar)₄,₁₀"
            component("silver", 648648000L)
            component("nikolite", 2594592000L)
        }

        meta {
            numericId           = 8659
            hashId              = 1233
            originalMod         = "Redpower"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Electrum - 3")
            alloyRef("purple_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Midasium = material("midasium") {
        appearance {
            color       = Rgba(255, 200, 40, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 79
            electrons    = 79
            neutrons     = 117
            mass         = 195L
            density      = 19.282
            meltingPoint = 1337L
            boilingPoint = 3129L
            plasmaPoint  = 312900L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 12.0f
        }

        processing {
            byProduct("gold")
            generifyingTarget      = "gold" amount 648648000L
        }

        composition {
            formula = "Au₂Ma"
            component("gold", 648648000L)
            component("magic", 324324000L)
        }

        meta {
            numericId           = 8677
            hashId              = 1170
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 2")
            aspect("Praecantio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val BlueSteel = material("blue_steel") {
        name = "Blue Steel"

        appearance {
            color       = Rgba(100, 100, 140, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 31
            electrons    = 31
            neutrons     = 38
            mass         = 69L
            density      = 8.724785
            meltingPoint = 1717L
            boilingPoint = 2967L
            plasmaPoint  = 296748L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 896L
            speed      = 7.0f
        }

        composition {
            formula = "(CuAg₄)(Bi(Cu₃Zn))Fe₂(Ni(Cu₃(AgAu))Fe₃)₄,₅"
            component("sterling_silver", 81081000L)
            component("bismuth_bronze", 81081000L)
            component("steel", 162162000L)
            component("black_steel", 324324000L)
        }

        meta {
            numericId           = 8632
            hashId              = 1199
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_blue_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WorkersAlloy = material("workers_alloy") {
        name = "Workers Alloy"

        appearance {
            color       = Rgba(216, 42, 42, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 54
            electrons    = 54
            neutrons     = 77
            mass         = 132L
            density      = 8.795733333
            meltingPoint = 1328L
            boilingPoint = 3033L
            plasmaPoint  = 303370L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 2560L
            speed      = 7.0f
        }

        composition {
            formula = "(B₂La₂NdNbCoCeLi)₄,₉Hg"
            component("desh", 648648000L)
            component("mercury", 162162000L)
        }

        meta {
            numericId           = 8780
            hashId              = 1335
            originalMod         = "hbm"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 1")
            aspect("Telum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AluminiumAlloy = material("aluminium_alloy") {
        name = "Aluminium Alloy"

        appearance {
            color       = Rgba(200, 200, 180, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 13
            mass         = 26L
            density      = 2.749768889
            meltingPoint = 949L
            boilingPoint = 2808L
            plasmaPoint  = 280821L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 2
            durability = 128L
            speed      = 10.0f
        }

        composition {
            formula = "Al₄₅Si"
            component("aluminium", 648648000L)
            component("silicon", 14414400L)
        }

        meta {
            numericId           = 8622
            hashId              = 1190
            originalMod         = "RotaryCraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Fabrico - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Manyullyn = material("manyullyn") {
        appearance {
            color       = Rgba(175, 100, 175, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 43
            mass         = 78L
            density      = 4.93
            meltingPoint = 1384L
            boilingPoint = 3100L
            plasmaPoint  = 165000L
        }

        tool {
            types      = 2
            quality    = 3
            durability = 96L
            speed      = 2.0f
        }

        composition {
            formula = "Co(Ardite)"
            component("cobalt", 324324000L)
            component("ardite", 324324000L)
        }

        meta {
            numericId           = 8703
            hashId              = 1282
            originalMod         = "TConstruct"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Strontio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Duralumin = material("duralumin") {
        appearance {
            color       = Rgba(255, 255, 220, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 23
            mass         = 44L
            density      = 5.829
            meltingPoint = 1145L
            boilingPoint = 2813L
            plasmaPoint  = 281350L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 10.0f
        }

        composition {
            formula = "AlCu"
            component("aluminium", 324324000L)
            component("copper", 324324000L)
        }

        meta {
            numericId           = 8756
            hashId              = 1341
            originalMod         = "GalaxySpace"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Permutatio - 1")
            aspect("Volatus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Osmiridium = material("osmiridium") {
        appearance {
            color       = Rgba(100, 100, 255, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 76
            electrons    = 76
            neutrons     = 114
            mass         = 191L
            density      = 22.585
            meltingPoint = 3012L
            boilingPoint = 4993L
            plasmaPoint  = 499300L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 3840L
            speed      = 11.0f
        }

        composition {
            formula = "OsIr"
            component("osmium_elemental", 324324000L)
            component("iridium", 324324000L)
        }

        meta {
            numericId           = 8682
            hashId              = 1271
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Machina - 2")
            aspect("Nebrisum - 1")
            alloyRef("hsss")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Manasteel = material("manasteel") {
        appearance {
            color       = Rgba(110, 200, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2311L
            boilingPoint = 4134L
            plasmaPoint  = 413400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 12.0f
        }

        processing {
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "FeMa"
            component("iron", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8720
            hashId              = 1317
            originalMod         = "Botania"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Praecantio - 2")
            reRegisteredTo("any_magic_iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Sunnarium = material("sunnarium") {
        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = 8683
            hashId              = 1272
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Desichalkos = material("desichalkos") {
        appearance {
            color       = Rgba(114, 47, 168, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 8.176
            meltingPoint = 2297L
            boilingPoint = 4595L
            plasmaPoint  = 459500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 4608L
            speed      = 11.0f
        }

        composition {
            formula = "(Eximite)(Meutoite)"
            component("eximite", 324324000L)
            component("meutoite", 324324000L)
        }

        meta {
            numericId           = 8781
            hashId              = 1177
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Iter - 1")
            aspect("Alienis - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HSLASteel = material("hsla_steel") {
        name = "HSLA-Steel"

        appearance {
            colorSolid  = Rgba(210, 210, 255, 255)
            colorLiquid = Rgba(180, 80, 30, 255)
            colorGas    = Rgba(210, 210, 255, 255)
            colorPlasma = Rgba(210, 210, 255, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 1873L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "Fe"
            component("wrought_iron", 324324000L)
        }

        meta {
            numericId           = 8637
            hashId              = 1210
            originalMod         = "RotaryCraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            reRegisteredTo("hsla")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ArsenicCopper = material("arsenic_copper") {
        name = "Arsenic Copper"

        appearance {
            color       = Rgba(210, 160, 60, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 30
            electrons    = 30
            neutrons     = 36
            mass         = 66L
            density      = 8.164
            meltingPoint = 1070L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 448L
            speed      = 5.5f
        }

        composition {
            formula = "Cu₃As"
            component("copper", 486486000L)
            component("arsenic", 162162000L)
        }

        meta {
            numericId           = 8614
            hashId              = 1195
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Venemum - 1")
            alloyRef("arsenic_bronze")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnnealedCopper = material("annealed_copper") {
        name = "Annealed Copper"

        appearance {
            color       = Rgba(255, 100, 0, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.96
            meltingPoint = 2800L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 0
            durability = 64L
            speed      = 4.0f
        }

        processing {
            pulverTarget          = "copper" amount 648648000L
            generifyingTarget      = "copper" amount 648648000L
        }

        composition {
            formula = "Cu"
            component("copper", 648648000L)
        }

        meta {
            numericId           = 8640
            hashId              = 1145
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Permutatio - 1")
            reRegisteredTo("any_copper")
            alloyRef("red_alloy")
            alloyRef("brass")
            alloyRef("signalum")
            alloyRef("bronze")
            alloyRef("black_bronze")
            alloyRef("arsenic_copper")
            alloyRef("yttrium_barium_cuprate")
            alloyRef("constantan")
            alloyRef("sterling_silver")
            alloyRef("rose_gold")
            alloyRef("aluminium_brass")
        }

        tags(
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val IronCompressed = material("iron_compressed") {
        name = "Compressed Iron"

        appearance {
            color       = Rgba(128, 128, 128, 255)
            iconSet     = IconSet.METALLIC
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
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8644
            hashId              = 1215
            originalMod         = "PneumaticCraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Terra - 1")
            reRegisteredTo("any_iron")
            reRegisteredTo("any_iron_or_steel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Duranium = material("duranium") {
        name = "Duranium Alloy"

        appearance {
            color       = Rgba(75, 175, 175, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 128
            electrons    = 128
            neutrons     = 167
            mass         = 296L
            density      = 17.71725
            meltingPoint = 1165L
            boilingPoint = 2350L
            plasmaPoint  = 235000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            byProduct("tritanium_dioxide", "trinium")
        }

        composition {
            formula = "Dn₇Mg"
            component("duranium_elemental", 567567000L)
            component("magnesium", 81081000L)
        }

        meta {
            numericId           = 8751
            hashId              = 1336
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CastIron = material("cast_iron") {
        name = "Cast Iron"

        appearance {
            color       = Rgba(64, 64, 64, 255)
            iconSet     = IconSet.METALLIC
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

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "iron" amount 648648000L
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8803
            hashId              = 1216
            originalMod         = "steamcraft2"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Terra - 1")
            reRegisteredTo("any_iron")
            reRegisteredTo("any_iron_or_steel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Haderoth = material("haderoth") {
        appearance {
            color       = Rgba(119, 52, 30, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 76
            electrons    = 76
            neutrons     = 113
            mass         = 188L
            density      = 20.355
            meltingPoint = 1944L
            boilingPoint = 3896L
            plasmaPoint  = 389600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 3200L
            speed      = 10.0f
        }

        composition {
            formula = "(Pt₂Ma)(Rubracium)"
            component("mithril", 324324000L)
            component("rubracium", 324324000L)
        }

        meta {
            numericId           = 8778
            hashId              = 1176
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            aspect("Praecantio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TantalumHafniumCarbide = material("tantalum_hafnium_carbide") {
        name = "Tantalum Hafnium Carbide"

        appearance {
            color       = Rgba(32, 128, 32, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 39
            electrons    = 39
            neutrons     = 56
            mass         = 95L
            density      = 9.1261
            meltingPoint = 4263L
            boilingPoint = 8526L
            plasmaPoint  = 852600L
            hasMetallum  = true
        }

        tool {
            types      = 0
            quality    = 2
            durability = 1L
            speed      = 1.0f
        }

        composition {
            formula = "Ta₄HfC₅"
            component("tantalum", 259459200L)
            component("hafnium", 64864800L)
            component("carbon", 324324000L)
        }

        meta {
            numericId           = 8802
            hashId              = 1226
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Gelum - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Steel = material("steel") {
        appearance {
            colorSolid  = Rgba(130, 130, 130, 255)
            colorLiquid = Rgba(255, 20, 10, 255)
            colorGas    = Rgba(130, 130, 130, 255)
            colorPlasma = Rgba(130, 130, 130, 255)
            iconSet     = IconSet.METALLIC
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

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 6.0f
        }

        processing {
            byProduct("hematite")
            reversingTarget        = ref("any_iron_steel")
        }

        composition {
            formula = "Fe"
            component("wrought_iron", 648648000L)
        }

        meta {
            numericId           = 8630
            hashId              = 1197
            originalMod         = "Railcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            reRegisteredTo("any_iron_or_steel")
            reRegisteredTo("any_iron_steel")
            alloyRef("red_steel")
            alloyRef("obsidian_steel")
            alloyRef("vanadium_steel")
            alloyRef("tungstensteel")
            alloyRef("vibranium_steel")
            alloyRef("electrical_steel")
            alloyRef("black_steel")
            alloyRef("blue_steel")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.NEVER_FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val RoseGold = material("rose_gold") {
        name = "Rose Gold"

        appearance {
            color       = Rgba(255, 230, 30, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 69
            electrons    = 69
            neutrons     = 100
            mass         = 169L
            density      = 17.2176
            meltingPoint = 1341L
            boilingPoint = 3070L
            plasmaPoint  = 307020L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 14.0f
        }

        composition {
            formula = "CuAu₄"
            component("copper", 129729600L)
            component("gold", 518918400L)
        }

        meta {
            numericId           = 8602
            hashId              = 1182
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 2")
            reRegisteredTo("tumbaga")
            alloyRef("red_steel")
            alloyRef("black_bronze")
            alloyRef("hepatizon")
            alloyRef("meteoric_red_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CrystallineAlloy = material("crystalline_alloy") {
        name = "Crystalline Alloy"

        appearance {
            color       = Rgba(109, 169, 169, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            hasMetallum  = true
        }

        meta {
            numericId           = 8812
            hashId              = 1314
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Vitreus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PulsatingIron = material("pulsating_iron") {
        name = "Pulsating Iron"

        appearance {
            color       = Rgba(100, 160, 110, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 37
            electrons    = 37
            neutrons     = 42
            mass         = 78L
            density      = 8.4044253
            meltingPoint = 2367L
            boilingPoint = 3459L
            plasmaPoint  = 345950L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 6.0f
        }

        composition {
            formula = "Fe(BeK₄N₅Ma₆)"
            component("wrought_iron", 648648000L)
            component("ender_pearl", 648648000L)
        }

        meta {
            numericId           = 8725
            hashId              = 1300
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Alienis - 1")
            reRegisteredTo("phased_iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VanadiumGallium = material("vanadium_gallium") {
        name = "Vanadium-Gallium"

        appearance {
            color       = Rgba(128, 128, 140, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 30
            mass         = 55L
            density      = 6.05925
            meltingPoint = 1712L
            boilingPoint = 3379L
            plasmaPoint  = 337925L
        }

        composition {
            formula = "V₃Ga"
            component("vanadium", 486486000L)
            component("gallium", 162162000L)
        }

        meta {
            numericId           = 8686
            hashId              = 1274
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val StellarAlloy = material("stellar_alloy") {
        name = "Stellar Alloy"

        appearance {
            color       = Rgba(170, 181, 164, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 85
            electrons    = 85
            neutrons     = 94
            mass         = 181L
            density      = 9.791686219
            meltingPoint = 2378L
            boilingPoint = 4256L
            plasmaPoint  = 425655L
            hasMetallum  = true
        }

        composition {
            formula = "(((Endstone)(Fe(MgFe(SiO₂)₂O₄)₉,₆₄)(MgFe(SiO₂)₂O₄)₉,₆₄)((BeK₄N₅Ma₆)₉,₁₀(Blaze)))(Nether Star)(((Al₂O₃)(SiO₂)₄)₂,₁₈(H₂O))₂"
            component("melodic_alloy", 324324000L)
            component("nether_star", 324324000L)
            component("clay", 1297296000L)
        }

        meta {
            numericId           = 8810
            hashId              = 1312
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Auram - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val YttriumBariumCuprate = material("yttrium_barium_cuprate") {
        name = "Yttrium-Barium-Cuprate"

        appearance {
            color       = Rgba(80, 64, 70, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 49
            electrons    = 49
            neutrons     = 61
            mass         = 110L
            density      = 6.4245005
            meltingPoint = 1200L
            boilingPoint = 2400L
            plasmaPoint  = 240000L
        }

        composition {
            formula = "YBa₂Cu₃O₇"
            component("yttrium", 108108000L)
            component("barium", 216216000L)
            component("copper", 324324000L)
            component("oxygen", 756756000L)
        }

        meta {
            numericId           = 8687
            hashId              = 1275
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.LAYERED,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Enderium = material("enderium") {
        appearance {
            color       = Rgba(60, 125, 115, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 67
            electrons    = 67
            neutrons     = 90
            mass         = 156L
            density      = 12.1641753
            meltingPoint = 1897L
            boilingPoint = 3427L
            plasmaPoint  = 342787L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 8.0f
        }

        composition {
            formula = "(Sn₂AgPt)(BeK₄N₅Ma₆)"
            component("enderium_base", 648648000L)
            component("ender_pearl", 648648000L)
        }

        meta {
            numericId           = 8710
            hashId              = 1289
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Alienis - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val DarkThaumium = material("dark_thaumium") {
        name = "Dark Thaumium"

        appearance {
            color       = Rgba(100, 75, 75, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 2311L
            boilingPoint = 4134L
            plasmaPoint  = 413400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 12.0f
        }

        processing {
            generifyingTarget      = "thaumium" amount 648648000L
        }

        meta {
            numericId           = 8680
            hashId              = 1268
            originalMod         = "ThaumcraftExtras"
            hidden              = true
            handleMaterial      = ref("any_magic_iron")
            aspect("Metallum - 2")
            aspect("Tenebrae - 1")
            reRegisteredTo("any_magic_iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.WARPING,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tartarite = material("tartarite") {
        appearance {
            color       = Rgba(255, 118, 60, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 160
            electrons    = 160
            neutrons     = 414
            mass         = 574L
            density      = 13.48558845
            meltingPoint = 4250L
            boilingPoint = 13026L
            plasmaPoint  = 1302600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 5
            durability = 7680L
            speed      = 20.0f
        }

        composition {
            formula = "(Ad₃O₄)Atl"
            component("adamantine", 324324000L)
            component("atlarus", 324324000L)
        }

        meta {
            numericId           = 8782
            hashId              = 1178
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            aspect("Cognitio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Carborundum = material("carborundum") {
        appearance {
            color       = Rgba(77, 77, 77, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 2.2983
            meltingPoint = 3000L
            boilingPoint = 3100L
            plasmaPoint  = 310000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 8.0f
        }

        composition {
            formula = "SiC"
            component("silicon", 324324000L)
            component("carbon", 324324000L)
        }

        meta {
            numericId           = 8003
            hashId              = 607
            originalMod         = "ihl"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.QUARTZ,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Bronze = material("bronze") {
        appearance {
            color       = Rgba(210, 130, 60, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 34
            electrons    = 34
            neutrons     = 42
            mass         = 76L
            density      = 8.54175
            meltingPoint = 1357L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 448L
            speed      = 5.5f
        }

        processing {
            byProduct("copper", "tin", "arsenic")
        }

        composition {
            formula = "Cu₃Sn"
            component("copper", 486486000L)
            component("tin", 162162000L)
        }

        meta {
            numericId           = 8610
            hashId              = 1191
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            alloyRef("hepatizon")
            alloyRef("arsenic_bronze")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AstralSilver = material("astral_silver") {
        name = "Astral Silver"

        appearance {
            color       = Rgba(230, 230, 255, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 47
            electrons    = 47
            neutrons     = 60
            mass         = 106L
            density      = 10.501
            meltingPoint = 1234L
            boilingPoint = 2435L
            plasmaPoint  = 243500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 10.0f
        }

        processing {
            byProduct("silver")
            generifyingTarget      = "silver" amount 648648000L
        }

        composition {
            formula = "Ag₂Ma"
            component("silver", 648648000L)
            component("magic", 324324000L)
        }

        meta {
            numericId           = 8676
            hashId              = 1169
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            aspect("Praecantio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val VividAlloy = material("vivid_alloy") {
        name = "Vivid Alloy"

        appearance {
            color       = Rgba(60, 139, 160, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 58
            electrons    = 58
            neutrons     = 72
            mass         = 129L
            density      = 11.0314253
            meltingPoint = 1491L
            boilingPoint = 2648L
            plasmaPoint  = 264833L
            hasMetallum  = true
        }

        composition {
            formula = "(Ag((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))((Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He))(BeK₄N₅Ma₆)"
            component("energetic_silver", 648648000L)
            component("ender_pearl", 648648000L)
        }

        meta {
            numericId           = 8811
            hashId              = 1313
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SpectreIron = material("spectre_iron") {
        name = "Spectre Iron"

        appearance {
            color       = Rgba(150, 200, 200, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 69
            electrons    = 69
            neutrons     = 85
            mass         = 154L
            density      = 8.874
            meltingPoint = 1811L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 768L
            speed      = 8.5f
        }

        processing {
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe(Ectoplasm)"
            component("wrought_iron", 648648000L)
            component("ectoplasm", 648648000L)
        }

        meta {
            numericId           = 8734
            hashId              = 1316
            originalMod         = "RandomThings"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            furnaceBurnTime     = 200L
            handleMaterial      = ref("obsidian")
            aspect("Metallum - 3")
            aspect("Spiritus - 3")
            reRegisteredTo("any_magic_iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MuspelheimPower = material("muspelheim_power") {
        name = "Muspelheim Power"

        appearance {
            color       = Rgba(174, 94, 94, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 54
            mass         = 102L
            density      = 11.404
            meltingPoint = 2811L
            boilingPoint = 5134L
            plasmaPoint  = 513400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2048L
            speed      = 18.0f
        }

        composition {
            formula = "(Elementium)(C₄Ma₂)"
            component("elvorium", 648648000L)
        }

        meta {
            numericId           = 8742
            hashId              = 1327
            originalMod         = "alfheim"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Ignis - 2")
            aspect("Potentia - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Celenegil = material("celenegil") {
        appearance {
            color       = Rgba(148, 204, 72, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 53
            electrons    = 53
            neutrons     = 75
            mass         = 129L
            density      = 14.98175
            meltingPoint = 1699L
            boilingPoint = 3466L
            plasmaPoint  = 346650L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 4096L
            speed      = 10.0f
        }

        composition {
            formula = "Pt(Cu₃ZnMa₂)"
            component("platinum", 324324000L)
            component("orichalcum", 324324000L)
        }

        meta {
            numericId           = 8779
            hashId              = 1173
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Nebrisum - 1")
            aspect("Vitreus - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val NiobiumTitanium = material("niobium_titanium") {
        name = "Niobium Titanium"

        appearance {
            color       = Rgba(29, 29, 41, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 31
            electrons    = 31
            neutrons     = 39
            mass         = 71L
            density      = 6.555
            meltingPoint = 2345L
            boilingPoint = 4288L
            plasmaPoint  = 428850L
        }

        composition {
            formula = "NbTi"
            component("niobium", 324324000L)
            component("titanium", 324324000L)
        }

        meta {
            numericId           = 8689
            hashId              = 1277
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val GildedIron = material("gilded_iron") {
        name = "Gilded Iron"

        appearance {
            color       = Rgba(255, 230, 80, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 34
            electrons    = 34
            neutrons     = 43
            mass         = 77L
            density      = 10.01644444
            meltingPoint = 1763L
            boilingPoint = 3133L
            plasmaPoint  = 313350L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "iron" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 12.0f
        }

        processing {
            forgingTarget         = "iron" amount 648648000L
        }

        composition {
            formula = "Fe₉Au"
            component("iron", 648648000L)
            component("gold", 72072000L)
        }

        meta {
            numericId           = 8606
            hashId              = 1187
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Lucrum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.COATED,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val EndSteel = material("end_steel") {
        name = "End Steel"

        appearance {
            color       = Rgba(164, 157, 116, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 72
            electrons    = 72
            neutrons     = 76
            mass         = 148L
            density      = 12.66847625
            meltingPoint = 1297L
            boilingPoint = 3846L
            plasmaPoint  = 384667L
            hasMetallum  = true
        }

        composition {
            formula = "(Endstone)(Fe(MgFe(SiO₂)₂O₄)₉,₆₄)(MgFe(SiO₂)₂O₄)₉,₆₄"
            component("endstone", 648648000L)
            component("obsidian_steel", 648648000L)
            component("obsidian", 5837832000L)
        }

        meta {
            numericId           = 8807
            hashId              = 1310
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 1")
            alloyRef("melodic_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VibraniumSteel = material("vibranium_steel") {
        name = "Vibranium Steel"

        appearance {
            color       = Rgba(40, 24, 50, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 57
            electrons    = 57
            neutrons     = 89
            mass         = 146L
            density      = 6.715445912
            meltingPoint = 2747L
            boilingPoint = 4704L
            plasmaPoint  = 470425L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 10
            durability = 2048L
            speed      = 50.0f
        }

        composition {
            formula = "VbFe₃"
            component("vibranium", 162162000L)
            component("steel", 486486000L)
        }

        meta {
            numericId           = 8704
            hashId              = 1283
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            aspect("Sensus - 1")
            aspect("Vitreus - 1")
            aspect("Metallum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TitaniumGold = material("titanium_gold") {
        name = "Titanium-Gold"

        appearance {
            color       = Rgba(222, 222, 255, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 36
            electrons    = 36
            neutrons     = 48
            mass         = 85L
            density      = 8.2255
            meltingPoint = 1790L
            boilingPoint = 3452L
            plasmaPoint  = 345225L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5120L
            speed      = 12.0f
        }

        composition {
            formula = "Ti₃Au"
            component("titanium", 486486000L)
            component("gold", 162162000L)
        }

        meta {
            numericId           = 8654
            hashId              = 1225
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 3")
            aspect("Lucrum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Vibramantium = material("vibramantium") {
        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 204
            electrons    = 204
            neutrons     = 501
            mass         = 706L
            density      = 10.82713163
            meltingPoint = 5131L
            boilingPoint = 13249L
            plasmaPoint  = 1324975L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 15
            durability = 5120L
            speed      = 1000.0f
        }

        composition {
            formula = "VbAd₃"
            component("vibranium", 162162000L)
            component("adamantium", 486486000L)
        }

        meta {
            numericId           = 8706
            hashId              = 1285
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            aspect("Sensus - 1")
            aspect("Vitreus - 1")
            aspect("Praecantio - 1")
            aspect("Metallum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val EnergeticAlloy = material("energetic_alloy") {
        name = "Energetic Alloy"

        appearance {
            color       = Rgba(200, 120, 50, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 146
            electrons    = 146
            neutrons     = 207
            mass         = 356L
            density      = 31.98142903
            meltingPoint = 580L
            boilingPoint = 1742L
            plasmaPoint  = 174300L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 12.5f
        }

        composition {
            formula = "(Au((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr)))((Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He)"
            component("gold_inductive", 1297296000L)
            component("glowstone", 648648000L)
        }

        meta {
            numericId           = 8728
            hashId              = 1302
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            aspect("Lux - 1")
            alloyRef("vibrant_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val FierySteel = material("fiery_steel") {
        name = "Fiery Steel"

        appearance {
            color       = Rgba(64, 0, 0, 255)
            iconSet     = IconSet.FIERY
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 55L
            density      = 7.874
            meltingPoint = 2934L
            boilingPoint = 3634L
            plasmaPoint  = 363400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1024L
            speed      = 9.0f
        }

        processing {
            generifyingTarget      = "steel" amount 648648000L
        }

        composition {
            formula = "FeMa"
            component("steel", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8675
            hashId              = 1259
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_blaze")
            aspect("Metallum - 2")
            aspect("Ignis - 3")
            aspect("Praecantio - 1")
            reRegisteredTo("fiery")
            reRegisteredTo("any_magic_iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Electrum = material("electrum") {
        appearance {
            color       = Rgba(255, 255, 100, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 63
            electrons    = 63
            neutrons     = 88
            mass         = 151L
            density      = 14.8915
            meltingPoint = 1285L
            boilingPoint = 2782L
            plasmaPoint  = 278200L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 12.0f
        }

        processing {
            byProduct("gold", "silver")
        }

        composition {
            formula = "AgAu"
            component("silver", 324324000L)
            component("gold", 324324000L)
        }

        meta {
            numericId           = 8600
            hashId              = 1180
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 2")
            alloyRef("black_bronze")
            alloyRef("electrum_flux")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Tritanium = material("tritanium") {
        name = "Tritanium Alloy"

        appearance {
            color       = Rgba(55, 155, 155, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 130
            electrons    = 130
            neutrons     = 196
            mass         = 326L
            density      = 23.75
            meltingPoint = 1800L
            boilingPoint = 2976L
            plasmaPoint  = 297625L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 5
            durability = 2560L
            speed      = 12.0f
        }

        processing {
            byProduct("diduranium_trioxide", "trinium")
        }

        composition {
            formula = "Tn₃Dn"
            component("tritanium_elemental", 486486000L)
            component("duranium_elemental", 162162000L)
        }

        meta {
            numericId           = 8752
            hashId              = 1337
            originalMod         = "mo"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 3")
            aspect("Vitreus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Constantan = material("constantan") {
        appearance {
            color       = Rgba(150, 100, 85, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 28
            electrons    = 28
            neutrons     = 32
            mass         = 60L
            density      = 8.936
            meltingPoint = 1542L
            boilingPoint = 3010L
            plasmaPoint  = 301050L
        }

        tool {
            types      = 3
            quality    = 1
            durability = 64L
            speed      = 6.0f
        }

        composition {
            formula = "CuNi"
            component("copper", 324324000L)
            component("nickel", 324324000L)
        }

        meta {
            numericId           = 8662
            hashId              = 1244
            originalMod         = "ImmersiveEngineering"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            reRegisteredTo("cupronickel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val EnderiumBase = material("enderium_base") {
        name = "Enderium Base"

        appearance {
            color       = Rgba(53, 85, 108, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 56
            electrons    = 56
            neutrons     = 78
            mass         = 134L
            density      = 11.63375
            meltingPoint = 1071L
            boilingPoint = 3070L
            plasmaPoint  = 307075L
            hasMetallum  = true
        }

        composition {
            formula = "Sn₂AgPt"
            component("tin", 324324000L)
            component("silver", 162162000L)
            component("platinum", 162162000L)
        }

        meta {
            numericId           = 8729
            hashId              = 1288
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            alloyRef("enderium")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HSLASpringSteel = material("hsla_spring_steel") {
        name = "Spring Steel"

        appearance {
            color       = Rgba(220, 100, 100, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 1873L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "(Fe)₄₅,₂((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₂,₁₀"
            component("hsla_steel", 648648000L)
            component("redstone", 28828800L)
        }

        meta {
            numericId           = 8639
            hashId              = 1212
            originalMod         = "RotaryCraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val StainlessSteel = material("stainless_steel") {
        name = "Stainless Steel"

        appearance {
            color       = Rgba(200, 200, 220, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 29
            mass         = 55L
            density      = 7.860666667
            meltingPoint = 1943L
            boilingPoint = 3029L
            plasmaPoint  = 302977L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 480L
            speed      = 7.0f
        }

        composition {
            formula = "Fe₄(Fe₂Ni)CrMn"
            component("wrought_iron", 288288000L)
            component("invar", 216216000L)
            component("chromium", 72072000L)
            component("manganese", 72072000L)
        }

        meta {
            numericId           = 8636
            hashId              = 1249
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Vitreus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SteelGalvanized = material("steel_galvanized") {
        name = "Galvanized Steel"

        appearance {
            color       = Rgba(250, 240, 240, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 33
            mass         = 63L
            density      = 8.666666667
            meltingPoint = 1910L
            boilingPoint = 2938L
            plasmaPoint  = 293860L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "steel" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 768L
            speed      = 7.0f
        }

        processing {
            forgingTarget         = "steel" amount 648648000L
        }

        composition {
            formula = "Fe₉Zn"
            component("steel", 648648000L)
            component("zinc", 72072000L)
        }

        meta {
            numericId           = 8651
            hashId              = 1223
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Sano - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.COATED,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Magnalium = material("magnalium") {
        appearance {
            color       = Rgba(200, 190, 255, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 2.378
            meltingPoint = 929L
            boilingPoint = 2315L
            plasmaPoint  = 231566L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 6.0f
        }

        composition {
            formula = "MgAl₂"
            component("magnesium", 216216000L)
            component("aluminium", 432432000L)
        }

        meta {
            numericId           = 8665
            hashId              = 1248
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BismuthBronze = material("bismuth_bronze") {
        name = "Bismuth Bronze"

        appearance {
            color       = Rgba(100, 125, 125, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 39
            electrons    = 39
            neutrons     = 52
            mass         = 92L
            density      = 8.7642
            meltingPoint = 1036L
            boilingPoint = 2635L
            plasmaPoint  = 263540L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 8.0f
        }

        composition {
            formula = "Bi(Cu₃Zn)"
            component("bismuth", 129729600L)
            component("brass", 518918400L)
        }

        meta {
            numericId           = 8612
            hashId              = 1193
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            alloyRef("meteoric_blue_steel")
            alloyRef("blue_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Netherite = material("netherite") {
        appearance {
            color       = Rgba(80, 70, 80, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 488
            electrons    = 488
            neutrons     = 688
            mass         = 1176L
            density      = 81.128
            meltingPoint = 2246L
            boilingPoint = 3334L
            plasmaPoint  = 333400L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 4
            durability = 500L
            speed      = 10.0f
        }

        composition {
            formula = "Au₄(Ancient Debris)₄"
            component("gold", 2594592000L)
            component("ancient_debris", 2594592000L)
        }

        meta {
            numericId           = 8745
            hashId              = 1331
            originalMod         = "netheriteplus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 2")
            aspect("Lucrum - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ElectricalSteel = material("electrical_steel") {
        name = "Electrical Steel"

        appearance {
            color       = Rgba(140, 140, 140, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 40
            electrons    = 40
            neutrons     = 44
            mass         = 84L
            density      = 10.2036
            meltingPoint = 1866L
            boilingPoint = 3336L
            plasmaPoint  = 333600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "FeSi"
            component("steel", 648648000L)
            component("silicon", 648648000L)
        }

        meta {
            numericId           = 8730
            hashId              = 1306
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Electrum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TinAlloy = material("tin_alloy") {
        name = "Tin Alloy"

        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 38
            electrons    = 38
            neutrons     = 49
            mass         = 87L
            density      = 7.5805
            meltingPoint = 1258L
            boilingPoint = 3004L
            plasmaPoint  = 300450L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 96L
            speed      = 6.5f
        }

        composition {
            formula = "SnFe"
            component("tin", 324324000L)
            component("wrought_iron", 324324000L)
        }

        meta {
            numericId           = 8667
            hashId              = 1251
            originalMod         = "Railcraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Fabrico - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ultimet = material("ultimet") {
        appearance {
            color       = Rgba(180, 180, 230, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 28
            electrons    = 28
            neutrons     = 33
            mass         = 61L
            density      = 8.636888889
            meltingPoint = 1980L
            boilingPoint = 3331L
            plasmaPoint  = 333177L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1024L
            speed      = 8.0f
        }

        composition {
            formula = "Co₅NiCr₂Mo"
            component("cobalt", 360360000L)
            component("nickel", 72072000L)
            component("chromium", 144144000L)
            component("molybdenum", 72072000L)
        }

        meta {
            numericId           = 8666
            hashId              = 1250
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Steeleaf = material("steeleaf") {
        appearance {
            color       = Rgba(50, 127, 50, 255)
            iconSet     = IconSet.LEAF
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 55L
            density      = 7.874
            meltingPoint = 1023L
            boilingPoint = 1567L
            plasmaPoint  = 156700L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "steel" amount 162162000L
        }

        tool {
            types      = 2
            quality    = 3
            durability = 144L
            speed      = 8.0f
        }

        composition {
            formula = "FeMa"
            component("steel", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8673
            hashId              = 1256
            originalMod         = "TwilightForest"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Herba - 1")
            aspect("Praecantio - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Hepatizon = material("hepatizon") {
        appearance {
            color       = Rgba(117, 94, 117, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 56
            electrons    = 56
            neutrons     = 79
            mass         = 136L
            density      = 13.911875
            meltingPoint = 1347L
            boilingPoint = 2982L
            plasmaPoint  = 298200L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 12.0f
        }

        composition {
            formula = "Au(Cu₃Sn)"
            component("gold", 324324000L)
            component("bronze", 324324000L)
        }

        meta {
            numericId           = 8613
            hashId              = 1194
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Trinitanium = material("trinitanium") {
        appearance {
            color       = Rgba(235, 175, 255, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 91
            electrons    = 91
            neutrons     = 136
            mass         = 228L
            density      = 2.225826667
            meltingPoint = 2410L
            boilingPoint = 4202L
            plasmaPoint  = 420200L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5120L
            speed      = 16.0f
        }

        composition {
            formula = "Ke₂Ti"
            component("trinium", 432432000L)
            component("titanium", 216216000L)
        }

        meta {
            numericId           = 8790
            hashId              = 1360
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 2")
            aspect("Vitreus - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BatteryAlloy = material("battery_alloy") {
        name = "Battery Alloy"

        appearance {
            color       = Rgba(156, 124, 160, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 75
            electrons    = 75
            neutrons     = 114
            mass         = 189L
            density      = 10.4106
            meltingPoint = 660L
            boilingPoint = 1989L
            plasmaPoint  = 198960L
        }

        composition {
            formula = "Pb₄Sb"
            component("lead", 518918400L)
            component("antimony", 129729600L)
        }

        meta {
            numericId           = 8668
            hashId              = 1252
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Lumium = material("lumium") {
        appearance {
            color       = Rgba(255, 255, 80, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 81
            electrons    = 81
            neutrons     = 109
            mass         = 191L
            density      = 14.44159565
            meltingPoint = 593L
            boilingPoint = 1682L
            plasmaPoint  = 168250L
            hasMetallum  = true
        }

        composition {
            formula = "Sn₃Ag((Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He)₄,₁₀"
            component("tin", 486486000L)
            component("silver", 162162000L)
            component("glowstone", 648648000L)
        }

        meta {
            numericId           = 8709
            hashId              = 1287
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Lux - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val DraconiumAwakened = material("draconium_awakened") {
        name = "Awakened Draconium"

        appearance {
            color       = Rgba(250, 150, 50, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 5500L
            boilingPoint = 11000L
            plasmaPoint  = 1100000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 5
            durability = 10000L
            speed      = 24.0f
        }

        composition {
            component("draconium", 648648000L)
        }

        meta {
            numericId           = 8792
            hashId              = 1352
            originalMod         = "DraconicEvolution"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 4")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CobaltBrass = material("cobalt_brass") {
        name = "Cobalt Brass"

        appearance {
            color       = Rgba(180, 180, 160, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 31
            mass         = 58L
            density      = 7.898055556
            meltingPoint = 1202L
            boilingPoint = 2870L
            plasmaPoint  = 287077L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 8.0f
        }

        composition {
            formula = "(Cu₃Zn)₇,₄AlCo"
            component("brass", 504504000L)
            component("aluminium", 72072000L)
            component("cobalt", 72072000L)
        }

        meta {
            numericId           = 8621
            hashId              = 1189
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Fabrico - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeteoflameSteel = material("meteoflame_steel") {
        name = "Meteoflame Steel"

        appearance {
            color       = Rgba(130, 120, 100, 255)
            iconSet     = IconSet.FIERY
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 55L
            density      = 7.874
            meltingPoint = 3134L
            boilingPoint = 3834L
            plasmaPoint  = 383400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1280L
            speed      = 12.0f
        }

        processing {
            generifyingTarget      = "meteoric_steel" amount 648648000L
        }

        composition {
            formula = "FeMa"
            component("meteoric_steel", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8693
            hashId              = 1262
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_blaze")
            aspect("Metallum - 2")
            aspect("Ignis - 3")
            aspect("Praecantio - 1")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            reRegisteredTo("any_magic_iron")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeteoricRedSteel = material("meteoric_red_steel") {
        name = "Meteoric Red Steel"

        appearance {
            color       = Rgba(135, 95, 95, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 33
            electrons    = 33
            neutrons     = 41
            mass         = 75L
            density      = 9.5702975
            meltingPoint = 1853L
            boilingPoint = 3171L
            plasmaPoint  = 317183L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1536L
            speed      = 9.0f
        }

        processing {
            generifyingTarget      = "red_steel" amount 648648000L
        }

        composition {
            formula = "(CuAu₄)(Cu₃Zn)Fe₂(Ni(Cu₃(AgAu))Fe₃)₄,₅"
            component("rose_gold", 81081000L)
            component("brass", 81081000L)
            component("meteoric_steel", 162162000L)
            component("meteoric_black_steel", 324324000L)
        }

        meta {
            numericId           = 8692
            hashId              = 1231
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_red_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tungstensteel = material("tungstensteel") {
        appearance {
            color       = Rgba(100, 100, 160, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 69
            mass         = 119L
            density      = 13.562
            meltingPoint = 2870L
            boilingPoint = 4481L
            plasmaPoint  = 448100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5120L
            speed      = 10.0f
        }

        composition {
            formula = "FeW"
            component("steel", 324324000L)
            component("tungsten", 324324000L)
        }

        meta {
            numericId           = 8635
            hashId              = 1203
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Tutamen - 1")
            reRegisteredTo("tungsten_steel")
            reRegisteredTo("wolframsteel")
            reRegisteredTo("wolfram_steel")
            alloyRef("hssg")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val GaiaSpirit = material("gaia_spirit") {
        name = "Gaia Spirit"

        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 3945L
            boilingPoint = 6328L
            plasmaPoint  = 632800L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 2048L
            speed      = 20.0f
        }

        meta {
            numericId           = 8735
            hashId              = 1321
            originalMod         = "Botania"
            hidden              = true
            handleMaterial      = ref("elven_elementium")
            aspect("Auram - 4")
            aspect("Spiritus - 4")
            aspect("Praecantio - 4")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TitaniumAluminide = material("titanium_aluminide") {
        name = "Titanium Aluminide"

        appearance {
            color       = Rgba(200, 200, 255, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 52
            electrons    = 52
            neutrons     = 56
            mass         = 108L
            density      = 10.83533333
            meltingPoint = 1235L
            boilingPoint = 3022L
            plasmaPoint  = 302240L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 3840L
            speed      = 12.0f
        }

        composition {
            formula = "Ti₃Al₇"
            component("titanium", 648648000L)
            component("aluminium", 1513512000L)
        }

        meta {
            numericId           = 8794
            hashId              = 1363
            originalMod         = "advancedRocketry"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 1")
            aspect("Volatus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Ironwood = material("ironwood") {
        appearance {
            color       = Rgba(150, 140, 110, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 18
            electrons    = 18
            neutrons     = 22
            mass         = 41L
            density      = 5.689222222
            meltingPoint = 1580L
            boilingPoint = 2816L
            plasmaPoint  = 281684L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 2
            durability = 512L
            speed      = 6.5f
        }

        composition {
            formula = "Fe₈((Wood)₃,₂₁Ma)₃(AuFe)"
            component("wrought_iron", 288288000L)
            component("live_root", 324324000L)
            component("angmallen", 72072000L)
        }

        meta {
            numericId           = 8672
            hashId              = 1254
            originalMod         = "TwilightForest"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Arbor - 1")
            aspect("Praecantio - 1")
            reRegisteredTo("iron_wood")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ClayCompound = material("clay_compound") {
        name = "Clay Compound"

        appearance {
            color       = Rgba(132, 127, 123, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 29
            mass         = 58L
            density      = 2.373311944
            meltingPoint = 1400L
            boilingPoint = 2800L
            plasmaPoint  = 280000L
        }

        composition {
            formula = "(Stone)₂((Al₂O₃)(SiO₂)₄)"
            component("stone", 1297296000L)
            component("ceramic", 648648000L)
        }

        meta {
            numericId           = 8806
            hashId              = 1308
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 4")
            reRegisteredTo("crude_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ConductiveIron = material("conductive_iron") {
        name = "Conductive Iron"

        appearance {
            color       = Rgba(170, 140, 140, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 1255L
            boilingPoint = 2317L
            plasmaPoint  = 231700L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 6.0f
        }

        composition {
            formula = "Fe((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))"
            component("wrought_iron", 648648000L)
            component("redstone", 648648000L)
        }

        meta {
            numericId           = 8727
            hashId              = 1241
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Potentia - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ChromiumDioxide = material("chromium_dioxide") {
        name = "Chromium Dioxide"

        appearance {
            color       = Rgba(10, 20, 10, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 40
            electrons    = 40
            neutrons     = 44
            mass         = 84L
            density      = 7.152858
            meltingPoint = 650L
            boilingPoint = 1300L
            plasmaPoint  = 130000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 11.0f
        }

        composition {
            formula = "CrO₂"
            component("chromium", 648648000L)
            component("oxygen", 1297296000L)
        }

        meta {
            numericId           = 8685
            hashId              = 1273
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Fabrico - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SterlingSilver = material("sterling_silver") {
        name = "Sterling Silver"

        appearance {
            color       = Rgba(250, 220, 225, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 54
            mass         = 98L
            density      = 10.1928
            meltingPoint = 1258L
            boilingPoint = 2515L
            plasmaPoint  = 251500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 13.0f
        }

        composition {
            formula = "CuAg₄"
            component("copper", 129729600L)
            component("silver", 518918400L)
        }

        meta {
            numericId           = 8601
            hashId              = 1181
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 2")
            alloyRef("signalum")
            alloyRef("black_bronze")
            alloyRef("meteoric_blue_steel")
            alloyRef("blue_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Soularium = material("soularium") {
        appearance {
            color       = Rgba(90, 70, 50, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 169
            electrons    = 169
            neutrons     = 207
            mass         = 376L
            density      = 26.279374
            meltingPoint = 1033L
            boilingPoint = 3012L
            plasmaPoint  = 40290L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 15.0f
        }

        composition {
            formula = "(Soulsand)₉Au"
            component("soulsand", 5837832000L)
            component("gold", 648648000L)
        }

        meta {
            numericId           = 8732
            hashId              = 1307
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Spiritus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeteoricBlackSteel = material("meteoric_black_steel") {
        name = "Meteoric Black Steel"

        appearance {
            color       = Rgba(85, 85, 85, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 35
            mass         = 64L
            density      = 8.77332
            meltingPoint = 1958L
            boilingPoint = 3200L
            plasmaPoint  = 320036L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            generifyingTarget      = "black_steel" amount 648648000L
        }

        composition {
            formula = "Ni(Cu₃(AgAu))Fe₃"
            component("nickel", 129729600L)
            component("black_bronze", 129729600L)
            component("meteoric_steel", 389188800L)
        }

        meta {
            numericId           = 8690
            hashId              = 1229
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_black_steel")
            alloyRef("meteoric_blue_steel")
            alloyRef("meteoric_red_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BedrockHSLAAlloy = material("bedrock_hsla_alloy") {
        name = "Bedrock-HSLA-Alloy"

        appearance {
            color       = Rgba(64, 64, 64, 255)
            iconSet     = IconSet.BRICK
        }

        physics {
            protons      = 914
            electrons    = 914
            neutrons     = 2350
            mass         = 3264L
            density      = 61.29899048
            meltingPoint = 4000L
            boilingPoint = 8000L
            plasmaPoint  = 800000L
        }

        tool {
            types      = 3
            quality    = 5
            durability = 2560L
            speed      = 10.0f
        }

        composition {
            formula = "(Bedrock)₄(Fe)"
            component("bedrock", 2594592000L)
            component("hsla_steel", 648648000L)
        }

        meta {
            numericId           = 8718
            hashId              = 1297
            originalMod         = "RotaryCraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Terra - 5")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VibraniumSilver = material("vibranium_silver") {
        name = "Vibranium Silver"

        appearance {
            color       = Rgba(240, 240, 255, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 73
            electrons    = 73
            neutrons     = 111
            mass         = 184L
            density      = 8.685695912
            meltingPoint = 2138L
            boilingPoint = 4180L
            plasmaPoint  = 418000L
        }

        tool {
            types      = 3
            quality    = 9
            durability = 512L
            speed      = 100.0f
        }

        composition {
            formula = "VbAg₃"
            component("vibranium", 162162000L)
            component("silver", 486486000L)
        }

        meta {
            numericId           = 8705
            hashId              = 1284
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("vibranium_steel")
            aspect("Sensus - 1")
            aspect("Vitreus - 1")
            aspect("Lucrum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedSteel = material("red_steel") {
        name = "Red Steel"

        appearance {
            color       = Rgba(140, 100, 100, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 33
            electrons    = 33
            neutrons     = 41
            mass         = 75L
            density      = 9.5702975
            meltingPoint = 1743L
            boilingPoint = 3061L
            plasmaPoint  = 306183L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1024L
            speed      = 7.5f
        }

        composition {
            formula = "(CuAu₄)(Cu₃Zn)Fe₂(Ni(Cu₃(AgAu))Fe₃)₄,₅"
            component("rose_gold", 81081000L)
            component("brass", 81081000L)
            component("steel", 162162000L)
            component("black_steel", 324324000L)
        }

        meta {
            numericId           = 8633
            hashId              = 1200
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_red_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Angmallen = material("angmallen") {
        appearance {
            color       = Rgba(215, 225, 138, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 52
            electrons    = 52
            neutrons     = 73
            mass         = 126L
            density      = 13.578
            meltingPoint = 1674L
            boilingPoint = 3131L
            plasmaPoint  = 313150L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 10.0f
        }

        composition {
            formula = "AuFe"
            component("gold", 324324000L)
            component("wrought_iron", 324324000L)
        }

        meta {
            numericId           = 8603
            hashId              = 1184
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            alloyRef("ironwood")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Orichalcum = material("orichalcum") {
        appearance {
            color       = Rgba(84, 122, 56, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.5035
            meltingPoint = 1357L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 3456L
            speed      = 4.5f
        }

        processing {
            byProduct("tetrahedrite", "kesterite")
            generifyingTarget      = "brass" amount 648648000L
        }

        composition {
            formula = "Cu₃ZnMa₂"
            component("copper", 486486000L)
            component("zinc", 162162000L)
            component("magic", 324324000L)
        }

        meta {
            numericId           = 8769
            hashId              = 1168
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Permutatio - 2")
            aspect("Praecantio - 1")
            alloyRef("celenegil")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Processing.WASHING_MERCURY,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Nichrome = material("nichrome") {
        appearance {
            color       = Rgba(205, 206, 246, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 29
            mass         = 56L
            density      = 8.5596
            meltingPoint = 1818L
            boilingPoint = 3137L
            plasmaPoint  = 313760L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 6.0f
        }

        composition {
            formula = "Ni₄Cr"
            component("nickel", 518918400L)
            component("chromium", 129729600L)
        }

        meta {
            numericId           = 8663
            hashId              = 1246
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            alloyRef("stainless_steel")
            alloyRef("ultimet")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AluminiumBrass = material("aluminium_brass") {
        name = "Aluminium Brass"

        appearance {
            color       = Rgba(220, 220, 130, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 17
            electrons    = 17
            neutrons     = 18
            mass         = 35L
            density      = 4.2635
            meltingPoint = 1039L
            boilingPoint = 2802L
            plasmaPoint  = 280275L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 64L
            speed      = 6.0f
        }

        composition {
            formula = "Al₃Cu"
            component("aluminium", 486486000L)
            component("copper", 162162000L)
        }

        meta {
            numericId           = 8700
            hashId              = 1278
            originalMod         = "TConstruct"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Strontio - 1")
            reRegisteredTo("aluminum_brass")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Kanthal = material("kanthal") {
        appearance {
            color       = Rgba(194, 210, 223, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 21
            electrons    = 21
            neutrons     = 23
            mass         = 44L
            density      = 5.907333333
            meltingPoint = 1708L
            boilingPoint = 2956L
            plasmaPoint  = 295666L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 6.0f
        }

        composition {
            formula = "FeAlCr"
            component("wrought_iron", 216216000L)
            component("aluminium", 216216000L)
            component("chromium", 216216000L)
        }

        meta {
            numericId           = 8664
            hashId              = 1247
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HSSS = material("hsss") {
        name = "HSS-S"

        appearance {
            color       = Rgba(102, 0, 51, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 53
            electrons    = 53
            neutrons     = 75
            mass         = 129L
            density      = 15.04481481
            meltingPoint = 2786L
            boilingPoint = 4509L
            plasmaPoint  = 450988L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 3000L
            speed      = 14.0f
        }

        composition {
            formula = "((FeW)₅,₂CrMo₂V)₆,₉(OsIr)Ir"
            component("hssg", 432432000L)
            component("osmiridium", 144144000L)
            component("iridium", 72072000L)
        }

        meta {
            numericId           = 8798
            hashId              = 1349
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 2")
            aspect("Machina - 2")
            aspect("Nebrisum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Elvorium = material("elvorium") {
        appearance {
            color       = Rgba(235, 164, 77, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 54
            mass         = 102L
            density      = 11.404
            meltingPoint = 2811L
            boilingPoint = 5134L
            plasmaPoint  = 513400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2048L
            speed      = 14.0f
        }

        composition {
            formula = "(Elementium)(C₄Ma₂)"
            component("elven_elementium", 648648000L)
            component("elven_dragonstone", 648648000L)
        }

        meta {
            numericId           = 8740
            hashId              = 1325
            originalMod         = "alfheim"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Praecantio - 4")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val HSSE = material("hsse") {
        name = "HSS-E"

        appearance {
            color       = Rgba(51, 102, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 35
            electrons    = 35
            neutrons     = 45
            mass         = 81L
            density      = 9.589214815
            meltingPoint = 2314L
            boilingPoint = 3886L
            plasmaPoint  = 388600L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5120L
            speed      = 10.0f
        }

        composition {
            formula = "((FeW)₅,₂CrMo₂V)₆,₉CoMnSi"
            component("hssg", 432432000L)
            component("cobalt", 72072000L)
            component("manganese", 72072000L)
            component("silicon", 72072000L)
        }

        meta {
            numericId           = 8797
            hashId              = 1348
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 2")
            aspect("Machina - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HSSG = material("hssg") {
        name = "HSS-G"

        appearance {
            color       = Rgba(153, 153, 0, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 42
            electrons    = 42
            neutrons     = 56
            mass         = 98L
            density      = 11.27888889
            meltingPoint = 2722L
            boilingPoint = 4317L
            plasmaPoint  = 431700L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 4000L
            speed      = 10.0f
        }

        composition {
            formula = "(FeW)₅,₂CrMo₂V"
            component("tungstensteel", 360360000L)
            component("chromium", 72072000L)
            component("molybdenum", 144144000L)
            component("vanadium", 72072000L)
        }

        meta {
            numericId           = 8796
            hashId              = 1347
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 1")
            aspect("Machina - 1")
            alloyRef("hsse")
            alloyRef("hsss")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Inolashite = material("inolashite") {
        appearance {
            color       = Rgba(148, 216, 187, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 41
            mass         = 73L
            density      = 4.6915
            meltingPoint = 1717L
            boilingPoint = 3434L
            plasmaPoint  = 343400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 2304L
            speed      = 8.0f
        }

        composition {
            formula = "(Alduorite)(Ceruclase)"
            component("alduorite", 324324000L)
            component("ceruclase", 324324000L)
        }

        meta {
            numericId           = 8777
            hashId              = 1175
            originalMod         = "Metallurgy"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Aer - 1")
            aspect("Aqua - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Alumite = material("alumite") {
        appearance {
            color       = Rgba(230, 100, 230, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 31L
            density      = 2.796141917
            meltingPoint = 1565L
            boilingPoint = 3780L
            plasmaPoint  = 378072L
        }

        tool {
            types      = 2
            quality    = 3
            durability = 64L
            speed      = 1.5f
        }

        composition {
            formula = "(Al₂O₃)Fe₂(MgFe(SiO₂)₂O₄)₁₈,₆₄"
            component("alumina", 360360000L)
            component("wrought_iron", 144144000L)
            component("obsidian", 1297296000L)
        }

        meta {
            numericId           = 8702
            hashId              = 1281
            originalMod         = "TConstruct"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Strontio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Fireleaf = material("fireleaf") {
        appearance {
            color       = Rgba(127, 50, 50, 255)
            iconSet     = IconSet.LEAF
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 54L
            density      = 7.874
            meltingPoint = 2934L
            boilingPoint = 3634L
            plasmaPoint  = 363400L
            hasMetallum  = true
        }

        fluids {
            smeltingTarget    = "fiery_steel" amount 162162000L
        }

        tool {
            types      = 2
            quality    = 4
            durability = 288L
            speed      = 12.0f
        }

        processing {
            generifyingTarget      = "steeleaf" amount 648648000L
        }

        composition {
            formula = "FeMa₂"
            component("steel", 648648000L)
            component("magic", 1297296000L)
        }

        meta {
            numericId           = 8698
            hashId              = 1261
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_blaze")
            aspect("Metallum - 2")
            aspect("Ignis - 3")
            aspect("Praecantio - 1")
            aspect("Herba - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val EnergeticSilver = material("energetic_silver") {
        name = "Energetic Silver"

        appearance {
            color       = Rgba(93, 126, 151, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 47
            electrons    = 47
            neutrons     = 60
            mass         = 107L
            density      = 10.501
            meltingPoint = 580L
            boilingPoint = 1511L
            plasmaPoint  = 151166L
            hasMetallum  = true
        }

        composition {
            formula = "Ag((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))((Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He)"
            component("silver", 648648000L)
            component("redstone", 648648000L)
            component("glowstone", 648648000L)
        }

        meta {
            numericId           = 8808
            hashId              = 1242
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Potentia - 1")
            alloyRef("vivid_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val ElvenElementium = material("elven_elementium") {
        name = "Elementium"

        appearance {
            color       = Rgba(250, 120, 250, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2811L
            boilingPoint = 5134L
            plasmaPoint  = 513400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 14.0f
        }

        meta {
            numericId           = 8722
            hashId              = 1319
            originalMod         = "Botania"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Praecantio - 2")
            reRegisteredTo("elementium")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Thaumium = material("thaumium") {
        appearance {
            color       = Rgba(150, 100, 200, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 55L
            density      = 7.874
            meltingPoint = 2311L
            boilingPoint = 4134L
            plasmaPoint  = 413400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 12.0f
        }

        processing {
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "FeMa"
            component("iron", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8679
            hashId              = 1267
            originalMod         = "Thaumcraft"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Praecantio - 1")
            reRegisteredTo("any_magic_iron")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val CrystalMatrix = material("crystal_matrix") {
        name = "Crystal Matrix"

        appearance {
            color       = Rgba(83, 231, 234, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 566
            electrons    = 566
            neutrons     = 590
            mass         = 1156L
            density      = 72.6
            meltingPoint = 3896L
            boilingPoint = 5127L
            plasmaPoint  = 512700L
        }

        tool {
            types      = 3
            quality    = 4
            durability = 25600L
            speed      = 20.0f
        }

        composition {
            formula = "(C₄)₂₀(Nether Star)₂"
            component("diamond", 12972960000L)
            component("nether_star", 1297296000L)
        }

        meta {
            numericId           = 8799
            hashId              = 1353
            originalMod         = "Avaritia"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Vitreus - 8")
            aspect("Praecantio - 4")
            aspect("Nebrisum - 4")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.Properties.ENDER_DRAGON_PROOF,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CrystallinePinkSlime = material("crystalline_pink_slime") {
        name = "Crystalline Pink Slime"

        appearance {
            color       = Rgba(176, 112, 166, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            hasMetallum  = true
        }

        meta {
            numericId           = 8813
            hashId              = 1315
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Vitreus - 1")
            aspect("Limus - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TungstenSintered = material("tungsten_sintered") {
        name = "Sintered Tungsten"

        appearance {
            color       = Rgba(70, 70, 70, 255)
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

        fluids {
            solidifyingTarget = "tungsten" amount 648648000L
            smeltingTarget    = "tungsten" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 5120L
            speed      = 8.0f
        }

        processing {
            pulverTarget          = "tungsten" amount 648648000L
            burningTarget         = "tungsten" amount 0L
            bendingTarget         = "tungsten" amount 648648000L
            compressingTarget     = "tungsten" amount 648648000L
            generifyingTarget      = "tungsten" amount 648648000L
        }

        composition {
            formula = "W"
            component("tungsten", 648648000L)
        }

        meta {
            numericId           = 8652
            hashId              = 1224
            originalMod         = "RotaryCraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Tutamen - 1")
            reRegisteredTo("any_tungsten")
            alloyRef("tungstensteel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VibrantAlloy = material("vibrant_alloy") {
        name = "Vibrant Alloy"

        appearance {
            color       = Rgba(160, 170, 70, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 157
            electrons    = 157
            neutrons     = 219
            mass         = 378L
            density      = 32.51185433
            meltingPoint = 1722L
            boilingPoint = 2763L
            plasmaPoint  = 276400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 64L
            speed      = 12.5f
        }

        composition {
            formula = "((Au((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr)))((Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He))(BeK₄N₅Ma₆)"
            component("energetic_alloy", 648648000L)
            component("ender_pearl", 648648000L)
        }

        meta {
            numericId           = 8726
            hashId              = 1303
            originalMod         = "EnderIO"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Lucrum - 1")
            aspect("Lux - 1")
            aspect("Alienis - 1")
            reRegisteredTo("phased_gold")
            reRegisteredTo("vibrant")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val GlowstoneRefined = material("glowstone_refined") {
        name = "Refined Glowstone"

        appearance {
            color       = Rgba(255, 240, 100, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 64
            electrons    = 64
            neutrons     = 83
            mass         = 148L
            density      = 11.67409565
            meltingPoint = 855L
            boilingPoint = 1853L
            plasmaPoint  = 185300L
            hasMetallum  = true
        }

        fluids {
            solidifyingTarget = "glowstone" amount 648648000L
            smeltingTarget    = "glowstone" amount 648648000L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 256L
            speed      = 8.0f
        }

        processing {
            pulverTarget          = "glowstone" amount 648648000L
            smashingTarget        = "glowstone" amount 648648000L
            cuttingTarget         = "glowstone" amount 648648000L
            workingTarget         = "glowstone" amount 648648000L
            forgingTarget         = "glowstone" amount 648648000L
            burningTarget         = "glowstone" amount 0L
            bendingTarget         = "glowstone" amount 648648000L
            compressingTarget     = "glowstone" amount 648648000L
        }

        composition {
            formula = "((Ca₅(PO₄)₃,₅F)₅,₉Au₃(SiO₂)He)Ge"
            component("glowstone", 648648000L)
            component("germanium", 648648000L)
        }

        meta {
            numericId           = 8713
            hashId              = 1290
            originalMod         = "Mekanism"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 4")
            aspect("Lux - 4")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Terrasteel = material("terrasteel") {
        appearance {
            color       = Rgba(110, 200, 50, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2561L
            boilingPoint = 4634L
            plasmaPoint  = 463400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 2048L
            speed      = 16.0f
        }

        meta {
            numericId           = 8721
            hashId              = 1318
            originalMod         = "Botania"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Praecantio - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val NetherizedDiamond = material("netherized_diamond") {
        name = "Netherized Diamond"

        appearance {
            color       = Rgba(90, 80, 90, 255)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 146
            electrons    = 146
            neutrons     = 196
            mass         = 342L
            density      = 23.812
            meltingPoint = 2246L
            boilingPoint = 3334L
            plasmaPoint  = 333400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 2560L
            speed      = 12.0f
        }

        composition {
            formula = "(Au₄(Ancient Debris)₄)(C₄)₄"
            component("netherite", 162162000L)
            component("diamond", 648648000L)
        }

        meta {
            numericId           = 8746
            hashId              = 1332
            originalMod         = "netheriteplus"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Alienis - 2")
            aspect("Lucrum - 2")
            aspect("Vitreus - 2")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.COATED,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.GEMS,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CdInAgAlloy = material("cd_in_ag_alloy") {
        name = "Cd-In-Ag-Alloy"

        appearance {
            color       = Rgba(100, 100, 128, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 47
            electrons    = 47
            neutrons     = 63
            mass         = 111L
            density      = 8.833666667
            meltingPoint = 752L
            boilingPoint = 1940L
            plasmaPoint  = 194000L
            hasMetallum  = true
        }

        composition {
            formula = "CdInAg"
            component("cadmium", 216216000L)
            component("indium", 216216000L)
            component("silver", 216216000L)
        }

        meta {
            numericId           = 8605
            hashId              = 1186
            originalMod         = "RotaryCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tenebrae - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val HSLATungstenAlloy = material("hsla_tungsten_alloy") {
        name = "Tungsten Alloy"

        appearance {
            color       = Rgba(179, 119, 190, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 1873L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1024L
            speed      = 7.0f
        }

        composition {
            formula = "((Fe)₄₅,₂((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₂,₁₀)₄W"
            component("hsla_spring_steel", 648648000L)
            component("tungsten", 3603600L)
        }

        meta {
            numericId           = 8766
            hashId              = 1213
            originalMod         = "RotaryCraft"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Tutamen - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VoidMetal = material("void_metal") {
        name = "Void Metal"

        appearance {
            color       = Rgba(30, 10, 30, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 3000L
            boilingPoint = 5000L
            plasmaPoint  = 500000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 2048L
            speed      = 12.0f
        }

        meta {
            numericId           = 8681
            hashId              = 1269
            originalMod         = "Thaumcraft"
            hidden              = true
            handleMaterial      = ref("any_magic_iron")
            aspect("Metallum - 7")
            aspect("Tenebrae - 8")
            aspect("Vacuos - 8")
            aspect("Alienis - 2")
            aspect("Herba - 1")
            reRegisteredTo("void")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Properties.WARPING,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.BETWEENLANDS,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeteoricSteel = material("meteoric_steel") {
        name = "Meteoric Steel"

        appearance {
            color       = Rgba(130, 120, 100, 255)
            iconSet     = IconSet.SPACE
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2246L
            boilingPoint = 3334L
            plasmaPoint  = 333400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            oreMultiplier           = 2
            byProduct("hematite")
            generifyingTarget      = "steel" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("meteoric_iron", 648648000L)
        }

        meta {
            numericId           = 8650
            hashId              = 1228
            originalMod         = "GalacticraftCore"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            reRegisteredTo("any_iron_or_steel")
            reRegisteredTo("any_iron_steel")
            alloyRef("vanadium_steel")
            alloyRef("obsidian_steel")
            alloyRef("tungstensteel")
            alloyRef("electrical_steel")
            alloyRef("meteoric_black_steel")
            alloyRef("meteoric_blue_steel")
            alloyRef("meteoric_red_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
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

    val DamascusSteel = material("damascus_steel") {
        name = "Damascus Steel"

        appearance {
            color       = Rgba(110, 110, 110, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 27
            electrons    = 27
            neutrons     = 32
            mass         = 60L
            density      = 8.3812
            meltingPoint = 2080L
            boilingPoint = 3196L
            plasmaPoint  = 319630L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1280L
            speed      = 8.0f
        }

        composition {
            formula = "Fe₅₀VW"
            component("steel", 648648000L)
            component("vanadium", 12972960L)
            component("tungsten", 12972960L)
        }

        meta {
            numericId           = 8634
            hashId              = 1201
            originalMod         = "Metallurgy"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            aspect("Telum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val NiobiumNitride = material("niobium_nitride") {
        name = "Niobium Nitride"

        appearance {
            color       = Rgba(29, 41, 29, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 30
            mass         = 54L
            density      = 4.2856253
            meltingPoint = 2573L
            boilingPoint = 5146L
            plasmaPoint  = 514600L
        }

        composition {
            formula = "NbN"
            component("niobium", 324324000L)
            component("nitrogen", 324324000L)
        }

        meta {
            numericId           = 8688
            hashId              = 1276
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.ELECTROLYSABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val MeteoflameBlackSteel = material("meteoflame_black_steel") {
        name = "Meteoflame Black Steel"

        appearance {
            color       = Rgba(85, 85, 85, 255)
            iconSet     = IconSet.FIERY
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 35
            mass         = 63L
            density      = 8.77332
            meltingPoint = 3000L
            boilingPoint = 3700L
            plasmaPoint  = 370000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 1280L
            speed      = 12.0f
        }

        processing {
            generifyingTarget      = "meteoric_black_steel" amount 648648000L
        }

        composition {
            formula = "(Ni(Cu₃(AgAu))Fe₃)Ma"
            component("meteoric_black_steel", 648648000L)
            component("magic", 648648000L)
        }

        meta {
            numericId           = 8694
            hashId              = 1263
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_blaze")
            aspect("Metallum - 2")
            aspect("Ignis - 3")
            aspect("Praecantio - 1")
            aspect("Magneto - 1")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_black_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.BURNING,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.MAGNETIC_ACTIVE,
            MaterialTag.Properties.AUTO_COLLECTING,
            MaterialTag.Properties.WITHER_PROOF,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Trinaquadalloy = material("trinaquadalloy") {
        appearance {
            color       = Rgba(146, 186, 146, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 123
            electrons    = 123
            neutrons     = 206
            mass         = 330L
            density      = 5.631048889
            meltingPoint = 2518L
            boilingPoint = 4159L
            plasmaPoint  = 415977L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 5
            durability = 20480L
            speed      = 14.0f
        }

        composition {
            formula = "Ke₆Nq₂C"
            component("trinium", 432432000L)
            component("naquadah", 144144000L)
            component("carbon", 72072000L)
        }

        meta {
            numericId           = 8684
            hashId              = 1358
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 3")
            aspect("Tutamen - 3")
            aspect("Nebrisum - 1")
            reRegisteredTo("naquadah_alloy")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SolderingAlloy = material("soldering_alloy") {
        name = "Soldering Alloy"

        appearance {
            color       = Rgba(220, 220, 230, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 50
            electrons    = 50
            neutrons     = 68
            mass         = 118L
            density      = 7.2268
            meltingPoint = 544L
            boilingPoint = 2773L
            plasmaPoint  = 277350L
        }

        composition {
            formula = "Sn₉Sb"
            component("tin", 583783200L)
            component("antimony", 64864800L)
        }

        meta {
            numericId           = 8669
            hashId              = 1253
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Processing.SOLDERING_MATERIAL,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.Processing.SOLDERING_MATERIAL_GOOD,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val VanadiumSteel = material("vanadium_steel") {
        name = "Vanadiumsteel"

        appearance {
            color       = Rgba(100, 100, 100, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 25
            electrons    = 25
            neutrons     = 29
            mass         = 55L
            density      = 7.5212
            meltingPoint = 2073L
            boilingPoint = 3243L
            plasmaPoint  = 324320L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        composition {
            formula = "Fe₄V"
            component("steel", 518918400L)
            component("vanadium", 129729600L)
        }

        meta {
            numericId           = 8653
            hashId              = 1202
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Instrumentum - 1")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val WroughtIron = material("wrought_iron") {
        name = "Wrought Iron"

        appearance {
            colorSolid  = Rgba(200, 180, 180, 255)
            colorLiquid = Rgba(255, 80, 40, 255)
            colorGas    = Rgba(200, 180, 180, 255)
            colorPlasma = Rgba(200, 180, 180, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 7.874
            meltingPoint = 2011L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "iron" amount 648648000L
            generifyingTarget      = "iron" amount 648648000L
        }

        composition {
            formula = "Fe"
            component("iron", 648648000L)
        }

        meta {
            numericId           = 8643
            hashId              = 1143
            originalMod         = "terrafirmacraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            reRegisteredTo("any_iron")
            reRegisteredTo("wrougt_iron")
            reRegisteredTo("any_iron_or_steel")
            reRegisteredTo("refined_iron")
            alloyRef("angmallen")
            alloyRef("stainless_steel")
            alloyRef("alumite")
            alloyRef("tin_alloy")
            alloyRef("pulsating_iron")
            alloyRef("spectre_iron")
            alloyRef("ironwood")
            alloyRef("electrotine_alloy")
            alloyRef("conductive_iron")
            alloyRef("invar")
            alloyRef("steel")
            alloyRef("kanthal")
        }

        tags(
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.NEVER_FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val TungstenCarbide = material("tungsten_carbide") {
        name = "Tungsten Carbide"

        appearance {
            color       = Rgba(123, 123, 123, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 40
            electrons    = 40
            neutrons     = 57
            mass         = 97L
            density      = 15.6
            meltingPoint = 3070L
            boilingPoint = 6270L
            plasmaPoint  = 627000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 4
            durability = 5120L
            speed      = 10.0f
        }

        composition {
            formula = "WC"
            component("tungsten", 324324000L)
            component("carbon", 324324000L)
        }

        meta {
            numericId           = 8638
            hashId              = 1207
            originalMod         = "ReactorCraft"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Ordo - 1")
            aspect("Tutamen - 1")
            reRegisteredTo("carbide")
            reRegisteredTo("wolfram_carbide")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.ItemGenerator.RAILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PurpleAlloy = material("purple_alloy") {
        name = "Purple Alloy"

        appearance {
            color       = Rgba(255, 120, 255, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 76
            electrons    = 76
            neutrons     = 94
            mass         = 170L
            density      = 19.461
            meltingPoint = 1400L
            boilingPoint = 2435L
            plasmaPoint  = 243500L
        }

        composition {
            formula = "(Cu((FeS₂)₅,₃Hg₃(SiO₂)((Al₂O₃)Cr))₄,₁₀)(Ag(((Al₂O₃)₃,₅(SiO₂)Na₄Cl)₅,₁₁Cu₃(SiO₂)Ar)₄,₁₀)"
            component("red_alloy", 648648000L)
            component("blue_alloy", 648648000L)
        }

        meta {
            numericId           = 8657
            hashId              = 1234
            originalMod         = "bluepower"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Machina - 3")
            aspect("Electrum - 3")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.WIRES,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Mauftrium = material("mauftrium") {
        appearance {
            color       = Rgba(250, 225, 121, 255)
            iconSet     = IconSet.SHINY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 1811L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1024L
            speed      = 12.0f
        }

        meta {
            numericId           = 8739
            hashId              = 1324
            originalMod         = "alfheim"
            hidden              = true
            handleMaterial      = ref("any_magical_wood")
            aspect("Metallum - 2")
            aspect("Praecantio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Knightmetal = material("knightmetal") {
        appearance {
            color       = Rgba(210, 240, 200, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 55L
            density      = 7.874
            meltingPoint = 2146L
            boilingPoint = 3234L
            plasmaPoint  = 323400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 8.0f
        }

        processing {
            generifyingTarget      = "steel" amount 648648000L
        }

        composition {
            formula = "Fe₂Ma"
            component("steel", 648648000L)
            component("magic", 324324000L)
        }

        meta {
            numericId           = 8674
            hashId              = 1257
            originalMod         = "TwilightForest"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Telum - 1")
            aspect("Praecantio - 1")
            reRegisteredTo("any_iron_or_steel")
            reRegisteredTo("any_iron_steel")
            reRegisteredTo("knight_metal")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAZEBREAKER,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Brass = material("brass") {
        appearance {
            color       = Rgba(255, 180, 0, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.5035
            meltingPoint = 1160L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
            hasMetallum  = true
        }

        tool {
            types      = 2
            quality    = 1
            durability = 96L
            speed      = 7.0f
        }

        processing {
            byProduct("copper", "zinc", "arsenic")
        }

        composition {
            formula = "Cu₃Zn"
            component("copper", 486486000L)
            component("zinc", 162162000L)
        }

        meta {
            numericId           = 8620
            hashId              = 1188
            originalMod         = "Redpower"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Instrumentum - 1")
            alloyRef("red_steel")
            alloyRef("cobalt_brass")
            alloyRef("bismuth_bronze")
            alloyRef("meteoric_red_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.SOFT,
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Invar = material("invar") {
        appearance {
            color       = Rgba(220, 220, 150, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 26
            electrons    = 26
            neutrons     = 30
            mass         = 56L
            density      = 8.22
            meltingPoint = 1916L
            boilingPoint = 3151L
            plasmaPoint  = 315133L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 6.0f
        }

        composition {
            formula = "Fe₂Ni"
            component("wrought_iron", 432432000L)
            component("nickel", 216216000L)
        }

        meta {
            numericId           = 8661
            hashId              = 1243
            originalMod         = "ThermalExpansion"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Gelum - 1")
            alloyRef("stainless_steel")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.PROJECTILES,
            MaterialTag.ItemGenerator.INGOTS_HOT,
            MaterialTag.ItemGenerator.MULTIINGOTS,
            MaterialTag.ItemGenerator.MULTIPLATES,
            MaterialTag.ItemGenerator.DENSEPLATES,
            MaterialTag.Compounds.ALLOY,
            MaterialTag.Compounds.DECOMPOSABLE,
            MaterialTag.Properties.MAGNETIC_PASSIVE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Processing.CENTRIFUGABLE,
            MaterialTag.Processing.CRUCIBLE_ALLOY,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.UUM_SYNTHESISABLE,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.ItemGenerator.FOILS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.INGOTS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }
}
