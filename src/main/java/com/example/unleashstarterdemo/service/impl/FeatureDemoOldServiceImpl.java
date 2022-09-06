package com.example.unleashstarterdemo.service.impl;

import com.example.unleashstarterdemo.service.FeatureDemoService;
import org.springframework.stereotype.Service;

@Service("featureOldService")
public class FeatureDemoOldServiceImpl implements FeatureDemoService {
    @Override
    public String featureDemo(String name) {
        return "In old implementation : " + name;
    }
}
