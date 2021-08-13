package com.scb.sigma.loan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FileNet")
public class FileNet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String unique_id;
	
	@Column(name="USERNAME")
	
	String username;
	@Column(name="PASSWORD")
	String password;
	public FileNet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FileNet(String unique_id, String username, String password) {
		super();
		this.unique_id = unique_id;
		this.username = username;
		this.password = password;
	}
	public String getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "FileNet [unique_id=" + unique_id + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
