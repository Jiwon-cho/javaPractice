package com.poly2.model.vo;

import com.poly2.common.PrintDriver;

public class CannonPrinter implements PrintDriver{
	
	
	public void cannonPrint() {
		System.out.println("캐논프니터 인쇄중...");
	}
	
	@Override
	public void print() {
		System.out.println("캐논 프린트 출력");
	}
}
