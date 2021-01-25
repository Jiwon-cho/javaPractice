package com.kh.practice.chap02.loop;

import java.util.*;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요: ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = 1; i <= su; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");

		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int su2 = 0;
		do {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int su = sc.nextInt();
			su2 += su;
			if (su > 0) {
				for (int i = 1; i <= su; i++) {

					System.out.print(i + " ");
				}
			}

		} while (su2 <= 0);

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요: ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = su; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");

		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int su2 = 0;
		do {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int su = sc.nextInt();
			su2 += su;
			if (su > 0) {
				for (int i = su; i > 0; i--) {

					System.out.print(i + " ");
				}
			}

		} while (su2 <= 0);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int su = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < su; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		sum += su;
		System.out.print(su + "=" + sum);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int su2 = sc.nextInt();
		if (su1 > 0 && su2 > 0 && su1 > su2) {
			for (int i = su1 - su2; i <= su1; i++) {
				System.out.print(i + " ");
			}
		} else if (su1 > 0 && su2 > 0 && su2 > su1) {
			for (int i = su2 - su1; i <= su2; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		int su3 = 0;
		int su4 = 0;

		do {
			System.out.print("첫 번째 숫자: ");
			int su1 = sc.nextInt();
			System.out.print("두 번째 숫자: ");
			int su2 = sc.nextInt();

			su3 += su1;
			su4 += su2;

			if (su1 > 0 && su2 > 0 && su1 > su2) {
				for (int i = su1 - su2; i <= su1; i++) {
					System.out.print(i + " ");
				}
			} else if (su1 > 0 && su2 > 0 && su2 > su1) {
				for (int i = su2 - su1; i <= su2; i++) {
					System.out.print(i + " ");
				}

			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		} while (su3 <= 0 || su4 <= 0);

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int su = sc.nextInt();
		System.out.println("==== " + su + "단 ====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(su + " * " + i + "=" + (su * i));
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int su = sc.nextInt();
		if (su < 10) {
			for (int i = su; i < 10; i++) {
				System.out.println("==== " + i + "단 ====");
				for (int j = 1; j <= 9; j++) {

					System.out.println(i + " * " + j + "=" + (i * j));
				}
			}

		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int su2 = 0;
		do {
			su2 = 0;
			System.out.print("숫자: ");
			int su = sc.nextInt();
			su2 += su;

			if (su < 10) {
				for (int i = su; i < 10; i++) {
					System.out.println("==== " + i + "단 ====");
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + "=" + (i * j));
					}
				}

			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		} while (su2 > 9);

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int init = sc.nextInt();
		System.out.print("공차: ");
		int itv = sc.nextInt();
		for (int i = init; i <= init + (itv * 9); i += itv) {
			System.out.print(i + " ");
		}

	}

	public void practice11_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int init = sc.nextInt();
		System.out.print("공차: ");
		int itv = sc.nextInt();
		for (int i = init; i >= init - (itv * 9); i -= itv) {
			System.out.print(i + " ");
		}

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		String po = "";
		int su3 = 0;

		do {

			System.out.print("연산자(+,*,/,%): ");
			String op = sc.next();

			po = op;
			if (po.equals("exit")) {
				System.out.print("프로그램을 종료합니다.");

			} else if (!po.equals("+") && !po.equals("/") && !po.equals("*") && !po.equals("%")) {
				System.out.print("정수1: ");
				int su1 = sc.nextInt();
				System.out.print("정수2: ");
				int su2 = sc.nextInt();
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			} else {

				System.out.print("정수1: ");
				int su1 = sc.nextInt();
				System.out.print("정수2: ");
				int su2 = sc.nextInt();
				su3 = su2;
				if (su2 != 0) {
					switch (op) {
					case "+":
						System.out.println(su1 + "+" + su2 + "=" + (su1 + su2));
						break;
					case "*":
						System.out.println(su1 + "*" + su2 + "=" + (su1 * su2));
						break;
					case "/":
						System.out.println(su1 + "/" + su2 + "=" + (su1 / su2));
						break;
					case "%":
						System.out.println(su1 + "%" + su2 + "=" + (su1 % su2));
						break;
					}
				} else if (su2 == 0) {
					switch (op) {
					case "+":
						System.out.println(su1 + "+" + su2 + "=" + (su1 + su2));
						break;
					case "*":
						System.out.println(su1 + "*" + su2 + "=" + (su1 * su2));
						break;
					case "/":
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						break;
					case "%":
						System.out.println(su1 + "%" + su2 + "=" + (su1 % su2));
						break;

					}
				}

			}
		} while (!po.equals("exit"));

	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int su=sc.nextInt();
		int us=su;
		while(su>0) {
			for(int j=us;j>=su;j--) {
				System.out.print("*");
				
			}
			System.out.println();
			su--;
		}
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int su=sc.nextInt();
		
		while(su>0) {
			for(int j=1;j<=su;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			su--;
		}

	}

}
