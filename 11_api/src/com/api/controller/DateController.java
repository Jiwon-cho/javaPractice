package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateController {
	public static void main(String[] args) {
		//날짜를 출력하기
		Date today=new Date();
		System.out.println(today);
		
		Date day=new Date(123456789L);
		System.out.println(day);
		
		Date birthDay=new Date(91,7-1,30);
		System.out.println(birthDay);
		
		//날짜표현방식 변경하기
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		String strBirth=sdf.format(birthDay);//포멧된 형식의 문자열로 반환(return)
		System.out.println(strBirth);
		String strToday=sdf.format(today);
		System.out.println(strToday);
	}
}
