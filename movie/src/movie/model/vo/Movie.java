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
			if (tit.get(i).contains("û�ҳ� ���ع�")) {
				String a = tit.get(i).replace("���ع�", "�����Ұ�");
				tit.set(i, a);
			}

		}

		for (int i = 0; i < 111; i++) {
			String a = tit.get(i).substring(0, tit.get(i).indexOf("��") + 1);
			String b = tit.get(i).substring(tit.get(i).indexOf("��") + 2);
			age.add(a);
			tit2.add(b);
			// System.out.println(tit2.get(i));
		}

//		for(int i=0;i<111;i++) {
//			System.out.println(age.get(i));
//		}
//		String xxx=age.get(0);
//		System.out.println(xxx);
//		String qqq=xxx.substring(0,xxx.indexOf("��")+1);
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
//	if(movie[i][0].equals("û�ҳ� �����Ұ�")) {
//	System.out.println("\""+movie[i][1]+"\""+"(��)�� ��û�ϱ� ���ؼ��� ���� ������ �ʿ��մϴ�.");	
//	}
//}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ã���� �ϴ� ��ȭ�� �̸��� �Է��Ͻÿ�: ");
//		String name = sc.next().trim().replace(" ", "");
//		boolean flag = false;
//		for (int i = 0; i < 111; i++) {
//
//			if (name.equals(movie[i][1].trim().replace(" ", "")) && movie[i][0].equals("û�ҳ� �����Ұ�")) {
//				System.out.println("\"" + movie[i][1] + "\"" + "(��)�� ��û�ϱ� ���ؼ��� ���� ������ �ʿ��մϴ�.");
//				flag = true;
//			} else if (name.equals(movie[i][1].trim().replace(" ", "")) && !movie[i][0].equals("û�ҳ� �����Ұ�")) {
//				System.out.println("\"" + movie[i][1] + "\"" + "(��)�� " + movie[i][0] + " �Դϴ�.");
//				flag = true;
//			}
//		}
//		if (flag == false) {
//			System.out.println(name + " (��)�� �������� �ʴ� ��ȭ�Դϴ�.");
//		}
	}

}
