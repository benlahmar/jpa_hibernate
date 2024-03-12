package com.isga.jpa.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.isga.jpa.entities.Categorie;
import com.isga.jpa.entities.Produit;
import com.isga.util.HibernateUtil;

public class CategorieDao implements ICategorie{

	SessionFactory sf=HibernateUtil.getSessionFactory();
	@Override
	public void addcategorie(Categorie c) {
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.persist(c);
		ses.getTransaction().commit();
		ses.close();
		
	}

	@Override
	public void addProduit(Produit p, int idcat) {
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		Categorie c = ses.find(Categorie.class, idcat);
		p.setCategorie(c);
		ses.persist(p);
		ses.getTransaction().commit();
		ses.close();
		
	}

	@Override
	public Categorie findCategorie(int id) {

		Session ses = sf.openSession();
		ses.beginTransaction();
		Categorie c = ses.find(Categorie.class, id);	
		ses.getTransaction().commit();
		ses.close();
		return c;
	}

	@Override
	public void updateCategorie(int idc, Categorie c) {
		Session ses = sf.openSession();
		ses.beginTransaction();
		Categorie cp = ses.find(Categorie.class, idc);	
		cp.setLibelle(c.getLibelle());
		ses.persist(cp);
		ses.getTransaction().commit();
		ses.close();
		
		
	}

}
