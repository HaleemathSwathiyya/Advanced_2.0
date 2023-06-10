package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String email;
	private int age;
	private int mobileno;
	private String Gender;
	
public User() {
	// TODO Auto-generated constructor stub
}

public User(long id, String name, String email, int age, int mobileno, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.mobileno = mobileno;
	Gender = gender;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getMobileno() {
	return mobileno;
}

public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}

public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}


	
	

}
