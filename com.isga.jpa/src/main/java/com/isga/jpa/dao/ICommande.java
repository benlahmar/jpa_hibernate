package com.isga.jpa.dao;

import java.util.Date;
import java.util.List;

import com.isga.jpa.entities.Commande;
import com.isga.jpa.entities.Lignecommande;

public interface ICommande {

	public Commande addCommande(Commande c);
	public Commande findCommande(int idc);
	public List<Commande> allCommande();
	public List<Commande> allCommande(int idu);
	public List<Commande> allCommande(Date dd, Date df);
	
	public Lignecommande addLigneCommande(Lignecommande c);
	
}
