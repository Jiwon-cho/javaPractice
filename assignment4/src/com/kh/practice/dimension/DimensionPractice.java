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
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				a[i][j] = (new Random().nextInt(10) + 1);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][a.length - 1] += a[i][j];
				a[a.length - 1][i] += a[j][i];

			}
			a[3][3] += a[i][3] + a[3][i];
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%-5d", a[i][j]);
			}
			System.out.println();
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.print("�� ũ��(1~10): ");
			int a = sc.nextInt();
			System.out.print("�� ũ��(1~10): ");
			int b = sc.nextInt();
			char[][] c = new char[a][b];
			if (10 >= a && a > 0 && 10 >= b && b > 0) {
				for (int i = 0; i < a; i++) {
					for (int j = 0; j < b; j++) {
						c[i][j] = (char) (new Random().nextInt(25) + 65);
						System.out.print(c[i][j]);

					}

					System.out.println();
				}
				flag = false;

			} else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ��մϴ�.");

			}
		}

	}

	public void practice6() {
		String[][] strArr = new String[][] { { "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" },
				{ "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" }, { "��", "��", "! ", "��", "!! " } };
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(strArr[j][i] + " ");

			}
			System.out.println();
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ��: ");
		int a = sc.nextInt();
		int k = 97;
		char[][] array = new char[a][];
		for (int i = 0; i < a; i++) {
			System.out.print(i + "���� �� ũ��: ");
			int b = sc.nextInt();
			array[i] = new char[b];
			for (int j = 0; j < b; j++) {
				array[i][j] = (char) k;
				k++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice8() {
		String[] ban1 = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };
		String[][] ban2 = new String[3][2];
		String[][] ban3 = new String[3][2];
		int k = 0;
		int h = 6;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				ban2[i][j] = ban1[k];
				k++;
				ban3[i][j] = ban1[h];
				h++;

			}

		}
		for (int z = 1; z < 3; z++) {
			System.out.println("==" + z + "�д�==");
			for (int i = 0; i < 3; i++) {
				if (z == 1) {
					for (int j = 0; j < 2; j++) {
						System.out.print(ban2[i][j] + " ");

					}
					System.out.println();
				} else {
					for (int j = 0; j < 2; j++) {
						System.out.print(ban3[i][j] + " ");

					}
					System.out.println();
				}
			}
		}
	}

	public void practice9() {
	      Scanner sc = new Scanner(System.in);
	      String[] ban1 = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };      
	      String[][] ban2 = new String[3][2];
	      String[][] ban3 = new String[3][2];
	      //�迭 �ֱ�
	      Object [] arr = new Object[2];

	      int idx=0;
	      //�迭�� ���
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 2; j++) {
	            ban2[i][j] = ban1[idx];
	            ban3[i][j] = ban1[idx+6];
	            idx++;
	         }

	      }
	      arr[0] = ban2;
	      arr[1] = ban3;
	      
	      //���
	      System.out.print("�˻��� �л� �̸��� �Է��Ͻÿ�: ");
	      String student = sc.next();

	      out:for(int i=0;i<3;i++) {
	         String[][] ban= (String[][]) arr[i];
	         for (int j=0;j<3;j++) {      
	            for(int e=0;e<2;e++) {
	               if(ban[j][e].equals(student)) {
	                  String loc = e==0? "����":"������";
	                  System.out.println("�� �� ���� " + (i+1)+" �д� " + (j + 1) + "�� ° �� "+loc+"�� �ֽ��ϴ�.");
	                  break out;
	               }
	               
	            }
	         }
	      }
	      

//		Scanner sc = new Scanner(System.in);
//		String[] ban1 = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };
//		String[][] ban2 = new String[3][2];
//		String[][] ban3 = new String[3][2];
//		int k = 0;
//		int h = 6;
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				ban2[i][j] = ban1[k];
//				k++;
//				ban3[i][j] = ban1[h];
//				h++;
//
//			}
//
//		}
//		System.out.print("�˻��� �л� �̸��� �Է��Ͻÿ�: ");
//		String student = sc.next();
//		boolean flag = true;
//		while (flag) {
//			for (int i = 0; i < 3; i++) {
//				for (int j = 0; j < 2; j++) {
//					if (student.equals(ban2[i][j]) && j == 0) {
//						System.out.println("�� �� ����" + " 1 �д� " + (i + 1) + "�� ° �� ���� �� �ֽ��ϴ�.");
//						flag = false;
//					} else if (student.equals(ban2[i][j]) && j == 1) {
//						System.out.println("�� �� ����" + " 1 �д� " + (i + 1) + "�� ° �� ������ �� �ֽ��ϴ�.");
//						flag = false;
//					} else if (student.equals(ban3[i][j]) && j == 0) {
//
//						System.out.println("�� �� ����" + " 2 �д� " + (i + 1) + "�� ° �� ���� �� �ֽ��ϴ�.");
//						flag = false;
//					} else if (student.equals(ban3[i][j]) && j != 0) {
//						System.out.println("�� �� ����" + " 2 �д� " + (i + 1) + "�� ° �� ������ �� �ֽ��ϴ�.");
//						flag = false;
//					}
//				}
//			}
//		}

	}
	
}
