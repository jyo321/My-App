package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.HashMap;

@RestController
@CrossOrigin(origins = "*") // allow frontend to call backend
public class HelloController {

    @GetMapping("/api/hello")
    public HashMap<String, String> hello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello from Spring Boot Backend 🚀");
        return map;
    }
}