package com.isga.jpa.dao;

import java.util.List;

import com.isga.jpa.entities.Profile;
import com.isga.jpa.entities.User;

public interface IUser {

	public User addUser(User u);
	public void addUser(String login, String password);
	public User findUserByID(int id);
	public List<User> allusers();
	public User auth(String login, String password);
	
	
	public void addProfile(Profile p, int idu);
}
