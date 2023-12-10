package com.esprit.tpfoyers.services;

import com.esprit.tpfoyers.Entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    List<Utilisateur> retrieveAllUtilisateurs();
    public Utilisateur ajouterUtilisateur (Utilisateur utilisateur);
}
