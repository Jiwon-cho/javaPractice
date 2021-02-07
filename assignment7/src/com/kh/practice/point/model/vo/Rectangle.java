package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y,int width,int height) {
		super(x, y);
		this.width=width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return ""+getX()+getY()+getWidth()+getHeight();
	}
	
}
