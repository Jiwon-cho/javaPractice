package com.array.controller;

import java.util.*;

public class ArrayController {
	public void basicArray() {
		// �迭 ����� �Ҵ��ϱ�
		int[] intArr;
		char[] charArr = null;
//		System.out.println(intArr);���� ������ �ʱ�ȭ �ȵŸ� ������ ����

		// �迭 ������ Ȱ�� �Ϸ��� �Ҵ��� �ؾ���.
		intArr = new int[3];
		charArr = new char[4];
//	    System.out.println(intArr);
//	    System.out.println(charArr);

		double[] darr = new double[10];
		// �迭�� �ε����� �������� �迭������ ���� ������ �� �ִ�.
		// �ε����� ������ �ҷ��� �� ������
		intArr[0] = 19;
		intArr[1] = 20;
		intArr[2] = 30;
		// �迭�ο��� �ε����� �ʰ��ؼ� �����ϸ�?
		// intArr[3]=40;->���� �� , ���� ������ �� � ������-

		// �迭�� �ִ� �� ����ϱ�
//	    int a=10;
//	    System.out.println(a);
//	    System.out.println(intArr[0]);
//	    
////	    String[] a= {"������","������","��⿵","�밡��"};
////	    for(int i=0;i<4;i++) {
////	    	System.out.println(a[i]);
////	    }
//	    int [] su=new int[10];
//	    for(int i=0;i<10;i++) {
//	    	su[i]=i+1;
//	    }
//	    for(int j=0;j<10;j++) {
//	    	System.out.println(su[j]);
//	    }
//	    
		String[] names;
		names = new String[] { "������", "�����", "��⿵", "�ڿ���", "����", "�����", };

//	    Scanner sc=new Scanner(System.in);
////	    System.out.println("ã���� �ϴ� �̸��� �����ÿ�: ");
////	    String nm=sc.next();
////	    for(int i=0;i<6;i++) {
////	    	if(!names[i].equals(nm)) {
////	    		continue;
////	    	}
////	    	System.out.println("����");
//	    
//	    
//	    boolean flag=false;
//	    for(int i=0;i<6;i++) {
//	    	System.out.println(names[i]);
//	    	if(names[i].equals("������")){
//	    		flag=true;
//	    	}
//	    
//	    
//  
		Scanner sc = new Scanner(System.in);
		String[] hobby = new String[5];

//	    int i=0;
//	    while(i<5) {
//	    	System.out.print("��̸� �����ÿ�: ");
//		    hobby[i]=sc.next();
//	    	
//	    	
//	    	i++;
////	    }
//	    System.out.println("��� 5���� �Է�: ");
//	    for(int i=0;i<5;i++) {
//	    	System.out.println(i+1+"�� ���");
//	    	hobby[i]=sc.nextLine();
//	    }
//	    for(int a=0;a<5;a++) {
//	    System.out.print(hobby[a]+" ");
//	    }
//	    

		System.out.println("��� 5���� �Է� ");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "�� ���");
			hobby[i] = sc.nextLine();
		}
		boolean f=false;
		System.out.println("���?: ");
		String hb=sc.next();
		here:
		for(int i=0;i<5;i++) {
			if(hobby[i].equals(hb)){
				
				f=true;
				break;
				
			
			}
				
			
		
		}System.out.println(f?"�ִ�":"����");
		
		
		
		
	}
	public void changeData() {
		//�迭�� ���� �Ǿ� �ִ� ���� ����
		int[] num= {1,5,3,6,8,9};
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		int temp=num[4];
		num[4]=num[1];
		num[1]=temp;
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		int[] nums= {78,3,5,2,6,9,12,4,7};
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			for(int j=0;j<i;j++) {
				System.out.print(nums[j]+" ");
				if(nums[i]<nums[j]) {
					int t=nums[i];
					nums[i]=nums[j];
					nums[j]=t;
				}
			}
			System.out.println();
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
			
		}
		System.out.println();
	}
   public void random() {
	   //���� �� ����ϱ�
	   //�� ���� ���
	   //1.Math ��ü�� �̿��ϴ� ���->random() �׳� Math.random �� �Ҽ� ����
	   //2.Random ��ü�� �̿��ϴ� ���->nextInt()
	   
	   System.out.println((int)(Math.random()*10));//0.00~9.000 ���� ��
	   System.out.println((int)(Math.random()*10)+1);//1~10����
	   System.out.println((int)(Math.random()*45)+1);//1~45����
	   System.out.println(new Random().nextInt());//int ��ü�������� ȣ��
	   System.out.println(new Random().nextInt(10)+1);//1~10
	   
	   int[] lotto=new int[6];
	   for(int i=0;i<lotto.length;i++) {
		   lotto[i]=new Random().nextInt(45)+1;
		   
	   }
	   for(int i=0;i<lotto.length;i++) {
		   System.out.print(lotto[i]+" ");
	   }
	   
   }
   
   public void arrayCopy() {
	   //�迭�� �����ϴ� ��� 2����
	   //1. ��������: �迭�� �ּҰ��� ���縦 �ϴ°� ->����Ҹ� ����
	   //2.���� ����: 
	   //�żҵ��� �Ű������� ���� ���� �� �ּҸ� ������ ���� ����� ������.
	   
	   int[]arr= {1,2,3,4,5};
	   int[] arr2=arr;
	   System.out.println(arr);
	   System.out.println(arr2);
	   System.out.println(arr2[0]);
	   System.out.println(arr[0]);
	   //����� �迭�� ���� �����ϸ�??
	   arr[0]=100;
	   System.out.println("arr[0]"+arr[0]);
	   System.out.println(arr2[0]);
	   //���� ����� ����Ҹ� ���� ���°� �׷��� �Ȱ��� ���´�
	   //2.��������:
	   int[] arr3=new int[arr.length];
	   for(int i=0;i<arr3.length;i++) {
		   arr3[i]=arr[i];
	   }
	   System.out.println(arr[0]);
	   System.out.println(arr3[0]);
	   arr3[0]=7;
	   System.out.println(arr[0]);
	   System.out.println(arr3[0]);
	   //�迭���� ����� �ϴ� �޼ҵ�
	   //1: ������ ���(�迭)
	   //2: ������ ����� ���� �ε���
	   //3: ����� ��ġ(target �迭)
	   //4: ����� �迭�� �����ε���
	   //5: ����� ���� ����
	   int[]arr4=new int[arr.length];
	   System.arraycopy(arr,2,arr4,3,2);
	   for(int i=0;i<arr4.length;i++) {
		   System.out.println(arr4[i]);
	   }
	   
   }
   
	   
   
}
