//package com.controller;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.List;
//
//import com.model.vo.Food;
//
//public class ListController {
//	public static void main(String[] args) {
//		//ArrayList클래스 이용하기 
//		//ArrayList 배열과 동일한 저장방식으로 가지며, 배열의 단점을 보완한 자료구조형태
//		//ArrayList는 클래스로 생성해서 이용을함.
//		//클래스 생성된 객체의 매소드를 이용해서 관리를 (수정, 추가, 삭제, 정렬...)
//		ArrayList list=new ArrayList();
//		//list 객체를 10개 보관할 수 있는 공간 확보! -> 배열구조 인덱스에 의해 관리됨
//		ArrayList list2=new ArrayList(20);//20개 공간확보
//		//내부의 저장소는 Object[]로 되어있음.
//		
//		//ArrayList List인터페이스, Collection인터페이스를 구현
//		//List 변수, Collection변수에 대입될 수 있다.
//		List l=new ArrayList();
//		Collection c=new ArrayList();
//		
//		//생성된 ArrayList활용하기
//		//1. ArrayList에 객체저장하기
//		// add()매소드를 이용해서 ArrayList저장소에 저장
//		list.add(true);//기본자료형 근데 어떻게 객체에 들어가요? ;;;; 사기꾼!!! 랩퍼클래스!
//		list.add(19);
//		list.add("유병승");
//		list.add(new Date());
//		System.out.println(list);
//		//list에 들어가 있는 객체수 확인 -> size();
//		System.out.println(list.size());
//		
//		//ArrayList는 특정객체를 관리!
//		//학생들. Student클래스를 보관.
//		//과일들 fruit클래스를 보관
//		ArrayList foods=new ArrayList();
//		foods.add(new Food("순대국",7000,"국밥",1000,null));
//		foods.add(new Food("감자전",8000,"전",650,
//				new Date(new GregorianCalendar(2021,02,20).getTimeInMillis())));
//		foods.add(new Food("계란초밥",1000,"초밥",200,null));
//		
//		System.out.println(foods);
//		
//		//리스트에 저장되어있는 값 출력하기
//		//list에 저장된 값을 가져오기
//		//get()매소드와 index값을 기준으로 가져옴.
//		//index값의 시작 0부터 시작
//		Food f=(Food)foods.get(0);//순대국
//		System.out.println(f.getName()+" "+f.getPrice());
//		System.out.println(((Food)foods.get(1)).getName()+" "+((Food)foods.get(1)).getPrice());
//		
//		for(int i=0;i<foods.size();i++) {
//			Food temp=(Food)foods.get(i);
//			System.out.println(temp.getName()+" "+temp.getPrice());
//		}
//		for(Object f1 : foods) {
//			Food temp=(Food)f1;
//			System.out.println(temp.getName()+" "+temp.getPrice());
//		}
//		
//		//음식중 칼로리가 500이상인 음식 출력하자
//		for(int i=0;i<foods.size();i++) {
//			Food t=(Food)foods.get(i);
//			if(t.getCalory()>=500) {
//				System.out.println(t);
//			}
//		}
//	
//		//ArrayList의 데이터 삭제하기
//		//remove()매소드이용
//		// 인덱스를 이용해서 삭제 / 동일객체를 이용해서 삭제
////		foods.remove(1);
////		foods.remove(1);
//		foods.remove(new Food("계란초밥",1000,"초밥",200,null));//??????? 어..어...엇..어
//		System.out.println(foods);
//		
//		//ArrayList에 있는 값 수정하기
//		//set()매소드를 이용 
//		foods.set(1, new Food("라면",1200,"면",680,null));
//		System.out.println(foods);
//		//원하는 위치에 값을 추가하기
//		//add(index, 값);
//		foods.add(0,new Food("피자",28000,"빵",1368,null));
//		System.out.println(foods);
//		
//		//list의 값 전체 삭제하기
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
//		
//		//추가 유용한 매소드
//		//list에 값이 있는지 확인하기
//		//contains()매소드이용 -> equals매소드가 오버라이딩 되어있어야함.
//		//for(int i=0;i<foods.size();i++) {
//		if(!foods.contains(new Food("라면",1200,"면",680,null))) {
//			foods.add(new Food("라면",1200,"면",680,null));
//		}
//		//}
//		
//		//list에 저장된 값이 있는지 여부 확인 매소드
//		//isEmpty() -> 비어있니???
//		System.out.println(foods.isEmpty());
//		System.out.println(list.isEmpty());
//		//list에 값이 없다면 for문 실행하지마.
//		if(!foods.isEmpty()) {//==foods.size()==0;
//			for(Object t : foods) {
//				System.out.println(t);
//			}
//		}
//		
//		// indexOf(객체) : 매개변수와 일치하는 값의 인덱스번호 반환
//		System.out.println(foods.indexOf(new Food("라면",1200,"면",680,null)));
//		
//		// toArray() : list에 저장된 객체를 Object배열로 반환해주는 매소드
//		Object[] objFood=foods.toArray();
//		for(int i=0;i<objFood.length;i++) {
//			System.out.println(objFood[i]);
//		}
//		
//		//list는 중복데이터도 저장이 가능함
//		foods.add(new Food("라면",1200,"면",680,null));
//		foods.add(new Food("라면",1200,"면",680,null));
//		foods.add(new Food("라면",1200,"면",680,null));
//		foods.add(new Food("라면",1200,"면",680,null));
//		foods.add(new Food("라면",1200,"면",680,null));
//		
//		for(int i=0;i<foods.size();i++) {
//			System.out.println(foods.get(i));
//		}
//		
//		//리스트 순서가 있음.
//		//정렬이 가능!
//		ArrayList numbers=new ArrayList();
//		for(int i=0;i<10;i++) {
//			numbers.add((int)(Math.random()*10));
//		}
//		System.out.println(numbers);
//		
//		Collections.sort(numbers);//정렬로직!오름차순정렬
//		
//		System.out.println(numbers);
//		
//		//Collections.sort(numbers, (Object o1,Object o2) -> (Integer)o2-(Integer)o1);
//		numbers.sort((Object o1, Object o2) -> (Integer)o2-(Integer)o1);
//		
//		System.out.println(numbers);
//		
//		
//		
////		for(int i=0;i<numbers.size();i++) {
////			for(int j=0;j<i;j++) {
////				
////			}
////		}
//		
//	}
//}
//
//
//
//
//
