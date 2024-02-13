package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloParamController {

    @GetMapping("/hello")
    @ResponseBody
    public String index(@RequestParam(required = false, defaultValue = "test") String name, @RequestParam String age) {
        return "Hello "+ name +", your age is " + age;
    }

}