package com.example.unleashstarterdemo.service.impl;

import com.example.unleashstarterdemo.service.FeatureDemoService;
import org.springframework.stereotype.Service;

@Service("featureNewService")
public class FeatureDemoNewServiceImpl implements FeatureDemoService {
    @Override
    public String featureDemo( String name) {
        return "In new implementation : " + name;
    }
}
