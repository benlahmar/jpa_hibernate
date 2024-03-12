package com.isga.jpa.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom,prenom;
	Date daten;
	@OneToOne
	User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDaten() {
		return daten;
	}
	public void setDaten(Date daten) {
		this.daten = daten;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(String nom, String prenom, Date daten) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.daten = daten;
	}
	
	
	
	
}
