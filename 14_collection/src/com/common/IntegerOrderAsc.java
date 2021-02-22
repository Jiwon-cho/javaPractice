package com.common;

import java.util.Comparator;

//리스트에 있는 두 객체의 순서를 비교하는 객체
public class IntegerOrderAsc implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer i2) {
		return i-i2;// 오름차순 정렬 -> + 면 바꿈
//	if(i>i2) {
//		return +1;
//	}else if(i<i2) {
//		return -1;
//		
//	}else {
//		return 0;
//	}
	}
}
