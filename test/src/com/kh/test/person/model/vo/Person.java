package com.kh.test.person.model.vo;

public class Person {
	private String name;
	private char gender;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}
