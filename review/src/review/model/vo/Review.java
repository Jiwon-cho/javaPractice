package review.model.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Review {

	public static void main(String[] args) {
//		String a="가나다라마바사";
//		String b[]=a.split(",");
//		char[]c=a.toCharArray();
//		String zzz="타타";
//		System.out.println(c[0]);
//		byte ax=127;
//		
//		System.out.println(ax+12415);
//		System.out.printf("2+2=%05d이다.\n",4);
//		System.out.println("\"가나다\"");
//		System.out.println(!a.equals(zzz));
		
//		int a=4;
//		int b=5;
//		int c=5;
//		System.out.println(c);
//		int d=7;
//		System.out.println(c+","+d);
//		System.out.println(c+","+d);
//		int result=d==c?++d:--c;
//		System.out.println(result);
//		System.out.println(c);
//		System.out.println(a!=c);
//		
		String a="코딩";
		String b="코딩";
		String str=new String("코딩");
		System.out.println(a.equals(str));
		
		int c=0;
		c+=10;
		c=c+10;
		System.out.println(c);
		ArrayList<Integer>age=new ArrayList();
		age.add(23);
		age.add(24);
		System.out.println(age.get(0)+age.get(1));
		System.out.println(age);
		char[]xx=a.toCharArray();
		int[]zz= {2,566,342,12,64,6};
		Arrays.sort(zz);
		System.out.println(Arrays.toString(zz));
//		List<Integer>lst=new ArrayList<>();
//		for(int i:zz) {
//			lst.add(i);
//		}
//		List<Integer> lst=Arrays.asList(zz);
//		Collections.sort(lst);
//		System.out.println(lst);
//		Collections.reverse(lst);
//		//Collections.sort().reverse(Arrays.asList(zz));
//		System.out.println(lst);
		//List<Integer>lis=Arrays.asList(2,566,342,12,64,6);
		String[] x=new String[4];
		String[] temp=new String[6];
		temp[4]="가나다";
		temp[5]="아나";
		x=Arrays.copyOf(temp, temp.length);
		System.out.println(x[5]);
		String [][] xxx=new String[2][];
//		xxx[0]=new String[2];
//		xxx[1]=new String [1];
//		xxx[0][0]="가나다";
//		xxx[0][1]="캉남";
//		xxx[1][0]="타타";
//		System.out.println(xxx[0][1]);
		String qewe=String.join("-",temp);
		System.out.println(String.valueOf(temp[1]));
		String bb=String.valueOf(temp[1]);
		String cc=String.valueOf(temp[0]);
		System.out.println(bb.equals(cc));
		char[]qwer=cc.toCharArray();
		for(int i=0;i<qwer.length;i++) {
			System.out.println(qwer[i]);
		}
		try {
		System.out.println(temp[1].equals(temp[0]));
		System.out.println("1".equals(temp[1]));
		}catch(NullPointerException npe){
			System.out.println("안돼 ㅄ아");
		}
		String tr="19";
		int qc=Integer.parseInt(tr);
		System.out.println(qc+3);
		String vx=String.valueOf(9);
		System.out.println(vx+3);
		String ch=String.valueOf('2');
		String ch2=String.valueOf('a');
		System.out.println(ch2);
		System.out.println(ch);
		}
	
	public static void review2(String[] args) {
		String[] a=new String[4];
		String[] temp=new String[6];
		temp[4]="가나다";
		temp[5]="아나";
		a=Arrays.copyOf(temp, temp.length);
		System.out.println(a[5]);
		
		String [][] xx=new String[3][];
		xx[0]=new String[4];
		xx[1]=new String [3];
		
		String vx=String.valueOf(9);
		System.out.println(vx);
		
		String tr="19";
		int qc=Integer.parseInt(tr);
		System.out.println(qc);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
