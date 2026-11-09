package dev.lasm.uranustech.data.materials

import dev.lasm.uranustech.api.chemical.material.*

// AUTO-GENERATED — do not edit manually
// Source: OreDictMaterials_clean.json  |  bucket: ParticleMaterials
@Suppress("unused") object ParticleMaterials {
    fun init() = Unit

    val Proton = material("proton") {
        appearance {
            color       = Rgba(255, 0, 0, 0)
        }

        physics {
            protons      = 1
            electrons    = 0
            neutrons     = 0
            mass         = 1L
            density      = 0.0
            meltingPoint = 0L
            boilingPoint = 0L
            plasmaPoint  = 0L
        }

        composition {
            formula = "p"
        }

        meta {
            numericId           = 4
            hashId              = 58
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Atomic.PARTICLE,
        )

    }

    val Neutron = material("neutron") {
        appearance {
            color       = Rgba(128, 128, 128, 0)
        }

        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 1
            mass         = 1L
            density      = 0.0
            meltingPoint = 0L
            boilingPoint = 0L
            plasmaPoint  = 0L
        }

        composition {
            formula = "n"
        }

        meta {
            numericId           = 3
            hashId              = 57
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Atomic.PARTICLE,
        )

    }

    val Electron = material("electron") {
        appearance {
            color       = Rgba(0, 0, 255, 0)
        }

        physics {
            protons      = 0
            electrons    = 1
            neutrons     = 0
            mass         = 0L
            density      = 0.0
            meltingPoint = 0L
            boilingPoint = 0L
            plasmaPoint  = 0L
        }

        composition {
            formula = "e"
        }

        meta {
            numericId           = 5
            hashId              = 59
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Atomic.PARTICLE,
        )

    }

    val Photon = material("photon") {
        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = 0L
            density      = 0.0
            meltingPoint = 0L
            boilingPoint = 0L
            plasmaPoint  = 0L
        }

        composition {
            formula = "y"
        }

        meta {
            numericId           = 1
            hashId              = 55
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Atomic.PARTICLE,
        )

    }

    val Neutrino = material("neutrino") {
        appearance {
            color       = Rgba(180, 180, 180, 0)
        }

        physics {
            protons      = 0
            electrons    = 0
            neutrons     = 0
            mass         = 0L
            density      = 0.0
            meltingPoint = 0L
            boilingPoint = 0L
            plasmaPoint  = 0L
        }

        composition {
            formula = "v"
        }

        meta {
            numericId           = 2
            hashId              = 56
            originalMod         = "gregapi"
            hidden              = true
            handleMaterial      = ref("any_wood_or_plastic")
        }

        tags(
            MaterialTag.Atomic.PARTICLE,
        )

    }
}
