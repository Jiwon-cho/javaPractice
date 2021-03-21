package movie.dao;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import movie.model.vo.Movie;

public class MovieDao{
   private static String url = "https://movie.naver.com/movie/running/current.nhn#";
   private static String url2 = "https://movie.naver.com/movie/sdb/browsing/bmovie_genre.nhn";

   private static MovieDao movieDao ;
     
   private MovieDao() {}
   
   public static MovieDao getInstance(){
      try {
         if(movieDao ==null) {
            movieDao = new MovieDao();
         }
         return movieDao;
      }
      catch(Exception e) {
         throw new RuntimeException("[Error: Create instance fail : "+  e.getMessage()+"]");
      }
   }
   
   
   public ArrayList<Movie> GetMovieInfo() {
      ArrayList<Movie>list = new ArrayList<Movie>();
      int idx=0;
      Document doc = null;
      try {
         doc = Jsoup.connect(url).get();
      } catch (IOException e) {
         throw new RuntimeException("[Error: Crawling fail : "+  e.getMessage()+"]");         
      }      
      Elements articles = doc.select("#content > div.article > div:nth-child(1) > div.lst_wrap > ul > li");
      for(Element element: articles) {
         Movie movie = new Movie();
//         movie.setTit(element.select("dl > dt > span").text());
         movie.setTit(element.select("dl > dt > a").text());
         movie.setAge(element.select("dl > dt > span").text());         
         String temp = element.select("dl.info_txt1").select("span").text();      
         movie.setCate(temp.substring(0,temp.indexOf("|")));
         movie.setRating(element.select(".num").text().substring(0,4));
         movie.setRank(idx+1);
         idx++;
         list.add(movie);
      }
      return list;
   }
   
  
   
   public  ArrayList<String> GetGenre(){
	   ArrayList<String>list= new ArrayList<String>();
	 
	   Document doc=null;
	   try {
	         doc = Jsoup.connect(url2).get();
	      } catch (IOException e) {
	         throw new RuntimeException("[Error: Crawling fail : "+  e.getMessage()+"]");         
	      }
	   Elements genre=doc.select("table.directory_item_other > tbody > tr > td");
	   for(Element element: genre) {
		   list.add(element.select("a").text());
		   
	   }
	
	   return list;
   }
   
   
   

}