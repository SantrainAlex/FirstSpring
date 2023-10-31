package com.example.demoFirst.exo2.model;

import lombok.Data;

@Data
public class Etudiant {
    private int id;
    private String nom;
    private int age;
    private String prenom;

    {
        ++id;
    }
}
