	package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.common.Car;

public class MapController {
	public static void main(String[] args) {
		//Map에 대해 알아보자.
		//map은 쌍으로 이루어져 있는 구조 -> Key: value
		//key, value type -> 둘다 Object 타입을 사용
		//통상 key 값은 String 으로 많이 사용함
		//value: 객체
		//Map 은 Collection을 상속받지 않았음. > list 랑 상관 없음
		//메소드의 명칭이나 활용이 약간 다름
		HashMap map=new HashMap();
		//값 넣기 ->put(key,value);
		map.put("가","A");
		map.put("나","B");
		map.put("다","C");
		System.out.println(map);
		
		//저장된 값 가져오기
		//저장된 값은 key 통해서 가져옴
		//get(key);
		System.out.println(map.get("가"));
		System.out.println(map.get("나"));
		
		//key값은 중복이 불가능함
		map.put("가", "유병승");//덮어씌움 /키 값이 객체가 되면 equals 오버라이딩 해주고 해야겠지만 통상 그렇게 안 씀
		System.out.println(map.get("가"));
		
		map.remove("가");
		System.out.println(map);
		System.out.println(map.get("가"));
		
		
		//map 에 있는 데이터 전체 순회학.
		//순회하는방법 2가지
		//1.key 값을 통째로 가져와 key 로 접근하는 방법
		//keyset() -> map 의 key set 방식으로 반환하는 메소드
		Set keys=map.keySet();//key들을 반환함.
		Iterator it=keys.iterator();
		while(it.hasNext()) {
//			Object key=it.next();//key 값 
			String key=(String)it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		//2.key,value 모두 가져와 접근하는 방법
		//key,value 모두 저장하는 클래스를 이용함 -> Map.Entry 클래스
		
		Set entrySets=map.entrySet();
		Iterator entryIt=entrySets.iterator();
		while(entryIt.hasNext()) {
			Map.Entry en=(Map.Entry)entryIt.next();
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
		//데이터가 있는지 확인
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("나"));
		System.out.println(map.containsValue("A"));
		//데이터의 객수를 확인
		System.out.println(map.size());
		
		//데이터 전체 지우기
		map.clear();
		
		//map
		
		HashMap car=new HashMap();
		car.put("1", new Car("모닝","흰색",5000,4));
		car.put("2", new Car("그랜져","검은색",8000,4));
		car.put("3", new Car("카니발","회색",6000,9));
		car.put("4", new Car("테슬라","빨강",13000,4));
		
		System.out.println(car);
		
		//가격 7천 이상 차명 가격 
//		Set carKeys=car.keySet();
//		Iterator carIt=carKeys.iterator();
//		
//		while(carIt.hasNext()) {
//			String key=(String)carIt.next();
//			if(((Car)car.get(key)).getPrice()>=7000) {
//			System.out.println(((Car)car.get(key)).getName()+((Car)car.get(key)).getPrice()+
//					((Car)car.get(key)).getPerson());}
//		}
//		
		
	Set entryCar=car.entrySet();
	Iterator entryit=entryCar.iterator();
	
	while(entryit.hasNext()) {
		Map.Entry entry=(Map.Entry)entryit.next();
		Car c=(Car)entry.getValue();
		if(c.getPrice()>=7000) {
			System.out.println(c.getName()+" "+ c.getPrice()+" "+c.getPerson());
		}
	}
	
	//values() : Map/Collection
	List list=new ArrayList(car.values()); //Collection으로 반환해줌
	System.out.println();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
