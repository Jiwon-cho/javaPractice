package com.obj.run;

import com.obj.controller.MethodTest;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodTest 클래스의 cal2매소드를 호출하려면
		MethodTest mt=new MethodTest();
		mt.cal2(10,10,'+');
		System.out.println(mt.cal3(10,10,'+'));//return 값이 mt.cal3 에 들어감 메소드 안에 들어간거

		

	}

}
