package com.example.unleashstarterdemo.service;

import org.unleash.features.annotation.ContextPath;
import org.unleash.features.annotation.Toggle;

public interface FeatureDemoService {
    @Toggle(name = "demo-toggle2", alterBean = "featureNewService", contextPath = ContextPath.THREADLOCAL)
    String featureDemo(final String name);
}
