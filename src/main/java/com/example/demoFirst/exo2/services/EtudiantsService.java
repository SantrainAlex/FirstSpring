package com.example.demoFirst.exo2.services;

import com.example.demoFirst.exo2.model.Etudiant;
import com.example.demoFirst.model.Person;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class EtudiantsService implements EtudiantServiceInter {
    List<Etudiant> lstEtudiants = new ArrayList<Etudiant>();

    public String getAllInfo(Etudiant etudiants) {
        return etudiants.getId() + " "+etudiants.getNom()+ " "+ etudiants.getPrenom();
    }
    public void setEtudiant(Etudiant etudiant) {
        etudiant.setId(lstEtudiants.size() +1);
        lstEtudiants.add(etudiant);
    }

    @Override
    public List<Etudiant> allEtudiant() {
        return lstEtudiants;
    }

    @Override
    public Etudiant getOneEtudiant(int id) {
        for (Etudiant e: lstEtudiants){
            if (e.getId() == id){
                return e;
            }
        }
        return null;
    }

    @Override
    public Etudiant getOneEtudiantNom(String nom) {
        for (Etudiant e: lstEtudiants){
            if (Objects.equals(e.getNom(), nom)){
                return e;
            }
        }
        return null;
    }

    @Override
    public Etudiant updateOneEtudiant(int id, Etudiant etudiant) {
        for (Etudiant e: lstEtudiants){
            if (e.getId() == id){
                e.setNom(etudiant.getNom());
                e.setAge(etudiant.getAge());
                e.setPrenom(etudiant.getPrenom());
                return e;
            }
        }
        return null;
    }

    @Override
    public String deleteOneEtudiant(int id) {
        lstEtudiants.removeIf(etudiant -> etudiant.getId() == id);
        return "etudiant supprimer";
    }


}
