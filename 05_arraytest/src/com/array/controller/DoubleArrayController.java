package com.array.controller;

import java.util.*;

public class DoubleArrayController {
	public void doubleArray() {
		//2���� �迭�� �����غ���
		int[][] arr;
		//2���� �迭 �Ҵ��ϱ�
		arr=new int[5][5];
		//2���� �迭�� ���� ����ϱ�
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		//����� �� ���߹ݺ����� �̿��� �� ����
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
		//����� ���ÿ� �ʱ�ȭ�ϱ�
		String[] names= {"�ȳ�","����","������"};
		String[][] classMember= {{"��","��"},{"��","��"},{"��","��"}};
		for(int i=0;i<classMember.length;i++) {
			for(int j=0;j<classMember[i].length;j++) {
				System.out.print(classMember[i][j]);
				
			}System.out.println();
		}
		
		//���� �迭 �����ϱ�
		//���� ������ �׻� �����Ѱ� �ƴϴ�.
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
