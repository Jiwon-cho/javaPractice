package com.student.model.vo;

//�л������� �����ϴ°�ü
public class Student {
// public static int count=0;	
	private String name;//�л� �̸�, 2���� �̻�
	private int age;//�л� ����, ������ ���Ա���
	private char gender;//
	private String address;
	private int kor;
	private int eng;
	private int math;
	private int coding;
	
	//{
	//	this.studentNumber=++count;
	//}
	
	public Student() {}
	
	public Student(String name,int age,char gender,String address) {
		//�Ű����� �ִ� �����ڷ� �Ű������� �ִ� ���� ���(�ʵ�) ������ �����ϴ� ��
		this.name=name;//this ��?
		this.age=age;
		this.gender=gender;
		this.address=address;
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
	
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getEng() {
		return eng;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getKor() {
		return kor;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public int getMath() {
		return math;
	}
	public void setCoding(int coding) {
		this.coding=coding;
	}
	public int getCoding() {
		return coding;
	}
	
	//�л������� ��� ����ϴ� �޼ҵ� �����ϱ�
	//�׸񰣰��� \t ����ϰ� ���� String���� ��ȯ�ϴ� �żҵ���.
	//studentInfo()
//	public String studentInfo() {
//		return name+"\t"+age+"\t"+gender+"\t"+address+"\t"+kor+"\t"+eng+"\t"+math+"\t"+coding;
//	}
	
@Override
public String toString() {
	return name+"\t"+age+"\t"+gender+"\t"+address+"\t"+kor+"\t"+eng+"\t"+math+"\t"+coding;
}
	
	
}	



