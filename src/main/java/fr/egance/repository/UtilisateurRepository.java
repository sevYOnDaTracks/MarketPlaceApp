package fr.egance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.egance.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

}
