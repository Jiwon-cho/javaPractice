package com.api.controller;

public class WrapperTestController {
	public static void main(String[] args) {
		//wrapper클래스는 자동으로 적용됨.
		Integer age=new Integer(19);
		System.out.println(age);
		int age2=age;//객체가 기본자료형에 대입됨.오토 언박싱
		age=100;//오토박싱!
		
		Double weight=65.6;//<-자동 언박싱
		
		System.out.println(age.MAX_VALUE);//<-객체라서 필드변수 같은거 부를수있음
		
		//문자열을 정수타입으로 변경하는 방법
		//ag2=(int)"19";<-안됌, String은 객체니까
		age2=Integer.parseInt("19");
		System.out.println(age2);
		weight=Double.parseDouble("65.6");
		System.out.println(weight);
		//age2=Integer.parseInt("19 ");
		boolean flag=Boolean.parseBoolean("true");
		test(age2);//<-wrapper 클래스 라서 됨
	
	}
	public static void test(Number obj) {//<-넘버가 부모 자료형이고 그거의 위가 오브젝트라 둘다 됨(Object obj) {
		System.out.println(obj instanceof Integer);
		System.out.println(obj);
	}
	
}
