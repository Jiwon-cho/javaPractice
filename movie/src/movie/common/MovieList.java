package movie.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import movie.dao.MovieDao;
import movie.model.vo.Movie;

public interface MovieList {
	
	static final List<Movie> movieList= MovieDao.getInstance().GetMovieInfo();
	static final List<String> genre= MovieDao.getInstance().GetGenre();
	
	
}
