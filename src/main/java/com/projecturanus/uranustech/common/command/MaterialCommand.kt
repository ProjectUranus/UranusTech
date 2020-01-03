package com.projecturanus.uranustech.common.command

import com.mojang.brigadier.CommandDispatcher
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.common.container.MATERIAL_SHOWCASE
import com.projecturanus.uranustech.common.util.localizedName
import net.fabricmc.fabric.api.container.ContainerProviderRegistry
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.LiteralText
import net.minecraft.text.Style
import net.minecraft.util.Formatting

object MaterialCommand {
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>) {
        dispatcher.register(CommandManager.literal("material")
            .then(CommandManager.literal("gui").then(CommandManager.argument("material", MaterialArgumentType).executes {
                val material = it.getArgument("material", Material::class.java)
                if (it.source.entity !is PlayerEntity)
                    it.source.sendFeedback(LiteralText("This command requires a player to execute it"), true)
                ContainerProviderRegistry.INSTANCE.openContainer(MATERIAL_SHOWCASE, it.source.player) { packet -> packet.writeIdentifier(material.identifier) }
                0
            }))
            .then(CommandManager.literal("info").then(CommandManager.argument("material", MaterialArgumentType).executes {
                val material = it.getArgument("material", Material::class.java)
                it.source.sendFeedback(LiteralText(material.toString()), true)
                arrayOf(material.localizedName.setStyle(Style().setColor(Formatting.AQUA)),
                        LiteralText(material.chemicalCompound).setStyle(Style().setColor(Formatting.GOLD)),
                        *material.description.map(::LiteralText).toTypedArray(),
                        LiteralText("Texture set: ${material.textureSet}").setStyle(Style().setColor(Formatting.BLUE)),
                        LiteralText("Valid forms: ${material.validForms}").setStyle(Style().setColor(Formatting.RED)),
                        LiteralText("Color: ${material.color}").setStyle(Style().setColor(Formatting.AQUA))
                ).forEach { text -> it.source.sendFeedback(text, false) }
                if (it.source.entity is PlayerEntity)
                    it.source.player.giveItemStack(ItemStack(Items.WRITTEN_BOOK))
                0
            }))
        )
    }
}
