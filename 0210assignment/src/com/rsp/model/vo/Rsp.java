package com.rsp.model.vo;

import java.util.Random;
import java.util.Scanner;

public class Rsp {
	private Scanner sc = new Scanner(System.in);

	public void rspGame() {
		while (true) {
			System.out.println("======���� ���� �� ����=====");
			System.out.println("�� ���� ���ÿ�(����(0),����(1),��(2)): ");
			int cho = sc.nextInt();
			int com = (int) (new Random().nextInt(3));
			String d = Result(cho, com);
			if (!d.equals("�����ϴ�.")) {
				System.out.println(d);
				return;
			}else {
				System.out.println(d);
			}
			
		}
	}

	public String Result(int cho, int com) {
		String[][] b = {{"�����ϴ�.","��ǻ�� ������ �½��ϴ�.�����ϴ�.","��ǻ�ʹ� ���� �½��ϴ�.�̰���ϴ�."},{"��ǻ�ʹ� ������ �½��ϴ�.�̰���ϴ�.","�����ϴ�","��ǻ�ʹ� ���� �½��ϴ�.�����ϴ�."},{"��ǻ�ʹ� ������ �½��ϴ�.�����ϴ�.","��ǻ�� ������ �½��ϴ�.�̰���ϴ�.","�����ϴ�."}};
		return b[cho][com];
	}

}