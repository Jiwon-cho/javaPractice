package com.poly2.model.vo;

import com.poly2.common.PrintDriver;

public class SamsungPrinter implements PrintDriver{
	
	public void printSamsung() {
		System.out.println("�Ｚ ����Ʈ �μ���..");
	}
	
	@Override
	public void print() {
		System.out.println("�Ｚ����Ʈ �����");
	}
}
