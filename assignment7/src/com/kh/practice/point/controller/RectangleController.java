package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r=new Rectangle();
	
	public String calcPerimeter(int x,int y,int width,int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return "둘레: "+r.toString()+(2*(r.getHeight()+r.getWidth()));
	}
	
	public String calcRectArea(int x,int y,int width,int height) {
	r.setX(x);
	r.setY(y);
	r.setWidth(width);
	r.setHeight(height);
	return "면적: "+r+(r.getHeight()*r.getWidth());
}
}