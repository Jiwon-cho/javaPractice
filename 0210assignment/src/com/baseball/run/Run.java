package com.baseball.run;

import java.util.Scanner;

import com.baseball.model.vo.Baseball;

public class Run {

	public static void main(String[] args) {
		Baseball b=new Baseball();
		String ran=b.Numb();
		Scanner sc=new Scanner(System.in);
		int count=1;
		
		while(true) {	
		int ball=0;
		int strike=0;
		System.out.print("4자리수를 입력하시오: ");
		String su=sc.next();
		
		char[]a1=ran.toCharArray();
		char[]a2=su.toCharArray();
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(a1[i]==a2[j]&&i==j) {
					strike+=1;
				}else if(a1[i]==a2[j]&&i!=j) {
					ball+=1;
				}
				
			}
		}
		if(strike==4) {
			System.out.println("정답입니다. 시도한 횟수: "+count);
			System.out.println("게임을 더 하시겠습니까?");
			char asw=sc.next().toLowerCase().charAt(0);
			if(asw=='n') {
				return;
			}
		}else {
			System.out.println("틀렸습니다. "+strike+"S"+ball+"B");
			count+=1;
		}

	}
	}
}
