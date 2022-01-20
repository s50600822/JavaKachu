package com.example.javakachu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WateverController {
    @RequestMapping("/")
    public String helloWorld(){
        return "WHATEVER!";
    }
}
