package com.example.demoFirst.services;

import org.springframework.stereotype.Service;

@Service("everyone")
public class GreetingsServiceEnglish implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello everyone !";
    }
}
