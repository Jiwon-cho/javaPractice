package movie.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import movie.common.MovieCommon;
import movie.common.MovieList;
import movie.dao.MovieDao;
import movie.view.MainView;

public class MovieController extends MovieCommon implements MovieList {
	private static MovieDao dao = MovieDao.getInstance();
	public MainView mv = new MainView();

	Scanner sc = new Scanner(System.in);

	public void MainMovie() {
		dao.LogLoad();
		mv.mainMenu();
	}

	public void Search() {
		mv.search();
	}

	public void searchAll() {
		String movieList = dao.SearchAll();
		logList.add("영화 전체검색 기능 사용 " + time);
		dao.Log(logList);
		mv.Msg(movieList);
	}

	public void searchName() {

		String title = mv.SearchName();
		String movie = dao.SearchName(title);
		logList.add("이름으로 검색 기능 사용/ " + title + " 검색 " + time);
		dao.Log(logList);
		mv.Msg(movie);

	}

	public void serachGenre() {
		int a = mv.SearchGenre();
		String movie = dao.SearchGenre(a);
		logList.add("장르로 검색 기능 사용/ " + genre.get(a - 1) + " 검색 " + time);
		dao.Log(logList);
		mv.Msg(movie);

	}

	public void searchRating() {
		double d = mv.SearchRating();
		String movie = dao.SearchRating(d);
		logList.add("평점으로 검색 기능 사용/ " + d + " 평점 검색 " + time);
		dao.Log(logList);
		mv.Msg(movie);

	}

	public void logPrint() {
		dao.logPrint();
	}

}
