package com.projecturanus.uranustech.api.material.generate;

import com.projecturanus.uranustech.api.material.MaterialStack;
import com.projecturanus.uranustech.common.block.MaterialBlock;
import com.projecturanus.uranustech.common.fluid.MoltenMaterialFluid;
import com.projecturanus.uranustech.common.item.FormItem;
import com.projecturanus.uranustech.common.material.MaterialContainer;

import java.util.function.Function;

public enum GenerateTypes implements GenerateType {
    BLOCK(MaterialBlock::new), ITEM(FormItem::new), TOOL(null), FLUID(MoltenMaterialFluid.Still::new), OTHER(stack -> null);

    private Function<MaterialStack, MaterialContainer> function;

    GenerateTypes(Function<MaterialStack, MaterialContainer> function) {
        this.function = function;
    }

    @Override
    public Function<MaterialStack, MaterialContainer> build() {
        return function;
    }
}
