package com.isga.jpa.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.isga.jpa.entities.Profile;
import com.isga.jpa.entities.User;
import com.isga.util.HibernateUtil;

public class UserDao implements IUser{

	SessionFactory sf=HibernateUtil.getSessionFactory();
	@Override
	public User addUser(User u) {
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.persist(u);
		ses.getTransaction().commit();
		ses.close();
		return u;
		
	}

	@Override
	public void addUser(String login, String password) {
		User u=new User(login, password);
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.persist(u);
		ses.getTransaction().commit();
		ses.close();
		
	}

	@Override
	public User findUserByID(int id) {
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		User u = ses.find(User.class, id);
		ses.getTransaction().commit();
		ses.close();
		return u;
	}

	@Override
	public List<User> allusers() {
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		 List<User> uu = ses.createQuery("from User u ",User.class)
				 .list();
		ses.getTransaction().commit();
		ses.close();
		return uu;
	}

	@Override
	public User auth(String login, String password) {
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		 Query<User> uu = ses.createQuery("from User u where u.login=? and u.pass=?", User.class);
		 uu.setParameter(1, login);
		 uu.setParameter(2, password);
		User u = uu.list().get(0);
		ses.getTransaction().commit();
		ses.close();
		return u;

	}

	@Override
	public void addProfile(Profile p, int idu) {
		Session ses = sf.openSession();
		ses.beginTransaction();
		User u = ses.find(User.class, idu);
		p.setUser(u);
		ses.persist(p);
		ses.getTransaction().commit();
		ses.close();
		
	}

}
