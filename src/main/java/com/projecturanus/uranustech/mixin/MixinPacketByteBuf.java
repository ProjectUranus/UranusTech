package com.projecturanus.uranustech.mixin;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.handler.codec.EncoderException;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtIo;
import net.minecraft.nbt.PositionTracker;
import net.minecraft.util.PacketByteBuf;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.io.IOException;

@Mixin(PacketByteBuf.class)
public abstract class MixinPacketByteBuf extends ByteBuf {

    @Shadow public abstract int readerIndex();

    @Shadow public abstract ByteBuf readerIndex(int int_1);

    @Shadow public abstract byte readByte();

    /**
     *
     * @author Takakura-Anri
     */
    @Overwrite
    @Nullable
    public CompoundTag readCompoundTag() {
        int int_1 = this.readerIndex();
        byte byte_1 = this.readByte();
        if (byte_1 == 0) {
            return null;
        } else {
            this.readerIndex(int_1);

            try {
                long time = System.currentTimeMillis();
                CompoundTag tag = NbtIo.read(new ByteBufInputStream(this), new PositionTracker(2097152L * 2));
                return tag;
            } catch (IOException var4) {
                throw new EncoderException(var4);
            }
        }
    }
}
