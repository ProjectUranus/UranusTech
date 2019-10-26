package com.projecturanus.uranustech.common.command

import com.mojang.brigadier.CommandDispatcher
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.common.multiblock.multiblock
import com.projecturanus.uranustech.common.multiblock.validateMultiblock
import net.minecraft.block.Blocks
import net.minecraft.command.arguments.BlockPosArgumentType
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.LiteralText
import net.minecraft.util.math.BlockPos

object MaterialCommand {
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>) {
        dispatcher.register(CommandManager.literal("material").then(CommandManager.argument("material", MaterialArgumentType).executes {
            it.source.sendFeedback(LiteralText(it.getArgument("material", Material::class.java).toString()), true)
            0
        }))
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
