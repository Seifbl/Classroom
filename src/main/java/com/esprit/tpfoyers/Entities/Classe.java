package com.esprit.tpfoyers.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;
@Entity
public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer codeClasse;
    private  String titre;
    private Niveau niveau;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classe")
    private Set<CoursClassroom> CoursClassrooms;
}
