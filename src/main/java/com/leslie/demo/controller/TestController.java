package com.leslie.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getMessage")
    public String getMessage() {
        return "I'm king of the world!";
    }

    @GetMapping("/getName")
    public String getName() {
        return "my name is leslie111222333";
    }
}
