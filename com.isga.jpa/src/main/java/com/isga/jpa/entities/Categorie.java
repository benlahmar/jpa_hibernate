package com.isga.jpa.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String libelle;
	
	@OneToMany(mappedBy = "categorie", 
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL)
	List<Produit> produits=new ArrayList<Produit>();
	
	
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelle=" + libelle +"]";
	}
	
	
	
	
}
