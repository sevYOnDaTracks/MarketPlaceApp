package fr.egance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String nom;
	
	private String description;
	
	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Constructeur pour les relations entres les tables
	 */
	public Categorie(Long id ,String nom , String description) {
	       this.id = id;
	       this.nom = nom;
	       this.description = description ;
	   }
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
