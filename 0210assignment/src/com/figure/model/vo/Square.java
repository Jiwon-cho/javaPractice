package com.figure.model.vo;

public class Square {
	private int height;
	private int area;
	
	public Square() {}

	public Square(int area,int height) {
		super();
		this.height = height;
		this.area = area;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void Print() {
		System.out.println("넓이가 "+area+", 높이가 "+height+" 인 사각형 출력");
	}
	

}
