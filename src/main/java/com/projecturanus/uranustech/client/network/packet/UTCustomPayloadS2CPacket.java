package com.projecturanus.uranustech.client.network.packet;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.packet.CustomPayloadS2CPacket;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.util.Identifier;
import net.minecraft.util.PacketByteBuf;

import java.io.IOException;

public class UTCustomPayloadS2CPacket extends CustomPayloadS2CPacket {
    private Identifier channel;
    private PacketByteBuf data;

    public UTCustomPayloadS2CPacket() {
    }

    public UTCustomPayloadS2CPacket(Identifier identifier_1, PacketByteBuf packetByteBuf_1) {
        this.channel = identifier_1;
        this.data = packetByteBuf_1;
    }

    public void read(PacketByteBuf packetByteBuf_1) throws IOException {
        this.channel = packetByteBuf_1.readIdentifier();
        int int_1 = packetByteBuf_1.readableBytes();
        if (int_1 >= 0)
            this.data = new PacketByteBuf(packetByteBuf_1.readBytes(int_1));
    }

    public void write(PacketByteBuf packetByteBuf_1) throws IOException {
        packetByteBuf_1.writeIdentifier(this.channel);
        packetByteBuf_1.writeBytes(this.data.copy());
    }

    public void method_11457(ClientPlayPacketListener clientPlayPacketListener_1) {
        clientPlayPacketListener_1.onCustomPayload(this);
    }

    @Environment(EnvType.CLIENT)
    public Identifier getChannel() {
        return this.channel;
    }

    @Environment(EnvType.CLIENT)
    public PacketByteBuf getData() {
        return new PacketByteBuf(this.data.copy());
    }
}
