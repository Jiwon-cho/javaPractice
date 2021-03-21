package com.practice;

import java.util.Calendar;

public interface TestIn {
	static final Calendar c=Calendar.getInstance();
	static final String time=" "+c.get(Calendar.YEAR)+"년 "+(c.get(Calendar.MONTH)+1)+"월 "+c.get(Calendar.DATE)+"일 "
			+(c.get(Calendar.AM_PM)==0?"오전 ":"오후 ")+c.get(Calendar.HOUR)+"시 "+c.get(Calendar.MINUTE)+"분 "
			+c.get(Calendar.SECOND)+"초 ";

}
