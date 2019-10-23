package com.projecturanus.uranustech.client.render

import net.fabricmc.fabric.api.renderer.v1.Renderer
import net.fabricmc.fabric.api.renderer.v1.material.MaterialFinder
import net.fabricmc.fabric.api.renderer.v1.material.RenderMaterial
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshBuilder
import net.minecraft.util.Identifier

object UTRenderer : Renderer {
    override fun registerMaterial(id: Identifier?, material: RenderMaterial?): Boolean {
        return true
    }

    override fun materialById(id: Identifier?): RenderMaterial {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun meshBuilder(): MeshBuilder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun materialFinder(): MaterialFinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
