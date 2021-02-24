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
		// ArrayListŬ������ �̿��ϱ�
		// ArrayList �迭�� ������ ���������� ������,�迭�� ������ ������ �ڷᱸ������
		// ArrayList�� Ŭ������ �����ؼ� �̿�����.
		// Ŭ���� ������ ��ü�� �żҵ带 �̿��ؼ� ������(����,�߰�,����,���� ��) �Ѵ�.
		ArrayList list = new ArrayList();
		// list ��ü�� 10�� ������ �� �ִ� ����Ȯ��! -> �迭 ���� �ε����� ���� ������
		ArrayList list2 = new ArrayList(20);
		// ������ ����Ҵ� Object[] �� �Ǿ�����.

		// ArrayList List �������̽�,Collectoin�������̽��� ����
		// List ����, Collection ������ ���Ե� �� �ִ�.
		List l = new ArrayList();
		Collection c = new ArrayList();

		// ������ ArrayList Ȱ���ϱ�
		// 1. Arraylist �� ��ü �����ϱ�
		// add() �޼ҵ带 �̿��ؼ� ArrayList����ҿ� ����
		list.add(true);// �⺻�ڷ����� ����ڽ� �Ǽ� ������
		list.add(19);
		list.add("�����");
		list.add(new Date());
		System.out.println(list);
		System.out.println(list.size());

		// ArrayList�� Ư����ü�� ����!
		// �л���. Student Ŭ������ ����.
		// ���ϵ�. Fruit Ŭ������ ����
		ArrayList foods = new ArrayList();
		foods.add(new Food("���뱹", 7000, "����", 1000, null));
		foods.add(new Food("������", 8000, "��", 650, new Date(new GregorianCalendar(2021, 01, 20).getTimeInMillis())));
		foods.add(new Food("����ʹ�", 1000, "�ʹ�", 200, null));

		System.out.println(foods);

		// ������ ����Ǿ��ִ� �� ����ϱ�
		// list�� ����� ���� ��������
		// get()�żҵ�� index ���� �������� ������
		// index���� ���� 0���� ����
		Food f = (Food) foods.get(0);// Object �� ���ϱ�
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
		// Į�θ� 5000�̻�
		for (Object f1 : foods) {
			Food temp = (Food) f1;
			if (temp.getCalorie() >= 500) {
				System.out.println("==���� ����==");
				System.out.println(temp);
			}
		}

