package com.isga.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lignecommande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int qte;
	double prix;
	
	@ManyToOne
	Produit produit;
	@ManyToOne
	Commande commande;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	
}
