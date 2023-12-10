package com.esprit.tpfoyers.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Entity
public class Utilisateur implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idUtilisateur;
    private String prenom;
    private String nom;
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    Classe classe;


    }
