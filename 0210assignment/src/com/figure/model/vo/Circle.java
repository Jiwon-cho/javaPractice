package com.figure.model.vo;

public class Circle {
	private double pi = Math.PI;
	private int radius;

	public Circle() {
	}

	
	public Circle(double pi, int radius) {
		super();
		this.pi = pi;
		this.radius = radius;
	}




	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void print() {
		System.out.println("반지름이 "+radius+" 인 원 출력");
	}
	

}
