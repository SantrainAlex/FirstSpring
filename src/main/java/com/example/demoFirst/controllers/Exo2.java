package com.example.demoFirst.controllers;

import com.example.demoFirst.marque.Marque;
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

    @ResponseBody
    @GetMapping(value = "/Vw")
    private String marquesList(){
        Marque vw = new Marque("Vw");
        return vw.getName();
    }
}
