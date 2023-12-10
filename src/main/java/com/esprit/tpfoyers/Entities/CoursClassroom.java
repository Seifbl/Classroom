package com.esprit.tpfoyers.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class CoursClassroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idCours;
    private Specialiste specialiste;
    private String nom;

    private Integer nbHeures;
    private boolean archive;

  @ManyToOne
    Classe classe;

}
