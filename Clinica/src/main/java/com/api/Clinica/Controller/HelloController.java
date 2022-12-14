package com.api.Clinica.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class HelloController {
    @GetMapping
    public String olaMundo() {
        return "Hello world Spring";
    }
}
