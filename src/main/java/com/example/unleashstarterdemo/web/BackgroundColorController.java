package com.example.unleashstarterdemo.web;

import com.example.unleashstarterdemo.service.BackgroundColorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.unleash.features.annotation.Context;

@RestController
@RequestMapping("/background")
public class BackgroundColorController {
    private final BackgroundColorService backgroundColorService;

    public BackgroundColorController(@Qualifier("noBackgroundColorService") BackgroundColorService backgroundColorService) {
        this.backgroundColorService = backgroundColorService;
    }

    @GetMapping
    public String backgroundColor(@RequestParam @Context(name = "name") final String name) {
        return backgroundColorService.getBackgroundColor();
    }
}
