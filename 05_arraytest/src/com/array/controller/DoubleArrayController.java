package com.array.controller;

import java.util.*;

public class DoubleArrayController {
	public void doubleArray() {
		//2차원 배열을 선언해보자
		int[][] arr;
		//2차원 배열 할당하기
		arr=new int[5][5];
		//2차원 배열의 변수 출력하기
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		//출력할 때 이중반복문을 이용할 수 있음
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		int[][] arr2=new int[3][3];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				arr2[i][j]=i;
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		int[][] arr3=new int[3][3];
		int k=1;
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++) {
				arr3[i][j]=k;
				k+=1;
			}
			
		}
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}
		//선언과 동시에 초기화하기
		String[] names= {"안녕","하이","곤니찌와"};
		String[][] classMember= {{"유","훈"},{"김","규"},{"장","재"}};
		for(int i=0;i<classMember.length;i++) {
			for(int j=0;j<classMember[i].length;j++) {
				System.out.print(classMember[i][j]);
				
			}System.out.println();
		}
		
		//가변 배열 선언하기
		//열의 갯수가 항상 동일한건 아니다.
	    int[][] intArr=new int[3][];
		intArr[0]=new int[3];
		intArr[1]=new int[4];
		intArr[2]=new int[5];
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
	
	

}
