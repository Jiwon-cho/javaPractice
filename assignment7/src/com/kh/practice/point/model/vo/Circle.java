package com.kh.practice.point.model.vo;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {}

	public Circle(int x, int y,int radius) {
		super(x, y);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
@Override
public String toString() {
	return getX()+" "+getY()+" "+getRadius()+" ";
}
	
}
