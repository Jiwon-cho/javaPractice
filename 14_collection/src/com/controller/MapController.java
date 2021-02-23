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
		//Map�� ���� �˾ƺ���.
		//map�� ������ �̷���� �ִ� ���� -> Key: value
		//key, value type -> �Ѵ� Object Ÿ���� ���
		//��� key ���� String ���� ���� �����
		//value: ��ü
		//Map �� Collection�� ��ӹ��� �ʾ���. > list �� ��� ����
		//�޼ҵ��� ��Ī�̳� Ȱ���� �ణ �ٸ�
		HashMap map=new HashMap();
		//�� �ֱ� ->put(key,value);
		map.put("��","A");
		map.put("��","B");
		map.put("��","C");
		System.out.println(map);
		
		//����� �� ��������
		//����� ���� key ���ؼ� ������
		//get(key);
		System.out.println(map.get("��"));
		System.out.println(map.get("��"));
		
		//key���� �ߺ��� �Ұ�����
		map.put("��", "������");//����� /Ű ���� ��ü�� �Ǹ� equals �������̵� ���ְ� �ؾ߰����� ��� �׷��� �� ��
		System.out.println(map.get("��"));
		
		map.remove("��");
		System.out.println(map);
		System.out.println(map.get("��"));
		
		
		//map �� �ִ� ������ ��ü ��ȸ��.
		//��ȸ�ϴ¹�� 2����
		//1.key ���� ��°�� ������ key �� �����ϴ� ���
		//keyset() -> map �� key set ������� ��ȯ�ϴ� �޼ҵ�
		Set keys=map.keySet();//key���� ��ȯ��.
		Iterator it=keys.iterator();
		while(it.hasNext()) {
//			Object key=it.next();//key �� 
			String key=(String)it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		//2.key,value ��� ������ �����ϴ� ���
		//key,value ��� �����ϴ� Ŭ������ �̿��� -> Map.Entry Ŭ����
		
		Set entrySets=map.entrySet();
		Iterator entryIt=entrySets.iterator();
		while(entryIt.hasNext()) {
			Map.Entry en=(Map.Entry)entryIt.next();
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
		//�����Ͱ� �ִ��� Ȯ��
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("��"));
		System.out.println(map.containsValue("A"));
		//�������� ������ Ȯ��
		System.out.println(map.size());
		
		//������ ��ü �����
		map.clear();
		
		//map
		
		HashMap car=new HashMap();
		car.put("1", new Car("���","���",5000,4));
		car.put("2", new Car("�׷���","������",8000,4));
		car.put("3", new Car("ī�Ϲ�","ȸ��",6000,9));
		car.put("4", new Car("�׽���","����",13000,4));
		
		System.out.println(car);
		
		//���� 7õ �̻� ���� ���� 
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
	List list=new ArrayList(car.values()); //Collection���� ��ȯ����
	System.out.println();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
