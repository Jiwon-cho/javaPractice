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
	//super()-> �θ� Ŭ������ �⺻ �����ڸ� ����
	public Student() {super("������",29,'m',"�ǿ�","13123",59.2,188.2);}
	
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
	
	//��ü�� �����͸� �����ִ� �޼ҵ�
	public String studentInfo() {
		return super.getName()+"\t"+getAge()+"\t"+super.gender+"\t"+getAddress()+"\t"+getPhone()+"\t"+
		getWeight()+"\t"+getHeight()+"\t"+grade+"\t"+group+"\t"+number;
	}
	
	//�޼ҵ�� ���� ���� ���� ��� �׳� �����// name �䷱ �Ű� ������ private �̶� �������� ����
	//���� �������°Ŵ� .������ /
	
//�θ�޼ҵ� Override �ϱ�
//@Override
//public void infoObject() {
//	System.out.println("Student Ŭ����");
//}
//	
//@Override <�ٵ� �̰� ���� ������ ���� �ȶ� �ֳ��ϸ� �̰� �������̵尡 �ƴϴϱ�
//public String infoObject(String name) {
//	return name;  
//}
// �̷��� �ϸ� ���� �ߴ� ���� override�� �ϰڴٰ� ǥ�� �س��� �θ� Ŭ������ ���ؼ��׷�	
	
//�Ϲ�������  Override �ϴ� �޼ҵ尡 ����..
//Object �޼ҵ�..toString(),equals(),hashCode(),clone()
@Override
public String toString() {
	return getName()+" "+getAge()+" "+getGender()+" "+getAddress()+" "
			+getPhone()+" "+getWeight()+" "+getHeight()+" "+grade+" "+group+" "+number;
}
	
@Override
public boolean equals(Object obj) {
	//1 . ����(� �����͸� ��������)�� ���� ��ü�� ���� �Ұ� ����
	//Object  �� ������ �θ��̱� ������ ��� Ÿ�� �� �����Ѵٴ� ��
	Student s=(Student)obj;
	if(getName().equals(s.getName())&&
			getAge()==s.getAge()&&
			getAddress().equals(s.getAddress())) {
		return true;
		
	}else
	
	return false;
}
//����񱳸� ������ ������ ��ġ���θ� �������̵� �ϴ°� �ƴϰ�
//hashCode() �ּҰ��� ����ϴ� �żҵ嵵 ó���ؾ���.
@Override
public int hashCode() {
	return Objects.hash(getName(),getAge(),getAddress());
}

//��ü �������� ó���ϱ�
//clone() �żҵ� �������̵�
@Override
public Student clone() {
	return new Student(getName(),getAge(),getGender(),getAddress(),getPhone(),getWeight(),getHeight(),grade,group,number);
}


}
	
	
	
	
	
	


