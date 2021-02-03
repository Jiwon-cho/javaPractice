package com.objarr.controller;

import java.util.Scanner;

import com.objarr.model.vo.Fruit;

public class ObjArrController {

	public void objArrTest() {
		// 과일객체를 저장할 수 있는 변수선언
		Fruit apple = new Fruit("사과", "충주", 23000, 2.3, "특상");
		// 과일객체를 여러개 저장할 수 있는 저장공간 확보
		// 과일객체 배열선언
		Fruit[] fruits = new Fruit[5];
		// 과일객체배열에 값넣기
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		// 객체배열 이용하기
		fruits[0] = new Fruit("딸기", "논산", 8000, 0.5, "특상");
		fruits[1] = new Fruit("키위", "뉴질랜드", 15000, 1, "상");
		fruits[2] = new Fruit("배", "나주", 25000, 3.5, "특상");
		fruits[3] = new Fruit();
		fruits[4] = new Fruit();
		// 각 객체의 값에 접근하기
		System.out.println(fruits[0].getName());
		System.out.println(fruits[0].getOrigin());

		// 객체배열 전체출력하기

		for (int i = 0; i < 5; i++) {
//			if(fruits[i]==null) {
//				break;
//			}
			System.out.println(fruits[i].getName() + " " + fruits[i].getOrigin() + " " + fruits[i].getPrice() + " "
					+ fruits[i].getWeight() + " " + fruits[i].getRating());

		}

		// 과일을 입력받아서 배열에 채우기
		Fruit[] fs = new Fruit[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fs.length; i++) {
			fs[i] = new Fruit();// 요렇게 해줘야 중간에 숫자들이 null이 아녀서 돌아감 0으로 디폴트값들어가니까

			System.out.print("이름: ");
			fs[i].setName(sc.next());
			System.out.print("원산지: ");
			fs[i].setOrigin(sc.next());
			System.out.print("가격: ");
			fs[i].setPrice(sc.nextInt());
			System.out.println("무게: ");
			fs[i].setWeight(sc.nextDouble());
			System.out.print("등급: ");
			fs[i].setRating(sc.next());

		}
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getName() + " " + fs[i].getOrigin() + " " + fs[i].getPrice() + " "
					+ fs[i].getWeight() + " " + fs[i].getRating());
		}

	}

}
