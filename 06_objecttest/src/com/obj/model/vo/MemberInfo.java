package com.obj.model.vo;

public class MemberInfo {
	private String id;
	private String password;
	private String name;
	private int age;
	private String email;
	
	public MemberInfo() {}
	
	public MemberInfo(String id,String password,String name,int age,String email) {
		this.id=id;
		this.password=password;
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;// �ߺ����� ���� ������ �������
	}
	public void setAge(int age) {
		if(age<0) {System.out.println("���ǰ��� ���� �� �����ϴ�.");}else{this.age=age;
	}
	}
	public int getAge() {
		return age;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}

}
