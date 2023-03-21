package fr.egance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.egance.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
