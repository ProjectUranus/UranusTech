package com.projecturanus.uranustech.api.worldgen;

import com.projecturanus.uranustech.api.registry.RegistryEntry;
import net.minecraft.state.property.EnumProperty;

/**
 * Represents a rock type.
 */
public interface Rock extends RegistryEntry {
    EnumProperty<Rocks> ROCKS_PROPERTY = EnumProperty.of("rock", Rocks.class);
}
