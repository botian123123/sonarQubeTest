package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "欢迎使用Spring Boot Demo!");
        model.addAttribute("currentTime", LocalDateTime.now());
        return "index";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}

@RestController
class ApiController {

    @GetMapping("/api/hello")
    public Map<String, Object> apiHello(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello, " + name + "!");
        response.put("timestamp", LocalDateTime.now());
        response.put("status", "success");
        return response;
    }

    @GetMapping("/api/info")
    public Map<String, Object> info() {
        Map<String, Object> info = new HashMap<>();
        info.put("application", "Spring Boot Demo");
        info.put("version", "1.0.0");
        info.put("java.version", System.getProperty("java.version"));
        info.put("os.name", System.getProperty("os.name"));
        return info;
    }

    @GetMapping("/api/welcome")
    public Map<String, Object> apiWelcome(@RequestParam(name="name", required=true) String name) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Welcome, " + name + "!");
        response.put("timestamp", LocalDateTime.now());
        response.put("status","success");
        return response;
    }
}
