package com.kh.test.shape.model.vo;

public class Circle {
	private double pi = Math.PI;
	private int radius;

	public Circle() {
	}

	
	public Circle(int radius) {
		super();
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
	
	
	public void draw() {
		System.out.println("�������� "+radius+"cm �� ���� �׸��ϴ�.");
	}
}
