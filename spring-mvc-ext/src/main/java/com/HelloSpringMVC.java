package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HelloSpringMVC {
    @RequestMapping("/hello")  
    public String test() {  
        System.out.println("test"); 
        return "hello"; 
    }
}