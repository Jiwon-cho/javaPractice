package com.inherit.model.vo;

import java.util.Objects;

public class Student extends Person {
	
//	private String name;
//	private int age;
//	private char gender;
//	private String address;
	private int grade;
	private int group;
	private int number;
//	private double weight;
//	private String phone;
//	
	//super()-> 부모 클래스의 기본 생성자를 위미
	public Student() {super("갈리오",29,'m',"의왕","13123",59.2,188.2);}
	
	public Student(
			String name,int age,char gender,String address,String phone,double weight,double height,
			int grade,int group,int number) {
		//super();
		super(name,age,gender,address,phone,weight,height);
//		this.name=name;
//		this.age=age;
//		this.gender=gender;
//		this.weight=weight;
//		this.phone=phone;
		this.grade=grade;
		this.group=group;
		this.number=number;
	}
	
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setAge(int age) {
//		this.age=age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setGender(char gender) {
//		this.gender=gender;
//	}
//	public char getGender() {
//		return gender;
//	}
//	public void setAddress(String address) {
//		this.address=address;
//	}
//	public String getAddress() {
//		return address;
//	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setGroup(int group) {
		this.group=group;
	}
	public int getGroup() {
		return group;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	
//	public void setWeight(double weight) {
//		this.weight=weight;
//	}
//	public double getWeight() {
//		return weight;
//	}
//	public void setPhone(String phone) {
//		this.phone=phone;
//	}
//	public String getPhone() {
//		return phone;
//	}
	
	//객체의 데이터를 보여주는 메소드
	public String studentInfo() {
		return super.getName()+"\t"+getAge()+"\t"+super.gender+"\t"+getAddress()+"\t"+getPhone()+"\t"+
		getWeight()+"\t"+getHeight()+"\t"+grade+"\t"+group+"\t"+number;
	}
	
	//메소드는 직접 접근 가능 고로 그냥 갖고옴// name 요런 매개 변수는 private 이라 직접접근 못함
	//직접 가져오는거는 .변수명 /
	
//부모메소드 Override 하기
//@Override
//public void infoObject() {
//	System.out.println("Student 클래스");
//}
//	
//@Override <근데 이거 지워 버리면 오류 안뜸 왜냐하면 이건 오버라이드가 아니니까
//public String infoObject(String name) {
//	return name;  
//}
// 이렇게 하면 오류 뜨는 것은 override를 하겠다고 표시 해놔서 부모 클래스랑 비교해서그럼	
	
//일반적으로  Override 하는 메소드가 잇음..
//Object 메소드..toString(),equals(),hashCode(),clone()
@Override
public String toString() {
	return getName()+" "+getAge()+" "+getGender()+" "+getAddress()+" "
			+getPhone()+" "+getWeight()+" "+getHeight()+" "+grade+" "+group+" "+number;
}
	
@Override
public boolean equals(Object obj) {
	//1 . 무엇(어떤 데이터를 기준으로)을 같은 객체로 보게 할것 인지
	//Object  는 모든것의 부모이기 때문에 모든 타입 다 가능한다는 말
	Student s=(Student)obj;
	if(getName().equals(s.getName())&&
			getAge()==s.getAge()&&
			getAddress().equals(s.getAddress())) {
		return true;
		
	}else
	
	return false;
}
//동등성비교를 했을때 데이터 일치여부만 오버라이딩 하는게 아니고
//hashCode() 주소값을 출력하는 매소드도 처리해야함.
@Override
public int hashCode() {
	return Objects.hash(getName(),getAge(),getAddress());
}

//객체 깊은복사 처리하기
//clone() 매소드 오버라이딩
@Override
public Student clone() {
	return new Student(getName(),getAge(),getGender(),getAddress(),getPhone(),getWeight(),getHeight(),grade,group,number);
}


}
	
	
	
	
	
	


