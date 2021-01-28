package com.obj.controller;

import com.obj.model.vo.MemberVariable;
import com.obj.model.vo.PublicTest;
//import com.obj.model.vo.DefaultTest; 안됌 디폴트라 안보임
public class ObjController {
	
	public void accessObj() {
		//접근제한자에 따른 클래스 이용가능여부
		//클래스를 이용하기 위해서는 new 연산자로 생성(객체화)을 해야한다.
		//new 클래스명() <---클래스를 생성한것.
		PublicTest pt=new PublicTest();
		
		//default 접근 제한자 클래스 생성하기
		//DefaultTest dt=new DEfaultTest();
		
		java.util.Date d= new java.util.Date();//이래도 되긴 하는데 이러면 계속 써야됨 주소를
	}
	public void memberVari() {
		//멤버 변수 활용 접근제한자 테스트하기
		MemberVariable mv=new MemberVariable();
		
		//mv.age=18;//default 접근제한자.
		//mv.height=190.3//private 접근 제한자
		System.out.println(mv.name);
		
		MemberVariable mv1=new MemberVariable();
		mv1.name="유병승";
		System.out.println(mv1.name);
	
		
		
//		System.out.println(mv.age);//접근제한자로 접근이 제한된 변수는 메소드를 이용함.
		//static 변수에 접근하기
		//static 변수는 heap 이 아닌 static 영역에 존재하며 멥버변수와 접근하는 방식이 다름
		//클래스를 생성 하지 않고 사용이 가능
		MemberVariable.gameTitle="메이플";
		//MemberVariable.bonus=0.2;//메소드를 이용해서 접근
		System.out.println(MemberVariable.bonus);
		MemberVariable mv2=new MemberVariable();
		System.out.println("mv: "+mv.memberId);
		System.out.println("mv1: "+mv1.memberId);
		System.out.println("mv2: "+mv2.memberId);
		
	}
}
