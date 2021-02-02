package com.kh.practice.array;

import java.util.*;

public class ArrayPractice {
	public void practice1() {
		int a[] = new int[10];
		int b = 1;
		for (int i = 0; i < 10; i++) {
			a[i] = b++;
			System.out.print(a[i] + " ");
		}

	}

	public void practice2() {
		int a[] = new int[10];
		int b = 10;
		for (int i = 0; i < 10; i++) {
			a[i] = b--;
			System.out.print(a[i] + " ");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int b = 1;
		System.out.print("양의 정수: ");
		int c = sc.nextInt();
		int[] a = new int[c];
		for (int i = 0; i < c; i++) {
			a[i] = b++;
			System.out.print(a[i] + " ");
		}

	}

	public void practice4() {
		String[] a = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(a[1]);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String a = sc.next();
		System.out.print("문자: ");
		char b = sc.next().charAt(0);
		char[] c = new char[a.length()];
		int count = 0;
		System.out.print(a + "에" + b + "가 존재하는 위치(인덱스): ");
		for (int i = 0; i < a.length(); i++) {
			c[i] = a.charAt(i);
			if (b == c[i]) {
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.print("\n" + b + " 개수: " + count);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		char[] a = { '월', '화', '수', '목', '금', '토', '일' };
		System.out.print("0~6 사이 숫자 입력: ");
		int b = sc.nextInt();
		if (b < 7 && b >= 0) {
			System.out.println(a[b]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int su = sc.nextInt();
		int array[] = new int[su];
		int sum = 0;
		for (int i = 0; i < su; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을값: ");
			int index = sc.nextInt();
			array[i] = index;
			sum += array[i];
		}
		for (int i = 0; i < su; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n" + sum);

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			int a = 1;
			System.out.print("정수: ");
			int su = sc.nextInt();
			int array[] = new int[su];
			int b = (su + 1) / 2;
			if (su % 2 == 1 && su > 2) {
				for (int i = 0; i < b; i++) {
					array[i] = a++;
				}
				for (int i = b; i < su; i++) {
					array[i] = --b;
				}
				for (int i = 0; i < su; i++) {
					System.out.print(array[i] + ", ");
				}
				flag = false;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String chicken[] = { "양념", "간장", "후라이드" };
		System.out.print("치킨 이름을 입력하세요: ");
		String ch = sc.next();
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			if (chicken[i].equals(ch)) {
				flag = true;

			}

		}
		System.out.println(flag ? ch + "치킨 배달가능" : ch + "치킨은 없는 메뉴입니다.");
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		char[] id = new char[14];
		char ddi[] = id;
		System.out.print("주민등록번호(-포함): ");
		String di = sc.next();
		for (int i = 0; i < 14; i++) {
			id[i] = di.charAt(i);
			if (i > 7) {
				ddi[i] = '*';
			}
			System.out.print(ddi[i]);
		}

	}

	public void practice11() {
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (new Random().nextInt(10) + 1);
			System.out.print(array[i] + " ");
		}

	}

	public void practice12() {
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (new Random().nextInt(10) + 1);
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (array[i] < array[j]) {
					int t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}

		}

		System.out.print("\n최대값: " + array[9]);
		System.out.println("\n최소값: " + array[0]);

	}

	public void practice13() {
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (new Random().nextInt(10) + 1);
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
			}

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public void practice14() {
		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = (new Random().nextInt(45) + 1);
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}

			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String a = sc.next();
		char[] b = new char[a.length()];
		int size = 0;
		System.out.print("문자열에 있는 문자: ");
		for (int i = 0; i < a.length(); i++) {
			b[i] = a.charAt(i);
			for (int j = 0; j < i; j++) {
				if (b[i] == b[j]) {
					b[i] = ' ';

				}
			}
		}

		for (int i = 0; i < a.length(); i++) {
			if (b[i] == ' ') {
				continue;
			} else {
				System.out.print(b[i] + " ");
				size++;
			}
		}
		System.out.println("\n문자개수:" + size);
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요: ");
		int sum = sc.nextInt();
//		String a[];
//		char as='y';
//		while(as!='n') {
//			
//		}

		String[] ar = new String[sum];
		String []ar2=ar;
		for (int i = 0; i <sum; i++) { 
			System.out.print(i+1 + "번째 문자열: ");
			String idx = sc.next();
			ar[i] = idx;
		}
		System.out.print("더 값을 입력하시겠습니까(Y/N): ");
		char as = sc.next().charAt(0);
		
		
		if (as == 'n') {
			for (int i = 0; i < sum; i++) {
				System.out.print(ar[i]);

			}

		} else if (as == 'y') {
			while(as!='n') {
				System.out.print("더 입력하고 싶은 개수: ");
				int mnum=sc.nextInt();
				int t=sum;
				sum+=mnum;
				ar2=new String[sum];
				
				for(int i=t;i<sum;i++) {
					System.out.print(t+1+"번째 문자열");
					String midx=sc.next();
					ar2[i]=midx;
					
				}
			
				System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
				as=sc.next().charAt(0);
			}
			for(int i=0;i<3;i++) {
				System.out.print(ar[i]);
			}
			for(int i=0;i<sum;i++) {
				System.out.print(ar2[i]);
			}
			
			
		}

	}
}
