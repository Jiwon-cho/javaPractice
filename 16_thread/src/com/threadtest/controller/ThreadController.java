package com.threadtest.controller;

public class ThreadController {

		public static void main(String[] args) {
			Thread t=new Thread(new RunnableTest());
			t.start();
			
			 BasicThread bt=new BasicThread();
			 //�����带 �����Ϸ��� start()
			 
			 bt.start();
		try { 
			 t.join();//t �����尡 �۾��� ������ ���� main�� ���� //�ϴ°� ���������� main�� ����
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			 for(int i=0;i<50;i++) {
				 System.out.println("����: "+i);
			 try {
				 Thread.sleep(300);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			 
			 }
		}
}
