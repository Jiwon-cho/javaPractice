package com.poly2.common;

import java.awt.event.MouseListener;

//인터페이스는 상속이 가능함.
//상속하려면 extends 예약어를 사용 ,다중 상속 가능
public interface AnimalBarkAble {//extends FlyAble,Runnable,MouseListener{
		//인터페이스는 객체에 특정한 메소드를 강제하기 위해 사용을 함.
		//상위클래스(부모) 타입으로 사용이 가능함.
		//자체 생성이 불가능함.
		//인터페이스 내부의 변수는 모두 public static final
		//인터페이스 내부에 있는 메소드는 모두 public abstract 메소드
		public  static final int age=19;//고정값만 사용이 가능하다.
		//접근 제한자, 예약어(static,final)를 생략한다면?
		String admin="admin@admin.com";//이렇게도 가능
		
	
		//메소드 선언
//		public void test() {
//			System.out.println("ㅎㅇ");
////		}
//		public abstract void test();
//		
//		void test1();// 이렇게도 가능
//얘네 있으면 모든 메소드를 다 구현해야되기 때문에 없으면 오류남
		void bark();
	
		default public void move() {
			System.out.println("움직인다");
		};

}
