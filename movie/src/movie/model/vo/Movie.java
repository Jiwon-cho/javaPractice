package movie.model.vo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Movie {

	public static void main(String[] args) {
		String url="https://movie.naver.com/movie/running/current.nhn#";
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Elements elem=doc.select("div.lst_wrap");
		
		for(Element e: elem.select("dt")) {
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	













}
