package com.fightresolver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String flatCode;
	private int karmaPoints;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFlatcode() {
		return flatCode;
	}
	public void setFlatcode(String flatcode) {
		this.flatCode = flatcode;
	}
	public int getKarmaPoints() {
		return karmaPoints;
	}
	public void setKarmaPoints(int karmaPoints) {
		this.karmaPoints = karmaPoints;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", flatcode=" + flatCode + ", karmaPoints=" + karmaPoints
				+ "]";
	}
	public User(int id, String username, String flatcode, int karmaPoints) {
		super();
		this.id = id;
		this.username = username;
		this.flatCode = flatcode;
		this.karmaPoints = karmaPoints;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
