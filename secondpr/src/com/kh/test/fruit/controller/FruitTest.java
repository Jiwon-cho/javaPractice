package com.kh.test.fruit.controller;

import java.util.ArrayList;

import com.kh.test.fruit.model.vo.Fruit;

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit> list =new ArrayList<Fruit>();
		list.add(new Fruit("���","����"));
		list.add(new Fruit("������","��ŭ"));
		list.add(new Fruit("Ű��","��ŭ"));
		
		System.out.println("�� ����:"+list);
		
		list.remove(1);
		System.out.println("�� ����1: "+list);
		
		list.remove(new Fruit("���","����"));
		System.out.println("�� ����2: "+list);
		
		
	}

}
