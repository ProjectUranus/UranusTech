package com.projecturanus.uranustech.mixin;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagContainer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Mixin(TagContainer.class)
public class MixinTagContainerClient {
    @Shadow
    private Map<Identifier, Tag> entries;

    @Overwrite
    public Collection<Identifier> getTagsFor(Object object) {
        List<Identifier> list = new ObjectArrayList<>();
        if (this.entries instanceof Object2ObjectMap) {
            Object2ObjectMaps.fastForEach((Object2ObjectMap<Identifier, Tag>) entries, entry -> {
                if (entry.getValue().contains(object)) {
                    list.add(entry.getKey());
                }
            });
        } else {
            Iterator var3 = this.entries.entrySet().iterator();

            while (var3.hasNext()) {
                Map.Entry<Identifier, Tag> entry = (Map.Entry) var3.next();
                if (entry.getValue().contains(object)) {
                    list.add(entry.getKey());
                }
            }
        }
        return list;
    }
}
