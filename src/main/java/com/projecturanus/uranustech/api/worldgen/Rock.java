package com.projecturanus.uranustech.api.worldgen;

import com.projecturanus.uranustech.api.registry.RegistryEntry;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;

/**
 * Represents a rock type.
 */
public interface Rock extends RegistryEntry, StringIdentifiable {
    EnumProperty<Rocks> ROCKS_PROPERTY = EnumProperty.of("rock", Rocks.class);
}
