package com.projecturanus.uranustech.common.command

import com.mojang.brigadier.CommandDispatcher
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.common.container.MATERIAL_SHOWCASE
import com.projecturanus.uranustech.common.multiblock.multiblock
import com.projecturanus.uranustech.common.multiblock.validateMultiblock
import com.projecturanus.uranustech.common.util.localizedName
import net.fabricmc.fabric.api.container.ContainerProviderRegistry
import net.minecraft.block.Blocks
import net.minecraft.command.arguments.BlockPosArgumentType
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.LiteralText
import net.minecraft.text.Style
import net.minecraft.util.Formatting
import net.minecraft.util.math.BlockPos

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
                if (it.source.entity !is PlayerEntity)
                    it.source.sendFeedback(LiteralText(material.toString()), true)
                arrayOf(material.localizedName.setStyle(Style().setColor(Formatting.AQUA)),
                        LiteralText(material.chemicalCompound).setStyle(Style().setColor(Formatting.GOLD)),
                        *material.description.map(::LiteralText).toTypedArray(),
                        LiteralText("Texture set: ${material.textureSet}").setStyle(Style().setColor(Formatting.BLUE)),
                        LiteralText("Valid forms: ${material.validForms}").setStyle(Style().setColor(Formatting.RED)),
                        LiteralText("Color: ${material.color}").setStyle(Style().setColor(Formatting.AQUA))
                ).forEach { text -> it.source.sendFeedback(text, false) }
                it.source.player.giveItemStack(ItemStack(Items.WRITTEN_BOOK))
                0
            }))
        )
        dispatcher.register(CommandManager.literal("testmultiblock").then(CommandManager.argument("pos", BlockPosArgumentType.blockPos()).executes {
            validateMultiblock(multiblock {
                layer(
                        row(Blocks.OAK_LOG, Blocks.OAK_LOG, Blocks.OAK_LOG),
                        row(listOf(Blocks.OAK_LOG), axis(Blocks.OAK_LOG), listOf(Blocks.OAK_LOG))
                )
                layer(
                        row(Blocks.OAK_LOG, Blocks.OAK_LOG, Blocks.OAK_LOG),
                        row(listOf(Blocks.OAK_LOG), base(Blocks.OAK_LOG), listOf(Blocks.OAK_LOG))
                )
            }, it.getArgument("pos", BlockPos::class.java), it.source.world).hashCode()
        }))
    }
}
