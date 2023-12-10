package com.esprit.tpfoyers.controllers;

import com.esprit.tpfoyers.Entities.Utilisateur;
import com.esprit.tpfoyers.services.IUtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
@RequestMapping("utilisateurs")
public class RestController {
    IUtilisateurService utilisateurService;

    @GetMapping("/GetAllUtilsateurs")
    public List<Utilisateur> getAllUtilisateurs(){
        return utilisateurService.retrieveAllUtilisateurs();
    }


    @PostMapping("/add-utilisateur")
    public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur u) {
        Utilisateur utilisateur = utilisateurService.ajouterUtilisateur(u);
        return utilisateur;
    }
}
