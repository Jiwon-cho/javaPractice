package kh.vari.funtion;

import java.util.Scanner;

public class VariExample {
	
	public void Minus() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1을 입력하시오: " );
		int a=sc.nextInt();
		System.out.print("정수2를 입력하시오: ");
		int b=sc.nextInt();
		
		System.out.println("뺄셈 결과 "+(a-b));
	
		
			
		}
	public void Divide() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1을 입력하시오: " );
		int a=sc.nextInt();
		System.out.print("정수2를 입력하시오: ");
		int b=sc.nextInt();
		
		
		System.out.println("나눗셈 결과: "+(a/b));
	
	}
	public void Left() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1을 입력하시오: " );
		int a=sc.nextInt();
		System.out.print("정수2를 입력하시오: ");
		int b=sc.nextInt();
		
	
		System.out.println("나머지 결과: "+(a%b));
	}
	
	public void Verify() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int su=sc.nextInt();
		if(su>20) {
			System.out.print("20 보다 크다");
		}else {
			System.out.print("20 보다 크지 않다:");
		}
		
	}
	public void English() {
		Scanner sc=new Scanner(System.in);
		System.out.print("영문을 입력하시오: ");
		String en=sc.next();
		for(int i=0;i<en.length(); i++) {
			int a=(int)en.charAt(i);
			if(a>=65&&a<=90) {
				System.out.println((i+1)+"번째 글자는 "+"대문자이다\n");
				
			}else {
				System.out.println((i+1)+"번째 글자는 "+"대문자가 아니다\n");
			}
		}
		
	}
		
	

	
	
	public void Information() {
		Scanner sc=new Scanner(System.in);
		String name="조지원";
		int age=29;
		String gender="남";
		String place="의왕";
		String phone="01012345678";
		String email="gwon188@gmail.com";
		System.out.println("이름 "+"나이 "+"성별"+" "+"지역 "+"전화번호 "+"이메일");
	    System.out.println(name+" "+age+" "+gender+" "+place+" "+phone+" "+email);
	    
	    System.out.print("이름을 입력 하시오: ");
	    String name2=sc.next();
	    System.out.print("나이를 입력하시오: ");
	    int age2=sc.nextInt();
	    System.out.print("성별을 입력하시오: ");
	    String gender2=sc.next();
	    System.out.print("사는 지역을 입력하시오: ");
	    String place2=sc.next();
	    System.out.print("전화번호를 입력하시오: ");
	    String phone2=sc.next();
	    System.out.print("이메일을 입력하시오: ");
	    String email2=sc.next();
		System.out.println("이름 "+"나이 "+"성별"+" "+"지역 "+"전화번호 "+"이메일");
	    System.out.println(name2+" "+age2+" "+gender2+" "+place2+" "+phone2+" "+email2);
	    
		
		
		
		
	}
	public void Information2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력 하시오: ");
	    String name=sc.next();
	    System.out.print("나이를 입력하시오: ");
	    int age=sc.nextInt();
	    System.out.print("주소를 입력 하시오: ");
	    String address=sc.next();
	    System.out.print("키를 입력 하시오: ");
	    double height=sc.nextDouble();
	    System.out.print("몸무게를 입력 하시오: ");
	    double weight=sc.nextDouble();
	    System.out.print("성별을 입력 하시오(M/F): ");
	    char gender=sc.next().charAt(0);
	    
	    System.out.printf("이름: %s 나이: %d 주소: %s 키: %d 몸무게: %.1f 성별: %c",name,age,address,(int)height,weight,gender);
	} 
	
	
	public void Variable() {
		int a=100;
		long b=10000;
		float c=234.567F;
		double d=567.12356;
		char e='A';
		String f="Hello world";
		boolean g=true;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g); 
		
		
	}
	public void Example() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1를 입력하시오: ");
		int su1=sc.nextInt();
		System.out.print("정수2를 입력하시오: ");
		int su2=sc.nextInt();
		int mul=su1+su2;
		int mi=su1-su2;
		int x=su1*su2;
		double di=su1/su2;
		System.out.print("합: " +mul+ " 차: "+mi+" 곱: "+x+" 나누기: "+di);
		
		
	}
	public void Example2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("가로 길이를 입력하시오: ");
		double ho=sc.nextDouble();
		System.out.print("가로 길이를 입력하시오: ");
		double ver=sc.nextDouble();
		double area=ho*ver;
		double cir=(ho+ver)*2;
		System.out.print("면적: "+area+" 둘레: "+cir);
	}
	public void Example3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("영어를 입력하시오: ");
		String en=sc.next();
	
		for(int i=0;i<en.length();i++) {
			System.out.print(""+(i+1)+"번째 문자"+en.charAt(i)+"\n");
		}
		
	}






		
	}




