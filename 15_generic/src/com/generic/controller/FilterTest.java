package com.generic.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.generic.model.dao.BookDao;
import com.generic.model.vo.Book;

public class FilterTest<T> {

	public static void main(String[] args) {
		
		List<Book> books=BookDao.books;
		//filter�� �����ؼ� �̿��ϱ�
		List<Book> result=filter(books,(Book b)-> b.getPrice()>8000);
		System.out.println(result);
		
		List result2=filter(Arrays.asList(new Integer[] {1,2,3,4,5}),(Integer i)->i>3);
		
		List result3=filter(Arrays.asList(new String[] {"������","������","������","��⿵"})
				,(String name)->name.charAt(0)=='��');
	
		//<T> ���׸����� �������� �� ó�� ���� ���� �� ���ϰ�
	
	
	
	}
	public static<T> List<T> filter(List<T> data, Predicate<T> filter){
		List<T> result=new ArrayList();
		for(T b: data) {
			if(filter.test(b)) {
				result.add(b);
			}
		}
		return result;
	}

}
