package com.poly2.model.vo;

public  abstract class Person {//추상클래스
	private String name;
	private int age;
	private String address;
	
	public Person() {}
	
	protected Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//공통적으로 정해진 메소드를 구현하게 만들때 사용하는 것 -> 추상 메소드
	//각 객체마다 구현되는 내용이 다른것
	//추상 클래스는 선언부만 선언하고 구현부는 상속받은 객체에서 작성을 함.->강제
	//자식 클래스는 추상 메소드를 반드시 override 처리 해야한다.
	public abstract void active();
	
}
