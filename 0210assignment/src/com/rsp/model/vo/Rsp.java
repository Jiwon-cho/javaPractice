package com.rsp.model.vo;

import java.util.Random;
import java.util.Scanner;

public class Rsp {
	private Scanner sc = new Scanner(System.in);

	public void rspGame() {
		while (true) {
			System.out.println("======가위 바위 보 게임=====");
			System.out.println("낼 것을 고르시오(가위(0),바위(1),보(2)): ");
			int cho = sc.nextInt();
			int com = (int) (new Random().nextInt(3));
			String d = Result(cho, com);
			if (!d.equals("비겼습니다.")) {
				System.out.println(d);
				return;
			}else {
				System.out.println(d);
			}
			
		}
	}

	public String Result(int cho, int com) {
		String[][] b = {{"비겼습니다.","컴퓨는 바위를 냈습니다.졌습니다.","컴퓨터는 보를 냈습니다.이겼습니다."},{"컴퓨터는 가위를 냈습니다.이겼습니다.","비겼습니다","컴퓨터는 보를 냈습니다.졌습니다."},{"컴퓨터는 가위를 냈습니다.졌습니다.","컴퓨는 바위를 냈습니다.이겼습니다.","비겼습니다."}};
		return b[cho][com];
	}

}