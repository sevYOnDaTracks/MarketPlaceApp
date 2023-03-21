package fr.egance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.egance.entities.Categorie;
import fr.egance.repository.CategoryRepository;

@RestController
@RequestMapping("/api/categorie")
public class CategorieController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Categorie>> getAllCategorie() {
		List<Categorie> categories = categoryRepository.findAll();
		return ResponseEntity.ok(categories);
	}
	
	@PostMapping
	public ResponseEntity<Categorie> createCategorie(@RequestBody Categorie categorie) {
		Categorie categorieSaved = categoryRepository.save(categorie);
		return ResponseEntity.status(HttpStatus.CREATED).body(categorieSaved);
	}

}
