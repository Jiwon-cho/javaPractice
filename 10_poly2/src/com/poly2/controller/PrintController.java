package com.poly2.controller;

import com.poly2.common.PrintDriver;

public class PrintController {
//	private CannonPrinter print=new CannonPrinter();
//private LgPrinter print=new LgPrinter();
	//	private SamsungPrinter print=new SamsungPrinter();
private PrintDriver printer;	
	
public PrintController(PrintDriver printer) {
	this.printer=printer;
}

	public void print() {
//	print.cannonPrint();
//		print.printSamsung();
//		print.lgPrint();
		printer.print();
	}
}
