package com.repeat.controller;

public class REpeatController {
	
	public void basicFor() {

		//1부터 100까지 출력
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		
		//1부터 100까지 짝수 출력
		for(int i=2; i<=100;i+=2) {
			System.out.println(i);
		}
       //100부터 1까지 출력하기
		for(int i=100;i>0;i--) {
    	   System.out.println(i);
       }
       
        
		//1부터 100 다 더하기
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
    	   
    	   }
		System.out.println(sum);
    	    
    	
		//1부터 100 홀수 값만 더하기
		int sum2=0;
		for(int i=1;i<=100;i+=2) {
			sum2+=i;
		}
		System.out.println(sum2);
       
	
	
	}
	

}
