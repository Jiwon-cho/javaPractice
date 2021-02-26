package movie.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




public class Test {



 public static void main(String[] args) {
		String url = "http://www.moviechart.co.kr/rank/realtime/index/image";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();

		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements elem = doc.select("div.movieBox");
	
		ArrayList<String> tit = new ArrayList();
		ArrayList<String> tit2 = new ArrayList();
		//System.out.println(elem);
//		String a;
//		for(Element l:elem.select("div")) {
//			a=l.getElementsByAttribute("href").attr("href");
//		if(a.contains("detail")) {
//			System.out.println(l.getElementsByAttribute("href").text());
//		}
//		}
		for(Element l:elem.select("div")) {
			if(!l.className().equals("text")) {
				continue;
			}
			tit.add(l.text());
			
		}
		
	for(int i=0;i<tit.size();i++) {
		String a=tit.get(i).substring(0,tit.get(i).indexOf("°³ºÀ"));
		tit2.add(a);
	}
	for(String s:tit2) {
		System.out.println(s);
	}
//		for(Element l:elem.select("div")) {
//			if(!l.className().equals("ex")) {
//				continue;
//			}
//			System.out.println(l.text());
//		}
		//for(Element l: elem.select(url))
		//		String a;
//		for (Element l : elem2.select("span")) {
//			a=l.getElementsByAttribute("href").attr("href");
//		if(a.contains("genre")){	
//			category.add(l.getElementsByAttribute("href").text());
//		}
//		}
//		System.out.println(category.size());
//		System.out.println(age.size());
//		System.out.println(tit2.size());

//		String[][] movie = new String[age.size()][3];
//		for (int i = 0; i < age.size(); i++) {
//			movie[i][0] = age.get(i);
//			movie[i][1] = tit2.get(i);
//			movie[i][2] = rank.get(i);
//		}
//		

	}

}
