package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: ActinideMaterials
@Suppress("unused") object ActinideMaterials {
    fun init() = Unit

    val Plutonium = material("plutonium") {
        appearance {
            color       = Rgba(240, 50, 50, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 94
            electrons    = 94
            neutrons     = 150
            mass         = 244L
            density      = 19.84
            meltingPoint = 912L
            boilingPoint = 3501L
            plasmaPoint  = 350100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        processing {
            byProduct("lead", "radium", "rare_earth")
        }

        composition {
            formula = "Pu"
        }

        meta {
            numericId           = 940
            hashId              = 201
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
            reRegisteredTo("plutonium244")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Actinium = material("actinium") {
        appearance {
            color       = Rgba(125, 113, 113, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 89
            electrons    = 89
            neutrons     = 136
            mass         = 225L
            density      = 10.07
            meltingPoint = 1323L
            boilingPoint = 3471L
            plasmaPoint  = 347100L
            hasMetallum  = true
        }

        composition {
            formula = "Ac"
        }

        meta {
            numericId           = 890
            hashId              = 184
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Neptunium = material("neptunium") {
        appearance {
            color       = Rgba(78, 90, 78, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 93
            electrons    = 93
            neutrons     = 144
            mass         = 237L
            density      = 20.45
            meltingPoint = 917L
            boilingPoint = 4273L
            plasmaPoint  = 427300L
            hasMetallum  = true
        }

        composition {
            formula = "Np"
        }

        meta {
            numericId           = 930
            hashId              = 198
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
            reRegisteredTo("neptunium237")
            reRegisteredTo("np237")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
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

    val Americium = material("americium") {
        appearance {
            color       = Rgba(200, 200, 200, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 95
            electrons    = 95
            neutrons     = 150
            mass         = 245L
            density      = 13.69
            meltingPoint = 1449L
            boilingPoint = 2880L
            plasmaPoint  = 288000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 4.0f
        }

        processing {
            byProduct("lead", "radium", "rare_earth")
        }

        composition {
            formula = "Am"
        }

        meta {
            numericId           = 950
            hashId              = 212
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Uranium233 = material("uranium233") {
        name = "Uranium-233"

        appearance {
            color       = Rgba(70, 250, 50, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 92
            electrons    = 92
            neutrons     = 141
            mass         = 233L
            density      = 18.95
            meltingPoint = 1405L
            boilingPoint = 4404L
            plasmaPoint  = 440400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "U-233"
        }

        meta {
            numericId           = 922
            hashId              = 196
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
            reRegisteredTo("u233")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Uranium235 = material("uranium235") {
        name = "Uranium-235"

        appearance {
            color       = Rgba(70, 250, 70, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 92
            electrons    = 92
            neutrons     = 143
            mass         = 235L
            density      = 18.95
            meltingPoint = 1405L
            boilingPoint = 4404L
            plasmaPoint  = 440400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "U-235"
        }

        meta {
            numericId           = 921
            hashId              = 193
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
            reRegisteredTo("uranium_enriched")
            reRegisteredTo("u235")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Americium242 = material("americium242") {
        name = "Americium-242"

        appearance {
            color       = Rgba(210, 210, 210, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 95
            electrons    = 95
            neutrons     = 147
            mass         = 242L
            density      = 13.69
            meltingPoint = 1449L
            boilingPoint = 2880L
            plasmaPoint  = 288000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 4.0f
        }

        composition {
            formula = "Am-242"
        }

        meta {
            numericId           = 952
            hashId              = 215
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
            reRegisteredTo("am242")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Americium241 = material("americium241") {
        name = "Americium-241"

        appearance {
            color       = Rgba(210, 210, 210, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 95
            electrons    = 95
            neutrons     = 146
            mass         = 241L
            density      = 13.69
            meltingPoint = 1449L
            boilingPoint = 2880L
            plasmaPoint  = 288000L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 256L
            speed      = 4.0f
        }

        composition {
            formula = "Am-241"
        }

        meta {
            numericId           = 951
            hashId              = 213
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
            reRegisteredTo("am241")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Uranium = material("uranium") {
        appearance {
            color       = Rgba(50, 240, 50, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 92
            electrons    = 92
            neutrons     = 146
            mass         = 238L
            density      = 18.95
            meltingPoint = 1405L
            boilingPoint = 4404L
            plasmaPoint  = 440400L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        processing {
            oreMultiplier           = 2
            byProduct("lead", "radium", "rare_earth")
            crushingTarget        = "uraninite" amount 648648000L
        }

        composition {
            formula = "U"
        }

        meta {
            numericId           = 920
            hashId              = 189
            originalMod         = "IC2"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
            reRegisteredTo("u238")
            reRegisteredTo("uranium238")
            reRegisteredTo("uran")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.ItemGenerator.MOLTEN,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.MELTING,
            MaterialTag.ItemGenerator.ARMORS,
        )

    }

    val Plutonium240 = material("plutonium240") {
        name = "Plutonium-240"

        appearance {
            color       = Rgba(235, 30, 30, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 94
            electrons    = 94
            neutrons     = 146
            mass         = 240L
            density      = 19.84
            meltingPoint = 912L
            boilingPoint = 3501L
            plasmaPoint  = 350100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "Pu-240"
        }

        meta {
            numericId           = 942
            hashId              = 203
            originalMod         = "hbm"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
            reRegisteredTo("pu240")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Plutonium241 = material("plutonium241") {
        name = "Plutonium-241"

        appearance {
            color       = Rgba(245, 70, 70, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 94
            electrons    = 94
            neutrons     = 147
            mass         = 241L
            density      = 19.84
            meltingPoint = 912L
            boilingPoint = 3501L
            plasmaPoint  = 350100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "Pu-241"
        }

        meta {
            numericId           = 943
            hashId              = 205
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
            reRegisteredTo("pu241")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Plutonium243 = material("plutonium243") {
        name = "Plutonium-243"

        appearance {
            color       = Rgba(250, 70, 70, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 94
            electrons    = 94
            neutrons     = 149
            mass         = 243L
            density      = 19.84
            meltingPoint = 912L
            boilingPoint = 3501L
            plasmaPoint  = 350100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "Pu-243"
        }

        meta {
            numericId           = 945
            hashId              = 207
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 2")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Plutonium239 = material("plutonium239") {
        name = "Plutonium-239"

        appearance {
            color       = Rgba(235, 50, 50, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 94
            electrons    = 94
            neutrons     = 145
            mass         = 239L
            density      = 19.84
            meltingPoint = 912L
            boilingPoint = 3501L
            plasmaPoint  = 350100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "Pu-239"
        }

        meta {
            numericId           = 947
            hashId              = 210
            originalMod         = "gregapi"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
            reRegisteredTo("pu239")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Plutonium238 = material("plutonium238") {
        name = "Plutonium-238"

        appearance {
            color       = Rgba(250, 30, 30, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 94
            electrons    = 94
            neutrons     = 144
            mass         = 238L
            density      = 19.84
            meltingPoint = 912L
            boilingPoint = 3501L
            plasmaPoint  = 350100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 3
            durability = 512L
            speed      = 6.0f
        }

        composition {
            formula = "Pu-238"
        }

        meta {
            numericId           = 946
            hashId              = 208
            originalMod         = "hbm"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 1")
            aspect("Radio - 3")
            reRegisteredTo("pu238")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Processing.EXTRUDABLE_SIMPLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.MORTAR_GRINDABLE,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.Processing.FURNACE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }

    val Thorium = material("thorium") {
        appearance {
            color       = Rgba(0, 30, 0, 255)
            iconSet     = IconSet.RAD
        }

        physics {
            protons      = 90
            electrons    = 90
            neutrons     = 142
            mass         = 232L
            density      = 11.72
            meltingPoint = 2115L
            boilingPoint = 5061L
            plasmaPoint  = 506100L
            hasMetallum  = true
        }

        tool {
            types      = 3
            quality    = 2
            durability = 512L
            speed      = 6.0f
        }

        processing {
            byProduct("lead", "radium", "rare_earth")
        }

        composition {
            formula = "Th"
        }

        meta {
            numericId           = 900
            hashId              = 185
            originalMod         = "gregtech"
            dictionaryBook      = "1xgt.multiitem.books@32002"
            handleMaterial      = ref("any_wood_or_plastic")
            aspect("Metallum - 2")
            aspect("Radio - 1")
            reRegisteredTo("thorium232")
            reRegisteredTo("th232")
        }

        tags(MaterialTag.ItemGenerator.simple())
        tags(
            MaterialTag.Properties.HAS_TOOL_STATS,
            MaterialTag.Properties.COMMON_ORE,
            MaterialTag.Atomic.ELEMENT,
            MaterialTag.Atomic.METAL,
            MaterialTag.Processing.EXTRUDABLE,
            MaterialTag.Atomic.ACTINIDE,
            MaterialTag.ItemGenerator.PARTS,
            MaterialTag.Processing.SMITHABLE,
            MaterialTag.ItemGenerator.ARMORS,
            MaterialTag.Processing.MELTING,
        )

    }
}
