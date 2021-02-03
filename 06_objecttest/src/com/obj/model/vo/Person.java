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
		//this.name/name 둘다 안됌 영역이 다름
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
	//getter/setter 만들기
	//set: 멤버변수에 값을 넣는 것
	//get: 멤버변수에 값으 가져오는 것
	//명명규칙
	//set변수명(): setName()
	//get변수명(): getName()
	//*반드시 준수할것. ->프레임워크나 라이브러리를 이용할 때 없다는 에러메세지를 볼 수 있음.
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;// 중복값이 없기 때문에 상관없음
	}
	
	public void setAge(int age) {
		if(age<0) {System.out.println("음의값은 넣을 수 없습니다.");}else{this.age=age;
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
