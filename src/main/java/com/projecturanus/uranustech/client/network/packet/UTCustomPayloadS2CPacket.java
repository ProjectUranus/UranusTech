package com.projecturanus.uranustech.client.network.packet;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.CustomPayloadS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.PacketByteBuf;

import java.io.IOException;

public class UTCustomPayloadS2CPacket extends CustomPayloadS2CPacket {
    private Identifier channel;
    private PacketByteBuf data;

    public UTCustomPayloadS2CPacket() {
    }

    public UTCustomPayloadS2CPacket(Identifier identifier, PacketByteBuf byteBuf) {
        this.channel = identifier;
        this.data = byteBuf;
    }

    public void read(PacketByteBuf byteBuf) throws IOException {
        this.channel = byteBuf.readIdentifier();
        int int_1 = byteBuf.readableBytes();
        if (int_1 >= 0)
            this.data = new PacketByteBuf(byteBuf.readBytes(int_1));
    }

    public void write(PacketByteBuf byteBuf) throws IOException {
        byteBuf.writeIdentifier(this.channel);
        byteBuf.writeBytes(this.data.copy());
    }

    public void method_11457(ClientPlayPacketListener listener) {
        listener.onCustomPayload(this);
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
