package kh.vari.funtion;

import java.util.Scanner;

public class VariExample {
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
	public static void main(String[] args) {
//		new VariExample().Example();
//		new VariExample().Example2();
		new VariExample().Example3();	
	}

}
