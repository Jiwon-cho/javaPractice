package com.poly2.common;

import java.awt.event.MouseListener;

//�������̽��� ����� ������.
//����Ϸ��� extends ���� ��� ,���� ��� ����
public interface AnimalBarkAble {//extends FlyAble,Runnable,MouseListener{
		//�������̽��� ��ü�� Ư���� �޼ҵ带 �����ϱ� ���� ����� ��.
		//����Ŭ����(�θ�) Ÿ������ ����� ������.
		//��ü ������ �Ұ�����.
		//�������̽� ������ ������ ��� public static final
		//�������̽� ���ο� �ִ� �޼ҵ�� ��� public abstract �޼ҵ�
		public  static final int age=19;//�������� ����� �����ϴ�.
		//���� ������, �����(static,final)�� �����Ѵٸ�?
		String admin="admin@admin.com";//�̷��Ե� ����
		
	
		//�޼ҵ� ����
//		public void test() {
//			System.out.println("����");
////		}
//		public abstract void test();
//		
//		void test1();// �̷��Ե� ����
//��� ������ ��� �޼ҵ带 �� �����ؾߵǱ� ������ ������ ������
		void bark();
	
		default public void move() {
			System.out.println("�����δ�");
		};

}
