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
		System.out.print("4�ڸ����� �Է��Ͻÿ�: ");
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
			System.out.println("�����Դϴ�. �õ��� Ƚ��: "+count);
			System.out.println("������ �� �Ͻðڽ��ϱ�?");
			char asw=sc.next().toLowerCase().charAt(0);
			if(asw=='n') {
				return;
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�. "+strike+"S"+ball+"B");
			count+=1;
		}

	}
	}
}
