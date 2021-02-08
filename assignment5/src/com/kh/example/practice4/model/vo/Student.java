package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	
	{
	grade=3;
	classroom=1;
	name="Áö¿ø";
	height=199.2;
	gender='m';
		
	}
	
	
	public void information() {
		System.out.print(grade+" "+classroom+" "+name+" "+height+" "+gender);
	}
}
