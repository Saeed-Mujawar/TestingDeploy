package com.geekster.springDeploy.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hi this is Saeed";
                    }
    @GetMapping("home")
    public String hellow(){
        return "Hi this is home";
    }
}
