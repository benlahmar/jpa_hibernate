package com.isga.jpa.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateurs")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "username", unique = true, length = 255)
	String login;
	
	String password;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	Profile profile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + "]";
	}
	
	
	
	
	
}
