package fr.egance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.egance.entities.Categorie;

public interface CategoryRepository extends JpaRepository <Categorie , Long> {

}
