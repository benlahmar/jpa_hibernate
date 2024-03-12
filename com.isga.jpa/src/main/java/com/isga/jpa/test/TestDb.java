package com.isga.jpa.test;



import java.util.Date;

import com.isga.jpa.dao.CategorieDao;
import com.isga.jpa.dao.IUser;
import com.isga.jpa.dao.UserDao;
import com.isga.jpa.entities.Categorie;
import com.isga.jpa.entities.Produit;
import com.isga.jpa.entities.Profile;
import com.isga.jpa.entities.User;




public class TestDb {

	public static void main(String[] args) {
			IUser udao;
			udao=new UserDao();
			User u = new User("toi5", "toi");
			Profile p=new Profile("nom","prenom",new Date());
			
			p.setUser(u);
			u.setProfile(p);
			
			
			 u = udao.addUser(u);
			
			System.out.println(u.toString());
			
		 
			

	}

}
