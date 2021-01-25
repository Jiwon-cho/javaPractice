package com.kh.practice.chap02.loop;

import java.util.*;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = 1; i <= su; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 �̻��� ���ڸ� �Է����ּ���.");

		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int su2 = 0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
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
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = su; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 �̻��� ���ڸ� �Է����ּ���.");

		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int su2 = 0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
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
		System.out.print("������ �ϳ� �Է��ϼ���: ");
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
		System.out.print("ù ��° ����: ");
		int su1 = sc.nextInt();
		System.out.print("�� ��° ����: ");
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
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		int su3 = 0;
		int su4 = 0;

		do {
			System.out.print("ù ��° ����: ");
			int su1 = sc.nextInt();
			System.out.print("�� ��° ����: ");
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
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		} while (su3 <= 0 || su4 <= 0);

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int su = sc.nextInt();
		System.out.println("==== " + su + "�� ====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(su + " * " + i + "=" + (su * i));
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int su = sc.nextInt();
		if (su < 10) {
			for (int i = su; i < 10; i++) {
				System.out.println("==== " + i + "�� ====");
				for (int j = 1; j <= 9; j++) {

					System.out.println(i + " * " + j + "=" + (i * j));
				}
			}

		} else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int su2 = 0;
		do {
			su2 = 0;
			System.out.print("����: ");
			int su = sc.nextInt();
			su2 += su;

			if (su < 10) {
				for (int i = su; i < 10; i++) {
					System.out.println("==== " + i + "�� ====");
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + "=" + (i * j));
					}
				}

			} else {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			}
		} while (su2 > 9);

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		int init = sc.nextInt();
		System.out.print("����: ");
		int itv = sc.nextInt();
		for (int i = init; i <= init + (itv * 9); i += itv) {
			System.out.print(i + " ");
		}

	}

	public void practice11_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		int init = sc.nextInt();
		System.out.print("����: ");
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

			System.out.print("������(+,*,/,%): ");
			String op = sc.next();

			po = op;
			if (po.equals("exit")) {
				System.out.print("���α׷��� �����մϴ�.");

			} else if (!po.equals("+") && !po.equals("/") && !po.equals("*") && !po.equals("%")) {
				System.out.print("����1: ");
				int su1 = sc.nextInt();
				System.out.print("����2: ");
				int su2 = sc.nextInt();
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			} else {

				System.out.print("����1: ");
				int su1 = sc.nextInt();
				System.out.print("����2: ");
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
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
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
		System.out.print("���� �Է�: ");
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
		System.out.print("���� �Է�: ");
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
