package com.inherit.model.vo;

public class Person {
	private String name;
//	protected int age; protected 는 후손 클래스는 사용 가능해서 이렇게하면 접근 가능
	private int age;
	protected char gender;
	private String address;
	private double weight;
	private String phone;
	private double height;
	
	public Person() {}
	
	public Person(String name, int age, char gender, String address, String phone, double weight,double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.weight = weight;
		this.phone = phone;
		this.height=height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	
	public void infoObject() {
		System.out.println("자고싶다");
	}
	
}
