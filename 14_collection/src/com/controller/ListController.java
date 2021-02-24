package com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.common.FoodCalAsc;
import com.common.FoodNameDesc;
import com.common.FoodnameAsc;
import com.common.IntegerOrderAsc;
import com.common.IntegerOrderDesc;
import com.common.TestLambda;
import com.model.vo.Food;

public class ListController {
	public static void main(String[] args) {
		// ArrayList클래스를 이용하기
		// ArrayList 배열과 동일한 저장방식으로 가지며,배열의 단점을 보완한 자료구조형태
		// ArrayList는 클래스로 생성해서 이용을함.
		// 클래스 생성된 객체의 매소드를 이용해서 관리를(수정,추가,삭제,정렬 등) 한다.
		ArrayList list = new ArrayList();
		// list 객체를 10개 보관할 수 있는 공간확보! -> 배열 구조 인덱스에 의해 관리됨
		ArrayList list2 = new ArrayList(20);
		// 내부의 저장소는 Object[] 로 되어있음.

		// ArrayList List 인터페이스,Collectoin인터페이스를 구현
		// List 변수, Collection 변수에 대입될 수 있다.
		List l = new ArrayList();
		Collection c = new ArrayList();

		// 생성된 ArrayList 활용하기
		// 1. Arraylist 에 객체 저장하기
		// add() 메소드를 이요해서 ArrayList저장소에 저장
		list.add(true);// 기본자료형은 오토박싱 되서 가능함
		list.add(19);
		list.add("유명승");
		list.add(new Date());
		System.out.println(list);
		System.out.println(list.size());

		// ArrayList는 특정객체를 관리!
		// 학생들. Student 클래스를 보관.
		// 과일들. Fruit 클래스를 보관
		ArrayList foods = new ArrayList();
		foods.add(new Food("슌대국", 7000, "국밥", 1000, null));
		foods.add(new Food("감자전", 8000, "전", 650, new Date(new GregorianCalendar(2021, 01, 20).getTimeInMillis())));
		foods.add(new Food("계란초밥", 1000, "초밥", 200, null));

		System.out.println(foods);

		// 리슽에 저장되어있는 값 출력하기
		// list에 저장된 값을 가져오기
		// get()매소드와 index 값을 기준으로 가져옴
		// index값의 시작 0부터 시작
		Food f = (Food) foods.get(0);// Object 로 들어가니까
		System.out.println(f.getName() + " " + f.getPrice());
		System.out.println(((Food) foods.get(1)).getName() + " " + ((Food) foods.get(1)).getPrice());
		for (int i = 0; i < foods.size(); i++) {
			Food temp = (Food) foods.get(i);
			System.out.println(temp.getName() + " " + temp.getPrice());
		}

		for (Object f1 : foods) {
			Food temp = (Food) f1;
			System.out.println(temp.getName() + " " + temp.getPrice());

		}
		// 칼로리 5000이상
		for (Object f1 : foods) {
			Food temp = (Food) f1;
			if (temp.getCalorie() >= 500) {
				System.out.println("==돼지 음식==");
				System.out.println(temp);
			}
		}

//		foods.remove(1);
//		foods.remove(1);
		foods.remove(new Food("계란초밥", 1000, "초밥", 200, null));
		// remove 할때 안에서 eqauls 로 둘이 같은지 비교 하고 지워서 equals 가 오버라이딩 되있어야함
		System.out.println(foods);

		foods.set(1, new Food("라면", 1200, "면", 680, null));
		System.out.println(foods);

		// list의 값 전체 삭제하기
		System.out.println(list);
		list.clear();
		System.out.println(list);

		// 추가 유용한 메소드
		// list에 값이 있는지 확인하기
		// contains() 메소드 이용 ->equals 메소드가 오버라이딩 되있어야함.
		if (!foods.contains(new Food("라면", 1200, "면", 680, null))) {
			foods.add(new Food("라면", 1200, "면", 680, null));
		}

		// list에 저장된 값이 있는지 여부 확인 메소드
		// isEmpty() ->비어있니?
		System.out.println(foods.isEmpty());
		System.out.println(list.isEmpty());
		// list 에 값이 없다면 for 문 실행하지마.
		if (!foods.isEmpty()) {
			for (Object t : foods) {
				System.out.println(t);
			}
		}

		// indexOf(객체):매개변수와 일치하는 값의 인덱스번호 반환
		System.out.println(foods.indexOf(new Food("라면", 1200, "면", 680, null)));

		// toArray(): list에 저아된 객체를 Object 배열로 변환
		Object[] objFood = foods.toArray();
		for (int i = 0; i < objFood.length; i++) {
			System.out.println(objFood[i]);
		}

		// list는 중복데이터도 저장이 가능함
		foods.add(new Food("탕수육", 2500, "요리", 1300, null));
		foods.add(new Food("버블티", 2000, "차", 100, null));
		foods.add(new Food("투움바파스타", 3400, "면", 950, null));
		foods.add(new Food("햄버거", 9700, "빵", 700, null));
		foods.add(new Food("마라탕", 9000, "면", 780, null));

		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}

