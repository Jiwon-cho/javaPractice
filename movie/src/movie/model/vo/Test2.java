package movie.model.vo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test2 {
	

public static void main(String[] args) {
			String url = "https://movie.naver.com/movie/running/current.nhn#";
			Document doc = null;
			try {
				doc = Jsoup.connect(url).get();

			} catch (IOException e) {
				e.printStackTrace();
			}

			Elements elem = doc.select("div.lst_wrap");
			Elements elem1 = doc.select("dl.info_star");
			Elements elem2 = doc.select("dl.info_txt1");
			
			ArrayList<String> tit = new ArrayList();
			ArrayList<String> tit2 = new ArrayList();
			ArrayList<String> age = new ArrayList();
			ArrayList<String> rank = new ArrayList();
			ArrayList<String> category = new ArrayList();
			//ArrayList<String> rank2 = new ArrayList();
			for (Element e : elem.select("dt")) {
				if (!e.className().equals("tit")) {
					continue;
				}
				tit.add(e.text());

			}

			for (int i = 0; i < tit.size(); i++) {
				if (tit.get(i).contains("청소년 유해물")) {
					String a = tit.get(i).replace("유해물", "관람불가");
					tit.set(i, a);
				}

			}

			for (int i = 0; i < tit.size(); i++) {
				String a = tit.get(i).substring(0, tit.get(i).indexOf("가") + 1);
				String b = tit.get(i).substring(tit.get(i).indexOf("가") + 2);
				age.add(a);
				tit2.add(b);

			}

			for (Element l : elem1.select("span")) {
				if (!l.className().equals("num")) {
					continue;
				}
				rank.add(l.text());

			}
		
			System.out.println(category);

			String[][] movie = new String[age.size()][3];
			for (int i = 0; i < age.size(); i++) {
				movie[i][0] = age.get(i);
				movie[i][1] = tit2.get(i);
				movie[i][2] = rank.get(i);
			}
		//너무 어렵다. 나는 어떻게 데이터를 정재해야할까
			//시간이 너무 없다 머리 빠개질꺼같다.

		}

	}



