package com.vari.controller;

public class VariableController {
	
	public static void main(String[] args) {
		//변수 선언하기
		//변수 선언하는 방법: 자료형 병수명;
		boolean flag;//변수명은 마음대로..단, 통상적으로 담고 있는 데이터를 표현해줄 수 있는 명칭으로 써라
		/*변수명을 작성할때는 규약
		 * 1. 대소문자가 구분되고 길이에 제약이 없음.*/
		int number;
		int nuMber; //이거 둘이 다름 대소문자가 다르기 때문에
		double alkfdsskjfskdjlfajlksfjalkdjslk;
		//2. 예약어는 사용이 불가능하다.>예약어란 이미 자바에서 지정 되있는 것들 ex)if, while, catch..
		//3. 숫자로 시작할 수 없음
		String name1; // 이름에 첫번째 자리만 숫자 아니면 됨
		String na1me;
		//4.특수문자_ 나 $aks 사용이 가능함.
		short _snum;
		double s$s;
		//5. 변수명은 한글로 가능하다
		double 가나다;//하지만 사용하지마라, 한국어는 공용어가 아니니까
		//영문으로 사용하자
		
		//변수명이 두단어이상으로 결합명칭일때는
		//첫글자는 무조건 소문자, 이어지는 단어의 첫글자는 대문자.
		
		int studentNumberForm;//camelcase = 낙타봉 표기법
		
		//변수선언시 주의할 점
		//같은 영역<{} 내에서 동일한 변수명이 있으면 안된다.
		/*ex) {
		 * int i;
		 * short i; < 이러면 안됌 , cpu 가 뭐 불러올지 모름
		 */
		//loval variable 지역변수 , 매소드 영역내에 선언된 변수
		
		
		
		int age = 30;
		System.out.println(age);
		
		 
		
	}

}
