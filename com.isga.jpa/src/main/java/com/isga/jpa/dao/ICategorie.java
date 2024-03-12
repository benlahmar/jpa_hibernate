package com.isga.jpa.dao;

import com.isga.jpa.entities.Categorie;
import com.isga.jpa.entities.Produit;

public interface ICategorie {

	public void addcategorie(Categorie c);
	public void addProduit(Produit p, int idcat);
	
	public Categorie findCategorie(int id);
	public void updateCategorie(int idc, Categorie c);
}
