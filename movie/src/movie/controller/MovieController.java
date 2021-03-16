package movie.controller;

import java.util.ArrayList;
import java.util.Scanner;

import movie.dao.MovieDao;
import movie.model.vo.Movie;


public class MovieController {    
   private static MovieDao dao = MovieDao.getInstance();
   //private MainView mv;
   Scanner sc=new Scanner(System.in);
   public void searchAll(){
      ArrayList<Movie> movieList = dao.GetMovieInfo();
      for(Movie movie: movieList) {
         System.out.println(movie.toString());
      }
   }
   
   public void searchName() {
	   ArrayList<Movie> movieList = dao.GetMovieInfo();
		System.out.println("영화 제목을 적으시오: ");
	   String title=sc.next();
	  
	   for(int i=0;i<movieList.size();i++) {
		   if(movieList.get(i).getTit().equals(title)) {
			   System.out.println(movieList.get(i));
		   }
	   }
   }
    
   
   
}