package com.example.unleashstarterdemo.strategies;

import io.getunleash.UnleashContext;
import io.getunleash.strategy.Strategy;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NameStartsWithStrategy implements Strategy {
    @Override
    public String getName() {
        return "NameStartsWithStrategy";
    }

    @Override
    public boolean isEnabled(Map<String, String> map) {
        return false;
    }

    @Override
    public boolean isEnabled(Map<String, String> parameters, UnleashContext unleashContext) {
        final var paramValue = parameters.get("paramName");
        final String name = unleashContext.getProperties().get("name");

        return StringUtils.startsWith(name, paramValue);
    }

    public static UnleashContext buildContext(String value) {
        return UnleashContext
                .builder()
                .addProperty("name", value)
                .build();
    }
}
