package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	//�ǽ� ����1
	public void Practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1.�Է�\n"+"2.����\n"+"3.��ȸ\n"+"4.����\n"+"7.����\n"+"�޴� ��ȣ�� �Է��ϼ���: ");
	    int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("�Է� �޴��Դϴ�.");break;
		case 2: System.out.println("���� �޴��Դϴ�.");break;
		case 3: System.out.println("��ȸ �޴��Դϴ�.");break;
		case 4: System.out.println("���� �޴��Դϴ�.");break;
		case 7: System.out.println("���α׷��� ����˴ϴ�.");break;
		}
		
	}
	//�ǽ� ����2
	public void Practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int su=sc.nextInt();
		if(su>0&&su%2==0) {
			System.out.println("¦����");
			
		}else if(su%2==1) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���");
		}
		
		
	}
	//�ǽ� ����3
	public void Practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int korean=sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int math=sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int english=sc.nextInt();
		int sum=korean+english+math;
		double aver=sum/3.0;
		
		if(korean>=40&&english>=40&&math>=40&&aver>=60) {
			System.out.println("����: "+korean+"\n����: "+math+"\n����: "+english+"\n�հ�: "+sum+"\n���: "+aver+"\n�����մϴ�, �հ��Դϴ�!");
			
		}else {
			System.out.println("���հ��Դϴ�.");
		}	
		
	}
	//�ǽ� ����4
	public void Practice4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է�: ");
		int month=sc.nextInt();
		switch(month) {
		case 1: case 2: case 12:System.out.println(month+"���� �ܿ� �Դϴ�.");break;
		case 3:case 4:case 5:System.out.println(month+"���� �� �Դϴ�.");break;
		case 6:case 7:case 8:System.out.println(month+"���� ���� �Դϴ�.");break;
		case 9:case 10: case 11:System.out.println(month+"���� ���� �Դϴ�.");break;
		default:System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
		
		}
		
	}
	//�ǽ� ����5
	public void Practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵�: ");
		String id=sc.next();
		System.out.print("��й�ȣ: ");
		String pas=sc.next();
		if(id.equals("myId")&&pas.equals("myPassword12")) {
			System.out.print("�α��� ����");
		}else if(pas.equals("myPassword12")) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(id.equals("myId")) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	//�ǽ� ����6
	public void Practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("��ȯ�� Ȯ���ϰ��� �ϴ� ȸ�� ���: ");
		String member=sc.next();
		switch(member) {
		case "������": System.out.println("ȸ�� ����,�Խñ� ����,�Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");break;
		case "ȸ��": System.out.println("�Խñ� �ۼ�,�Խñ� ��ȸ,��� �ۼ�");break;
		case "��ȸ��":System.out.println("�Խñ� ��ȸ");break;
		}
	}
	//�ǽ� ����7
	public void Practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ���: ");
		double height=sc.nextDouble();
		height*=height;
		System.out.print("������(kg)�� �Է��� �ּ���: ");
		double weight=sc.nextDouble();
		double bmi=weight/height;
		System.out.println("BMI ����:"+bmi);
		if(bmi>=30) {
			System.out.println("������");
		}else if(bmi>=25) {
			System.out.println("��");
		}else if(bmi>=23) {
			System.out.println("��ü��");
		}else if(bmi>=18.5) {
			System.out.println("����ü��");
		}else {
			System.out.println("��ü��");
		}
		
	}
	//�ǽ� ����8
	public void Practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է�: ");
		int a=sc.nextInt();
		double e=(double)a;
		
		System.out.print("�ǿ�����2 �Է�: ");
		int b=sc.nextInt();
		double f=(double)b;
		System.out.print("�����ڸ� �Է�(+,-*,/,%): ");
		char c=sc.next().charAt(0);
		char [] d = {'+','-','*','/','%'};
		double [] result = {(e+f),(e-f),(e*f),(e/f),(e%f)};
		for(int i=0;i<5;i++) {
			if(e>0&&f>0&&d[i]==c) {
				 
					System.out.println(""+a+d[i]+b+"= "+result[i]);}
	
			}
		 if(c!='+'&&c!='/'&&c!='*'&&c!='-'&&c!='%'){
				System.out.println("�߸� �Է��ϼ̽��ϴ�.���α׷��� �����մϴ�.");}	
	}		
	//�ǽ� ����9	
	public void Practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�߰� ���� ������ �Է��Ͻÿ�: ");
		double mid=sc.nextInt()*0.2;
		System.out.print("�⸻ ���� ������ �Է��Ͻÿ�: ");
		double fin=sc.nextInt()*0.3;
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		double asg=sc.nextInt()*0.3;
		System.out.print("�⼮ ȸ���� �Է��Ͻÿ�: ");
		double att=sc.nextDouble();
		System.out.println("=========���=========");
		double sum=mid+fin+asg+att;
		if(sum>=70&&(20-att)<(20*0.3)) {
			
				System.out.println("�߰� ���� ����(20): "+mid+"\n�⸻ ���� ����(30): "+fin+"\n���� ����(30): "+asg+"\n�⼮ ����(20): "+att+"\n����: "+sum+"\nPASS");
				
			}else if((20-att)>=(20*0.3)){
				System.out.println("Fail "+"[�⼮ ȸ�� ����("+(int)att+"/"+20+")]");
			}
		else if(sum<70) {
			System.out.println("�߰� ���� ����(20): "+mid+"\n�⸻ ���� ����(30): "+fin+"\n���� ����(30): "+asg+"\n�⼮ ����(20): "+att+"\n����: "+sum+"\nFail [���� �̴�]");
		}
		
		
		
	}
	//�ǽ� ���� 10
	public void Practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.\n"+"1.�޴� ���\n"+"2.¦��/Ȧ��\n"+"3.�հ�/���հ�\n"+"4.����\n"+"5.�α���\n"+"6.���� Ȯ��\n"+"7.BMI\n"+"8.����\n"+"9.P/F\n"+"����: ");
		int numb=sc.nextInt();
		switch(numb) {
		case 1: Practice1();break;
		case 2: Practice2();break;
		case 3: Practice3();break;
		case 4: Practice4();break;
		case 5: Practice5();break;
		case 6: Practice6();break;
		case 7: Practice7();break;
		case 8: Practice8();break;
		case 9: Practice9();break;
		
		}
		
	}









}