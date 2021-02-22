package com.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.common.Car;

public class SetContorller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set: 객체들은 저장할 수 있는 구조
		//순서가 없고, 중복값은 저장하지 않음
		//Collection을 상속받은 객체 -> list에서 사용하는 메소드랑 비슷
		HashSet set=new HashSet();
		
		//값을 넣기
		set.add("유지훈");
		set.add("노상민");
		set.add("장우영");
		set.add("김가현");
		set.add("이시후");
		
		System.out.println(set);
		//값을 가져오기 
		//set저장소에 있는 값을 가져올때는
		//값을 지칭하는 id 값이 없기 때문에
		//전체를 순회히야함
		//Iterator 객체를 이용하는 방법
		//forEach를 이용하는 방법
		//set.iterator() 메소드를 이용함
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			//String name=(String)it.next();//object 니까 String 으로 형변환해야함
			// next () 연속 두번은 두개씩 없앤다는걸 알아둬야함
			System.out.println(it.next());
		}
		//it.next();//<- 이건 안됌 이미 next 다 해버렸으니까
		it=set.iterator(); // 이렇게 다시 할당해줘야됨 하려면.
		for(Object s : set) {
			System.out.println(s);
		}
		
		//set의 데이터 수 알아보기
		System.out.println(set.size());
		//set.clear();
		System.out.println(set.isEmpty());
	
		//set 에는 중복값을 가지지 않는다.
		set.add("유지훈");
		set.add("유지훈");
		set.add("유지훈");
		//출력
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(Object s: set) {
			System.out.println(s);
		}
		
		HashSet cars=new HashSet();
		cars.add(new Car("제네시스","검정",80000000,4));
		cars.add(new Car("티코","흰색",8000000,2));
		cars.add(new Car("포르쉐","빨강",200000000,4));
		cars.add(new Car("마티즈","황금",40000000,4));
		cars.add(new Car("벤틀리","회색",380000000,4));
		
		boolean result=cars.contains(new Car("벤틀리","회색",380000000,4));
		System.out.println(result);
		
		cars.add(new Car("벤틀리","회색",380000000,4));
		cars.add(new Car("벤틀리","회색",380000000,4));
		cars.add(new Car("벤틀리","회색",380000000,4));
		for(Object o:cars) {
			System.out.println(o);
		}
		
		//lotto 쉽게 만들기
		HashSet lotto=new HashSet();
		while(lotto.size()!=6) {
			int num=(int)(Math.random()*44)+1;
			lotto.add(num);
		}
	
		for(Object o:lotto) {
			System.out.println(o);
		}
		
		cars.remove(new Car("벤틀리","회색",380000000,4));
			for(Object o:cars) {
				System.out.println(o);
			}
		
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		System.out.println(list);
		HashSet temp=new HashSet(list);
		System.out.println(temp);
		list=new ArrayList(temp);
		System.out.println(list);
		
		//저장 순서를 기억하는 set
		LinkedHashSet lSet=new LinkedHashSet();
		lSet.add("유병승");
		lSet.add("유지훈");
		lSet.add("김가현");
		System.out.println(lSet);
		
		//값들의 오름 차순
		TreeSet tSet=new TreeSet();
//		tSet.add(1);
//		tSet.add(6);
//		tSet.add(2);
//		tSet.add(3);
//		tSet.add(1);
//		tSet.add(4);
//		tSet.add(2);
//		tSet.add(1);
		tSet.add(new Car("제네시스","검정",80000000,4));
		tSet.add(new Car("티코","흰색",8000000,2));
		tSet.add(new Car("포르쉐","빨강",200000000,4));
		tSet.add(new Car("마티즈","황금",40000000,4));
		tSet.add(new Car("벤틀리","회색",380000000,4));
		
		System.out.println(tSet);
		Iterator it3=tSet.descendingIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		Iterator carIt=tSet.iterator();
		while(carIt.hasNext()) {
			Car c=(Car)carIt.next();
			if(c.getName().contains("벤틀리")){
				System.out.println(c.getName()+" "+c.getColor()+" "+c.getPrice()+" "+c.getPerson());
			}
		
		}
		for(Object o: tSet) {
			if(((Car)o).getName().equals("벤틀리")){
				System.out.println(((Car)o).getColor());
			}
		}
		
	}

}
