package com.frankc.training.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@EnableWebMvc
@RequestMapping("/str")
public class StringOpController {
    @GetMapping(path = "/ping/{input}")
    public Map<String, String> ping(@PathVariable String input) {
        Map<String, String> pong = new HashMap<>();
        pong.put("pong", "Hello, " + input + "!");
        return pong;
    }

    @GetMapping(path = "/reverse/{input}")
    public String reverse(@PathVariable String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @GetMapping(path = "/split/{input}")
    public String[] split(@PathVariable String input) {
        return input.split("\\s+");
    }
}
