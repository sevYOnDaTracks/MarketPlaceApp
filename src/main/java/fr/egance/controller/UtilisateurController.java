package fr.egance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.egance.entities.Utilisateur;
import fr.egance.repository.UtilisateurRepository;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utilisateursRepository;

	@GetMapping
	public ResponseEntity<List<Utilisateur>> getAllUtilisateurs() {
		List<Utilisateur> utilisateurs = utilisateursRepository.findAll();
		return ResponseEntity.ok(utilisateurs);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Utilisateur> getUtilisateursById(@PathVariable Long id) {
		Utilisateur utilisateurs = utilisateursRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Utilisateurs not found with id " + id));
		return ResponseEntity.ok(utilisateurs);
	}

	@PostMapping
	public ResponseEntity<Utilisateur> createUtilisateurs(@RequestBody Utilisateur utilisateurs) {
		Utilisateur savedUtilisateurs = utilisateursRepository.save(utilisateurs);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUtilisateurs);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Utilisateur> updateUtilisateurs(@PathVariable Long id, @RequestBody Utilisateur utilisateurs) {
		if (!utilisateursRepository.existsById(id)) {
			throw new RuntimeException("Utilisateurs not found with id " + id);
		}
		utilisateurs.setId(id);
		Utilisateur updatedUtilisateurs = utilisateursRepository.save(utilisateurs);
		return ResponseEntity.ok(updatedUtilisateurs);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUtilisateurs(@PathVariable Long id) {
		if (!utilisateursRepository.existsById(id)) {
			throw new RuntimeException("Utilisateurs not found with id " + id);
		}
		utilisateursRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
