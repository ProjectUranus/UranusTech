package com.projecturanus.uranustech.api.tool;

import com.projecturanus.uranustech.api.material.form.Form;

public interface Tool extends Form {
    boolean hasHandleMaterial();

    default Form getHandleForm() {
        return null;
    }
}
