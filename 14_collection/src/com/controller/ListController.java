package com.controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.model.vo.Food;



public class ListController {
	public static void main(String[] args) {
		//ArrayList클래스를 이용하기
		//ArrayList 배열과 동일한 저장방식으로 가지며,배열의 단점을 보완한 자료구조형태
		//ArrayList는 클래스로 생성해서 이용을함.
		//클래스 생성된 객체의 매소드를 이용해서 관리를(수정,추가,삭제,정렬 등) 한다.
		ArrayList list=new ArrayList();
		//list 객체를 10개 보관할 수 있는 공간확보! -> 배열 구조 인덱스에 의해 관리됨
		ArrayList list2=new ArrayList(20);
		//내부의 저장소는 Object[] 로 되어있음.
	
		//ArrayList List 인터페이스,Collectoin인터페이스를 구현
		//List 변수, Collection 변수에 대입될 수 있다.
		List l=new ArrayList();
		Collection c=new ArrayList();
		
		//생성된 ArrayList 활용하기
		//1. Arraylist 에 객체 저장하기
		// add() 메소드를 이요해서 ArrayList저장소에 저장
		list.add(true);//기본자료형은 오토박싱 되서 가능함
		list.add(19);
		list.add("유명승");
		list.add(new Date());
		System.out.println(list);
		System.out.println(list.size());
	
		//ArrayList는 특정객체를 관리!
		//학생들. Student 클래스를 보관.
		//과일들. Fruit 클래스를 보관
		ArrayList foods=new ArrayList();
		foods.add(new Food("슌대국",7000,"국밥",1000,null));
		foods.add(new Food("감자전",8000,"전",650,new Date(new GregorianCalendar(2021,02,20).getTimeInMillis())));
		foods.add(new Food("계란초밥",1000,"초밥",200,null));
	
		System.out.println(foods);
		
		//리슽에 저장되어있는 값 출력하기
		//list에 저장된 값을 가져오기
		//get()매소드와 index 값을 기준으로 가져옴
		//index값의 시작 0부터 시작
		Food f=(Food)foods.get(0);//Object 로 들어가니까
		System.out.println(f.getName()+" "+f.getPrice());
		System.out.println(((Food)foods.get(1)).getName()+" "+((Food)foods.get(1)).getPrice());
		for(int i=0;i<foods.size();i++) {
			Food temp=(Food)foods.get(i);
			System.out.println(temp.getName()+" "+temp.getPrice());
		}
		
		for(Object f1:foods) {
			Food temp=(Food)f1;
			System.out.println(temp.getName()+" "+temp.getPrice());
			
		}
		//칼로리 5000이상
		for(Object f1:foods) {
			Food temp=(Food)f1;
			if(temp.getCalorie()>=500) {
			System.out.println("==돼지 음식==");
			System.out.println(temp);
			}
		}
		
//		foods.remove(1);
//		foods.remove(1);
		foods.remove(new Food("계란초밥",1000,"초밥",200,null));
		//remove 할때 안에서 eqauls 로 둘이 같은지 비교 하고 지워서 equals 가 오버라이딩 되있어야함
		System.out.println(foods);
		
		foods.set(1, new Food("라면",1200,"면",680,null));
		System.out.println(foods);
		
		
		
		//list의 값 전체 삭제하기
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		//추가 유용한 메소드
		//list에 값이 있는지 확인하기
		//contains() 메소드 이용 ->equals 메소드가 오버라이딩 되있어야함.
		if(!foods.contains(new Food("라면",1200,"면",680,null))) {
			foods.add(new Food("라면",1200,"면",680,null));
		}
		
		//list에 저장된 값이 있는지 여부 확인 메소드
		//isEmpty() ->비어있니?
		System.out.println(foods.isEmpty());
		System.out.println(list.isEmpty());
		//list 에 값이 없다면 for 문 실행하지마.
		if(!foods.isEmpty()) {
			for(Object t: foods) {
				System.out.println(t);
			}
		}
		
	//indexOf(객체):매개변수와 일치하는 값의 인덱스번호 반환
	System.out.println(foods.indexOf(new Food("라면",1200,"면",680,null)));
		
	//toArray(): list에 저아된 객체를 Object 배열로 변환
	Object[]objFood=foods.toArray();
	for(int i=0;i<objFood.length;i++) {
		System.out.println(objFood[i]);
	}
	
	//list는 중복데이터도 저장이 가능함
			foods.add(new Food("라면",1200,"면",680,null));
			foods.add(new Food("라면",1200,"면",680,null));
			foods.add(new Food("라면",1200,"면",680,null));
			foods.add(new Food("라면",1200,"면",680,null));
			foods.add(new Food("라면",1200,"면",680,null));
			
			for(int i=0;i<foods.size();i++) {
				System.out.println(foods.get(i));
			}
	
	
		
	//리스트 순서가 있음.
	//정렬이 가능하다
	ArrayList numbers=new ArrayList();
	
	for(int i=0;i<10;i++) {
		numbers.add((int)(Math.random()*10));
	}
	System.out.println(numbers);	
	Collections.sort(numbers);	//정렬
	System.out.println(numbers);
	Collections.reverse(numbers);
	System.out.println(numbers);
	numbers.sort((Object o1,Object o2)->(Integer)o2-(Integer)o1);
	System.out.println(numbers);
		
		
		
	}
}
