package com.poly2.model.vo;

import com.poly2.common.PrintDriver;

public class LgPrinter implements PrintDriver {
	
	public void lgPrint() {
		System.out.println("�������� �μ���..");}
	
	@Override
	public void print() {
		System.out.println("lg ����Ʈ ���");
	}
	
	}

