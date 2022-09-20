package com.example.unleashstarterdemo.strategies;

import io.getunleash.UnleashContext;
import io.getunleash.strategy.Strategy;
import org.springframework.stereotype.Component;
import org.unleash.features.aop.UnleashContextThreadLocal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

@Component
public class RegexBasedStrategy implements Strategy {
    private final ConcurrentHashMap<String, Pattern> patternConcurrentHashMap = new ConcurrentHashMap<>();

    @Override
    public String getName() {
        return "RegexBasedStrategy";
    }

    @Override
    public boolean isEnabled(Map<String, String> parameters) {
        return isEnabled(parameters, UnleashContextThreadLocal.get());
    }

    @Override
    public boolean isEnabled(Map<String, String> parameters, UnleashContext unleashContext) {
        final String regex = parameters.get("regex");
        final Pattern pattern = patternConcurrentHashMap.computeIfAbsent(regex, Pattern::compile);
        final String name = unleashContext.getByName("name").orElseThrow();

        return pattern.matcher(name).matches();
    }
}
