package com.obj.model.vo;

public class PublicTest {
	//접근 제한자가 public인 클래스 생성/
	
//	DefaultTest dt=new DefaultTest();// 얘는 같은 패키지라 됨
	
	public void variableTest() {
		MemberVariable mv=new MemberVariable();
		mv.name="나다";
		mv.age=190;
//		mv.height=19.2;//private 이라 class 내부에서만 됨
	}

}
