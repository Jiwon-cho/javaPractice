package com.vari.controller;

import java.util.Scanner;

public class InputOutputTest {
	
	public static void main(String[] args) {
		//print()매소드 사용해보기
		int num=100;
	    String name="조지원";
	    System.out.print(num);
	    System.out.print(name);
	    System.out.println();//개행하기 
	    System.out.println(num);
	    System.out.println(name);
	    
	    //printf 매소드 사용하기
	    System.out.printf("%d -이름 %s", num,name);
	    System.out.printf("%s\n","rclass가의장");
	    //printf->기본적으로 개행이 안됨.
	    double dnum=190.5;
	    System.out.printf("%f\n", dnum);
	    System.out.printf("%.2f\n",dnum);
	    
	    //정렬이 가능함
	    System.out.printf("%s %d %.2f\n", "조지원",29, 188.1);
	    
	    System.out.println("안녕\t하세요\t힘내자!");
	    System.out.println("안녕\\호호\\");
	    System.out.println("그가 말했다\"야호\"");
	    String msg="<button onclick=\"\'location.href('')\'\">클릭하기</button>";
	    
	    
	    //Scanner 객체를 통한 입력값 받아오기!
	    //1.import하기 ->import java.util.Scanner;
	    //2.Scanner를 생성->new Scanner(System.in);
	    Scanner sc=new Scanner(System.in);
	    //3. 받을 자료형에 맞는 메소드를 사용
	    // -int sc.nextInt();
	    // -double sc.nextDouble();
	    // -String sc.next()<띄어 쓰기 앞까지만 받음, sc.nextLine();<띄어쓰기 해도 있는거 다 가져옴
	    System.out.print("\"나이를 적으시오(숫자로입력)\":");
	    int age=sc.nextInt();
	    System.out.print("당신의 키 입력:");
	    double height=sc.nextDouble();
	    System.out.print("당신의 이름 입력:");
	    sc.nextLine();
	    String name1=sc.nextLine();
	    //String name1=sc.nextline(); 
	    System.out.println("당신의 이름은 "+name1+" 나이는 "+age+"살이네요! 키는"+height+"cm");
	    
	 
	    
	}

}
