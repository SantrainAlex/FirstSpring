package com.example.demoFirst.coltrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/base")
public class Exo2 {

    @GetMapping(value = "/1-Param")
    public String sayHello(){
        return "Hello";
    }

    @ResponseBody
    @GetMapping(value = "/params")
    public List<String> marqueJson(){
        return List.of("VW", "Audi");
    }
}
