package com.student.model.vo;

//학생정보를 저자하는객체
public class Student {
// public static int count=0;	
	private String name;//학생 이름, 2글자 이상
	private int age;//학생 나이, 음수는 대입금지
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
		//매개변수 있는 생성자로 매개변수에 있는 값을 멤버(필드) 변수에 대입하는 것
		this.name=name;//this 는?
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
	
	//학생정보를 모두 출력하는 메소드 구현하기
	//항목간격은 \t 출력하고 값은 String으로 반환하는 매소드임.
	//studentInfo()
//	public String studentInfo() {
//		return name+"\t"+age+"\t"+gender+"\t"+address+"\t"+kor+"\t"+eng+"\t"+math+"\t"+coding;
//	}
	
@Override
public String toString() {
	return name+"\t"+age+"\t"+gender+"\t"+address+"\t"+kor+"\t"+eng+"\t"+math+"\t"+coding;
}
	
	
}	



