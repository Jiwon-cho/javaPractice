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
		//���׸��̿��ϱ�
		//<�ڷ���> �̿��� ��.
		//�ַ� Collection, Map �� �̿��� �� ���
		ArrayList<String> names=new ArrayList<String>();
		names.add("������");
		names.add("������");	
		//�����Ͻ����� Ÿ���� Ȯ��
		//names.add(10); <String> �� ����� �̰� �� �� ���� 
		//�׷��� �ؿ� ó�� String ���� ����ȯ�� ������ �� ���ۿ� ���� ,��Ÿ�Ӷ�/ generic�� �̰� ������ ������ ���ִ°�
		
		for(Object n: names) {
			String s=(String)n;
			System.out.println(s.charAt(0));
		}
	
	for(String s:names) {
		System.out.println(s.charAt(0));
	}//������ String �̴ϱ� ���� ����ȯ�ϰ� �ȱ׷��� ��
	
	List oriBooks=BookDao.oriBooks;
	//å�̸� ������ ����ϱ�
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
	
	map.put(1,"������");
	map.put(2, "���뱹");
	map.put(3, "����ʹ�");
	
	Set<Integer> keys=map.keySet();
	Iterator<Integer> keyIt=keys.iterator();
	while(keyIt.hasNext()) {
		int temp=keyIt.next();
		System.out.println(map.get(temp).charAt(0));
	}
	
	//Map.Entry Ŭ���� �̿��ϱ�
	
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
	
	//Ŭ������ ���׸����� �����غ���.
	MyGeneric obj=new MyGeneric();
	obj.setTemp("������");
	System.out.println(obj.getTemp());
	obj.setTemp(new Date());
	System.out.println(obj.getTemp());
	//MyGeneric<String> strObj=new MyGeneric(); ���׸� 2�� ������ �¼� �ϳ��� �ϸ� ������
	//strObj.setTemp("������");
	//System.out.println(strObj.getTemp());
	MyGeneric<List<Book>,Integer> objobj=new MyGeneric();
	objobj.setTemp(new ArrayList<Book>());
	objobj.getTemp().add(new Book("å ����","ȭ����",100));
	System.out.println(objobj.getTemp().get(0).getTitle());
	
	}
	

}
