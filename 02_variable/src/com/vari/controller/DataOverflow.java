package com.vari.controller;

public class DataOverflow {
	public static void main(String[] args) {
		//byte bnum=125;
		int bnum=999995999;
		for(int i=0;i<10000000;i++) {
			bnum+=1000;
			System.out.println( bnum);
		}
			
	}

}
