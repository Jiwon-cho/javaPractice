package com.threadtest.controller;

public class ThreadController {

		public static void main(String[] args) {
			Thread t=new Thread(new RunnableTest());
			t.start();
			
			 BasicThread bt=new BasicThread();
			 //스레드를 실행하려면 start()
			 
			 bt.start();
		try { 
			 t.join();//t 스레드가 작업을 끝낼때 까지 main이 멈춤 //하는거 끝날때까지 main이 안함
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			 for(int i=0;i<50;i++) {
				 System.out.println("메인: "+i);
			 try {
				 Thread.sleep(300);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			 
			 }
		}
}
