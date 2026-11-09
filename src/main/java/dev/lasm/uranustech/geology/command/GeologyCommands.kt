package dev.lasm.uranustech.geology.command

import dev.lasm.uranustech.UranusTech
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.neoforge.event.RegisterCommandsEvent
import net.minecraft.commands.Commands

/** Registers the geology diagnostics under `/uranustech`. */
object GeologyCommands {
    @SubscribeEvent
    fun onRegisterCommands(event: RegisterCommandsEvent) {
        event.dispatcher.register(
            Commands.literal(UranusTech.MODID)
                .requires { source -> source.hasPermission(0) }
                .let(VeinDebugCommand::register)
        )
    }
}
