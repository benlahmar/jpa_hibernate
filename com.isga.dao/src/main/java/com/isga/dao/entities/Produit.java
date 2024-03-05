package com.isga.dao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int code;
	@Column(name = "libelle", unique = true, length = 255)
	String desg;
	double prix;
	int qte;
	@ManyToOne
	Categorie categorie;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Produit( String desg, double prix, int qte) {
		super();
		
		this.desg = desg;
		this.prix = prix;
		this.qte = qte;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	
}