//		foods.remove(1);
//		foods.remove(1);
		foods.remove(new Food("����ʹ�", 1000, "�ʹ�", 200, null));
		// remove �Ҷ� �ȿ��� eqauls �� ���� ������ �� �ϰ� ������ equals �� �������̵� ���־����
		System.out.println(foods);

		foods.set(1, new Food("���", 1200, "��", 680, null));
		System.out.println(foods);

		// list�� �� ��ü �����ϱ�
		System.out.println(list);
		list.clear();
		System.out.println(list);

		// �߰� ������ �޼ҵ�
		// list�� ���� �ִ��� Ȯ���ϱ�
		// contains() �޼ҵ� �̿� ->equals �޼ҵ尡 �������̵� ���־����.
		if (!foods.contains(new Food("���", 1200, "��", 680, null))) {
			foods.add(new Food("���", 1200, "��", 680, null));
		}

		// list�� ����� ���� �ִ��� ���� Ȯ�� �޼ҵ�
		// isEmpty() ->����ִ�?
		System.out.println(foods.isEmpty());
		System.out.println(list.isEmpty());
		// list �� ���� ���ٸ� for �� ����������.
		if (!foods.isEmpty()) {
			for (Object t : foods) {
				System.out.println(t);
			}
		}

		// indexOf(��ü):�Ű������� ��ġ�ϴ� ���� �ε�����ȣ ��ȯ
		System.out.println(foods.indexOf(new Food("���", 1200, "��", 680, null)));

		// toArray(): list�� ���Ƶ� ��ü�� Object �迭�� ��ȯ
		Object[] objFood = foods.toArray();
		for (int i = 0; i < objFood.length; i++) {
			System.out.println(objFood[i]);
		}

		// list�� �ߺ������͵� ������ ������
		foods.add(new Food("������", 2500, "�丮", 1300, null));
		foods.add(new Food("����Ƽ", 2000, "��", 100, null));
		foods.add(new Food("������Ľ�Ÿ", 3400, "��", 950, null));
		foods.add(new Food("�ܹ���", 9700, "��", 700, null));
		foods.add(new Food("������", 9000, "��", 780, null));

		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}

		// ����Ʈ ������ ����.
		// ������ �����ϴ�
		ArrayList numbers = new ArrayList();

		for (int i = 0; i < 10; i++) {
			numbers.add((int) (Math.random() * 10));
		}
		System.out.println(numbers);
		Collections.sort(numbers, new IntegerOrderAsc()); // ����
		System.out.println(numbers);
		Collections.sort(numbers, new IntegerOrderDesc());
		System.out.println(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);
		numbers.sort((Object o1, Object o2) -> (Integer) o2 - (Integer) o1);
		System.out.println(numbers);

		// foods�� �ִ� ���� ���ǿ� ���� �����غ���.
		// 1.Į�θ��� �������� �������� ������ ����.
		// 2.
		Collections.sort(foods, new FoodCalAsc());
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		System.out.println("�̸� ���� ���� ����=================");
//		
//		for (Object f1 : foods) {
//			System.out.println(f1);
//		}
		// 2.���ڿ� �����ϱ� �����̸����� �����ϱ�
		// -������������ �����ϱ�//���ĺ� �������
		// String ��ü���� ���ڿ��� �����ִ� �޼ҵ带 ����� ����
		// CompareTo() -> str1.compareTo(str 2) -> str1 str2 ��, return -+0

		Collections.sort(foods, new FoodnameAsc());
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		System.out.println("=========�̸� ���� ����");
		Collections.sort(foods, new FoodNameDesc());
		for (Object f1 : foods) {
			System.out.println(f1);
		}

		foods.sort(new FoodNameDesc());// �̷��Ե� ��

		// food[0].compareTo(food[1]);

		System.out.println("===���ݼ�====");
//		Collections.sort(foods);
//		for (Object f1 : foods) {
//			System.out.println(f1);
//		}

		// ��ü�� ���� ����
		// �͸�Ŭ����.. 1ȸ��
		// �ϳ� �񱳸� ���ؼ� �����ϰ� Ŭ���� ������ ���� �ѹ��� �Ҳ� �׳� ���� ,�͸� Ŭ����
		// �������̽� ����Ҷ� �� ����
		Collections.sort(foods, new Comparator<Food>() {
			@Override
			public int compare(Food f1, Food f2) {
				return f1.getPrice() - f2.getPrice();
			}
		});
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		// �͸� �̱� ������, �̸� �ʿ� ���� �ʿ��Ѱ�, �Ű������� ���� �� ��
		// lambda :(�Ű�����,..) -> {����}
		// @FunctionalInterface -> �߻�޼ҵ� �Ѱ��� ����� �������̽�
		// �⺻������ Interface ���� �����ؾ��ϴ� �޼ҵ� ����
		// int compare(Object o1, Object o2)
		System.out.println("==ī�װ� �̸���");
		Collections.sort(foods, (Object o1, Object o2) -> {
			return ((Food) o1).getCategory().compareTo(((Food) o2).getCategory());
		});
		for (Object f1 : foods) {
			System.out.println(f1);
		}
		
		TestLambda testfilter=(Food temp)->temp.getPrice()>20000;
		System.out.println("=======����====");
		List result =filter(foods, (Food temp)->temp.getPrice()>8000);
		result=filter(foods,(Food temp)->temp.getCategory().contains("��"));
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
