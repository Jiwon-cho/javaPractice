package com.kh.test.shape.model.vo;

public class RectAngle {
	private int height;
	private int width;
	
	public RectAngle() {}

	public RectAngle(int width,int height) {
		super();
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void draw() {
		System.out.println("���� "+width+"cm, ���� "+height+"cm �� �簢���� �׸��ϴ�.");
	}

}
