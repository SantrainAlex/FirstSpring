package com.example.demoFirst.controllers;

import com.example.demoFirst.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseRestController {

    //Injection de dépendance par constructeur
    private final GreetingService greetingService;

    @Autowired
    public BaseRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


@RequestMapping(value = "/hello-service")
    public String sayHello(){
        System.out.println(greetingService.sayHello());
        return "coucou";
    }
}
