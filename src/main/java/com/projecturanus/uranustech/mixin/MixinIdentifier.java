package com.projecturanus.uranustech.mixin;

import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

@Mixin(Identifier.class)
public abstract class MixinIdentifier implements Externalizable {
    private static long serialVersionUID = 648648; // ULTIMATE ANSWER TO EVERYTHING

    @Shadow
    @Final
    protected String namespace;

    @Shadow
    @Final
    protected String path;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeChars(this.namespace + ':' + this.path);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    }
}
