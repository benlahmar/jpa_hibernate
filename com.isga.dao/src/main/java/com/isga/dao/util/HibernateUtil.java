package com.isga.dao.util;


import org.hibernate.*;
import org.hibernate.cfg.*;
public class HibernateUtil {    
public static final SessionFactory sessionFactory;    
static {        
	try {            
	sessionFactory = new Configuration()
			.configure()
			.buildSessionFactory();        
	} catch (Throwable ex) {
	System.err.println("Initial SessionFactory creation failed." + ex);            throw new ExceptionInInitializerError(ex);        
	}    
	}    
	public static SessionFactory getSessionFactory() {        
	    return sessionFactory;    
	}
}
