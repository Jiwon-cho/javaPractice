package com.poly2.model.vo;

import com.poly2.common.PrintDriver;

public class LgPrinter implements PrintDriver {
	
	public void lgPrint() {
		System.out.println("엘지블린터 인쇄중..");}
	
	@Override
	public void print() {
		System.out.println("lg 프린트 출력");
	}
	
	}

