package com.api.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public static void main(String[] args) {
		//��¥�� ����ϱ�
		Date today=new Date();
		System.out.println(today);
		
		Date day=new Date(1622569890039L);
		System.out.println(day);
		
		Date birthDay=new Date(91,7-1,30);
		System.out.println(birthDay);
		
		//��¥ǥ����� �����ϱ�
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		String strBirth=sdf.format(birthDay);//����� ������ ���ڿ��� ��ȯ(return)
		System.out.println(strBirth);
		String strToday=sdf.format(today);
		System.out.println(strToday);
		
		/*Calendar�� �̿��غ���.
		Calendar Ŭ������ �߻� Ŭ�����⶧���� ���� ������ �Ұ���
		Calendar �� getInstance() �޼ҵ带 �̿���.*/
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		
		//��, �� ���� ����Ϸ���
		//get �޼ҵ带 �̿��ؼ� ���� �����;���.
		System.out.println("���� ��¥");
		System.out.print(c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DATE));//��ȯ���� int
		//��ǻ�Ϳ��� ���� ǥ���Ҷ� ���ڴ� 0���� ����,�� ���� �޷� ���߱� ���ؼ��� +1�������
		//System.out.print("-"+c.get(Calendar.DATE));
		
		//�ð�
		System.out.print("-"+(c.get(Calendar.AM_PM)==0?"���� ":"���� "));
		System.out.print("-"+c.get(Calendar.HOUR));
		System.out.println("-"+c.get(Calendar.MINUTE));
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		int ampm=c.get(Calendar.AM_PM);
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		System.out.println(year+"�� "+(month+1)+"�� "+date+"�� "+(ampm==0?"���� ":"���� ")+hour+":"+minute+":"+second);
		
		//Calendar �� SimpleDateFormat �����ϱ�
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		String d=sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(d);
		
		//��¥�� ���� ���ϴ� ��¥�� �����ϱ�
		//set �޼ҵ�,�� �̿��ؼ� ó���ϱ�.
		c.set(Calendar.YEAR, 1991);
		c.set(Calendar.MONTH, 6);//7���ϸ� 8����/��� -1�ؼ� 6���� �ؾ���
		c.set(Calendar.DATE, 30);
		c.set(Calendar.HOUR,4);
		c.set(Calendar.MINUTE,38);
		
		System.out.println(sdf2.format(new Date(c.getTimeInMillis())));
		
		//Gregorian Calendar�� �̿��غ���.
		//���� �������ų�, ���� �����ϴ°��� ����!
		//�����ڸ� �̿��ؼ� ��¥ ������ �����ϰ�,
		//�Ű����� �ִ� �����ڸ� �̿��ϸ� ��~�ʱ��� �ʱ�ȭ ����
		GregorianCalendar gc=new GregorianCalendar();//���� ��ǻ�� ��¥
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
