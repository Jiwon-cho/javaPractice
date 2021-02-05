package com.poly.run;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class TEst {
	static Scanner sc = new Scanner(System.in);
	   static int cnt;
	   static String [] arr;
	   
	   public static void main(String[] args) {

	      System.out.println("배열의 크기를 입력하세요");
	      cnt = sc.nextInt();
	      arr = new String[cnt];
	      
	      if(cnt>0) {
	         for(int i=0;i<cnt;i++) {
	            System.out.print(i+1+"번째 문자열: ");
	            arr[i] = sc.next();
	            System.out.println();
	         }
	         StudyArr();
	         System.out.println(Arrays.toString(arr));
	      }else {
	         System.out.println("0이상이 아닙니다");
	      }
	      
	   }
	   public static void StudyArr() {
	      while(true) {
	         System.out.println("값을 더 입력하시겠습니까?(Y/N)");
	         String sw= sc.next().toLowerCase().trim();
	         //y ,n
	         if(sw.equals("y")) {
	            MoreArr();
	         }else if(sw.equals("n")) {
	            return;
	         }else {
	            System.out.println("Y/N만 입력가능");
	            continue;
	         }
	      }
	   }
	   public static void MoreArr() {
	      System.out.println("더 입력하고 싶은 개수: ");
	      int moreCnt = sc.nextInt();
	      if(moreCnt>0) {
	         cnt+=moreCnt;
	         String[] temp = new String[cnt];
	         temp = Arrays.copyOf(arr, cnt);
	         arr = temp;
	         for(int i=cnt-moreCnt;i<cnt;i++) {
	            System.out.print(i+1+"번째 문자열: ");
	            arr[i] = sc.next();
	            System.out.println();
	         }      
	      }else {
	         System.out.println("0이상이 아닙니다");
	         return;
	      }
	   }

}
