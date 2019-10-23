package com.projecturanus.uranustech.common.command

import com.mojang.brigadier.CommandDispatcher
import com.projecturanus.uranustech.api.material.Material
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.LiteralText

object MaterialCommand {
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>) {
        dispatcher.register(CommandManager.literal("material").then(CommandManager.argument("material", MaterialArgumentType).executes {
            it.source.sendFeedback(LiteralText(it.getArgument("material", Material::class.java).toString()), true)
            0
        }))
    }
}
