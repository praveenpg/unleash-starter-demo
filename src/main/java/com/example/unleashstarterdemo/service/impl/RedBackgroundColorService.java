package com.example.unleashstarterdemo.service.impl;

import com.example.unleashstarterdemo.service.BackgroundColorService;
import org.springframework.stereotype.Service;

@Service("redBackgroundColorService")
public class RedBackgroundColorService implements BackgroundColorService {
    @Override
    public String getBackgroundColor() {
        return "Red";
    }
}
