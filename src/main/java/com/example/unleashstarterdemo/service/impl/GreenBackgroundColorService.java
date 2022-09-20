package com.example.unleashstarterdemo.service.impl;

import com.example.unleashstarterdemo.service.BackgroundColorService;
import org.springframework.stereotype.Service;

@Service("greenBackgroundColorService")
public class GreenBackgroundColorService implements BackgroundColorService {
    @Override
    public String getBackgroundColor() {
        return "Green";
    }
}
