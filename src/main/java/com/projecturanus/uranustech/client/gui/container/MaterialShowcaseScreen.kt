package com.projecturanus.uranustech.client.gui.container

import com.mojang.blaze3d.platform.GlStateManager
import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.common.container.MaterialShowcaseContainer
import com.projecturanus.uranustech.common.util.localizedName
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen
import net.minecraft.text.TranslatableText
import net.minecraft.util.Identifier

class MaterialShowcaseScreen(container: MaterialShowcaseContainer) : AbstractInventoryScreen<MaterialShowcaseContainer>(container, container.playerInventory, TranslatableText("gui.container.material")) {
    companion object {
        private val TEXTURE = Identifier(MODID, "textures/gui/container/material_showcase.png")
        private val TEXT_BOUND_X = 164
        private val TEXT_BOUND_Y = 67
    }

    override fun drawBackground(f: Float, i: Int, j: Int) {
        GlStateManager.color4f(1.0f, 1.0f, 1.0f, 1.0f)
        minecraft!!.textureManager.bindTexture(TEXTURE)
        val x = this.x
        val y = (this.height - this.containerHeight) / 2
        this.blit(x, y, 0, 0, this.containerWidth, this.containerHeight)
    }

    override fun drawForeground(i: Int, j: Int) {
        val x = this.x
        val y = (this.height - this.containerHeight) / 2
        font.draw(container.material.localizedName.asFormattedString(), 12.0f, 5.0f, 4210752)
        font.draw(this.playerInventory.displayName.asFormattedString(), 8.0f, (this.containerHeight - 96 + 2).toFloat(), 4210752)
        super.drawForeground(i, j)
    }

    override fun init() {
        super.init()
    }

    override fun tick() {
        super.tick()
        container.tick()
    }

    override fun render(i: Int, j: Int, f: Float) {
        super.render(i, j, f)
        drawMouseoverTooltip(i, j)
    }
}
