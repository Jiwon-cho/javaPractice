package com.kh.test.run;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ���� �� ������ �����մϴ�.");
		
		do {
			System.out.println("���� ���� �� �� �Ѱ��� �Է��ϼ���: ");
			String input=sc.nextLine();
			System.out.println("����� "+input+" �� �½��ϴ�.");
			
			int random=(int)(Math.random()*3);
			String computer="";
			
			switch(random) {
			case 0:computer ="����";break;
			case 1:computer ="����";break;
			case 2:computer="��";break;
			}
			System.out.println("��ǻ�ʹ� "+computer+" �� �½��ϴ�.");
			
			if(computer.equals(input)) {
				System.out.println("�����ϴ�. �ٽ� �����մϴ�.");
				 
			}else {
				boolean win=false;
				
				if(computer =="����") {
					if(input=="����") {
						win=true;
					}
				}else if(computer =="����") {
					if(input=="��") {
						win=false;
					}
				}else {
					if(input=="����") {
						win =false;
					}
				}
				if(win) {
					System.out.println("����� �̰���ϴ�!");
					break;
				}else {
					System.out.println("����� �����ϴ�.");
					break;
				}
			}
			
			
			
			
			
		}while(false);
		
	}
	
}
