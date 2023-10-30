package com.example.demoFirst.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/hello")
public class HelloRestController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String sayHello(){
        System.out.println("hello");
        return "Hello World!!!";
    }

//    @RequestMapping(value = "/personnes")
    @ResponseBody
    @GetMapping(value = "/personnes")
    public List<String> personJson(){
        return List.of("Jhon", "toto", "tata");
    }
}
