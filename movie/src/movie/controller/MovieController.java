package movie.controller;

import java.util.ArrayList;
import java.util.Scanner;

import movie.dao.MovieDao;
import movie.model.vo.Movie;

public class MovieController {
	private static MovieDao dao = MovieDao.getInstance();
	private static ArrayList<Movie> movieList = dao.GetMovieInfo();
	private static ArrayList<String> genre = dao.GetGenre();
	Scanner sc = new Scanner(System.in);

	public void searchAll() {

		for (Movie movie : movieList) {
			System.out.println(movie.toString());
		}
	}

	public void searchName() {

		System.out.println("영화 제목을 적으시오: ");
		String title = sc.next();

		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTit().contains(title)) {
				System.out.println(movieList.get(i));
			}
		}
	}

	public void serachGenre() {
		for (int i = 0; i < genre.size(); i++) {
			if (i == (genre.size() - 1)) {
				System.out.println((i+1) + " " + genre.get(i));
			} else if (((i + 1) % 3) != 0) {
				System.out.print((i + 1) + " " + genre.get(i) + " ");
			} else if (((i + 1) % 3) == 0) {
				System.out.println((i + 1) + " " + genre.get(i));
			}
		}
		System.out.print("장르 번호 선택: ");
		int a = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getCate().contains(genre.get(a-1))) {
				System.out.println(movieList.get(i));
				flag = true;
			}

		}
		if(flag==false){
			System.out.println("해당 장르의 영화가 없습니다.");}
	}
	
	public void searchRating() {
		System.out.print("찾고자 하는 평점(대)을 입력하시오: ");
		double d=sc.nextDouble();
		int c=(int)d+1;
		for(int i=0;i<movieList.size();i++) {
			double a=Double.parseDouble(movieList.get(i).getRating());
			if(d<=a &&a<c) {
				System.out.println(movieList.get(i));
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
