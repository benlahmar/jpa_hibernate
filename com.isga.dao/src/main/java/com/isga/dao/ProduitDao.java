package com.isga.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.isga.dao.entities.Categorie;
import com.isga.dao.entities.Produit;
import com.isga.dao.util.HibernateUtil;

public class ProduitDao implements IDao{

	
	public Produit addproduit(Produit p,int idc) {
		
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Categorie c = ses.find(Categorie.class, idc);
		p.setCategorie(c);
		ses.persist(p);
		ses.getTransaction().commit();
		ses.close();
		return p;
	}

	
	public Produit findById(int id) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Produit pp = ses.find(Produit.class, id);
		ses.getTransaction().commit();
		ses.close();
		return pp;
	}

	
	public List<Produit> all() {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		 List<Produit> pp = ses.createQuery("from Produit", Produit.class).list();
		 
		ses.getTransaction().commit();
		ses.close();
		return pp;
	}

	
	public void delete(int id) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Produit pp = ses.find(Produit.class, id);
		ses.remove(pp);
		ses.getTransaction().commit();
		ses.close();
	}

	
	public void update(int id, Produit p) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Produit pp = ses.find(Produit.class, id);
		pp.setDesg(p.getDesg());
		pp.setPrix(p.getPrix());
		pp.setQte(p.getQte());
		ses.update(pp);
		
		ses.getTransaction().commit();
		ses.close();
		
	}

	
	public void addcategorie(Categorie c) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		ses.persist(c);
		ses.getTransaction().commit();
		ses.close();
	}

	
	public Categorie findCategorie(int id) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Categorie c = ses.find(Categorie.class, id);
		ses.getTransaction().commit();
		ses.close();
		return c;
	}

}
