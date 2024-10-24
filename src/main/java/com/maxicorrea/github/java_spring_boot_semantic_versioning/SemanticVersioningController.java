package com.maxicorrea.github.java_spring_boot_semantic_versioning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/version")
public class SemanticVersioningController {
    

    @GetMapping("")
    public String getVersion() {
        return "Version 1.0.0";
    }
    
    @GetMapping("/hello")
    public String getHello() { 
        return "Hello";
    }
    
}
