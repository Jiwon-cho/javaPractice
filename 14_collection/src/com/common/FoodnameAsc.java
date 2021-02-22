package com.common;

import java.util.Comparator;

import com.model.vo.Food;

public class FoodnameAsc implements Comparator <Food>{
	
	@Override
	public int compare(Food f1, Food f2) {
		return f1.getName().compareTo(f2.getName());
		
	}
}
