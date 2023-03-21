package fr.egance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.egance.entities.Produit;
import fr.egance.repository.ProduitRepository;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping
	public ResponseEntity<List<Produit>> getAllProduit() {
		List<Produit> produits = produitRepository.findAll();
		return ResponseEntity.ok(produits);
	}

}
