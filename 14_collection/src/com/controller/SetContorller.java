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
		//Set: ��ü���� ������ �� �ִ� ����
		//������ ����, �ߺ����� �������� ����
		//Collection�� ��ӹ��� ��ü -> list���� ����ϴ� �޼ҵ�� ���
		HashSet set=new HashSet();
		
		//���� �ֱ�
		set.add("������");
		set.add("����");
		set.add("��쿵");
		set.add("�谡��");
		set.add("�̽���");
		
		System.out.println(set);
		//���� �������� 
		//set����ҿ� �ִ� ���� �����ö���
		//���� ��Ī�ϴ� id ���� ���� ������
		//��ü�� ��ȸ������
		//Iterator ��ü�� �̿��ϴ� ���
		//forEach�� �̿��ϴ� ���
		//set.iterator() �޼ҵ带 �̿���
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			//String name=(String)it.next();//object �ϱ� String ���� ����ȯ�ؾ���
			// next () ���� �ι��� �ΰ��� ���شٴ°� �˾Ƶ־���
			System.out.println(it.next());
		}
		//it.next();//<- �̰� �ȉ� �̹� next �� �ع������ϱ�
		it=set.iterator(); // �̷��� �ٽ� �Ҵ�����ߵ� �Ϸ���.
		for(Object s : set) {
			System.out.println(s);
		}
		
		//set�� ������ �� �˾ƺ���
		System.out.println(set.size());
		//set.clear();
		System.out.println(set.isEmpty());
	
		//set ���� �ߺ����� ������ �ʴ´�.
		set.add("������");
		set.add("������");
		set.add("������");
		//���
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(Object s: set) {
			System.out.println(s);
		}
		
		HashSet cars=new HashSet();
		cars.add(new Car("���׽ý�","����",80000000,4));
		cars.add(new Car("Ƽ��","���",8000000,2));
		cars.add(new Car("������","����",200000000,4));
		cars.add(new Car("��Ƽ��","Ȳ��",40000000,4));
		cars.add(new Car("��Ʋ��","ȸ��",380000000,4));
		
		boolean result=cars.contains(new Car("��Ʋ��","ȸ��",380000000,4));
		System.out.println(result);
		
		cars.add(new Car("��Ʋ��","ȸ��",380000000,4));
		cars.add(new Car("��Ʋ��","ȸ��",380000000,4));
		cars.add(new Car("��Ʋ��","ȸ��",380000000,4));
		for(Object o:cars) {
			System.out.println(o);
		}
		
		//lotto ���� �����
		HashSet lotto=new HashSet();
		while(lotto.size()!=6) {
			int num=(int)(Math.random()*44)+1;
			lotto.add(num);
		}
	
		for(Object o:lotto) {
			System.out.println(o);
		}
		
		cars.remove(new Car("��Ʋ��","ȸ��",380000000,4));
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
		
		//���� ������ ����ϴ� set
		LinkedHashSet lSet=new LinkedHashSet();
		lSet.add("������");
		lSet.add("������");
		lSet.add("�谡��");
		System.out.println(lSet);
		
		//������ ���� ����
		TreeSet tSet=new TreeSet();
//		tSet.add(1);
//		tSet.add(6);
//		tSet.add(2);
//		tSet.add(3);
//		tSet.add(1);
//		tSet.add(4);
//		tSet.add(2);
//		tSet.add(1);
		tSet.add(new Car("���׽ý�","����",80000000,4));
		tSet.add(new Car("Ƽ��","���",8000000,2));
		tSet.add(new Car("������","����",200000000,4));
		tSet.add(new Car("��Ƽ��","Ȳ��",40000000,4));
		tSet.add(new Car("��Ʋ��","ȸ��",380000000,4));
		
		System.out.println(tSet);
		Iterator it3=tSet.descendingIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		Iterator carIt=tSet.iterator();
		while(carIt.hasNext()) {
			Car c=(Car)carIt.next();
			if(c.getName().contains("��Ʋ��")){
				System.out.println(c.getName()+" "+c.getColor()+" "+c.getPrice()+" "+c.getPerson());
			}
		
		}
		for(Object o: tSet) {
			if(((Car)o).getName().equals("��Ʋ��")){
				System.out.println(((Car)o).getColor());
			}
		}
		
	}

}
