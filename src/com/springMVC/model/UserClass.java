package com.springMVC.model;

import org.springframework.stereotype.Service;

@Service
public class UserClass {

	private String name;
	private int age;
	private String email;
	private String country;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getCountry() {
		return country;
	}
	
	
}
