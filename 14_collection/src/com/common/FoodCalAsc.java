package com.common;

import java.util.Comparator;

import com.model.vo.Food;

public class FoodCalAsc implements Comparator<Food> {

	@Override
	public int compare(Food f1, Food f2) {
//		if(o2 instanceof Food && o1 instanceof Food) {
//			Food f1=(Food)o1;
//			Food f2=(Food)o2;
//			
//			if(f1.getCalorie()>f2.getCalorie()) 
//				return +1; else if(f1.getCalorie(	)<f2.getCalorie())return -1;
//				else return 0;
//			
//		}
//			return 0;

		if (f1.getCalorie() < f2.getCalorie())
			return +1;
		else if (f1.getCalorie() > f2.getCalorie())
			return -1;
		else
			return 0;

	}
}
