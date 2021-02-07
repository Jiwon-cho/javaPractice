package com.kh.example.practice3.model.vo;

public class Circle {
	private  double pi=3.14;
	private  int radius=1;
	
	public Circle() {}
	
	public void incrementRadius() {
		radius+=1;
		getAreaOfCircle();
		getSizeOfCircle();		
	}
	
	public void getAreaOfCircle() {
		double area=(radius*radius)*pi;
		System.out.println(area);
	}
	public void getSizeOfCircle() {
		double size=2*pi*radius;
		System.out.println(size);				
	}
	
}
