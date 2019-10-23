package com.projecturanus.uranustech.api.material;

import java.util.Collection;
import java.util.Collections;

public interface WildcardMaterial extends Material {
    /**
     * Checks if a material is valid subtype.
     * @param material subtype material
     * @return whether material is a subtype of wildcard
     */
    boolean isSubtype(Material material);

    /**
     * Known subtype materials
     */
    default Collection<Material> subMaterials() {
        return Collections.emptyList();
    }
}
