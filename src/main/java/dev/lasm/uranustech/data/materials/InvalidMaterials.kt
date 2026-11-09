package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: InvalidMaterials
@Suppress("unused") object InvalidMaterials {
    fun init() = Unit

    val AntiTriseptbium = material("anti_triseptbium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_gravitonium")
        }

        meta {
            numericId           = -1
            hashId              = 2043
            toThis("anti_gravitonium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Tumbaga = material("tumbaga") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("rose_gold")
        }

        meta {
            numericId           = -1
            hashId              = 1183
            toThis("rose_gold")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PotassiumPersulphate = material("potassium_persulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_persulfate")
        }

        meta {
            numericId           = -1
            hashId              = 702
            toThis("potassium_persulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Astatine209 = material("astatine209") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("astatine")
        }

        meta {
            numericId           = -1
            hashId              = 178
            toThis("astatine")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PotassiumPyrosulphate = material("potassium_pyrosulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_pyrosulfate")
        }

        meta {
            numericId           = -1
            hashId              = 710
            toThis("potassium_pyrosulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Gyubnera = material("gyubnera") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("huebnerite")
        }

        meta {
            numericId           = -1
            hashId              = 1462
            toThis("huebnerite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val VolcanicAsh = material("volcanic_ash") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("volcanic_ashes")
        }

        meta {
            numericId           = -1
            hashId              = 789
            toThis("volcanic_ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Osmium = material("osmium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("germanium")
        }

        meta {
            numericId           = -1
            hashId              = 110
            toThis("germanium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Lantanum = material("lantanum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("lanthanium")
        }

        meta {
            numericId           = -1
            hashId              = 139
            toThis("lanthanium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnySand = material("any_sand") {
        name = "Sand"

        appearance {
            color       = Rgba(250, 250, 200, 255)
            iconSet     = IconSet.SAND
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
        }

        fluids {
            solidifyingTarget = "sand" amount 648648000L
            smeltingTarget    = "glass" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "sand" amount 648648000L
            smashingTarget        = "sand" amount 648648000L
            cuttingTarget         = "sand" amount 648648000L
            workingTarget         = "sand" amount 648648000L
            forgingTarget         = "glass" amount 648648000L
            burningTarget         = "sand" amount 0L
            bendingTarget         = "sand" amount 648648000L
            compressingTarget     = "sand" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 37
            toThis("sand")
            toThis("red_sand")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val Np237 = material("np237") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("neptunium")
        }

        meta {
            numericId           = -1
            hashId              = 200
            toThis("neptunium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Ium = material("ium") {
        name = "ium"

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2213
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val Flour = material("flour") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wheat")
        }

        meta {
            numericId           = -1
            hashId              = 890
            toThis("wheat")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val RedRock = material("red_rock") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("redrock")
        }

        meta {
            numericId           = -1
            hashId              = 1382
            toThis("redrock")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnySalt = material("any_salt") {
        name = "Salt"

        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.CUBE
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 0.487107
            meltingPoint = 1074L
            boilingPoint = 1686L
            plasmaPoint  = 168600L
        }

        fluids {
            solidifyingTarget = "salt" amount 648648000L
            smeltingTarget    = "salt" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "salt" amount 648648000L
            smashingTarget        = "salt" amount 648648000L
            cuttingTarget         = "salt" amount 648648000L
            workingTarget         = "salt" amount 648648000L
            forgingTarget         = "salt" amount 648648000L
            burningTarget         = "salt" amount 0L
            bendingTarget         = "salt" amount 648648000L
            compressingTarget     = "salt" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 22
            toThis("lithium_chloride")
            toThis("sylvite")
            toThis("salt")
            toThis("magnesium_chloride")
            toThis("calcium_chloride")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val GlauconiteSand = material("glauconite_sand") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("glauconite")
        }

        meta {
            numericId           = -1
            hashId              = 1501
            toThis("glauconite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Cupronickel = material("cupronickel") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("constantan")
        }

        meta {
            numericId           = -1
            hashId              = 1245
            toThis("constantan")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SaltWater = material("salt_water") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("saltwater")
        }

        meta {
            numericId           = -1
            hashId              = 688
            toThis("saltwater")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Gasoline = material("gasoline") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("petrol")
        }

        meta {
            numericId           = -1
            hashId              = 760
            toThis("petrol")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnySteel = material("any_steel") {
        name = "Any Steel"

        appearance {
            colorSolid  = Rgba(130, 130, 130, 255)
            colorLiquid = Rgba(255, 20, 10, 255)
            colorGas    = Rgba(130, 130, 130, 255)
            colorPlasma = Rgba(130, 130, 130, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 51
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val GreenTigerEye = material("green_tiger_eye") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("cats_eye")
        }

        meta {
            numericId           = -1
            hashId              = 979
            toThis("cats_eye")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val YellowTigerEye = material("yellow_tiger_eye") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tiger_eye")
        }

        meta {
            numericId           = -1
            hashId              = 977
            toThis("tiger_eye")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val BrickNether = material("brick_nether") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("nether_brick")
        }

        meta {
            numericId           = -1
            hashId              = 1128
            toThis("nether_brick")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiUranium238 = material("anti_uranium238") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_uranium")
        }

        meta {
            numericId           = -1
            hashId              = 1746
            toThis("anti_uranium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SodiumHydrogenSulphate = material("sodium_hydrogen_sulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_bisulfate")
        }

        meta {
            numericId           = -1
            hashId              = 672
            toThis("sodium_bisulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Cobblestone = material("cobblestone") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2074
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Beeswax = material("beeswax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_bee")
        }

        meta {
            numericId           = -1
            hashId              = 824
            toThis("wax_bee")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Nitre = material("nitre") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("niter")
        }

        meta {
            numericId           = -1
            hashId              = 855
            toThis("niter")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val CassiteriteSand = material("cassiterite_sand") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("cassiterite")
        }

        meta {
            numericId           = -1
            hashId              = 1434
            toThis("cassiterite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Bitriennium = material("bitriennium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("mac_guffium")
        }

        meta {
            numericId           = -1
            hashId              = 378
            toThis("mac_guffium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiPlutonium244 = material("anti_plutonium244") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_plutonium")
        }

        meta {
            numericId           = -1
            hashId              = 1751
            toThis("anti_plutonium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PTFE = material("ptfe") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("teflon")
        }

        meta {
            numericId           = -1
            hashId              = 868
            toThis("teflon")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyThaumicCrystal = material("any_thaumic_crystal") {
        name = "Any Thaumic Crystal"

        appearance {
            color       = Rgba(252, 252, 252, 255)
            iconSet     = IconSet.SHARDS
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 64L
            speed      = 32.0f
        }

        meta {
            numericId           = -1
            hashId              = 39
            toThis("infused_entropy")
            toThis("infused_order")
            toThis("infused_balance")
            toThis("infused_dull")
            toThis("infused_vis")
            toThis("infused_air")
            toThis("infused_fire")
            toThis("infused_earth")
            toThis("infused_water")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnyEmerald = material("any_emerald") {
        name = "Emerald"

        appearance {
            color       = Rgba(80, 255, 80, 127)
            iconSet     = IconSet.EMERALD
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 18L
            density      = 0.8603214469
            meltingPoint = 1803L
            boilingPoint = 2851L
            plasmaPoint  = 285193L
        }

        fluids {
            solidifyingTarget = "emerald" amount 648648000L
            smeltingTarget    = "beryllium" amount 18018000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 9.0f
        }

        processing {
            pulverTarget          = "emerald" amount 648648000L
            smashingTarget        = "emerald" amount 648648000L
            cuttingTarget         = "emerald" amount 648648000L
            workingTarget         = "emerald" amount 648648000L
            forgingTarget         = "emerald" amount 648648000L
            burningTarget         = "emerald" amount 0L
            bendingTarget         = "emerald" amount 648648000L
            compressingTarget     = "emerald" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 4
            toThis("maxixe")
            toThis("emeradic")
            toThis("emerald")
            toThis("aquamarine")
            toThis("morganite")
            toThis("heliodor")
            toThis("goshenite")
            toThis("bixbite")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AntiUnunseptium = material("anti_ununseptium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_farnsium")
        }

        meta {
            numericId           = -1
            hashId              = 1779
            toThis("anti_farnsium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SmokyQuartz = material("smoky_quartz") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("smokey_quartz")
        }

        meta {
            numericId           = -1
            hashId              = 1081
            toThis("smokey_quartz")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Aluminum = material("aluminum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("aluminium")
        }

        meta {
            numericId           = -1
            hashId              = 84
            toThis("aluminium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Ferrovanadium = material("ferrovanadium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("vanadium_magnetite")
        }

        meta {
            numericId           = -1
            hashId              = 1475
            toThis("vanadium_magnetite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PotassiumSulphate = material("potassium_sulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_sulfate")
        }

        meta {
            numericId           = -1
            hashId              = 708
            toThis("potassium_sulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Fossil = material("fossil") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("bone")
        }

        meta {
            numericId           = -1
            hashId              = 874
            toThis("bone")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val RefinedCavenium = material("refined_cavenium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("cavenium_refined")
        }

        meta {
            numericId           = -1
            hashId              = 2121
            toThis("cavenium_refined")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val BasaltBricks = material("basalt_bricks") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2201
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val Peanutwood = material("peanutwood") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("peanut_wood")
        }

        meta {
            numericId           = -1
            hashId              = 817
            toThis("peanut_wood")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyIronSteel = material("any_iron_steel") {
        name = "Steel"

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
        }

        fluids {
            solidifyingTarget = "steel" amount 648648000L
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
            cuttingTarget         = "steel" amount 648648000L
            workingTarget         = "steel" amount 648648000L
            forgingTarget         = "steel" amount 648648000L
            burningTarget         = "steel" amount 0L
            bendingTarget         = "steel" amount 648648000L
            compressingTarget     = "steel" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 25
            toThis("knightmetal")
            toThis("meteoric_steel")
            toThis("steel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val RedTigerEye = material("red_tiger_eye") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("dragon_eye")
        }

        meta {
            numericId           = -1
            hashId              = 981
            toThis("dragon_eye")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Ash = material("ash") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("ashes")
        }

        meta {
            numericId           = -1
            hashId              = 783
            toThis("ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GarnetPurple = material("garnet_purple") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("pyrope")
        }

        meta {
            numericId           = -1
            hashId              = 962
            toThis("pyrope")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SodiumSulphide = material("sodium_sulphide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_sulfide")
        }

        meta {
            numericId           = -1
            hashId              = 676
            toThis("sodium_sulfide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AshDark = material("ash_dark") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("dark_ashes")
        }

        meta {
            numericId           = -1
            hashId              = 786
            toThis("dark_ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AndesitePolished = material("andesite_polished") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2212
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val AnyAshes = material("any_ashes") {
        name = "Ashes"

        appearance {
            color       = Rgba(120, 120, 120, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            solidifyingTarget = "ashes" amount 648648000L
            smeltingTarget    = "ashes" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "ashes" amount 648648000L
            smashingTarget        = "ashes" amount 648648000L
            cuttingTarget         = "ashes" amount 648648000L
            workingTarget         = "ashes" amount 648648000L
            forgingTarget         = "ashes" amount 648648000L
            burningTarget         = "ashes" amount 0L
            bendingTarget         = "ashes" amount 648648000L
            compressingTarget     = "ashes" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 31
            toThis("dark_ashes")
            toThis("volcanic_ashes")
            toThis("ashes")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val StrengthenedTerrasteelAlloy = material("strengthened_terrasteel_alloy") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("terrasteel_alloy_strengthened")
        }

        meta {
            numericId           = -1
            hashId              = 2086
            toThis("terrasteel_alloy_strengthened")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val TungstenOxide = material("tungsten_oxide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungsten_trioxide")
        }

        meta {
            numericId           = -1
            hashId              = 619
            toThis("tungsten_trioxide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyCarbon = material("any_carbon") {
        name = "Carbon"

        appearance {
            color       = Rgba(20, 20, 20, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 2.267
            meltingPoint = 3800L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            solidifyingTarget = "carbon" amount 648648000L
            smeltingTarget    = "carbon" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "carbon" amount 648648000L
            smashingTarget        = "carbon" amount 648648000L
            cuttingTarget         = "carbon" amount 648648000L
            workingTarget         = "carbon" amount 648648000L
            forgingTarget         = "carbon" amount 648648000L
            burningTarget         = "carbon" amount 0L
            bendingTarget         = "carbon" amount 648648000L
            compressingTarget     = "carbon" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 32
            toThis("graphene")
            toThis("graphite")
            toThis("carbon")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val AnyNormalWood = material("any_normal_wood") {
        name = "Normal Wood"

        appearance {
            color       = Rgba(102, 79, 47, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
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
        }

        meta {
            numericId           = -1
            hashId              = 43
            furnaceBurnTime     = 100L
            toThis("wood_bleached")
            toThis("wood_tainted")
            toThis("maple")
            toThis("willow")
            toThis("blue_mahoe")
            toThis("hazel")
            toThis("cinnamonwood")
            toThis("coconutwood")
            toThis("rainbowood")
            toThis("blue_spruce")
            toThis("towerwood")
            toThis("witchwood")
            toThis("ogrewood")
            toThis("wyvernwood")
            toThis("aspen")
            toThis("douglas_fir")
            toThis("sycamore")
            toThis("white_cedar")
            toThis("white_elm")
            toThis("thorntree")
            toThis("silver_pine")
            toThis("alder")
            toThis("hawthorn")
            toThis("rowan")
            toThis("mahogany")
            toThis("palm")
            toThis("autumnwood")
            toThis("cypress")
            toThis("fir")
            toThis("japanese_maple")
            toThis("rainbow_eucalyptus")
            toThis("redwood")
            toThis("sakura")
            toThis("balsa")
            toThis("baobab")
            toThis("cherrywood")
            toThis("wood")
            toThis("chestnutwood")
            toThis("citruswood")
            toThis("cocobolowood")
            toThis("ebony")
            toThis("wood_rubber")
            toThis("giganteumwood")
            toThis("bamboo")
            toThis("greenheart")
            toThis("skyroot")
            toThis("ipe")
            toThis("weedwood")
            toThis("kapok")
            toThis("larch")
            toThis("limewood")
            toThis("mahoe")
            toThis("padauk")
            toThis("peanut_wood")
            toThis("papayawood")
            toThis("plumwood")
            toThis("poplar")
            toThis("sequoia")
            toThis("teak")
            toThis("walnutwood")
            toThis("wenge")
            toThis("zebrawood")
            toThis("pine")
            toThis("darkwood")
            toThis("etherealwood")
            toThis("goldwood")
            toThis("hellbark")
            toThis("jacaranda")
            toThis("mangrove")
            toThis("sacred_oak")
            toThis("magicwood")
            toThis("applewood")
            toThis("ashwood")
            toThis("beech")
            toThis("boxwood")
            toThis("brazilwood")
            toThis("butternutwood")
            toThis("cedar")
            toThis("elderwood")
            toThis("elm")
            toThis("eucalyptus")
            toThis("figwood")
            toThis("gingko")
            toThis("hemlock")
            toThis("hickory")
            toThis("holly")
            toThis("hornbeam")
            toThis("iroko")
            toThis("locust")
            toThis("logwood")
            toThis("maclura")
            toThis("olivewood")
            toThis("pearwood")
            toThis("pink_ivory")
            toThis("purpleheart")
            toThis("rosewood")
            toThis("sweetgum")
            toThis("syzgium")
            toThis("whitebeam")
            toThis("yew")
            toThis("oak")
            toThis("birch")
            toThis("spruce")
            toThis("junglewood")
            toThis("acacia")
            toThis("dark_oak")
            toThis("crimsonwood")
            toThis("warpedwood")
            toThis("foxfirewood")
            toThis("wood_compressed")
            toThis("wood_dead")
            toThis("wood_rotten")
            toThis("wood_mossy")
            toThis("wood_frozen")
            toThis("wood_scorched")
            toThis("wood_varnished")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Polycarbonate = material("polycarbonate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("hard_plastic")
        }

        meta {
            numericId           = -1
            hashId              = 872
            toThis("hard_plastic")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Bibibium = material("bibibium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("adamantium")
        }

        meta {
            numericId           = -1
            hashId              = 360
            toThis("adamantium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyDiamond = material("any_diamond") {
        name = "Diamond"

        appearance {
            color       = Rgba(200, 255, 255, 127)
            iconSet     = IconSet.DIAMOND
        }

        physics {
            protons      = 24
            electrons    = 24
            neutrons     = 24
            mass         = 48L
            density      = 3.53
            meltingPoint = 4200L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            solidifyingTarget = "diamond" amount 648648000L
            smeltingTarget    = "carbon" amount 1297296000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 1280L
            speed      = 8.0f
        }

        processing {
            pulverTarget          = "diamond" amount 648648000L
            smashingTarget        = "diamond" amount 648648000L
            cuttingTarget         = "diamond" amount 648648000L
            workingTarget         = "diamond" amount 648648000L
            forgingTarget         = "diamond" amount 648648000L
            burningTarget         = "ashes" amount 648648000L
            bendingTarget         = "diamond" amount 648648000L
            compressingTarget     = "diamond" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 2
            toThis("blue_diamond")
            toThis("green_diamond")
            toThis("purple_diamond")
            toThis("diamantine")
            toThis("red_diamond")
            toThis("yellow_diamond")
            toThis("pink_diamond")
            toThis("diamond_industrial")
            toThis("mana_diamond")
            toThis("elven_dragonstone")
            toThis("gravitite")
            toThis("diamond")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Vibrant = material("vibrant") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("vibrant_alloy")
        }

        meta {
            numericId           = -1
            hashId              = 1305
            toThis("vibrant_alloy")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyClay = material("any_clay") {
        name = "Clay"

        appearance {
            color       = Rgba(230, 140, 75, 255)
            iconSet     = IconSet.ROUGH
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 21L
            density      = 1.318339944
            meltingPoint = 2000L
            boilingPoint = 4000L
            plasmaPoint  = 400000L
        }

        fluids {
            solidifyingTarget = "clay" amount 648648000L
            smeltingTarget    = "ceramic" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "clay" amount 648648000L
            smashingTarget        = "clay" amount 648648000L
            cuttingTarget         = "clay" amount 648648000L
            workingTarget         = "clay" amount 648648000L
            forgingTarget         = "clay" amount 648648000L
            burningTarget         = "clay" amount 0L
            bendingTarget         = "clay" amount 648648000L
            compressingTarget     = "clay" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 21
            toThis("bentonite")
            toThis("palygorskite")
            toThis("kaolinite")
            toThis("clay")
            toThis("clay_brown")
            toThis("clay_red")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val Coke = material("coke") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("coal_coke")
        }

        meta {
            numericId           = -1
            hashId              = 1047
            toThis("coal_coke")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiTitan = material("anti_titan") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_titanium")
        }

        meta {
            numericId           = -1
            hashId              = 1668
            toThis("anti_titanium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyTreatedWood = material("any_treated_wood") {
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
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
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
        }

        meta {
            numericId           = -1
            hashId              = 45
            furnaceBurnTime     = 100L
            toThis("wood_treated")
            toThis("wood_polished")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Salpeter = material("salpeter") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_nitrate")
        }

        meta {
            numericId           = -1
            hashId              = 697
            toThis("potassium_nitrate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val NaturalAluminum = material("natural_aluminum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("alumina")
        }

        meta {
            numericId           = -1
            hashId              = 622
            toThis("alumina")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val BandedIron = material("banded_iron") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("hematite")
        }

        meta {
            numericId           = -1
            hashId              = 631
            toThis("hematite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyAmber = material("any_amber") {
        name = "Amber"

        appearance {
            color       = Rgba(255, 180, 0, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 473L
            boilingPoint = 946L
            plasmaPoint  = 94600L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 4.0f
        }

        meta {
            numericId           = -1
            hashId              = 10
            toThis("golden_amber")
            toThis("dominican_amber")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Saphire = material("saphire") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sapphire")
        }

        meta {
            numericId           = -1
            hashId              = 947
            toThis("sapphire")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Lantanium = material("lantanium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("lanthanium")
        }

        meta {
            numericId           = -1
            hashId              = 138
            toThis("lanthanium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Paraffinwax = material("paraffinwax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_paraffin")
        }

        meta {
            numericId           = -1
            hashId              = 832
            toThis("wax_paraffin")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyCoalCarbon = material("any_coal_carbon") {
        name = "Carbon"

        appearance {
            color       = Rgba(20, 20, 20, 255)
            iconSet     = IconSet.FINE
        }

        physics {
            protons      = 6
            electrons    = 6
            neutrons     = 6
            mass         = 12L
            density      = 2.267
            meltingPoint = 3800L
            boilingPoint = 4300L
            plasmaPoint  = 430000L
        }

        fluids {
            solidifyingTarget = "carbon" amount 648648000L
            smeltingTarget    = "carbon" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "carbon" amount 648648000L
            smashingTarget        = "carbon" amount 648648000L
            cuttingTarget         = "carbon" amount 648648000L
            workingTarget         = "carbon" amount 648648000L
            forgingTarget         = "carbon" amount 648648000L
            burningTarget         = "carbon" amount 0L
            bendingTarget         = "carbon" amount 648648000L
            compressingTarget     = "carbon" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 33
            toThis("graphene")
            toThis("charcoal")
            toThis("graphite")
            toThis("coal")
            toThis("coal_coke")
            toThis("carbon")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val Gol198 = material("gol198") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("gold198")
        }

        meta {
            numericId           = -1
            hashId              = 168
            toThis("gold198")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Unseptquadium = material("unseptquadium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("naquadah")
        }

        meta {
            numericId           = -1
            hashId              = 302
            toThis("naquadah")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GarnetGreen = material("garnet_green") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("uvarovite")
        }

        meta {
            numericId           = -1
            hashId              = 968
            toThis("uvarovite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnySilicon = material("any_silicon") {
        name = "Silicon"

        appearance {
            color       = Rgba(60, 60, 80, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 14
            electrons    = 14
            neutrons     = 14
            mass         = 28L
            density      = 2.3296
            meltingPoint = 1687L
            boilingPoint = 3538L
            plasmaPoint  = 353800L
        }

        fluids {
            solidifyingTarget = "silicon" amount 648648000L
            smeltingTarget    = "silicon" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "silicon" amount 648648000L
            smashingTarget        = "silicon" amount 648648000L
            cuttingTarget         = "silicon" amount 648648000L
            workingTarget         = "silicon" amount 648648000L
            forgingTarget         = "silicon" amount 648648000L
            burningTarget         = "silicon" amount 0L
            bendingTarget         = "silicon" amount 648648000L
            compressingTarget     = "silicon" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 34
            toThis("silicon")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.MELTING,
        )

    }

    val AntiQuicksilver = material("anti_quicksilver") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_mercury")
        }

        meta {
            numericId           = -1
            hashId              = 1732
            toThis("anti_mercury")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val DarkSteel = material("dark_steel") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("obsidian_steel")
        }

        meta {
            numericId           = -1
            hashId              = 1299
            toThis("obsidian_steel")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val FullersEarth = material("fullers_earth") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("palygorskite")
        }

        meta {
            numericId           = -1
            hashId              = 850
            toThis("palygorskite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Oats = material("oats") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("oat")
        }

        meta {
            numericId           = -1
            hashId              = 895
            toThis("oat")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyCalcite = material("any_calcite") {
        name = "Calcite"

        appearance {
            color       = Rgba(250, 230, 220, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 9
            electrons    = 9
            neutrons     = 9
            mass         = 20L
            density      = 0.7622574
            meltingPoint = 1612L
            plasmaPoint  = 300000L
        }

        fluids {
            solidifyingTarget = "calcite" amount 648648000L
            smeltingTarget    = "calcite" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "calcite" amount 648648000L
            smashingTarget        = "calcite" amount 648648000L
            cuttingTarget         = "calcite" amount 648648000L
            workingTarget         = "calcite" amount 648648000L
            forgingTarget         = "calcite" amount 648648000L
            burningTarget         = "calcite" amount 0L
            bendingTarget         = "calcite" amount 648648000L
            compressingTarget     = "calcite" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 20
            toThis("calcite")
            toThis("chalk")
            toThis("dolomite")
            toThis("marble")
            toThis("limestone")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val CrudeSteel = material("crude_steel") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("clay_compound")
        }

        meta {
            numericId           = -1
            hashId              = 1309
            toThis("clay_compound")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SolutionNickelSulfate = material("solution_nickel_sulfate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("cyan_vitriol")
        }

        meta {
            numericId           = -1
            hashId              = 729
            toThis("cyan_vitriol")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Sylvine = material("sylvine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sylvite")
        }

        meta {
            numericId           = -1
            hashId              = 693
            toThis("sylvite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Radium226 = material("radium226") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("radium")
        }

        meta {
            numericId           = -1
            hashId              = 183
            toThis("radium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Titan = material("titan") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("titanium")
        }

        meta {
            numericId           = -1
            hashId              = 96
            toThis("titanium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyIron = material("any_iron") {
        name = "Iron"

        appearance {
            colorSolid  = Rgba(200, 200, 200, 255)
            colorLiquid = Rgba(255, 64, 32, 255)
            colorGas    = Rgba(200, 200, 200, 255)
            colorPlasma = Rgba(200, 200, 200, 255)
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
        }

        fluids {
            solidifyingTarget = "iron" amount 648648000L
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
            cuttingTarget         = "iron" amount 648648000L
            workingTarget         = "iron" amount 648648000L
            forgingTarget         = "iron" amount 648648000L
            burningTarget         = "iron" amount 0L
            bendingTarget         = "iron" amount 648648000L
            compressingTarget     = "iron" amount 648648000L
            reversingTarget        = ref("any_iron_or_steel")
        }

        meta {
            numericId           = -1
            hashId              = 23
            toThis("cast_iron")
            toThis("iron")
            toThis("enori")
            toThis("wrought_iron")
            toThis("meteoric_iron")
            toThis("pig_iron")
            toThis("meteorite")
            toThis("iron_compressed")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AntiChrome = material("anti_chrome") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_chromium")
        }

        meta {
            numericId           = -1
            hashId              = 1671
            toThis("anti_chromium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GarnetYellow = material("garnet_yellow") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("andradite")
        }

        meta {
            numericId           = -1
            hashId              = 966
            toThis("andradite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SodiumSulphite = material("sodium_sulphite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_sulfite")
        }

        meta {
            numericId           = -1
            hashId              = 678
            toThis("sodium_sulfite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val RomanVitriol = material("roman_vitriol") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("blue_vitriol")
        }

        meta {
            numericId           = -1
            hashId              = 722
            toThis("blue_vitriol")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Carbide = material("carbide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungsten_carbide")
        }

        meta {
            numericId           = -1
            hashId              = 1208
            toThis("tungsten_carbide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Neptunium237 = material("neptunium237") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("neptunium")
        }

        meta {
            numericId           = -1
            hashId              = 199
            toThis("neptunium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Valerite = material("valerite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("calcite")
        }

        meta {
            numericId           = -1
            hashId              = 645
            toThis("calcite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Illmenite = material("illmenite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("ilmenite")
        }

        meta {
            numericId           = -1
            hashId              = 1480
            toThis("ilmenite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiAdamant = material("anti_adamant") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_adamantium")
        }

        meta {
            numericId           = -1
            hashId              = 1890
            toThis("anti_adamantium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiUran = material("anti_uran") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_uranium")
        }

        meta {
            numericId           = -1
            hashId              = 1747
            toThis("anti_uranium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val QuartzSmoky = material("quartz_smoky") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("smokey_quartz")
        }

        meta {
            numericId           = -1
            hashId              = 1080
            toThis("smokey_quartz")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val LiquifiedCoralium = material("liquified_coralium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("coralium")
        }

        meta {
            numericId           = -1
            hashId              = 319
            toThis("coralium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SodiumHydrogenSulfate = material("sodium_hydrogen_sulfate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_bisulfate")
        }

        meta {
            numericId           = -1
            hashId              = 671
            toThis("sodium_bisulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Beewax = material("beewax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_bee")
        }

        meta {
            numericId           = -1
            hashId              = 826
            toThis("wax_bee")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val RefinedIron = material("refined_iron") {
        name = "Refined Iron"

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
            meltingPoint = 2011L
            boilingPoint = 3134L
            plasmaPoint  = 313400L
        }

        fluids {
            solidifyingTarget = "iron" amount 648648000L
            smeltingTarget    = "iron" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 384L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "iron" amount 648648000L
            smashingTarget        = "iron" amount 648648000L
            cuttingTarget         = "iron" amount 648648000L
            workingTarget         = "iron" amount 648648000L
            forgingTarget         = "iron" amount 648648000L
            burningTarget         = "iron" amount 0L
            bendingTarget         = "iron" amount 648648000L
            compressingTarget     = "iron" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 2075
            originalMod         = "IC2"
            handleMaterial      = ref("any_wood_or_plastic")
            toThis("wrought_iron")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnyWoodOrPlastic = material("any_wood_or_plastic") {
        name = "Any Wood Or Plastic"

        appearance {
            color       = Rgba(102, 79, 47, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
        }

        meta {
            numericId           = -1
            hashId              = 47
            toThis("wood_bleached")
            toThis("wood_tainted")
            toThis("maple")
            toThis("willow")
            toThis("blue_mahoe")
            toThis("hazel")
            toThis("cinnamonwood")
            toThis("coconutwood")
            toThis("rainbowood")
            toThis("blue_spruce")
            toThis("towerwood")
            toThis("witchwood")
            toThis("ogrewood")
            toThis("wyvernwood")
            toThis("aspen")
            toThis("douglas_fir")
            toThis("sycamore")
            toThis("white_cedar")
            toThis("white_elm")
            toThis("thorntree")
            toThis("silver_pine")
            toThis("alder")
            toThis("hawthorn")
            toThis("rowan")
            toThis("mahogany")
            toThis("palm")
            toThis("autumnwood")
            toThis("cypress")
            toThis("fir")
            toThis("japanese_maple")
            toThis("rainbow_eucalyptus")
            toThis("redwood")
            toThis("sakura")
            toThis("balsa")
            toThis("baobab")
            toThis("wood")
            toThis("cherrywood")
            toThis("wood_treated")
            toThis("chestnutwood")
            toThis("citruswood")
            toThis("wood_polished")
            toThis("cocobolowood")
            toThis("wood_rubber")
            toThis("ebony")
            toThis("bamboo")
            toThis("giganteumwood")
            toThis("skyroot")
            toThis("greenheart")
            toThis("weedwood")
            toThis("ipe")
            toThis("livingwood")
            toThis("kapok")
            toThis("dreamwood")
            toThis("larch")
            toThis("shimmerwood")
            toThis("limewood")
            toThis("greatwood")
            toThis("mahoe")
            toThis("silverwood")
            toThis("padauk")
            toThis("peanut_wood")
            toThis("papayawood")
            toThis("any_plastic")
            toThis("marshmallow")
            toThis("plumwood")
            toThis("poplar")
            toThis("sequoia")
            toThis("petrified_wood")
            toThis("teak")
            toThis("walnutwood")
            toThis("wenge")
            toThis("zebrawood")
            toThis("pine")
            toThis("darkwood")
            toThis("etherealwood")
            toThis("goldwood")
            toThis("hellbark")
            toThis("jacaranda")
            toThis("mangrove")
            toThis("sacred_oak")
            toThis("magicwood")
            toThis("applewood")
            toThis("ashwood")
            toThis("beech")
            toThis("boxwood")
            toThis("brazilwood")
            toThis("butternutwood")
            toThis("cedar")
            toThis("elderwood")
            toThis("elm")
            toThis("eucalyptus")
            toThis("figwood")
            toThis("gingko")
            toThis("hemlock")
            toThis("hickory")
            toThis("holly")
            toThis("hornbeam")
            toThis("iroko")
            toThis("locust")
            toThis("logwood")
            toThis("maclura")
            toThis("olivewood")
            toThis("pearwood")
            toThis("pink_ivory")
            toThis("purpleheart")
            toThis("rosewood")
            toThis("sweetgum")
            toThis("syzgium")
            toThis("whitebeam")
            toThis("yew")
            toThis("oak")
            toThis("birch")
            toThis("spruce")
            toThis("junglewood")
            toThis("acacia")
            toThis("dark_oak")
            toThis("crimsonwood")
            toThis("warpedwood")
            toThis("foxfirewood")
            toThis("wood_compressed")
            toThis("wood_dead")
            toThis("wood_rotten")
            toThis("wood_mossy")
            toThis("wood_frozen")
            toThis("wood_scorched")
            toThis("wood_varnished")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Thorium232 = material("thorium232") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("thorium")
        }

        meta {
            numericId           = -1
            hashId              = 186
            toThis("thorium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Unoctseptium = material("unoctseptium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("dreadium")
        }

        meta {
            numericId           = -1
            hashId              = 321
            toThis("dreadium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnySiliconDioxide = material("any_silicon_dioxide") {
        name = "Silicon Dioxide"

        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        fluids {
            solidifyingTarget = "silicon_dioxide" amount 648648000L
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "silicon_dioxide" amount 648648000L
            smashingTarget        = "silicon_dioxide" amount 648648000L
            cuttingTarget         = "silicon_dioxide" amount 648648000L
            workingTarget         = "silicon_dioxide" amount 648648000L
            forgingTarget         = "silicon_dioxide" amount 648648000L
            burningTarget         = "silicon_dioxide" amount 0L
            bendingTarget         = "silicon_dioxide" amount 648648000L
            compressingTarget     = "silicon_dioxide" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 35
            toThis("silicon_dioxide")
            toThis("glass")
            toThis("flint")
            toThis("milky_quartz")
            toThis("nether_quartz")
            toThis("void_quartz")
            toThis("sunny_quartz")
            toThis("quartzite")
            toThis("lavender_quartz")
            toThis("red_quartz")
            toThis("blaze_quartz")
            toThis("smokey_quartz")
            toThis("sand")
            toThis("red_sand")
            toThis("mana_quartz")
            toThis("white_end_sand")
            toThis("elven_quartz")
            toThis("black_end_sand")
            toThis("quartz_black")
            toThis("certus_quartz")
            toThis("charged_certus_quartz")
            toThis("fluix")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val Unoctpentium = material("unoctpentium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("abyssalnite")
        }

        meta {
            numericId           = -1
            hashId              = 316
            toThis("abyssalnite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Ancient = material("ancient") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("ancient_debris")
        }

        meta {
            numericId           = -1
            hashId              = 1330
            toThis("ancient_debris")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val TungstenSteel = material("tungsten_steel") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungstensteel")
        }

        meta {
            numericId           = -1
            hashId              = 1204
            toThis("tungstensteel")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val ScarletEmerald = material("scarlet_emerald") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("bixbite")
        }

        meta {
            numericId           = -1
            hashId              = 944
            toThis("bixbite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Onyx = material("onyx") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("onyx_black")
        }

        meta {
            numericId           = -1
            hashId              = 1003
            toThis("onyx_black")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val U238 = material("u238") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("uranium")
        }

        meta {
            numericId           = -1
            hashId              = 192
            toThis("uranium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Mythril = material("mythril") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("mithril")
        }

        meta {
            numericId           = -1
            hashId              = 1172
            toThis("mithril")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Void = material("void") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("void_metal")
        }

        meta {
            numericId           = -1
            hashId              = 1270
            toThis("void_metal")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Am242 = material("am242") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("americium242")
        }

        meta {
            numericId           = -1
            hashId              = 216
            toThis("americium242")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Fiery = material("fiery") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("fiery_steel")
        }

        meta {
            numericId           = -1
            hashId              = 1260
            toThis("fiery_steel")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Am241 = material("am241") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("americium241")
        }

        meta {
            numericId           = -1
            hashId              = 214
            toThis("americium241")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val U235 = material("u235") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("uranium235")
        }

        meta {
            numericId           = -1
            hashId              = 195
            toThis("uranium235")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val U233 = material("u233") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("uranium233")
        }

        meta {
            numericId           = -1
            hashId              = 197
            toThis("uranium233")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Gibbsite = material("gibbsite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("aluminium_hydroxide")
        }

        meta {
            numericId           = -1
            hashId              = 625
            toThis("aluminium_hydroxide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyBlackSteel = material("any_black_steel") {
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
        }

        fluids {
            solidifyingTarget = "black_steel" amount 648648000L
            smeltingTarget    = "black_steel" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 768L
            speed      = 6.5f
        }

        processing {
            pulverTarget          = "black_steel" amount 648648000L
            smashingTarget        = "black_steel" amount 648648000L
            cuttingTarget         = "black_steel" amount 648648000L
            workingTarget         = "black_steel" amount 648648000L
            forgingTarget         = "black_steel" amount 648648000L
            burningTarget         = "black_steel" amount 0L
            bendingTarget         = "black_steel" amount 648648000L
            compressingTarget     = "black_steel" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 26
            toThis("meteoric_black_steel")
            toThis("black_steel")
            toThis("meteoflame_black_steel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Lanthanum = material("lanthanum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("lanthanium")
        }

        meta {
            numericId           = -1
            hashId              = 140
            toThis("lanthanium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Au198 = material("au198") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("gold198")
        }

        meta {
            numericId           = -1
            hashId              = 169
            toThis("gold198")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Poison = material("poison") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2200
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val IronOxide = material("iron_oxide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("hematite")
        }

        meta {
            numericId           = -1
            hashId              = 632
            toThis("hematite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GarnetOrange = material("garnet_orange") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("grossular")
        }

        meta {
            numericId           = -1
            hashId              = 960
            toThis("grossular")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Blood = material("blood") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2214
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val AnyFluorite = material("any_fluorite") {
        name = "Fluorite"

        appearance {
            color       = Rgba(225, 185, 140, 255)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 12
            electrons    = 12
            neutrons     = 12
            mass         = 25L
            density      = 0.514464
            meltingPoint = 1633L
            boilingPoint = 3266L
            plasmaPoint  = 326600L
        }

        fluids {
            solidifyingTarget = "fluorite" amount 648648000L
            smeltingTarget    = "fluorite" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "fluorite" amount 648648000L
            smashingTarget        = "fluorite" amount 648648000L
            cuttingTarget         = "fluorite" amount 648648000L
            workingTarget         = "fluorite" amount 648648000L
            forgingTarget         = "fluorite" amount 648648000L
            burningTarget         = "fluorite" amount 0L
            bendingTarget         = "fluorite" amount 648648000L
            compressingTarget     = "fluorite" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 11
            toThis("orange_fluorite")
            toThis("magenta_fluorite")
            toThis("fluorite")
            toThis("red_fluorite")
            toThis("pink_fluorite")
            toThis("blue_fluorite")
            toThis("green_fluorite")
            toThis("black_fluorite")
            toThis("white_fluorite")
            toThis("yellow_fluorite")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.ACID,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val Unknown = material("unknown") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2073
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val DarkAsh = material("dark_ash") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("dark_ashes")
        }

        meta {
            numericId           = -1
            hashId              = 785
            toThis("dark_ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Flux = material("flux") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("calcite")
        }

        meta {
            numericId           = -1
            hashId              = 647
            toThis("calcite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AshVolcanic = material("ash_volcanic") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("volcanic_ashes")
        }

        meta {
            numericId           = -1
            hashId              = 790
            toThis("volcanic_ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val FzDarkIron = material("fz_dark_iron") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("dark_iron")
        }

        meta {
            numericId           = -1
            hashId              = 1221
            toThis("dark_iron")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val ArcaneAsh = material("arcane_ash") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("arcane_ashes")
        }

        meta {
            numericId           = -1
            hashId              = 1018
            toThis("arcane_ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Oilsands = material("oilsands") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("oil_sand")
        }

        meta {
            numericId           = -1
            hashId              = 752
            toThis("oil_sand")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyWood = material("any_wood") {
        name = "Wood"

        appearance {
            color       = Rgba(102, 79, 47, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
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
        }

        meta {
            numericId           = -1
            hashId              = 41
            furnaceBurnTime     = 100L
            toThis("wood_bleached")
            toThis("wood_tainted")
            toThis("maple")
            toThis("willow")
            toThis("blue_mahoe")
            toThis("hazel")
            toThis("cinnamonwood")
            toThis("coconutwood")
            toThis("rainbowood")
            toThis("blue_spruce")
            toThis("towerwood")
            toThis("witchwood")
            toThis("ogrewood")
            toThis("wyvernwood")
            toThis("aspen")
            toThis("douglas_fir")
            toThis("sycamore")
            toThis("white_cedar")
            toThis("white_elm")
            toThis("thorntree")
            toThis("silver_pine")
            toThis("alder")
            toThis("hawthorn")
            toThis("rowan")
            toThis("mahogany")
            toThis("palm")
            toThis("autumnwood")
            toThis("cypress")
            toThis("fir")
            toThis("japanese_maple")
            toThis("rainbow_eucalyptus")
            toThis("redwood")
            toThis("sakura")
            toThis("balsa")
            toThis("baobab")
            toThis("wood")
            toThis("cherrywood")
            toThis("wood_treated")
            toThis("chestnutwood")
            toThis("citruswood")
            toThis("wood_polished")
            toThis("cocobolowood")
            toThis("wood_rubber")
            toThis("ebony")
            toThis("bamboo")
            toThis("giganteumwood")
            toThis("skyroot")
            toThis("greenheart")
            toThis("weedwood")
            toThis("ipe")
            toThis("livingwood")
            toThis("kapok")
            toThis("dreamwood")
            toThis("larch")
            toThis("shimmerwood")
            toThis("limewood")
            toThis("greatwood")
            toThis("mahoe")
            toThis("silverwood")
            toThis("padauk")
            toThis("peanut_wood")
            toThis("papayawood")
            toThis("marshmallow")
            toThis("plumwood")
            toThis("poplar")
            toThis("sequoia")
            toThis("teak")
            toThis("walnutwood")
            toThis("wenge")
            toThis("zebrawood")
            toThis("pine")
            toThis("darkwood")
            toThis("etherealwood")
            toThis("goldwood")
            toThis("hellbark")
            toThis("jacaranda")
            toThis("mangrove")
            toThis("sacred_oak")
            toThis("magicwood")
            toThis("applewood")
            toThis("ashwood")
            toThis("beech")
            toThis("boxwood")
            toThis("brazilwood")
            toThis("butternutwood")
            toThis("cedar")
            toThis("elderwood")
            toThis("elm")
            toThis("eucalyptus")
            toThis("figwood")
            toThis("gingko")
            toThis("hemlock")
            toThis("hickory")
            toThis("holly")
            toThis("hornbeam")
            toThis("iroko")
            toThis("locust")
            toThis("logwood")
            toThis("maclura")
            toThis("olivewood")
            toThis("pearwood")
            toThis("pink_ivory")
            toThis("purpleheart")
            toThis("rosewood")
            toThis("sweetgum")
            toThis("syzgium")
            toThis("whitebeam")
            toThis("yew")
            toThis("oak")
            toThis("birch")
            toThis("spruce")
            toThis("junglewood")
            toThis("acacia")
            toThis("dark_oak")
            toThis("crimsonwood")
            toThis("warpedwood")
            toThis("foxfirewood")
            toThis("wood_compressed")
            toThis("wood_dead")
            toThis("wood_rotten")
            toThis("wood_mossy")
            toThis("wood_frozen")
            toThis("wood_scorched")
            toThis("wood_varnished")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val SodiumSulphate = material("sodium_sulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_sulfate")
        }

        meta {
            numericId           = -1
            hashId              = 680
            toThis("sodium_sulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyMetal = material("any_metal") {
        name = "Any Metal"

        appearance {
            colorSolid  = Rgba(200, 200, 200, 255)
            colorLiquid = Rgba(255, 64, 32, 255)
            colorGas    = Rgba(200, 200, 200, 255)
            colorPlasma = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.METALLIC
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 53
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val RefractoryWax = material("refractory_wax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_refractory")
        }

        meta {
            numericId           = -1
            hashId              = 828
            toThis("wax_refractory")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Unpentbium = material("unpentbium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("vibranium")
        }

        meta {
            numericId           = -1
            hashId              = 279
            toThis("vibranium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyDefaultWood = material("any_default_wood") {
        name = "Normal Wood"

        appearance {
            color       = Rgba(102, 79, 47, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
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
        }

        meta {
            numericId           = -1
            hashId              = 42
            furnaceBurnTime     = 100L
            toThis("wood_bleached")
            toThis("wood_tainted")
            toThis("maple")
            toThis("willow")
            toThis("blue_mahoe")
            toThis("hazel")
            toThis("cinnamonwood")
            toThis("coconutwood")
            toThis("rainbowood")
            toThis("blue_spruce")
            toThis("towerwood")
            toThis("witchwood")
            toThis("ogrewood")
            toThis("wyvernwood")
            toThis("aspen")
            toThis("douglas_fir")
            toThis("sycamore")
            toThis("white_cedar")
            toThis("white_elm")
            toThis("thorntree")
            toThis("silver_pine")
            toThis("alder")
            toThis("hawthorn")
            toThis("rowan")
            toThis("mahogany")
            toThis("palm")
            toThis("autumnwood")
            toThis("cypress")
            toThis("fir")
            toThis("japanese_maple")
            toThis("rainbow_eucalyptus")
            toThis("redwood")
            toThis("sakura")
            toThis("balsa")
            toThis("baobab")
            toThis("cherrywood")
            toThis("wood")
            toThis("chestnutwood")
            toThis("citruswood")
            toThis("cocobolowood")
            toThis("ebony")
            toThis("giganteumwood")
            toThis("greenheart")
            toThis("ipe")
            toThis("kapok")
            toThis("larch")
            toThis("limewood")
            toThis("mahoe")
            toThis("padauk")
            toThis("peanut_wood")
            toThis("papayawood")
            toThis("plumwood")
            toThis("poplar")
            toThis("sequoia")
            toThis("teak")
            toThis("walnutwood")
            toThis("wenge")
            toThis("zebrawood")
            toThis("pine")
            toThis("darkwood")
            toThis("etherealwood")
            toThis("goldwood")
            toThis("hellbark")
            toThis("jacaranda")
            toThis("mangrove")
            toThis("sacred_oak")
            toThis("magicwood")
            toThis("applewood")
            toThis("ashwood")
            toThis("beech")
            toThis("boxwood")
            toThis("brazilwood")
            toThis("butternutwood")
            toThis("cedar")
            toThis("elderwood")
            toThis("elm")
            toThis("eucalyptus")
            toThis("figwood")
            toThis("gingko")
            toThis("hemlock")
            toThis("hickory")
            toThis("holly")
            toThis("hornbeam")
            toThis("iroko")
            toThis("locust")
            toThis("logwood")
            toThis("maclura")
            toThis("olivewood")
            toThis("pearwood")
            toThis("pink_ivory")
            toThis("purpleheart")
            toThis("rosewood")
            toThis("sweetgum")
            toThis("syzgium")
            toThis("whitebeam")
            toThis("yew")
            toThis("oak")
            toThis("birch")
            toThis("spruce")
            toThis("junglewood")
            toThis("acacia")
            toThis("dark_oak")
            toThis("crimsonwood")
            toThis("warpedwood")
            toThis("foxfirewood")
            toThis("wood_compressed")
            toThis("wood_dead")
            toThis("wood_rotten")
            toThis("wood_mossy")
            toThis("wood_frozen")
            toThis("wood_scorched")
            toThis("wood_varnished")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Chrome = material("chrome") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("chromium")
        }

        meta {
            numericId           = -1
            hashId              = 99
            toThis("chromium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val CoffeeDust = material("coffee_dust") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("coffee")
        }

        meta {
            numericId           = -1
            hashId              = 907
            toThis("coffee")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Oilshale = material("oilshale") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("oil_shale")
        }

        meta {
            numericId           = -1
            hashId              = 1138
            toThis("oil_shale")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val BogIron = material("bog_iron") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("yellow_limonite")
        }

        meta {
            numericId           = -1
            hashId              = 1473
            toThis("yellow_limonite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyGarnet = material("any_garnet") {
        name = "Garnet"

        appearance {
            color       = Rgba(255, 100, 100, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 11
            electrons    = 11
            neutrons     = 12
            mass         = 24L
            density      = 1.7360974
            meltingPoint = 1715L
            boilingPoint = 2625L
            plasmaPoint  = 262510L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 128L
            speed      = 7.0f
        }

        meta {
            numericId           = -1
            hashId              = 6
            toThis("pyrope")
            toThis("spessartine")
            toThis("andradite")
            toThis("uvarovite")
            toThis("almandine")
            toThis("grossular")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnyIronOrSteel = material("any_iron_or_steel") {
        name = "Iron"

        appearance {
            colorSolid  = Rgba(200, 200, 200, 255)
            colorLiquid = Rgba(255, 64, 32, 255)
            colorGas    = Rgba(200, 200, 200, 255)
            colorPlasma = Rgba(200, 200, 200, 255)
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
        }

        fluids {
            solidifyingTarget = "iron" amount 648648000L
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
            cuttingTarget         = "iron" amount 648648000L
            workingTarget         = "iron" amount 648648000L
            forgingTarget         = "iron" amount 648648000L
            burningTarget         = "iron" amount 0L
            bendingTarget         = "iron" amount 648648000L
            compressingTarget     = "iron" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 24
            toThis("cast_iron")
            toThis("iron")
            toThis("enori")
            toThis("wrought_iron")
            toThis("knightmetal")
            toThis("meteoric_iron")
            toThis("meteoric_steel")
            toThis("steel")
            toThis("pig_iron")
            toThis("meteorite")
            toThis("iron_compressed")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnyPrismarine = material("any_prismarine") {
        name = "Prismarine"

        appearance {
            color       = Rgba(110, 178, 165, 255)
            iconSet     = IconSet.PRISMARINE
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            solidifyingTarget = "prismarine" amount 648648000L
            smeltingTarget    = "prismarine" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 48L
            speed      = 4.0f
        }

        processing {
            pulverTarget          = "prismarine" amount 648648000L
            smashingTarget        = "prismarine" amount 648648000L
            cuttingTarget         = "prismarine" amount 648648000L
            workingTarget         = "prismarine" amount 648648000L
            forgingTarget         = "prismarine" amount 648648000L
            burningTarget         = "prismarine" amount 0L
            bendingTarget         = "prismarine" amount 648648000L
            compressingTarget     = "prismarine" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 14
            toThis("prismarine")
            toThis("prismarine_dark")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Unbihexium = material("unbihexium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("trinium")
        }

        meta {
            numericId           = -1
            hashId              = 251
            toThis("trinium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SulphuricAcid = material("sulphuric_acid") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sulfuric_acid")
        }

        meta {
            numericId           = -1
            hashId              = 603
            toThis("sulfuric_acid")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val BioMass = material("bio_mass") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("biomass")
        }

        meta {
            numericId           = -1
            hashId              = 747
            toThis("biomass")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val At209 = material("at209") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("astatine")
        }

        meta {
            numericId           = -1
            hashId              = 179
            toThis("astatine")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val DioritePolished = material("diorite_polished") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2209
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val SolutionNickelSulphate = material("solution_nickel_sulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("cyan_vitriol")
        }

        meta {
            numericId           = -1
            hashId              = 730
            toThis("cyan_vitriol")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SodiumPyrosulphate = material("sodium_pyrosulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_pyrosulfate")
        }

        meta {
            numericId           = -1
            hashId              = 682
            toThis("sodium_pyrosulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyCopper = material("any_copper") {
        name = "Copper"

        appearance {
            color       = Rgba(255, 130, 90, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 29
            electrons    = 29
            neutrons     = 34
            mass         = 63L
            density      = 8.96
            meltingPoint = 1357L
            boilingPoint = 2835L
            plasmaPoint  = 283500L
        }

        fluids {
            solidifyingTarget = "copper" amount 648648000L
            smeltingTarget    = "copper" amount 648648000L
        }

        tool {
            types      = 2
            quality    = 0
            durability = 64L
            speed      = 4.0f
        }

        processing {
            pulverTarget          = "copper" amount 648648000L
            smashingTarget        = "copper" amount 648648000L
            cuttingTarget         = "copper" amount 648648000L
            workingTarget         = "copper" amount 648648000L
            forgingTarget         = "copper" amount 648648000L
            burningTarget         = "copper" amount 0L
            bendingTarget         = "copper" amount 648648000L
            compressingTarget     = "copper" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 30
            toThis("annealed_copper")
            toThis("copper")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val DioriteChiseled = material("diorite_chiseled") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2208
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val Unbipentium = material("unbipentium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tritanium_elemental")
        }

        meta {
            numericId           = -1
            hashId              = 249
            toThis("tritanium_elemental")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Meat = material("meat") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("meat_cooked")
        }

        meta {
            numericId           = -1
            hashId              = 883
            toThis("meat_cooked")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Soda = material("soda") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_hydrogencarbonate")
        }

        meta {
            numericId           = -1
            hashId              = 668
            toThis("sodium_hydrogencarbonate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Ardaite = material("ardaite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("aredrite")
        }

        meta {
            numericId           = -1
            hashId              = 1153
            toThis("aredrite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Unstableingot = material("unstableingot") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("unstable")
        }

        meta {
            numericId           = -1
            hashId              = 1357
            toThis("unstable")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Wolframsteel = material("wolframsteel") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungstensteel")
        }

        meta {
            numericId           = -1
            hashId              = 1205
            toThis("tungstensteel")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Aragonite = material("aragonite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("calcite")
        }

        meta {
            numericId           = -1
            hashId              = 646
            toThis("calcite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyWax = material("any_wax") {
        name = "Wax"

        appearance {
            color       = Rgba(250, 250, 250, 255)
            iconSet     = IconSet.FOOD
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 350L
            boilingPoint = 700L
            plasmaPoint  = 70000L
        }

        fluids {
            solidifyingTarget = "wax" amount 648648000L
            smeltingTarget    = "wax" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "wax" amount 648648000L
            smashingTarget        = "wax" amount 648648000L
            cuttingTarget         = "wax" amount 648648000L
            workingTarget         = "wax" amount 648648000L
            forgingTarget         = "wax" amount 648648000L
            burningTarget         = "wax" amount 0L
            bendingTarget         = "wax" amount 648648000L
            compressingTarget     = "wax" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 18
            toThis("wax_plant")
            toThis("wax_magic")
            toThis("wax_amnesic")
            toThis("wax_soulful")
            toThis("wax")
            toThis("wax_bee")
            toThis("wax_refractory")
            toThis("wax_paraffin")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val CreosoteOil = material("creosote_oil") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("creosote")
        }

        meta {
            numericId           = -1
            hashId              = 766
            toThis("creosote")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyTigerEye = material("any_tiger_eye") {
        name = "Tiger Eye"

        appearance {
            color       = Rgba(142, 116, 61, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        meta {
            numericId           = -1
            hashId              = 8
            toThis("tiger_eye")
            toThis("cats_eye")
            toThis("dragon_eye")
            toThis("hawks_eye")
            toThis("black_eye")
            toThis("tiger_iron")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AluminumBrass = material("aluminum_brass") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("aluminium_brass")
        }

        meta {
            numericId           = -1
            hashId              = 1279
            toThis("aluminium_brass")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GarnetRed = material("garnet_red") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("almandine")
        }

        meta {
            numericId           = -1
            hashId              = 958
            toThis("almandine")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val WrougtIron = material("wrougt_iron") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wrought_iron")
        }

        meta {
            numericId           = -1
            hashId              = 1144
            toThis("wrought_iron")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val BoricAcid = material("boric_acid") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("hydrogen_borate")
        }

        meta {
            numericId           = -1
            hashId              = 612
            toThis("hydrogen_borate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Garnet = material("garnet") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("spessartine")
        }

        meta {
            numericId           = -1
            hashId              = 964
            toThis("spessartine")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Ender = material("ender") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("ender_pearl")
        }

        meta {
            numericId           = -1
            hashId              = 1032
            toThis("ender_pearl")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SolutionBlueVitriol = material("solution_blue_vitriol") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("blue_vitriol")
        }

        meta {
            numericId           = -1
            hashId              = 724
            toThis("blue_vitriol")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiUnseptquadium = material("anti_unseptquadium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_naquadah")
        }

        meta {
            numericId           = -1
            hashId              = 1838
            toThis("anti_naquadah")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Adamant = material("adamant") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("adamantium")
        }

        meta {
            numericId           = -1
            hashId              = 359
            toThis("adamantium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiBitriennium = material("anti_bitriennium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_mac_guffium")
        }

        meta {
            numericId           = -1
            hashId              = 1909
            toThis("anti_mac_guffium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiUnpentbium = material("anti_unpentbium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_vibranium")
        }

        meta {
            numericId           = -1
            hashId              = 1815
            toThis("anti_vibranium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val RockSalt = material("rock_salt") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sylvite")
        }

        meta {
            numericId           = -1
            hashId              = 692
            toThis("sylvite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GranitePolished = material("granite_polished") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2206
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val BeesWax = material("bees_wax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_bee")
        }

        meta {
            numericId           = -1
            hashId              = 823
            toThis("wax_bee")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Natrium = material("natrium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium")
        }

        meta {
            numericId           = -1
            hashId              = 81
            toThis("sodium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SodiumPersulphate = material("sodium_persulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_persulfate")
        }

        meta {
            numericId           = -1
            hashId              = 674
            toThis("sodium_persulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyRubber = material("any_rubber") {
        name = "Rubber"

        appearance {
            color       = Rgba(20, 20, 20, 255)
            iconSet     = IconSet.RUBBER
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 5L
            density      = 0.8719783877
            meltingPoint = 410L
            boilingPoint = 820L
            plasmaPoint  = 82000L
        }

        fluids {
            solidifyingTarget = "rubber" amount 648648000L
            smeltingTarget    = "rubber" amount 432432000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 256L
            speed      = 3.0f
        }

        processing {
            pulverTarget          = "rubber" amount 648648000L
            smashingTarget        = "rubber" amount 648648000L
            cuttingTarget         = "rubber" amount 648648000L
            workingTarget         = "rubber" amount 648648000L
            forgingTarget         = "rubber" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "rubber" amount 648648000L
            compressingTarget     = "rubber" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 48
            toThis("rubber")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AndesiteChiseled = material("andesite_chiseled") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2211
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val Polymer = material("polymer") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("teflon")
        }

        meta {
            numericId           = -1
            hashId              = 867
            toThis("teflon")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Uranium238 = material("uranium238") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("uranium")
        }

        meta {
            numericId           = -1
            hashId              = 190
            toThis("uranium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyPhosphorus = material("any_phosphorus") {
        name = "Phosphorus"

        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.FLINT
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 15
            mass         = 31L
            density      = 1.07005728
            meltingPoint = 829L
            boilingPoint = 1374L
            plasmaPoint  = 137420L
        }

        fluids {
            solidifyingTarget = "phosphorus" amount 648648000L
            smeltingTarget    = "phosphorus" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "phosphorus" amount 648648000L
            smashingTarget        = "phosphorus" amount 648648000L
            cuttingTarget         = "phosphorus" amount 648648000L
            workingTarget         = "phosphorus" amount 648648000L
            forgingTarget         = "phosphorus" amount 648648000L
            burningTarget         = "phosphorus" amount 0L
            bendingTarget         = "phosphorus" amount 648648000L
            compressingTarget     = "phosphorus" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 12
            toThis("phosphorus")
            toThis("blue_phosphorus")
            toThis("red_phosphorus")
            toThis("white_phosphorus")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.EXPLOSIVE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val AnySapphire = material("any_sapphire") {
        name = "Sapphire"

        appearance {
            color       = Rgba(100, 100, 200, 127)
            iconSet     = IconSet.GEM_VERTICAL
        }

        physics {
            protons      = 8
            electrons    = 8
            neutrons     = 8
            mass         = 16L
            density      = 0.9000478333
            meltingPoint = 2345L
            boilingPoint = 3250L
            plasmaPoint  = 325000L
        }

        fluids {
            solidifyingTarget = "sapphire" amount 648648000L
            smeltingTarget    = "alumina" amount 486486000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 7.0f
        }

        processing {
            pulverTarget          = "sapphire" amount 648648000L
            smashingTarget        = "sapphire" amount 648648000L
            cuttingTarget         = "sapphire" amount 648648000L
            workingTarget         = "sapphire" amount 648648000L
            forgingTarget         = "sapphire" amount 648648000L
            burningTarget         = "sapphire" amount 0L
            bendingTarget         = "sapphire" amount 648648000L
            compressingTarget     = "sapphire" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 3
            toThis("sapphire")
            toThis("ruby")
            toThis("blue_sapphire")
            toThis("green_sapphire")
            toThis("purple_sapphire")
            toThis("yellow_sapphire")
            toThis("orange_sapphire")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Adluorite = material("adluorite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("alduorite")
        }

        meta {
            numericId           = -1
            hashId              = 1147
            priorityPrefixIndex = 2
            handleMaterial      = ref("any_wood_or_plastic")
            toThis("alduorite")
        }

        tags(
            MaterialTag.ItemGenerator.PLANTS,
            MaterialTag.ItemGenerator.ORES,
            MaterialTag.ItemGenerator.DUSTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val WolframCarbide = material("wolfram_carbide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungsten_carbide")
        }

        meta {
            numericId           = -1
            hashId              = 1209
            toThis("tungsten_carbide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Th232 = material("th232") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("thorium")
        }

        meta {
            numericId           = -1
            hashId              = 187
            toThis("thorium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SulphurTrioxide = material("sulphur_trioxide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sulfur_trioxide")
        }

        meta {
            numericId           = -1
            hashId              = 600
            toThis("sulfur_trioxide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Quartz = material("quartz") {
        appearance {
            color       = Rgba(210, 210, 210, 255)
            iconSet     = IconSet.QUARTZ
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        fluids {
            solidifyingTarget = "silicon_dioxide" amount 648648000L
            smeltingTarget    = "silicon_dioxide" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 3
            durability = 32L
            speed      = 2.5f
        }

        processing {
            pulverTarget          = "silicon_dioxide" amount 648648000L
            smashingTarget        = "silicon_dioxide" amount 648648000L
            cuttingTarget         = "silicon_dioxide" amount 648648000L
            workingTarget         = "silicon_dioxide" amount 648648000L
            forgingTarget         = "silicon_dioxide" amount 648648000L
            burningTarget         = "silicon_dioxide" amount 0L
            bendingTarget         = "silicon_dioxide" amount 648648000L
            compressingTarget     = "silicon_dioxide" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 36
            toThis("milky_quartz")
            toThis("nether_quartz")
            toThis("void_quartz")
            toThis("sunny_quartz")
            toThis("quartzite")
            toThis("lavender_quartz")
            toThis("red_quartz")
            toThis("blaze_quartz")
            toThis("smokey_quartz")
            toThis("mana_quartz")
            toThis("elven_quartz")
            toThis("quartz_black")
            toThis("certus_quartz")
            toThis("charged_certus_quartz")
            toThis("fluix")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.QUARTZ,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnyBronze = material("any_bronze") {
        name = "Any Bronze"

        appearance {
            color       = Rgba(210, 130, 60, 255)
            iconSet     = IconSet.COPPER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 52
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Unoctoctium = material("unoctoctium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("ethaxium")
        }

        meta {
            numericId           = -1
            hashId              = 323
            toThis("ethaxium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Unocthexium = material("unocthexium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("coralium")
        }

        meta {
            numericId           = -1
            hashId              = 318
            toThis("coralium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Brine = material("brine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("saltwater")
        }

        meta {
            numericId           = -1
            hashId              = 689
            toThis("saltwater")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyJasper = material("any_jasper") {
        name = "Jasper"

        appearance {
            color       = Rgba(200, 80, 80, 150)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 15
            electrons    = 15
            neutrons     = 16
            mass         = 32L
            density      = 3.142990667
            meltingPoint = 1927L
            boilingPoint = 3191L
            plasmaPoint  = 319133L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        meta {
            numericId           = -1
            hashId              = 7
            toThis("red_jasper")
            toThis("ocean_jasper")
            toThis("rainforest_jasper")
            toThis("blue_jasper")
            toThis("green_jasper")
            toThis("yellow_jasper")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Tantalium = material("tantalium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tantalum")
        }

        meta {
            numericId           = -1
            hashId              = 157
            toThis("tantalum")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PhasedIron = material("phased_iron") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("pulsating_iron")
        }

        meta {
            numericId           = -1
            hashId              = 1301
            toThis("pulsating_iron")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Crystal = material("crystal") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2072
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Kalium = material("kalium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium")
        }

        meta {
            numericId           = -1
            hashId              = 92
            toThis("potassium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val QuickSilver = material("quick_silver") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("mercury")
        }

        meta {
            numericId           = -1
            hashId              = 172
            toThis("mercury")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Olivine = material("olivine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("peridot")
        }

        meta {
            numericId           = -1
            hashId              = 1006
            toThis("peridot")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Triseptbium = material("triseptbium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("gravitonium")
        }

        meta {
            numericId           = -1
            hashId              = 512
            toThis("gravitonium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val ParaffinWax = material("paraffin_wax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_paraffin")
        }

        meta {
            numericId           = -1
            hashId              = 831
            toThis("wax_paraffin")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Chrysotile = material("chrysotile") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("asbestos")
        }

        meta {
            numericId           = -1
            hashId              = 795
            toThis("asbestos")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiKalium = material("anti_kalium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_potassium")
        }

        meta {
            numericId           = -1
            hashId              = 1664
            toThis("anti_potassium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Magnesite = material("magnesite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("magnesium_carbonate")
        }

        meta {
            numericId           = -1
            hashId              = 638
            toThis("magnesium_carbonate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SodiumBisulphate = material("sodium_bisulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sodium_bisulfate")
        }

        meta {
            numericId           = -1
            hashId              = 670
            toThis("sodium_bisulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Uran = material("uran") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("uranium")
        }

        meta {
            numericId           = -1
            hashId              = 191
            toThis("uranium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val NaquadahAlloy = material("naquadah_alloy") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("trinaquadalloy")
        }

        meta {
            numericId           = -1
            hashId              = 1359
            toThis("trinaquadalloy")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyStone = material("any_stone") {
        name = "Stone"

        appearance {
            colorSolid  = Rgba(205, 205, 205, 255)
            colorLiquid = Rgba(192, 96, 64, 255)
            colorGas    = Rgba(205, 205, 205, 255)
            colorPlasma = Rgba(205, 205, 205, 255)
            iconSet     = IconSet.STONE
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1100L
            boilingPoint = 2200L
            plasmaPoint  = 220000L
        }

        fluids {
            solidifyingTarget = "stone" amount 648648000L
            smeltingTarget    = "stone" amount 648648000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        processing {
            pulverTarget          = "stone" amount 648648000L
            smashingTarget        = "stone" amount 648648000L
            cuttingTarget         = "stone" amount 648648000L
            workingTarget         = "stone" amount 648648000L
            forgingTarget         = "stone" amount 648648000L
            burningTarget         = "stone" amount 0L
            bendingTarget         = "stone" amount 648648000L
            compressingTarget     = "stone" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 19
            toThis("slate")
            toThis("deepslate")
            toThis("eclogite")
            toThis("phobos_rock")
            toThis("deimos_rock")
            toThis("venus_rock")
            toThis("mercury_rock")
            toThis("ceres_rock")
            toThis("jupiter_rock")
            toThis("io_rock")
            toThis("europa_rock")
            toThis("ganymede_rock")
            toThis("callisto_rock")
            toThis("saturn_rock")
            toThis("rhea_rock")
            toThis("titan_rock")
            toThis("oberon_rock")
            toThis("iapetus_rock")
            toThis("uranus_rock")
            toThis("titania_rock")
            toThis("neptune_rock")
            toThis("triton_rock")
            toThis("pluto_rock")
            toThis("eris_rock")
            toThis("kepler22b_rock")
            toThis("space_stone")
            toThis("moon_stone")
            toThis("moon_turf")
            toThis("mars_stone")
            toThis("mars_sand")
            toThis("sky_stone")
            toThis("holystone")
            toThis("livingrock")
            toThis("deadrock")
            toThis("betweenstone")
            toThis("pitstone")
            toThis("cragrock")
            toThis("templerock")
            toThis("mazestone")
            toThis("castlerock")
            toThis("umber")
            toThis("stone")
            toThis("shale")
            toThis("concrete")
            toThis("redrock")
            toThis("netherrack")
            toThis("nether_brick")
            toThis("komatiite")
            toThis("pumice")
            toThis("endstone")
            toThis("gabbro")
            toThis("basalt")
            toThis("marble")
            toThis("prismarine")
            toThis("limestone")
            toThis("prismarine_dark")
            toThis("greenschist")
            toThis("greenstone")
            toThis("blueschist")
            toThis("bluestone")
            toThis("grayschist")
            toThis("epidote")
            toThis("pinkschist")
            toThis("gneiss")
            toThis("kimberlite")
            toThis("quartzite")
            toThis("granite_red")
            toThis("granite_black")
            toThis("granite")
            toThis("andesite")
            toThis("diorite")
            toThis("blackstone")
            toThis("greywacke")
            toThis("siltstone")
            toThis("rhyolite")
            toThis("migmatite")
            toThis("chert")
            toThis("dacite")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Processing.UNRECYCLABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.STONE,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Bibiunium = material("bibiunium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("atlarus")
        }

        meta {
            numericId           = -1
            hashId              = 357
            toThis("atlarus")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Saltedwater = material("saltedwater") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("salted_water")
        }

        meta {
            numericId           = -1
            hashId              = 716
            toThis("salted_water")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val DioriteBricks = material("diorite_bricks") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2207
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val Sulphur = material("sulphur") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sulfur")
        }

        meta {
            numericId           = -1
            hashId              = 88
            toThis("sulfur")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val HSLA = material("hsla") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("hsla_steel")
        }

        meta {
            numericId           = -1
            hashId              = 1211
            toThis("hsla_steel")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Brick = material("brick") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("clay_brick")
        }

        meta {
            numericId           = -1
            hashId              = 844
            toThis("clay_brick")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyRedSteel = material("any_red_steel") {
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
        }

        fluids {
            solidifyingTarget = "red_steel" amount 648648000L
            smeltingTarget    = "red_steel" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 1024L
            speed      = 7.5f
        }

        processing {
            pulverTarget          = "red_steel" amount 648648000L
            smashingTarget        = "red_steel" amount 648648000L
            cuttingTarget         = "red_steel" amount 648648000L
            workingTarget         = "red_steel" amount 648648000L
            forgingTarget         = "red_steel" amount 648648000L
            burningTarget         = "red_steel" amount 0L
            bendingTarget         = "red_steel" amount 648648000L
            compressingTarget     = "red_steel" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 28
            toThis("red_steel")
            toThis("meteoflame_red_steel")
            toThis("meteoric_red_steel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Pepper = material("pepper") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("pepper_black")
        }

        meta {
            numericId           = -1
            hashId              = 918
            toThis("pepper_black")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Paduak = material("paduak") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("padauk")
        }

        meta {
            numericId           = -1
            hashId              = 1584
            toThis("padauk")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyUntreatedWood = material("any_untreated_wood") {
        name = "Untreated Wood"

        appearance {
            color       = Rgba(102, 79, 47, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
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
        }

        meta {
            numericId           = -1
            hashId              = 46
            furnaceBurnTime     = 100L
            toThis("wood_bleached")
            toThis("wood_tainted")
            toThis("maple")
            toThis("willow")
            toThis("blue_mahoe")
            toThis("hazel")
            toThis("cinnamonwood")
            toThis("coconutwood")
            toThis("rainbowood")
            toThis("blue_spruce")
            toThis("towerwood")
            toThis("witchwood")
            toThis("ogrewood")
            toThis("wyvernwood")
            toThis("aspen")
            toThis("douglas_fir")
            toThis("sycamore")
            toThis("white_cedar")
            toThis("white_elm")
            toThis("thorntree")
            toThis("silver_pine")
            toThis("alder")
            toThis("hawthorn")
            toThis("rowan")
            toThis("mahogany")
            toThis("palm")
            toThis("autumnwood")
            toThis("cypress")
            toThis("fir")
            toThis("japanese_maple")
            toThis("rainbow_eucalyptus")
            toThis("redwood")
            toThis("sakura")
            toThis("balsa")
            toThis("baobab")
            toThis("cherrywood")
            toThis("wood")
            toThis("chestnutwood")
            toThis("citruswood")
            toThis("cocobolowood")
            toThis("ebony")
            toThis("wood_rubber")
            toThis("giganteumwood")
            toThis("bamboo")
            toThis("greenheart")
            toThis("skyroot")
            toThis("ipe")
            toThis("weedwood")
            toThis("kapok")
            toThis("livingwood")
            toThis("larch")
            toThis("dreamwood")
            toThis("limewood")
            toThis("shimmerwood")
            toThis("mahoe")
            toThis("greatwood")
            toThis("padauk")
            toThis("silverwood")
            toThis("peanut_wood")
            toThis("papayawood")
            toThis("plumwood")
            toThis("poplar")
            toThis("sequoia")
            toThis("teak")
            toThis("walnutwood")
            toThis("wenge")
            toThis("zebrawood")
            toThis("pine")
            toThis("darkwood")
            toThis("etherealwood")
            toThis("goldwood")
            toThis("hellbark")
            toThis("jacaranda")
            toThis("mangrove")
            toThis("sacred_oak")
            toThis("magicwood")
            toThis("applewood")
            toThis("ashwood")
            toThis("beech")
            toThis("boxwood")
            toThis("brazilwood")
            toThis("butternutwood")
            toThis("cedar")
            toThis("elderwood")
            toThis("elm")
            toThis("eucalyptus")
            toThis("figwood")
            toThis("gingko")
            toThis("hemlock")
            toThis("hickory")
            toThis("holly")
            toThis("hornbeam")
            toThis("iroko")
            toThis("locust")
            toThis("logwood")
            toThis("maclura")
            toThis("olivewood")
            toThis("pearwood")
            toThis("pink_ivory")
            toThis("purpleheart")
            toThis("rosewood")
            toThis("sweetgum")
            toThis("syzgium")
            toThis("whitebeam")
            toThis("yew")
            toThis("oak")
            toThis("birch")
            toThis("spruce")
            toThis("junglewood")
            toThis("acacia")
            toThis("dark_oak")
            toThis("crimsonwood")
            toThis("warpedwood")
            toThis("foxfirewood")
            toThis("wood_compressed")
            toThis("wood_dead")
            toThis("wood_rotten")
            toThis("wood_mossy")
            toThis("wood_frozen")
            toThis("wood_scorched")
            toThis("wood_varnished")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val PotassiumSulphite = material("potassium_sulphite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_sulfite")
        }

        meta {
            numericId           = -1
            hashId              = 706
            toThis("potassium_sulfite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Tennessine = material("tennessine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("farnsium")
        }

        meta {
            numericId           = -1
            hashId              = 240
            toThis("farnsium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val SulphurDioxide = material("sulphur_dioxide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sulfur_dioxide")
        }

        meta {
            numericId           = -1
            hashId              = 598
            toThis("sulfur_dioxide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Electrotine = material("electrotine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("nikolite")
        }

        meta {
            numericId           = -1
            hashId              = 1063
            toThis("nikolite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val FuelOil = material("fuel_oil") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("fuel")
        }

        meta {
            numericId           = -1
            hashId              = 755
            toThis("fuel")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val TeslatineAlloy = material("teslatine_alloy") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("nikoline_alloy")
        }

        meta {
            numericId           = -1
            hashId              = 1238
            toThis("nikoline_alloy")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Co60 = material("co60") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("cobalt60")
        }

        meta {
            numericId           = -1
            hashId              = 104
            toThis("cobalt60")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyPlastic = material("any_plastic") {
        name = "Plastic"

        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.7557265867
            meltingPoint = 423L
            boilingPoint = 846L
            plasmaPoint  = 84600L
        }

        fluids {
            solidifyingTarget = "plastic" amount 648648000L
            smeltingTarget    = "plastic" amount 432432000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 256L
            speed      = 3.0f
        }

        processing {
            pulverTarget          = "plastic" amount 648648000L
            smashingTarget        = "plastic" amount 648648000L
            cuttingTarget         = "plastic" amount 648648000L
            workingTarget         = "plastic" amount 648648000L
            forgingTarget         = "plastic" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "plastic" amount 648648000L
            compressingTarget     = "plastic" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 49
            reRegisteredTo("any_wood_or_plastic")
            toThis("plastic")
            toThis("teflon")
            toThis("pvc")
            toThis("bakelite")
            toThis("hard_plastic")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AntiAluminum = material("anti_aluminum") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_aluminium")
        }

        meta {
            numericId           = -1
            hashId              = 1657
            toThis("anti_aluminium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiWolframium = material("anti_wolframium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_tungsten")
        }

        meta {
            numericId           = -1
            hashId              = 1724
            toThis("anti_tungsten")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Hexorium = material("hexorium") {
        appearance {
            color       = Rgba(224, 224, 224, 127)
            iconSet     = IconSet.HEX
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        tool {
            types      = 2
            quality    = 2
            durability = 384L
            speed      = 5.0f
        }

        meta {
            numericId           = -1
            hashId              = 40
            toThis("hexorium_black")
            toThis("hexorium_red")
            toThis("hexorium_green")
            toThis("hexorium_blue")
            toThis("hexorium_white")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Saltpeter = material("saltpeter") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_nitrate")
        }

        meta {
            numericId           = -1
            hashId              = 695
            toThis("potassium_nitrate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Fettelite = material("fettelite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("sanguinite")
        }

        meta {
            numericId           = -1
            hashId              = 1159
            toThis("sanguinite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val CalciumTungstate = material("calcium_tungstate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("scheelite")
        }

        meta {
            numericId           = -1
            hashId              = 1458
            toThis("scheelite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AshesDark = material("ashes_dark") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("dark_ashes")
        }

        meta {
            numericId           = -1
            hashId              = 787
            toThis("dark_ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AndesiteBricks = material("andesite_bricks") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2210
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val AnyGrains = material("any_grains") {
        name = "Grains"

        appearance {
            color       = Rgba(255, 255, 196, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            solidifyingTarget = "wheat" amount 648648000L
            smeltingTarget    = "wheat" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "wheat" amount 648648000L
            smashingTarget        = "wheat" amount 648648000L
            cuttingTarget         = "wheat" amount 648648000L
            workingTarget         = "wheat" amount 648648000L
            forgingTarget         = "wheat" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "wheat" amount 648648000L
            compressingTarget     = "wheat" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 15
            toThis("abyssal_oat")
            toThis("corn")
            toThis("wheat")
            toThis("barley")
            toThis("rye")
            toThis("rice")
            toThis("oat")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val AnyMagicIron = material("any_magic_iron") {
        name = "Magic Iron"

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
        }

        fluids {
            solidifyingTarget = "iron" amount 648648000L
            smeltingTarget    = "iron" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 256L
            speed      = 12.0f
        }

        processing {
            pulverTarget          = "iron" amount 648648000L
            smashingTarget        = "iron" amount 648648000L
            cuttingTarget         = "iron" amount 648648000L
            workingTarget         = "iron" amount 648648000L
            forgingTarget         = "iron" amount 648648000L
            burningTarget         = "iron" amount 0L
            bendingTarget         = "iron" amount 648648000L
            compressingTarget     = "iron" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 29
            toThis("thaumium")
            toThis("dark_thaumium")
            toThis("spectre_iron")
            toThis("manasteel")
            toThis("fiery_steel")
            toThis("meteoflame_steel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Plutonium244 = material("plutonium244") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("plutonium")
        }

        meta {
            numericId           = -1
            hashId              = 202
            toThis("plutonium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Sheldonite = material("sheldonite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("cooperite")
        }

        meta {
            numericId           = -1
            hashId              = 1451
            toThis("cooperite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Aventurine = material("aventurine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("green_aventurine")
        }

        meta {
            numericId           = -1
            hashId              = 988
            toThis("green_aventurine")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val TitaniumIron = material("titanium_iron") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("ilmenite")
        }

        meta {
            numericId           = -1
            hashId              = 1481
            toThis("ilmenite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiElectron = material("anti_electron") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("positron")
        }

        meta {
            numericId           = -1
            hashId              = 1636
            toThis("positron")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyTungsten = material("any_tungsten") {
        name = "Tungsten"

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
            smashingTarget        = "tungsten" amount 648648000L
            cuttingTarget         = "tungsten" amount 648648000L
            workingTarget         = "tungsten" amount 648648000L
            forgingTarget         = "tungsten" amount 648648000L
            burningTarget         = "tungsten" amount 0L
            bendingTarget         = "tungsten" amount 648648000L
            compressingTarget     = "tungsten" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 38
            toThis("tungsten_sintered")
            toThis("tungsten")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.UNBURNABLE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnyFlourOrGrains = material("any_flour_or_grains") {
        name = "Flour and Grains"

        appearance {
            color       = Rgba(255, 255, 196, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            solidifyingTarget = "wheat" amount 648648000L
            smeltingTarget    = "wheat" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "wheat" amount 648648000L
            smashingTarget        = "wheat" amount 648648000L
            cuttingTarget         = "wheat" amount 648648000L
            workingTarget         = "wheat" amount 648648000L
            forgingTarget         = "wheat" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "wheat" amount 648648000L
            compressingTarget     = "wheat" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 17
            toThis("abyssal_oat")
            toThis("corn")
            toThis("potato")
            toThis("wheat")
            toThis("barley")
            toThis("rye")
            toThis("rice")
            toThis("oat")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val AnyBlueSteel = material("any_blue_steel") {
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
        }

        fluids {
            solidifyingTarget = "blue_steel" amount 648648000L
            smeltingTarget    = "blue_steel" amount 648648000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 896L
            speed      = 7.0f
        }

        processing {
            pulverTarget          = "blue_steel" amount 648648000L
            smashingTarget        = "blue_steel" amount 648648000L
            cuttingTarget         = "blue_steel" amount 648648000L
            workingTarget         = "blue_steel" amount 648648000L
            forgingTarget         = "blue_steel" amount 648648000L
            burningTarget         = "blue_steel" amount 0L
            bendingTarget         = "blue_steel" amount 648648000L
            compressingTarget     = "blue_steel" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 27
            toThis("meteoflame_blue_steel")
            toThis("meteoric_blue_steel")
            toThis("blue_steel")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val BlueTigerEye = material("blue_tiger_eye") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("hawks_eye")
        }

        meta {
            numericId           = -1
            hashId              = 983
            toThis("hawks_eye")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyHardPlastic = material("any_hard_plastic") {
        name = "Hard Plastic"

        appearance {
            color       = Rgba(180, 180, 180, 255)
            iconSet     = IconSet.DULL
        }

        physics {
            protons      = 2
            electrons    = 2
            neutrons     = 2
            mass         = 4L
            density      = 0.7557265867
            meltingPoint = 423L
            boilingPoint = 846L
            plasmaPoint  = 84600L
        }

        fluids {
            solidifyingTarget = "plastic" amount 648648000L
            smeltingTarget    = "plastic" amount 432432000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 256L
            speed      = 3.0f
        }

        processing {
            pulverTarget          = "plastic" amount 648648000L
            smashingTarget        = "plastic" amount 648648000L
            cuttingTarget         = "plastic" amount 648648000L
            workingTarget         = "plastic" amount 648648000L
            forgingTarget         = "plastic" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "plastic" amount 648648000L
            compressingTarget     = "plastic" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 50
            toThis("pvc")
            toThis("hard_plastic")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AnyBlaze = material("any_blaze") {
        name = "Blaze"

        appearance {
            color       = Rgba(255, 200, 0, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
            meltingPoint = 4000L
            boilingPoint = 8000L
            plasmaPoint  = 800000L
        }

        tool {
            types      = 1
            quality    = 1
            durability = 16L
            speed      = 2.0f
        }

        meta {
            numericId           = -1
            hashId              = 13
            toThis("basalz")
            toThis("blitz")
            toThis("blizz")
            toThis("blaze")
            toThis("breeze")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.BRITTLE,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val Elementium = material("elementium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("elven_elementium")
        }

        meta {
            numericId           = -1
            hashId              = 1320
            toThis("elven_elementium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Pu239 = material("pu239") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("plutonium239")
        }

        meta {
            numericId           = -1
            hashId              = 211
            toThis("plutonium239")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Pu238 = material("pu238") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("plutonium238")
        }

        meta {
            numericId           = -1
            hashId              = 209
            toThis("plutonium238")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiQuickSilver = material("anti_quick_silver") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_mercury")
        }

        meta {
            numericId           = -1
            hashId              = 1733
            toThis("anti_mercury")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiAdamantine = material("anti_adamantine") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_adamantium")
        }

        meta {
            numericId           = -1
            hashId              = 1889
            toThis("anti_adamantium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val BeeWax = material("bee_wax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_bee")
        }

        meta {
            numericId           = -1
            hashId              = 825
            toThis("wax_bee")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Pu240 = material("pu240") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("plutonium240")
        }

        meta {
            numericId           = -1
            hashId              = 204
            toThis("plutonium240")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Pu241 = material("pu241") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("plutonium241")
        }

        meta {
            numericId           = -1
            hashId              = 206
            toThis("plutonium241")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PotassiumBisulphate = material("potassium_bisulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_bisulfate")
        }

        meta {
            numericId           = -1
            hashId              = 700
            toThis("potassium_bisulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AshesVolcanic = material("ashes_volcanic") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("volcanic_ashes")
        }

        meta {
            numericId           = -1
            hashId              = 791
            toThis("volcanic_ashes")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val NULL = material("null") {
        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = 0L
            density      = 0.0
        }

        meta {
            numericId           = -1
            hashId              = 0
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Wolfram = material("wolfram") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungsten")
        }

        meta {
            numericId           = -1
            hashId              = 160
            toThis("tungsten")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Organic = material("organic") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2071
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.DONT_SHOW_THIS_COMPONENT,
        )

    }

    val Nitrate = material("nitrate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_nitrate")
        }

        meta {
            numericId           = -1
            hashId              = 696
            toThis("potassium_nitrate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Wolframium = material("wolframium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungsten")
        }

        meta {
            numericId           = -1
            hashId              = 159
            toThis("tungsten")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val ElnTungsten = material("eln_tungsten") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungsten")
        }

        meta {
            numericId           = -1
            hashId              = 161
            toThis("tungsten")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Raspite = material("raspite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("stolzite")
        }

        meta {
            numericId           = -1
            hashId              = 1465
            toThis("stolzite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiBibibium = material("anti_bibibium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_adamantium")
        }

        meta {
            numericId           = -1
            hashId              = 1891
            toThis("anti_adamantium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PotassiumSulphide = material("potassium_sulphide") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("potassium_sulfide")
        }

        meta {
            numericId           = -1
            hashId              = 704
            toThis("potassium_sulfide")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PhasedGold = material("phased_gold") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("vibrant_alloy")
        }

        meta {
            numericId           = -1
            hashId              = 1304
            toThis("vibrant_alloy")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val RawTerrasteelAlloy = material("raw_terrasteel_alloy") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("terrasteel_alloy_raw")
        }

        meta {
            numericId           = -1
            hashId              = 2084
            toThis("terrasteel_alloy_raw")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val WoodSealed = material("wood_sealed") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wood_treated")
        }

        meta {
            numericId           = -1
            hashId              = 805
            toThis("wood_treated")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Soapstone = material("soapstone") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("talc")
        }

        meta {
            numericId           = -1
            hashId              = 797
            toThis("talc")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GraniteChiseled = material("granite_chiseled") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2205
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val AnyAmethyst = material("any_amethyst") {
        name = "Amethyst"

        appearance {
            color       = Rgba(166, 120, 241, 127)
            iconSet     = IconSet.RUBY
        }

        physics {
            protons      = 13
            electrons    = 13
            neutrons     = 14
            mass         = 27L
            density      = 2.1967888
            meltingPoint = 1951L
            boilingPoint = 3202L
            plasmaPoint  = 320280L
        }

        fluids {
            solidifyingTarget = "amethyst" amount 648648000L
            smeltingTarget    = "amethyst" amount 0L
        }

        tool {
            types      = 3
            quality    = 3
            durability = 128L
            speed      = 6.0f
        }

        processing {
            pulverTarget          = "amethyst" amount 648648000L
            smashingTarget        = "amethyst" amount 648648000L
            cuttingTarget         = "amethyst" amount 648648000L
            workingTarget         = "amethyst" amount 648648000L
            forgingTarget         = "amethyst" amount 648648000L
            burningTarget         = "amethyst" amount 0L
            bendingTarget         = "amethyst" amount 648648000L
            compressingTarget     = "amethyst" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 5
            toThis("amethyst_ender")
            toThis("amethyst")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AntiGregorium = material("anti_gregorium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_technetium")
        }

        meta {
            numericId           = -1
            hashId              = 1692
            toThis("anti_technetium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val UraniumEnriched = material("uranium_enriched") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("uranium235")
        }

        meta {
            numericId           = -1
            hashId              = 194
            toThis("uranium235")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Jasper = material("jasper") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("red_jasper")
        }

        meta {
            numericId           = -1
            hashId              = 970
            toThis("red_jasper")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Iritanium = material("iritanium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("titanium_iridium")
        }

        meta {
            numericId           = -1
            hashId              = 1362
            toThis("titanium_iridium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val KnightMetal = material("knight_metal") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("knightmetal")
        }

        meta {
            numericId           = -1
            hashId              = 1258
            toThis("knightmetal")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Teslatite = material("teslatite") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("nikolite")
        }

        meta {
            numericId           = -1
            hashId              = 1064
            toThis("nikolite")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Columbium = material("columbium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("niobium")
        }

        meta {
            numericId           = -1
            hashId              = 120
            toThis("niobium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val PetCoke = material("pet_coke") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("petroleum_coke")
        }

        meta {
            numericId           = -1
            hashId              = 1054
            toThis("petroleum_coke")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val IronWood = material("iron_wood") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("ironwood")
        }

        meta {
            numericId           = -1
            hashId              = 1255
            toThis("ironwood")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val HeeEndium = material("hee_endium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("endium")
        }

        meta {
            numericId           = -1
            hashId              = 1323
            toThis("endium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Refractorywax = material("refractorywax") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("wax_refractory")
        }

        meta {
            numericId           = -1
            hashId              = 829
            toThis("wax_refractory")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AbyssalOats = material("abyssal_oats") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("abyssal_oat")
        }

        meta {
            numericId           = -1
            hashId              = 897
            toThis("abyssal_oat")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyGlowstone = material("any_glowstone") {
        name = "Glowstone"

        appearance {
            color       = Rgba(255, 255, 0, 255)
            iconSet     = IconSet.REDSTONE
        }

        physics {
            protons      = 32
            electrons    = 32
            neutrons     = 43
            mass         = 76L
            density      = 6.35109565
            meltingPoint = 500L
            boilingPoint = 600L
            plasmaPoint  = 60000L
        }

        fluids {
            solidifyingTarget = "glowstone" amount 648648000L
            smeltingTarget    = "glowstone" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
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

        meta {
            numericId           = -1
            hashId              = 1
            toThis("glowstone")
            toThis("glowstone_ceres")
            toThis("glowstone_io")
            toThis("glowstone_enceladus")
            toThis("glowstone_proteus")
            toThis("glowstone_pluto")
            toThis("gloomstone")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.GLOWING,
            MaterialTag.Properties.LIGHTING,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }

    val BasaltPolished = material("basalt_polished") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2203
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val AnyAventurine = material("any_aventurine") {
        name = "Aventurine"

        appearance {
            color       = Rgba(66, 189, 133, 200)
            iconSet     = IconSet.GLASS
        }

        physics {
            protons      = 10
            electrons    = 10
            neutrons     = 10
            mass         = 20L
            density      = 0.777486
            meltingPoint = 1986L
            boilingPoint = 3220L
            plasmaPoint  = 322000L
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 7.0f
        }

        meta {
            numericId           = -1
            hashId              = 9
            toThis("blue_aventurine")
            toThis("red_aventurine")
            toThis("green_aventurine")
            toThis("brown_aventurine")
            toThis("yellow_aventurine")
            toThis("black_aventurine")
        }

        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.CRYSTAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.VALUABLE,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val CalciumSulphate = material("calcium_sulphate") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("calcium_sulfate")
        }

        meta {
            numericId           = -1
            hashId              = 641
            toThis("calcium_sulfate")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Gregorium = material("gregorium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("technetium")
        }

        meta {
            numericId           = -1
            hashId              = 123
            toThis("technetium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyMagicalWood = material("any_magical_wood") {
        name = "Magical Wood"

        appearance {
            color       = Rgba(60, 30, 25, 255)
            iconSet     = IconSet.WOOD
        }

        physics {
            protons      = 3
            electrons    = 3
            neutrons     = 3
            mass         = 7L
            density      = 1.362
            meltingPoint = 400L
            boilingPoint = 500L
            plasmaPoint  = 50000L
        }

        fluids {
            solidifyingTarget = "wood" amount 648648000L
            smeltingTarget    = "ashes" amount 162162000L
        }

        tool {
            types      = 1
            quality    = 0
            durability = 16L
            speed      = 2.0f
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
        }

        meta {
            numericId           = -1
            hashId              = 44
            furnaceBurnTime     = 400L
            toThis("magicwood")
            toThis("wood_tainted")
            toThis("rainbowood")
            toThis("livingwood")
            toThis("witchwood")
            toThis("dreamwood")
            toThis("shimmerwood")
            toThis("greatwood")
            toThis("silverwood")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.WOOD,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Properties.MAGICAL,
            MaterialTag.ItemGenerator.STICKS,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.PLATES,
        )

    }

    val AntiWolfram = material("anti_wolfram") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_tungsten")
        }

        meta {
            numericId           = -1
            hashId              = 1725
            toThis("anti_tungsten")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Unquadpentium = material("unquadpentium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("duranium_elemental")
        }

        meta {
            numericId           = -1
            hashId              = 271
            toThis("duranium_elemental")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AntiNatrium = material("anti_natrium") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("anti_sodium")
        }

        meta {
            numericId           = -1
            hashId              = 1654
            toThis("anti_sodium")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Quicksilver = material("quicksilver") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("mercury")
        }

        meta {
            numericId           = -1
            hashId              = 171
            toThis("mercury")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val WolframSteel = material("wolfram_steel") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("tungstensteel")
        }

        meta {
            numericId           = -1
            hashId              = 1206
            toThis("tungstensteel")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val Phosphorous = material("phosphorous") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("phosphorus")
        }

        meta {
            numericId           = -1
            hashId              = 857
            toThis("phosphorus")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val GraniteBricks = material("granite_bricks") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2204
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val BasaltChiseled = material("basalt_chiseled") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        meta {
            numericId           = -1
            hashId              = 2202
        }

        tags(
            MaterialTag.Properties.AUTO_BLACKLIST,
            MaterialTag.Properties.AUTO_MATERIAL,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Properties.UNUSED_MATERIAL,
        )

    }

    val BlackTigerEye = material("black_tiger_eye") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("black_eye")
        }

        meta {
            numericId           = -1
            hashId              = 985
            toThis("black_eye")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val CyprusVitriol = material("cyprus_vitriol") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("blue_vitriol")
        }

        meta {
            numericId           = -1
            hashId              = 723
            toThis("blue_vitriol")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val FoolsRuby = material("fools_ruby") {
        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        processing {
            registrationTarget     = ref("balas_ruby")
        }

        meta {
            numericId           = -1
            hashId              = 956
            toThis("balas_ruby")
        }

        tags(
            MaterialTag.Properties.INVALID_MATERIAL,
        )

    }

    val AnyFlour = material("any_flour") {
        name = "Flour"

        appearance {
            color       = Rgba(255, 255, 196, 255)
            iconSet     = IconSet.POWDER
        }

        physics {
            protons      = 43
            electrons    = 43
            neutrons     = 55
            mass         = 98L
        }

        fluids {
            solidifyingTarget = "wheat" amount 648648000L
            smeltingTarget    = "wheat" amount 648648000L
        }

        tool {
            types      = 0
            quality    = 0
            durability = 1L
            speed      = 1.0f
        }

        processing {
            pulverTarget          = "wheat" amount 648648000L
            smashingTarget        = "wheat" amount 648648000L
            cuttingTarget         = "wheat" amount 648648000L
            workingTarget         = "wheat" amount 648648000L
            forgingTarget         = "wheat" amount 648648000L
            burningTarget         = "ashes" amount 72072000L
            bendingTarget         = "wheat" amount 648648000L
            compressingTarget     = "wheat" amount 648648000L
        }

        meta {
            numericId           = -1
            hashId              = 16
            toThis("abyssal_oat")
            toThis("corn")
            toThis("potato")
            toThis("wheat")
            toThis("barley")
            toThis("rye")
            toThis("oat")
        }

        tags(
            MaterialTag.Properties.NO_ADVANCED_TOOLS,
            MaterialTag.Properties.FLAMMABLE,
            MaterialTag.Properties.FOOD,
            MaterialTag.Properties.INVALID_MATERIAL,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Properties.UNUSED_MATERIAL,
            MaterialTag.Properties.IGNORE_IN_COLOR_LOG,
            MaterialTag.Processing.MELTING,
        )

    }
}
