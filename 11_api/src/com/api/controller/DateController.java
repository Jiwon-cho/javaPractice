package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateController {
	public static void main(String[] args) {
		//��¥�� ����ϱ�
		Date today=new Date();
		System.out.println(today);
		
		Date day=new Date(123456789L);
		System.out.println(day);
		
		Date birthDay=new Date(91,7-1,30);
		System.out.println(birthDay);
		
		//��¥ǥ����� �����ϱ�
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		String strBirth=sdf.format(birthDay);//����� ������ ���ڿ��� ��ȯ(return)
		System.out.println(strBirth);
		String strToday=sdf.format(today);
		System.out.println(strToday);
	}
}
