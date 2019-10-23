package com.projecturanus.uranustech.common.network

import net.fabricmc.fabric.api.network.PacketConsumer
import net.fabricmc.fabric.api.network.PacketContext
import net.minecraft.util.PacketByteBuf

class PacketEnergySync: PacketConsumer {
    override fun accept(context: PacketContext, buffer: PacketByteBuf) {
    }
}
