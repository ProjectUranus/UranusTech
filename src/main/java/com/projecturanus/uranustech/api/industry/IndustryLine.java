package com.projecturanus.uranustech.api.industry;

import com.projecturanus.uranustech.api.material.Material;

import java.util.Collection;

/**
 * Industry line progression prototype to be generated in real game.
 * Focusing on the multiplication and progression of materials.
 * Ore progressing is included.
 */
public interface IndustryLine {
    Collection<Material> getBaseMaterials();
    Collection<Material> getFinalMaterials();
}