		// 리스트 순서가 있음.
		// 정렬이 가능하다
		ArrayList numbers = new ArrayList();

		for (int i = 0; i < 10; i++) {
			numbers.add((int) (Math.random() * 10));
		}
		System.out.println(numbers);
		Collections.sort(numbers, new IntegerOrderAsc()); // 정렬
		System.out.println(numbers);
		Collections.sort(numbers, new IntegerOrderDesc());
		System.out.println(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);
		numbers.sort((Object o1, Object o2) -> (Integer) o2 - (Integer) o1);
		System.out.println(numbers);

		// foods에 있는 값을 조건에 따라 정렬해보자.
		// 1.칼로리를 기준으로 오름차순 정렬해 보자.
		// 2.
		Collections.sort(foods, new FoodCalAsc());
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		System.out.println("이름 오름 차순 정렬=================");
//		
//		for (Object f1 : foods) {
//			System.out.println(f1);
//		}
		// 2.문자열 정렬하기 음식이름으로 정렬하기
		// -오름차순으로 정렬하기//알파벳 순서대로
		// String 객체에서 문자열을 비교해주는 메소드를 만들어 놓음
		// CompareTo() -> str1.compareTo(str 2) -> str1 str2 비교, return -+0

		Collections.sort(foods, new FoodnameAsc());
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		System.out.println("=========이름 내림 차순");
		Collections.sort(foods, new FoodNameDesc());
		for (Object f1 : foods) {
			System.out.println(f1);
		}

		foods.sort(new FoodNameDesc());// 이렇게도 됨

		// food[0].compareTo(food[1]);

		System.out.println("===가격순====");
//		Collections.sort(foods);
//		for (Object f1 : foods) {
//			System.out.println(f1);
//		}

		// 객체에 대해 정렬
		// 익명클래스.. 1회용
		// 하나 비교를 위해서 번잡하게 클래스 만들지 말고 한번만 할꺼 그냥 쓰자 ,익명 클래스
		// 인터페이스 사용할때 다 가능
		Collections.sort(foods, new Comparator<Food>() {
			@Override
			public int compare(Food f1, Food f2) {
				return f1.getPrice() - f2.getPrice();
			}
		});
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		// 익명 이기 때문에, 이름 필요 없음 필요한건, 매개변수와 리턴 값 뿐
		// lambda :(매개변수,..) -> {로직}
		// @FunctionalInterface -> 추상메소드 한개만 선언된 인터페이스
		// 기본적으로 Interface 에서 구현해야하는 메소드 구조
		// int compare(Object o1, Object o2)
		System.out.println("==카테고리 이름순");
		Collections.sort(foods, (Object o1, Object o2) -> {
			return ((Food) o1).getCategory().compareTo(((Food) o2).getCategory());
		});
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		
		TestLambda testfilter=(Food temp)->temp.getPrice()>20000;
		System.out.println("=======람다====");
		List result =filter(foods, (Food temp)->temp.getPrice()>8000);
		result=filter(foods,(Food temp)->temp.getCategory().contains("빵"));
		for(Object o: result) {
			System.out.println(o);
		}
		
		
		

	}
	
	
	public static List filter(List list, TestLambda filter) {
		List result=new ArrayList();
		for(Object o: list) {
			if(filter.test((Food)o)){
				result.add(o);
			}
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
