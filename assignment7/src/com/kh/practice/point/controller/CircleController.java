package com.kh.practice.point.controller;

import java.util.*;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c=new Circle();
	
	
	
	public String calcCircum(int x,int y,int radius ) {
		
		c.setX(x);
		
		c.setY(y);
		
		c.setRadius(radius);
		return "µ—∑π: "+c.toString()+(double)(c.getRadius()*3.14*2) ;
	}
	
	public String calcCircleArea(int x,int y,int radius) {
		c.setX(x);
		
		c.setY(y);
		
		c.setRadius(radius);
		return "≥–¿Ã: "+c.toString()+(double)(Math.pow(c.getRadius(),2)*3.14) ;
	}

}
