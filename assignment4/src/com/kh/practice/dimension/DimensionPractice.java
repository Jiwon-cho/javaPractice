package com.kh.practice.dimension;

import java.util.*;

public class DimensionPractice {
	public void practice1() {
		String[][] s = new String[3][3];
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				s[i][j] = "(" + i + "," + j + ")";
			}

		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);

			}
			System.out.println();
		}

	}

	public void practice2() {
		int[][] arr3 = new int[4][4];
		int k = 1;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				arr3[i][j] = k;
				k += 1;
			}

		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}

	}

	public void practice3() {
		int[][] arr3 = new int[4][4];
		int k = 16;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				arr3[i][j] = k--;

			}

		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}

	}

	public void practice4() {
		int[][] a = new int[4][4];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				a[i][j] = (new Random().nextInt(10) + 1);
			}
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				a[i][a.length - 1] += a[i][j];
				a[a.length - 1][i] += a[j][i];

			}
			a[a.length - 1][a.length - 1] += a[i][a.length - 1] + a[a.length - 1][i];
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%-5d", a[i][j]);
			}
			System.out.println();
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.print("행 크기(1~10): ");
			int a = sc.nextInt();
			System.out.print("열 크기(1~10): ");
			 int b = sc.nextInt();
			 char[][] c = new char[a][b];
			if (10 >= a && a > 0 && 10 >= b && b > 0) {
				for (int i = 0; i < a ; i++) {
					for (int j = 0; j < b ; j++) {
						c[i][j] = (char) (new Random().nextInt(25) + 65);

					}
				
				}
				for(int i=0;i<c.length;i++) {
					for(int j=0;j<c[b].length;j++) {
						System.out.print(c[i][j]);
					}
					System.out.println();
				}
				flag=false;

			}else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다.");
				
			}
		}
		
			

		}

	

	public void practice6() {

	}

	public void practice7() {

	}

	public void practice8() {

	}

	public void practice9() {

	}

}
