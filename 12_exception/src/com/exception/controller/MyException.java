package com.exception.controller;

//���� Exception �����
//�⺻Ŭ������ Exception Ŭ������ ��ӹ���

public class MyException extends Exception {

	
	private static final long serialVersionUID = -253252351212152515L;
	
	public MyException() {
		super();
	}
	public MyException(String msg) {
		super(msg);
	}
}
