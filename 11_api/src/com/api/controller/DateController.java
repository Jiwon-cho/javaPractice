package com.api.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public static void main(String[] args) {
		//날짜를 출력하기
		Date today=new Date();
		System.out.println(today);
		
		Date day=new Date(1622569890039L);
		System.out.println(day);
		
		Date birthDay=new Date(91,7-1,30);
		System.out.println(birthDay);
		
		//날짜표현방식 변경하기
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		String strBirth=sdf.format(birthDay);//포멧된 형식의 문자열로 반환(return)
		System.out.println(strBirth);
		String strToday=sdf.format(today);
		System.out.println(strToday);
		
		/*Calendar를 이용해보자.
		Calendar 클래스는 추상 클래스기때문에 직접 생성이 불가능
		Calendar 의 getInstance() 메소드를 이용함.*/
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		
		//년, 월 일을 출력하려면
		//get 메소드를 이용해서 각각 가져와야함.
		System.out.println("오늘 날짜");
		System.out.print(c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DATE));//반환형이 int
		//컴퓨터에서 월을 표시할때 숫자는 0부터 시작,즉 현재 달로 맞추기 위해서는 +1해줘야함
		//System.out.print("-"+c.get(Calendar.DATE));
		
		//시간
		System.out.print("-"+(c.get(Calendar.AM_PM)==0?"오전 ":"오후 "));
		System.out.print("-"+c.get(Calendar.HOUR));
		System.out.println("-"+c.get(Calendar.MINUTE));
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		int ampm=c.get(Calendar.AM_PM);
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		System.out.println(year+"년 "+(month+1)+"월 "+date+"일 "+(ampm==0?"오전 ":"오후 ")+hour+":"+minute+":"+second);
		
		//Calendar 도 SimpleDateFormat 적용하기
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		String d=sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(d);
		
		//날짜를 내가 원하는 날짜로 병경하기
		//set 메소드,를 이용해서 처리하기.
		c.set(Calendar.YEAR, 1991);
		c.set(Calendar.MONTH, 6);//7로하면 8월임/고로 -1해서 6으로 해야함
		c.set(Calendar.DATE, 30);
		c.set(Calendar.HOUR,4);
		c.set(Calendar.MINUTE,38);
		
		System.out.println(sdf2.format(new Date(c.getTimeInMillis())));
		
		//Gregorian Calendar를 이용해보자.
		//값을 가져오거나, 값을 대입하는것은 동일!
		//생성자를 이용해서 날짜 생성이 가능하고,
		//매개변수 있는 생성자를 이용하면 년~초까지 초기화 가능
		GregorianCalendar gc=new GregorianCalendar();//현재 컴퓨터 날짜
		System.out.println(gc);
		System.out.println(gc.get(Calendar.YEAR));
		String d1=sdf2.format(gc.getTimeInMillis());
		System.out.println(d1);
		
		gc=new GregorianCalendar(1993,6-1,13);
		System.out.println(sdf2.format(gc.getTimeInMillis()));
		System.out.println(sdf2.format(new Date(gc.getTimeInMillis())));
		
		String bd="1998-04-19";
		String[] temp=bd.split("-");
		for(String day1:temp) {
			System.out.println(day1);
		}
		
		gc=new GregorianCalendar(Integer.parseInt(temp[0]),Integer.parseInt(temp[1])-1,Integer.parseInt(temp[2]));
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-MM-dd");
		try {
		
			Date parseDate=sdf4.parse(bd);
			System.out.println(sdf2.format(parseDate));

		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf2.format(new Date(gc.getTimeInMillis())));
		
		
		
		
	}
}
