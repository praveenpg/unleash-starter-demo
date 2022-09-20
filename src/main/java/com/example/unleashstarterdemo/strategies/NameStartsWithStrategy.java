package com.example.unleashstarterdemo.strategies;

import io.getunleash.UnleashContext;
import io.getunleash.strategy.Strategy;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

@Component
public class NameStartsWithStrategy implements Strategy {
    @Override
    public String getName() {
        return "name-starts-with";
    }

    @Override
    public boolean isEnabled(Map<String, String> map) {
        return false;
    }

    @Override
    public boolean isEnabled(Map<String, String> parameters, UnleashContext unleashContext) {
        final var paramValue = parameters.get("paramName").split(",");
        final String name = unleashContext.getProperties().get("name");

        return Arrays.stream(paramValue).anyMatch(a -> StringUtils.startsWith(name.toLowerCase(), a.toLowerCase()));
    }

    public static UnleashContext buildContext(String value) {
        return UnleashContext
                .builder()
                .addProperty("name", value)
                .build();
    }
}
