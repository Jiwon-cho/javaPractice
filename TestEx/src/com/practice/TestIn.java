package com.practice;

import java.util.Calendar;

public interface TestIn {
	static final Calendar c=Calendar.getInstance();
	static final String time=" "+c.get(Calendar.YEAR)+"�� "+(c.get(Calendar.MONTH)+1)+"�� "+c.get(Calendar.DATE)+"�� "
			+(c.get(Calendar.AM_PM)==0?"���� ":"���� ")+c.get(Calendar.HOUR)+"�� "+c.get(Calendar.MINUTE)+"�� "
			+c.get(Calendar.SECOND)+"�� ";

}
