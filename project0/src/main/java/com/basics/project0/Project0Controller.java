package com.basics.project0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Project0Controller {
    
    @GetMapping("/error")
    public String Hello() {
        return "Error 404";
    }
    
}
