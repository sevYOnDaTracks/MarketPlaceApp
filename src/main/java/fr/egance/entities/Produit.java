package fr.egance.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    
    private long quantite;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie_id")
    private Categorie categorie; 
    
    public Produit() {
		// TODO Auto-generated constructor stub
	}
    
    public Produit(String nom , Long quantite , Categorie categorie) {
    	this.nom = nom ;
    	this.quantite = quantite;
    	this.categorie = categorie;
    }
    
    public Long getId() {
		return id;
	}
    
    public void setId(Long id) {
		this.id = id;
	}
    
    public String getNom() {
		return nom;
	}
    
    public void setNom(String nom) {
		this.nom = nom;
	}
    public long getQuantite() {
		return quantite;
	}
    public void setQuantite(long quantite) {
		this.quantite = quantite;
	}
    
    public Categorie getCategorie() {
		return categorie;
	}
    public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }

}
