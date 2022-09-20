package com.example.unleashstarterdemo.service;

import org.unleash.features.annotation.FeatureVariant;
import org.unleash.features.annotation.FeatureVariants;
import org.unleash.features.annotation.Toggle;

public interface BackgroundColorService {
    @Toggle(name = "background-color-feature",
            variants = @FeatureVariants(variants = {
                    @FeatureVariant(name = "green-background-variant", variantBean = "greenBackgroundColorService"),
                    @FeatureVariant(name = "red-background-variant", variantBean = "redBackgroundColorService")
            }))
    String getBackgroundColor();
}
