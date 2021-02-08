package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int [] lotto;
	
	{
		lotto=new int [45];
		for(int i=0; i<45;i++) {
			lotto[i]=(int)(new Random().nextInt(45)+1);
		}
	}
	
	public void information() {
		for(int i=0;i<45;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
