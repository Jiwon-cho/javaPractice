package com.obj.model.vo;

public class Person {
	
	private String name;
	private int age;
	private String phone;
	private double height;
	private String email;
	private String address;
	private static int count;
	
	public static void setCount(int count) {
		//this.name/name �Ѵ� �ȉ� ������ �ٸ�
		Person.count=count;
	}
	
	public int getCount() {
		Person.setCount(20);
		return count;
	}
	
	public Person() {}
	
	public Person(String name,int age,String phone,double height,String address) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.height=height;
		this.address=address;
	}
	//getter/setter �����
	//set: ��������� ���� �ִ� ��
	//get: ��������� ���� �������� ��
	//����Ģ
	//set������(): setName()
	//get������(): getName()
	//*�ݵ�� �ؼ��Ұ�. ->�����ӿ�ũ�� ���̺귯���� �̿��� �� ���ٴ� �����޼����� �� �� ����.
	
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
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}







}	
