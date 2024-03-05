package com.isga.dao;

import java.util.List;

import com.isga.dao.entities.Categorie;
import com.isga.dao.entities.Produit;

public interface IDao {

	public Produit addproduit(Produit p, int idc);
	public Produit findById(int id);
	public List<Produit> all();
	public void delete(int id);
	public void update(int id, Produit p);
	
	
	public void addcategorie(Categorie c);
	public Categorie findCategorie(int id);
}
