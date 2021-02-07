package com.kh.example.practice1.model.vo;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private int age;
	private char gender;
	private String email;
	
	public Member() {}
	
	public Member(String id,String pw,String name,String phone,int age,char gender,String email) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.phone=phone;
		this.age=age;
		this.gender=gender;
		this.email=email;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	public void setAddress(String address) {
		this.phone=phone;
	}
	public String getAddress() {
		return phone;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return pw;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	public void changeName(String name) {
		setName(name);
	}
	public void printNmae() {
		System.out.println(getName());
	}
	public String memberInfo() {
		return id+"\t"+pw+"\t"+name+"\t"+phone+"\t"+age+"\t"+gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
