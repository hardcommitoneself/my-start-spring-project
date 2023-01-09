package com.example.starter;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/starter")
    public Starter starter(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Starter(counter.incrementAndGet(), String.format(template, name));
    }
}
