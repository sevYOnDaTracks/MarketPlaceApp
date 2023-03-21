package fr.egance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    
    private long quantite;
    
    public Produit() {
		// TODO Auto-generated constructor stub
	}
    
    public Produit(String nom , Long quantite) {
    	this.nom = nom ;
    	this.quantite = quantite;
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
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }

}
