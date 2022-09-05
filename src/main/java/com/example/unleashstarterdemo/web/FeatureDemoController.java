package com.example.unleashstarterdemo.web;

import com.example.unleashstarterdemo.service.FeatureDemoService;
import com.example.unleashstarterdemo.strategies.NameStartsWithStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature")
public class FeatureDemoController {
    private final FeatureDemoService featureDemoService;

    public FeatureDemoController(@Qualifier("featureOldService") FeatureDemoService featureDemoService) {
        this.featureDemoService = featureDemoService;
    }

    @GetMapping
    public String featureDemo(@RequestParam final String name) {
        return featureDemoService.featureDemo(name, NameStartsWithStrategy.buildContext(name));
    }
}
