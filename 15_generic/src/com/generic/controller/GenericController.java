package com.generic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.generic.model.dao.BookDao;
import com.generic.model.vo.Book;
import com.generic.model.vo.MyGeneric;

public class GenericController {
	
	public static void main(String[] args) {
		//제네릭이용하기
		//<자료형> 이용을 함.
		//주로 Collection, Map 을 이용할 때 사용
		ArrayList<String> names=new ArrayList<String>();
		names.add("유병승");
		names.add("유지훈");	
		//컴파일시점에 타입을 확인
		//names.add(10); <String> 을 지우면 이게 들어갈 수 잇음 
		//그런데 밑에 처럼 String 으로 형변환시 오류가 날 수밖에 없음 ,런타임때/ generic이 이걸 사전에 방지를 해주는것
		
		for(Object n: names) {
			String s=(String)n;
			System.out.println(s.charAt(0));
		}
	
	for(String s:names) {
		System.out.println(s.charAt(0));
	}//어차피 String 이니까 굳이 형변환하고 안그래도 됨
	
	List oriBooks=BookDao.oriBooks;
	//책이름 가격을 출력하기
	for(Object o: oriBooks) {
		Book b=(Book)o;
		System.out.println(b.getTitle()+" "+b.getPrice());
	}
	
	
	
	List<Book> books=BookDao.books;
	for(Book b: books) {
		System.out.println(b.getTitle()+" "+b.getPrice());
	}
	
	Set oriBookSet=new HashSet(oriBooks);
	Iterator it=oriBookSet.iterator();
	Iterator<Book> it2=oriBookSet.iterator();
	while(it.hasNext()) {
		Book b=(Book)it.next();
		System.out.println(b.getTitle()+" "+b.getAuthor());
	}
	while(it2.hasNext()) {
		Book b=it2.next();
		System.out.println(b.getTitle()+" "+b.getAuthor());
	}
	
//	for(Book b: bookSet) {
//		System.out.println(b.getTitle()+" "+b.getAuthor());
//	}
	HashMap<Integer,String> map=new HashMap();
	
	map.put(1,"볶음밥");
	map.put(2, "순대국");
	map.put(3, "계란초밥");
	
	Set<Integer> keys=map.keySet();
	Iterator<Integer> keyIt=keys.iterator();
	while(keyIt.hasNext()) {
		int temp=keyIt.next();
		System.out.println(map.get(temp).charAt(0));
	}
	
	//Map.Entry 클래스 이용하기
	
	Set<Map.Entry<Integer, String>> entry=map.entrySet();
	Iterator<Map.Entry<Integer, String>> mapIt=entry.iterator();
	while(mapIt.hasNext()) {
		Map.Entry<Integer, String> data=mapIt.next();
		System.out.println(data.getKey()+" "+data.getValue().charAt(0));
	}
	
	HashMap<String,Book> bookMap=new HashMap();
	bookMap.put("one", books.get(0));
	bookMap.put("two", books.get(1));
	bookMap.put("three", books.get(2));
	bookMap.put("four", books.get(3));
	
	for(Map.Entry<String,Book>temp: bookMap.entrySet()) {
		System.out.println(temp.getValue().getTitle()+" "+temp.getValue().getPrice());
	}
	
	//클래스를 제네릭으로 설계해보자.
	MyGeneric obj=new MyGeneric();
	obj.setTemp("유병승");
	System.out.println(obj.getTemp());
	obj.setTemp(new Date());
	System.out.println(obj.getTemp());
	//MyGeneric<String> strObj=new MyGeneric(); 제네릭 2개 설정해 좌서 하나만 하면 오류남
	//strObj.setTemp("유지훈");
	//System.out.println(strObj.getTemp());
	MyGeneric<List<Book>,Integer> objobj=new MyGeneric();
	objobj.setTemp(new ArrayList<Book>());
	objobj.getTemp().add(new Book("책 제목","화이팅",100));
	System.out.println(objobj.getTemp().get(0).getTitle());
	
	}
	

}
