package movie.dao;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Test {
	   private static String url2 = "https://movie.naver.com/movie/sdb/browsing/bmovie_genre.nhn";


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String>list= new ArrayList<String>();
		   int idx=1;
		   Document doc=null;
		   try {
		         doc = Jsoup.connect(url2).get();
		      } catch (IOException e) {
		         throw new RuntimeException("[Error: Crawling fail : "+  e.getMessage()+"]");         
		      }
		   Elements genre=doc.select("table.directory_item_other > tbody > tr > td");
		   for(Element element: genre) {
			   list.add(idx+" "+element.select("a").text());
			   idx++;
		   }
		System.out.println(list);

	}
	
	public static ArrayList<String> GetGenre(){
		   ArrayList<String>list= new ArrayList<String>();
		   int idx=1;
		   Document doc=null;
		   try {
		         doc = Jsoup.connect(url2).get();
		      } catch (IOException e) {
		         throw new RuntimeException("[Error: Crawling fail : "+  e.getMessage()+"]");         
		      }
		   Elements genre=doc.select("table.directory_item_other > tbody > tr > td");
		   for(Element element: genre) {
			   list.add(idx+" "+element.select("a").text());
			   idx++;
		   }
		
		   return list;
	   }
	    

}
