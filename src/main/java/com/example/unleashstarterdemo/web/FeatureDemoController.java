package com.example.unleashstarterdemo.web;

import com.example.unleashstarterdemo.service.FeatureDemoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.unleash.features.annotation.Context;

@RestController
@RequestMapping("/feature")
public class FeatureDemoController {
    private final FeatureDemoService featureDemoService;

    public FeatureDemoController(@Qualifier("featureOldService") FeatureDemoService featureDemoService) {
        this.featureDemoService = featureDemoService;
    }

    @GetMapping
    public String featureDemo(@RequestParam @Context(name = "name") final String name) {
        return featureDemoService.featureDemo(name);
    }
}
