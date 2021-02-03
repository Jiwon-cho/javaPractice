package com.member.model.vo;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String address;
	private int age;
	private char gender;
	
	public Member() {}
	
	public Member(String id,String pw,String name,String address,int age,char gender) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.address=address;
		this.age=age;
		this.gender=gender;
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
		this.address=address;
	}
	public String getAddress() {
		return address;
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
	public String memberInfo() {
		return id+"\t"+pw+"\t"+name+"\t"+address+"\t"+age+"\t"+gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
