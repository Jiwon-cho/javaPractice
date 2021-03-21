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
//	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//	private Date today=new Date();
//	private String date=sdf.format(today);
//	private Calendar c=Calendar.getInstance();
//	private String time=" "+c.get(Calendar.YEAR)+"년 "+(c.get(Calendar.MONTH)+1)+"월 "+c.get(Calendar.DATE)+"일 "
//			+(c.get(Calendar.AM_PM)==0?"오전 ":"오후 ")+c.get(Calendar.HOUR)+"시 "+c.get(Calendar.MINUTE)+"분 "
//			+c.get(Calendar.SECOND)+"초 ";

	Scanner sc = new Scanner(System.in);

	public void MainMovie() {
		dao.LogLoad();
		mv.mainMenu(this);
	}

	public void Search() {
		mv.search(this);
	}

	public void searchAll() {
		String movieList = dao.SearchAll();
		logList.add("영화 전체검색 기능 사용 "+time);
		dao.Log(logList);
		mv.Msg(movieList);
	}

	public void searchName() {

		String title = mv.SearchName();
		String movie = dao.SearchName(title);
		logList.add("이름으로 검색 기능 사용/ "+title+" 검색 "+time);
		dao.Log(logList);
		mv.Msg(movie);

	}

	public void serachGenre() {
		int a = mv.SearchGenre();
		String movie = dao.SearchGenre(a);
		logList.add("장르로 검색 기능 사용/ "+genre.get(a-1)+" 검색 "+time);
		dao.Log(logList);
		mv.Msg(movie);

	}

	public void searchRating() {
		double d = mv.SearchRating();
		String movie = dao.SearchRating(d);
		logList.add("평점으로 검색 기능 사용/ "+d+" 평점 검색 "+time);
		dao.Log(logList);
		mv.Msg(movie);

	}
	
	public void logPrint() {
		dao.logPrint();
	}
	
	
	

}
