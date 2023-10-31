package com.example.demoFirst.controllers;

import com.example.demoFirst.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/crud")
public class CrudRestController {

    @GetMapping//Get http://localhost:8081/api/v1/crud
    public List<String> getAllPerson(){
        return List.of("Alexis Santrain", "Jeremy Santrain");
    }

    @GetMapping("/{id}")//Get http://localhost:8081/api/v1/crud/x
    public String getOnePerson(@PathVariable int id){
        return "Vous chercher la personne avec l'id "+id;
    }

    @PostMapping //Post http://localhost:8081/api/v1/crud
    public Person  create(@RequestBody Person person){
        return  person;
    }

    @DeleteMapping("/{id}")//Delete http://localhost:8081/api/v1/crud/x
    public String deletePerson(@PathVariable int id){
        return "Vous supprimer la personne avec l'id "+id;
    }

    @PutMapping("/{id}")//Put http://localhost:8081/api/v1/crud/x
    public String updatePerson(@PathVariable int id){
        return "Vous modifier la personne avec l'id "+id;
    }

}
