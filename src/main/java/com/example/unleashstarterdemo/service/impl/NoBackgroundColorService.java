package com.example.unleashstarterdemo.service.impl;

import com.example.unleashstarterdemo.service.BackgroundColorService;
import org.springframework.stereotype.Service;

/**
 * @author pgovindan on 9/19/22
 * @project IntelliJ IDEA
 */
@Service("noBackgroundColorService")
public class NoBackgroundColorService implements BackgroundColorService {
    @Override
    public String getBackgroundColor() {
        return "no background";
    }
}
