package com.vari.controller;

public class CastingTest {
	static public void main(String[] args) {
		//자동 형 변환 작은범위 자료형에서 큰 범위 자료형으로 변경 될 때
	
		long lnum=100;
		double dnum=lnum;
		System.out.println(dnum);
		//+연산시에도 자료형은 같아야함.
		//연산시에 자료형이 다를 때는 더 큰 자료형에 맞춰서 자동형변환
		System.out.println(10+30.5);
		double temp;
		temp=189.2;
		int name=(int)temp;
		System.out.println(name);
		
		//강제적 형변환: 큰 자료형에서 작은 자료형으로 대입할 때 에러 발생-> 강제적 형변환을 해줌
		//데이터 손실이 잇을 수 잇음
	
		double height=189.4;
		int num=(int)height;
		System.out.println(num);
		
		//char 문자->코드 매핑되어있는 숫자를 가지고 잇음.	
	    char ch = 'A';
	    System.out.println(ch);
	    System.out.println((int)ch);
	    num=97;
	    System.out.println(num);
	    System.out.println((char)num);
//	    System.out.println(ch);
	    ch=(char)(ch+1);
	    System.out.println(ch);
	    
	}

}
