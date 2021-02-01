package com.array.controller;

import java.util.*;

public class ArrayController {
	public void basicArray() {
		// 배열 선언과 할당하기
		int[] intArr;
		char[] charArr = null;
//		System.out.println(intArr);지역 변수라 초기화 안돼면 쓸수가 없음

		// 배열 벼수를 활용 하려면 할당을 해야함.
		intArr = new int[3];
		charArr = new char[4];
//	    System.out.println(intArr);
//	    System.out.println(charArr);

		double[] darr = new double[10];
		// 배열은 인덱스를 기준으로 배열변수의 값을 가져올 수 있다.
		// 인덱스로 변수를 불러와 값 대입하
		intArr[0] = 19;
		intArr[1] = 20;
		intArr[2] = 30;
		// 배열부여된 인덱스를 초과해서 대입하면?
		// intArr[3]=40;->에러 남 , 저장 공간을 벗 어나 버려서-

		// 배열에 있는 값 출력하기
//	    int a=10;
//	    System.out.println(a);
//	    System.out.println(intArr[0]);
//	    
////	    String[] a= {"유병승","유지훈","김기영","노가람"};
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
		names = new String[] { "유혜신", "김경찬", "김기영", "박원재", "노상민", "김규희", };

//	    Scanner sc=new Scanner(System.in);
////	    System.out.println("찾고자 하는 이름을 적으시오: ");
////	    String nm=sc.next();
////	    for(int i=0;i<6;i++) {
////	    	if(!names[i].equals(nm)) {
////	    		continue;
////	    	}
////	    	System.out.println("없다");
//	    
//	    
//	    boolean flag=false;
//	    for(int i=0;i<6;i++) {
//	    	System.out.println(names[i]);
//	    	if(names[i].equals("유지훈")){
//	    		flag=true;
//	    	}
//	    
//	    
//  
		Scanner sc = new Scanner(System.in);
		String[] hobby = new String[5];

//	    int i=0;
//	    while(i<5) {
//	    	System.out.print("취미를 적으시오: ");
//		    hobby[i]=sc.next();
//	    	
//	    	
//	    	i++;
////	    }
//	    System.out.println("취미 5개를 입력: ");
//	    for(int i=0;i<5;i++) {
//	    	System.out.println(i+1+"번 취미");
//	    	hobby[i]=sc.nextLine();
//	    }
//	    for(int a=0;a<5;a++) {
//	    System.out.print(hobby[a]+" ");
//	    }
//	    

		System.out.println("취미 5개를 입력 ");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번 취미");
			hobby[i] = sc.nextLine();
		}
		boolean f=false;
		System.out.println("취미?: ");
		String hb=sc.next();
		here:
		for(int i=0;i<5;i++) {
			if(hobby[i].equals(hb)){
				
				f=true;
				break;
				
			
			}
				
			
		
		}System.out.println(f?"있다":"없다");
		
		
		
		
	}
	public void changeData() {
		//배열에 저장 되어 있는 값을 변경
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
	   //임의 수 출력하기
	   //두 가지 방법
	   //1.Math 객체를 이용하는 방법->random() 그냥 Math.random 은 소수 나옴
	   //2.Random 객체를 이용하는 방법->nextInt()
	   
	   System.out.println((int)(Math.random()*10));//0.00~9.000 랜덤 값
	   System.out.println((int)(Math.random()*10)+1);//1~10까지
	   System.out.println((int)(Math.random()*45)+1);//1~45까지
	   System.out.println(new Random().nextInt());//int 전체범위에서 호출
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
	   //배열을 복사하는 방법 2가지
	   //1. 얕은복사: 배열의 주소값만 복사를 하는것 ->저장소를 공유
	   //2.깊은 복사: 
	   //매소드의 매개변수에 값을 넣을 때 주소를 너으면 얕은 복사랑 동일함.
	   
	   int[]arr= {1,2,3,4,5};
	   int[] arr2=arr;
	   System.out.println(arr);
	   System.out.println(arr2);
	   System.out.println(arr2[0]);
	   System.out.println(arr[0]);
	   //복사된 배열의 값을 수정하면??
	   arr[0]=100;
	   System.out.println("arr[0]"+arr[0]);
	   System.out.println(arr2[0]);
	   //얕은 복사는 저장소를 같이 쓰는것 그래서 똑같이 나온다
	   //2.깊은복사:
	   int[] arr3=new int[arr.length];
	   for(int i=0;i<arr3.length;i++) {
		   arr3[i]=arr[i];
	   }
	   System.out.println(arr[0]);
	   System.out.println(arr3[0]);
	   arr3[0]=7;
	   System.out.println(arr[0]);
	   System.out.println(arr3[0]);
	   //배열복사 기능을 하는 메소드
	   //1: 복사할 대상(배열)
	   //2: 복사할 대상의 시작 인덱스
	   //3: 복사된 위치(target 배열)
	   //4: 복사될 배열의 시작인덱스
	   //5: 복사될 값의 갯수
	   int[]arr4=new int[arr.length];
	   System.arraycopy(arr,2,arr4,3,2);
	   for(int i=0;i<arr4.length;i++) {
		   System.out.println(arr4[i]);
	   }
	   
   }
   
	   
   
}
