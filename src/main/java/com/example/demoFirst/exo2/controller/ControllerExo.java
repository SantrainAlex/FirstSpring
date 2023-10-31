package com.example.demoFirst.exo2.controller;

import com.example.demoFirst.exo2.model.Etudiant;
import com.example.demoFirst.exo2.services.EtudiantServiceInter;
import com.example.demoFirst.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/etudiant")
public class ControllerExo {
    private final EtudiantServiceInter etudiantService;

    @Autowired
    public ControllerExo(EtudiantServiceInter etudiantServiceInter){
        this.etudiantService = etudiantServiceInter;
    }

    @PostMapping
    public Etudiant create(@RequestBody Etudiant etudiant){

        etudiantService.setEtudiant(etudiant);
        return etudiant;
    }

    @GetMapping
    public List<Etudiant> getAllPerson(){
        return etudiantService.allEtudiant();
    }

    @GetMapping("/{id}")
    public Etudiant getOneEtudiant(@PathVariable int id){
        return etudiantService.getOneEtudiant(id);
    }

    @GetMapping("/Nom")
    public Etudiant getEtudiantNom(@RequestBody String nom){
        return etudiantService.getOneEtudiantNom(nom);
    }

    @PutMapping("/{id}")
    public Etudiant udateEtudiant(@PathVariable int id, @RequestBody Etudiant etudiant){
        return etudiantService.updateOneEtudiant(id, etudiant);
    }

    @DeleteMapping("/{id}")
    public String deleteEtudiant(@PathVariable int id){
        return etudiantService.deleteOneEtudiant(id);
    }



}
