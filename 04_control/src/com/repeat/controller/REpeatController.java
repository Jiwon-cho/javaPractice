package com.repeat.controller;

public class REpeatController {
	
	public void basicFor() {

		//1���� 100���� ���
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		
		//1���� 100���� ¦�� ���
		for(int i=2; i<=100;i+=2) {
			System.out.println(i);
		}
       //100���� 1���� ����ϱ�
		for(int i=100;i>0;i--) {
    	   System.out.println(i);
       }
       
        
		//1���� 100 �� ���ϱ�
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
    	   
    	   }
		System.out.println(sum);
    	    
    	
		//1���� 100 Ȧ�� ���� ���ϱ�
		int sum2=0;
		for(int i=1;i<=100;i+=2) {
			sum2+=i;
		}
		System.out.println(sum2);
       
	
	
	}
	

}
