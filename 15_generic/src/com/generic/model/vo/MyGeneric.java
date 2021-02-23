package com.generic.model.vo;

public class MyGeneric<T,U> {
	private T temp;
	private U temp2;
	
	

	public MyGeneric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyGeneric(T temp) {
		super();
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	public U getTemp2() {
		return temp2;
	}

	public void setTemp2(U temp2) {
		this.temp2 = temp2;
	}
	
	
}
