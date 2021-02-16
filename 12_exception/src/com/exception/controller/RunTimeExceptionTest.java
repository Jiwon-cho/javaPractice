package com.exception.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class RunTimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	//ArithmeticException 수리계산적으로 말이 안됄 때
//try{ <-이렇게 하면 이 중괄호 안의 영역 안에 변수 선언 하면 지역 변수로 되서 밖에서 못씀
		System.out.println("수: ");
		int su=sc.nextInt();
		System.out.println("수: ");
		int su2=sc.nextInt();
		try {		
		System.out.println(su/su2);
		System.out.println("에러발생 이후 코드");//<-에러 발생 이되면 바로 catch로 넘어가기 때문에 생략 그냥 넘어감
	}catch(ArithmeticException e) {
		System.out.println("나오나?");
	}
		
		//NegativeArraySizeException: 배열 길이를 음수로 지정
		//int[] intArr=new int[-29];//compile 시점에 못읽음,heap영역 갈 때 읽음1111
		//사용자에게 받을 때나 실수록 음수 값이 입력될 수 있기 때문에 예외 처리를 해줌
		
		//ArrayIndexOutOfBoundsException : 배열의 인덱스 법위를 넘어서 지정	
		String[] names=new String[3];
	try {	
		names[3] ="ㄱㄱ";
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 증가");
		//String[] temp=new String[names.length+5];
		String[] temp=Arrays.copyOf(names, names.length+5);
		//System.arraycopy(names, 0, temp,0,names.length);
		temp[3]="유병승";
		names=temp;
	}
	
	for(String n: names) {
		System.out.println(n);
	}
		//ClassCastException : 클래스 형변환 에러
		Object obj=new Date();
		try {	
			String a=(String)obj;
	}catch(ClassCastException e) {
		System.out.println("에러");
	}
	
	//NullPointerException	
		String name=null;
	try {	
		name.charAt(0);
	}catch(NullPointerException e) {
		System.out.println("기본값 설정");
		name="조지원";
		
	}
		//		
		
		//checkedException
		//IOException(데이터입출력) -> 발생하는 예외에 대한 내용	
	String hobby[]=null;
	
	try {
		//hobby[0]="운동";
	FileInputStream input=new FileInputStream("test.txt");
	input.read();
	
}
catch(FileNotFoundException e) {
	e.printStackTrace();
	//return;
}//Exception 에도 상속관계가 있음	
	catch(NullPointerException e){
	System.out.println("ㅈ까");
}catch(IOException e) {
	System.out.println("IO");//IOException 이 부모 클래스가 그 예하꺼 다 처리, notfound 가 자식
}finally {
	System.out.println("무조건 실행");//try문 끝나면 무조건 실행하게 하는 것
}

	
	
System.out.println("나오나?");
new ThrowsTest().tryWithResourceTest();
	
	
	
	
}

}