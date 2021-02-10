package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int [] lotto=new int[6];
	
	{
		//lotto=new int [45];
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=(int)(new Random().nextInt(45)+1);
		}
	}
	
	
	public int[] getLotto() {
		return lotto;
	}


	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}


	public void information() {
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
