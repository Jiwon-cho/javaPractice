package movie.model.vo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Movie {

	public static String[][] main() {
		String url = "https://movie.naver.com/movie/running/current.nhn#";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();

		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements elem = doc.select("div.lst_wrap");
		Elements elem1 = doc.select("div.star_t1");
		ArrayList<String> tit = new ArrayList();
		ArrayList<String> tit2 = new ArrayList();
		ArrayList<String> age = new ArrayList();
		ArrayList<String> rank = new ArrayList();
		ArrayList<String> rank2 = new ArrayList();
		for (Element e : elem.select("dt")) {
			if (!e.className().equals("tit")) {
				continue;
			}
			tit.add(e.text());

		}
//
		for (int i = 0; i < 111; i++) {
			if (tit.get(i).contains("청소년 유해물")) {
				String a = tit.get(i).replace("유해물", "관람불가");
				tit.set(i, a);
			}

		}

		for (int i = 0; i < 111; i++) {
			String a = tit.get(i).substring(0, tit.get(i).indexOf("가") + 1);
			String b = tit.get(i).substring(tit.get(i).indexOf("가") + 2);
			age.add(a);
			tit2.add(b);
			// System.out.println(tit2.get(i));
		}

//		for(int i=0;i<111;i++) {
//			System.out.println(age.get(i));
//		}
//		String xxx=age.get(0);
//		System.out.println(xxx);
//		String qqq=xxx.substring(0,xxx.indexOf("가")+1);
//		System.out.println(qqq);
		for (Element l : elem1.select("span")) {
			if (!l.className().equals("num")) {
				continue;
			}
			rank.add(l.text());

		}

//		System.out.println(tit.size());
//		System.out.println(rank.size());
		for (int i = 206; i < 214; i++) {
			rank2.add(rank.get(i));
		}

		for (int i = 213; i > 205; i--) {
			rank.remove(i);
		}

//	for(int i=0;i<206;i++) {
//		System.out.println(rank.get(i));
//	}

		for (int i = 205; i > 0; i -= 2) {
			rank.remove(i);
		}
		for (int i = 0; i < 8; i++) {
			rank.add(rank2.get(i));
		}

//	System.out.println(rank.size());
//	System.out.println(tit.size());
		String[][] movie = new String[111][3];
		for (int i = 0; i < 111; i++) {
			movie[i][0] = age.get(i);
			movie[i][1] = tit2.get(i);
			movie[i][2] = rank.get(i);
		}
		return movie;

//for(int i=0;i<111;i++) {
//	if(movie[i][0].equals("청소년 관람불가")) {
//	System.out.println("\""+movie[i][1]+"\""+"(을)를 시청하기 위해서는 성인 인증이 필요합니다.");	
//	}
//}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("찾고자 하는 영화의 이름을 입력하시오: ");
//		String name = sc.next().trim().replace(" ", "");
//		boolean flag = false;
//		for (int i = 0; i < 111; i++) {
//
//			if (name.equals(movie[i][1].trim().replace(" ", "")) && movie[i][0].equals("청소년 관람불가")) {
//				System.out.println("\"" + movie[i][1] + "\"" + "(을)를 시청하기 위해서는 성인 인증이 필요합니다.");
//				flag = true;
//			} else if (name.equals(movie[i][1].trim().replace(" ", "")) && !movie[i][0].equals("청소년 관람불가")) {
//				System.out.println("\"" + movie[i][1] + "\"" + "(은)는 " + movie[i][0] + " 입니다.");
//				flag = true;
//			}
//		}
//		if (flag == false) {
//			System.out.println(name + " (은)는 존재하지 않는 영화입니다.");
//		}
	}

}
