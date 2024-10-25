package com.maxicorrea.github.java_spring_boot_semantic_versioning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.*;

@RestController
@RequestMapping("/version")
public class SemanticVersioningController {
    
    @GetMapping("")
    public String getVersion() {
        return "Semantic Versioning"; 
    }

    @GetMapping("/time")
    public String getMethodName() {
        return String.valueOf(LocalDateTime.now());
    }
    
}
