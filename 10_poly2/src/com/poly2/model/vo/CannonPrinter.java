package com.poly2.model.vo;

import com.poly2.common.PrintDriver;

public class CannonPrinter implements PrintDriver{
	
	
	public void cannonPrint() {
		System.out.println("ĳ�������� �μ���...");
	}
	
	@Override
	public void print() {
		System.out.println("ĳ�� ����Ʈ ���");
	}
}
