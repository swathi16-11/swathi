package com.rms.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;



@Entity

public class Adminlogin {

@Override
	public String toString() {
		return "Adminlogin [id=" + id + ", password=" + password + "]";
	}

@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;



private String password;

public Long getId() {

	return id;

}

public void setId(Long id) {

	this.id = id;

}



public String getPassword() {

	return password;

}

public void setPassword(String password) {

	this.password = password;

}






}

