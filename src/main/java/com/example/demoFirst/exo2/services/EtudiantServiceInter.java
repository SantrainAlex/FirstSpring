package com.example.demoFirst.exo2.services;

import com.example.demoFirst.exo2.model.Etudiant;
import com.example.demoFirst.model.Person;

import java.util.List;

public interface EtudiantServiceInter {

    void setEtudiant(Etudiant etudiant);

    List<Etudiant> allEtudiant();

    Etudiant getOneEtudiant(int id);
    Etudiant getOneEtudiantNom(String nom);

    Etudiant updateOneEtudiant(int id, Etudiant etudiant);

    String deleteOneEtudiant(int id);

}
