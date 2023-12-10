package com.esprit.tpfoyers.services;

import com.esprit.tpfoyers.Entities.Utilisateur;
import com.esprit.tpfoyers.repositories.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurServiceimpl implements IUtilisateurService{

    UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> retrieveAllUtilisateurs() {
        return utilisateurRepository.findAll() ;
    }
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);

    }
}
