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
		//filter를 적용해서 이용하기
		List<Book> result=filter(books,(Book b)-> b.getPrice()>8000);
		System.out.println(result);
		
		List result2=filter(Arrays.asList(new Integer[] {1,2,3,4,5}),(Integer i)->i>3);
		
		List result3=filter(Arrays.asList(new String[] {"유병승","유지태","유지훈","김기영"})
				,(String name)->name.charAt(0)=='유');
	
		//<T> 제네릭으로 여러가지 다 처리 가능 따로 뭐 안하고도
	
	
	
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
