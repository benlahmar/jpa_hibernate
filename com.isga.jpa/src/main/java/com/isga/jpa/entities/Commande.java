package com.isga.jpa.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	Date date;
	
	
	@OneToMany(mappedBy = "commande")
	List<Lignecommande> lines;
	
	@ManyToOne
	User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Lignecommande> getLines() {
		return lines;
	}
	public void setLines(List<Lignecommande> lines) {
		this.lines = lines;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
