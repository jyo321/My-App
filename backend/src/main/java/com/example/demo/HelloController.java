package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public HashMap<String, String> hello() {
        HashMap<String, String> map = new HashMap<>();
        map.get("message", "Hello from Spring Boot Backend 🚀");
        return map;
    }
}