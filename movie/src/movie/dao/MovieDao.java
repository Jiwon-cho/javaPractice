package movie.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import movie.common.MovieCommon;
import movie.common.MovieList;
import movie.model.vo.Movie;

public class MovieDao extends MovieCommon implements MovieList {
	private static String url = "https://movie.naver.com/movie/running/current.nhn#";
	private static String url2 = "https://movie.naver.com/movie/sdb/browsing/bmovie_genre.nhn";
	private static MovieDao movieDao;
	

	private MovieDao() {
	}

	public static MovieDao getInstance() {
		try {
			if (movieDao == null) {
				movieDao = new MovieDao();
			}
			return movieDao;
		} catch (Exception e) {
			throw new RuntimeException("[Error: Creating instance fail : " + e.getMessage() + "]");
		}
	}

	public List<Movie> GetMovieInfo() {
		List<Movie> list = new ArrayList<Movie>();
		int idx = 0;
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			throw new RuntimeException("[Error: Crawling fail : " + e.getMessage() + "]");
		}
		Elements articles = doc.select("#content > div.article > div:nth-child(1) > div.lst_wrap > ul > li");
		for (Element element : articles) {
			Movie movie = new Movie();
			movie.setTit(element.select("dl > dt > a").text());
			movie.setAge(element.select("dl > dt > span").text());
			String temp = element.select("dl.info_txt1").select("span").text();
			movie.setCate(temp.substring(0, temp.indexOf("|")));
			movie.setRating(element.select(".num").text().substring(0, 4));
			movie.setRank(idx + 1);
			idx++;
			list.add(movie);
		}
		return list;
	}

	public List<String> GetGenre() {
		List<String> list = new ArrayList<String>();

		Document doc = null;
		try {
			doc = Jsoup.connect(url2).get();
		} catch (IOException e) {
			throw new RuntimeException("[Error: Crawling fail : " + e.getMessage() + "]");
		}
		Elements genre = doc.select("table.directory_item_other > tbody > tr > td");
		for (Element element : genre) {
			list.add(element.select("a").text());

		}

		return list;
	}

	public String SearchAll() {
		String movie = "";

		for (Movie m : movieList) {
			movie += m + "\n";
		}
		return movie;
	}

	public String SearchName(String title) {
		String movie = "";

		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTit().contains(title)) {
				movie += movieList.get(i);
			}

		}
		return movie;

	}

	public String SearchGenre(int a) {
		boolean flag = false;
		String movie = "";

		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getCate().contains(genre.get(a - 1))) {
				movie += movieList.get(i) + "\n";
				flag = true;
			}

		}
		if (flag == false) {
			movie += "해당 장르의 영화가 없습니다.";

		}
		return movie;

	}

	public String SearchRating(double d) {
		int c = (int) d + 1;
		String movie = "";
		for (int i = 0; i < movieList.size(); i++) {
			double a = Double.parseDouble(movieList.get(i).getRating());
			if (d <= a && a < c) {
				movie += movieList.get(i) + "\n";
			}
		}
		return movie;
	}

	public void Log(List<String> a) {
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		Date today=new Date();
//		String date=sdf.format(today);
//		Calendar c=Calendar.getInstance();
//		String time=" "+c.get(Calendar.YEAR)+"년 "+(c.get(Calendar.MONTH)+1)+"월 "+c.get(Calendar.DATE)+"일 "
//				+(c.get(Calendar.AM_PM)==0?"오전 ":"오후 ")+c.get(Calendar.HOUR)+"시 "+c.get(Calendar.MINUTE)+"분 "
//				+c.get(Calendar.SECOND)+"초 ";
		try (ObjectOutputStream obo = new ObjectOutputStream(new FileOutputStream(date + " log_msg.txt"))) {
			obo.writeObject(a);
		} catch (IOException e) {
			throw new RuntimeException("[Error: Creating log message fail : " + e.getMessage() + "]");
		}
	}

	public void LogLoad() {
		File f = new File(date + " log_msg.txt");

		if (f.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
				logList = (List<String>) ois.readObject();

			} catch (IOException e) {
				throw new RuntimeException("[Error: loading log message fail : " + e.getMessage() + "]");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("[Error: loading log message fail[ClassNotFoud] : " + e.getMessage() + "]");
			}
		}

	}
	
	public void logPrint() {
		for(String s:logList) {
			System.out.println(s);
		}
	}

}