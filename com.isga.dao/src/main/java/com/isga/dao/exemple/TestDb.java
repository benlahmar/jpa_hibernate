package com.isga.dao.exemple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.isga.dao.ProduitDao;
import com.isga.dao.entities.Categorie;
import com.isga.dao.entities.Produit;

public class TestDb {

	public static void main(String[] args) {
		Produit p= new Produit("Ecran2", 200, 10);
		
		Categorie c=new Categorie();
		c.setLibelle("info2");
		c.setDesciption("desc");
		ProduitDao dao=new ProduitDao();
		
		c.getProduits().add(p);
		
		dao.addcategorie(c);
		
		Categorie cat = dao.findCategorie(1);
		System.out.println(cat.getLibelle());
		
		System.out.println(cat.getProduits().size());
	}

}
