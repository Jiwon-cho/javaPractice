package com.threadtest.controller;

//������ ������ü
public class BasicThread extends Thread{

	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(i);
			try {
				sleep(500);//������ ����������Ű�� �޼ҵ�
				
			}catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		}
	}
	
	
	
}
