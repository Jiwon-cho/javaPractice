package com.exception.controller;

//나의 Exception 만들기
//기본클래스에 Exception 클래스를 상속받음

public class MyException extends Exception {

	
	private static final long serialVersionUID = -253252351212152515L;
	
	public MyException() {
		super();
	}
	public MyException(String msg) {
		super(msg);
	}
}
