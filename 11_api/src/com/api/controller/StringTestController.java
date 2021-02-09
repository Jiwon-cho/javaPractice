package com.api.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTestController {
	public static void main(String[] args) {
		//문자열 처리 클래스에 대해 알아보자.
		//1. String클래스, 자바에서 기본자료형 처럼 문자열을 처리할 수 있는 클래스
		String str="유병승";
		System.out.println(str);
		//주소값 출력하기
		//String은 불변의 데이터이다.
		System.out.println(str.hashCode());
		str+="선생이다.";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		//String 클래스에서 제공하는 메소드 알아보기
		//자주 쓰는
		//1. concat(): 문자열을 결합하고 반환 하는 메소드
		String temp=str.concat("19살이다");//str+19살이다;
		System.out.println(temp);
		//2.contains(확인문자열): 문자열에 특정문자가 포함됐는지 확인하는 메소드
		//매개변수에 들어온 문자열이 포함되어있는지 확인하여 있으면 true, 없으면 false;
		System.out.println(temp.contains("선생"));
		System.out.println(temp.contains("학생"));
		
		if(temp.contains("선생")) {
			System.out.println("그는 수업 중이다");
		}
		//3.indexOf():매개변수의 문자열과 동일한 문자를 찾고 그 문자열의 인덱스번호를 반환
		//만약에 없으면 -1을 반환
		System.out.println(temp.indexOf("19"));//다른 메소드하고 결합하여 많이 사용
		//매개변수가 두개있는것도 있음 -> 찾는 시작 인덱스를 지정할 수 있음
		temp="abaabcd";
		System.out.println(temp.indexOf("a",2)); //시작 위치 지정 안하면(중복되게 있는경우) 제일 처음나오는것 인덱스 반환
		System.out.println(temp.indexOf("29"));//결과값: -1;
		
		//4. lastIndexOf(): 오른쪽에서부터 찾음
		System.out.println(temp.lastIndexOf("a"));
	
		//5.replace(수정대상문구, 대체 문구): 특정문구를 수정하는 메소드
		String change=temp.replace("a", "지훈");
		System.out.println(change);
		temp="이거 공백이 많다   아아";
		System.out.println(temp.replace(" ", ""));
		
		change=temp.replaceFirst(" ", "");//처음꺼만 바꾸는것
		System.out.println(change);
		
		//6.split(): 문자열이 특정 구분자에 의해 구분 되어있을때 그 구분자를 기준으로
		//배열 형태를 만들어주는 함수
		temp="코딩,축국,캠핑,클라이밍";
		String[] hobbies=temp.split(",");
		System.out.print(Arrays.toString(hobbies));
		System.out.println();
		for(int i=0;i<hobbies.length;i++) {
			System.out.println(hobbies[i]);
		}
		//for each문: 배열,List,Map,Set등의 자료를 자동으로 반복하여
		//데이터를 순회할 수 있게 해주는 반복문
		//for(배열자료형 변수: 배열||List||Set||Map){로직}
		for(String h: hobbies) {
			System.out.println(h);
		}
		//7.join(): 배열로 되어있는 것은 문자열로 변경해주는 메소드 static
		change=String.join("-",hobbies);
		System.out.println(change);
		
		//8. substring(): 문자열의 특정 위치를 잘라내는 것
		//substring(정수)/substring(정수,정수);
		temp="이제 곧 쉬는시간";
		System.out.println(temp.substring(5));
		System.out.println(temp.substring(3,4));//(정수,정수) 에서 뒤에껀 포함안하 즉 뒤에정수 전까지란말 3,3으로하면 아무것도 안나옴
		//indexOf(): 인덱스 번호를 찾는것
		System.out.println(temp.substring(temp.indexOf("쉬")));
		System.out.println(temp.substring(temp.indexOf("쉬"),temp.indexOf("시")));
		System.out.println(temp.substring(temp.indexOf("쉬"),temp.indexOf("는")+1));
		
		//9.영문자 변환(대문자->소문자, 소문자->대문자)
		//toUpperCase(),toLowerCase()
		temp="aBxCxKKm";
		System.out.println(temp.toUpperCase());
		System.out.println(temp.toLowerCase());
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("성별(M/F): ");
//		if(sc.next().toUpperCase().charAt(0)=='M') {
//			System.out.println("남자다");
//		}else {
//			System.out.println("여자다");
//		}
		//10. trim(): 공백제고 메소드
		//다른자료형을 문자열로 변경하기
		//기본클래스 형변환(자료형)
		int age=19;
		//temp=(String)age; >string은 참조변수라 이렇게 못함
		//String.valueOf();
		temp=String.valueOf(age);
		System.out.println(temp);
		double height=190.2;
		System.out.println(String.valueOf(height));
		
		//StringBufer 클래스
		//기본자료형처럼 쓰지 않고 객체처럼 쓴다.
		//생성해서 사용한다. 메소드를 이용해서 데이터를 수정한다.
		StringBuffer sb=new StringBuffer();
		//데이터 넣기(추가)
		//append() 메소드 이용
		sb.append("여러분 힘내세용!!");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("이제곧 저녁시간");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		//temp="유병승 하하 안녕";
		//문자열의 특정한위치에 문자를 추가하는 메소드 제공
		//insert();
		//sb.insert(sb.lastIndexOf("!"), "홍홍홍");//원본값 수정하면 하는대로 바뀜 '가변'
		sb.insert(sb.lastIndexOf("!")+1, "홍홍홍");
		System.out.println(sb);// 이렇게 하면!홍홍홍 ! <그 전으로 하니까
		sb.delete(sb.indexOf("힘"), sb.indexOf("!"));
		System.out.println(sb);
		
		//원하는 문자 수정(문자!)
		//setCharAt();
		sb.setCharAt(0,'야');
		System.out.println(sb);
		
		//문자열을 거꾸로하자
		//reverse()
		sb.reverse();
		System.out.println(sb);
		
		//String,StringBuffer 변환이 가능
		String temp1=new String(sb);
		//temp1=sb.toString();//이렇게해도 위랑 똑같음
		System.out.println(temp1);
		StringBuffer sb1=new StringBuffer(temp1);
		
		//sb.contains();
		temp1.contains("시간");
		
		StringBuilder sbuilder=new StringBuilder();
		sbuilder.append("계란에 소금 넣지마");
		System.out.println(sbuilder);//다 똑같은ㄷ데 safe 기능만 없음
		
		//StringTokenizer 클래스 이용하기
		String lang="java,oracle,html/css,javascript/jqeury,mybatis";
		StringTokenizer st=new StringTokenizer(lang,",/");
		//st.hasMoreTokens() -> 더 없으면 false 있으면 true
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			//System.out.println(st.nextToken());->이렇게 하면 이건 마지막 2개가 아니라 하나 남아서 에러 뜸
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
