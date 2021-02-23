package com.threadtest.controller;

//쓰레드 구현객체
public class BasicThread extends Thread{

	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(i);
			try {
				sleep(500);//쓰레드 실행지연시키늰 메소드
				
			}catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		}
	}
	
	
	
}
