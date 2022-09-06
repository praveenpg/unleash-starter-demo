package com.example.unleashstarterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication
@EnableSpringConfigured
public class UnleashStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnleashStarterDemoApplication.class, args);
    }

}
