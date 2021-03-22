package movie.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class MovieCommon {
	
	public SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	public Date today=new Date();
	public String date=sdf.format(today);
	public Calendar c=Calendar.getInstance();
	public String time=" "+c.get(Calendar.YEAR)+"�� "+(c.get(Calendar.MONTH)+1)+"�� "+c.get(Calendar.DATE)+"�� "
			+(c.get(Calendar.AM_PM)==0?"���� ":"���� ")+c.get(Calendar.HOUR)+"�� "+c.get(Calendar.MINUTE)+"�� "
			+c.get(Calendar.SECOND)+"�� ";
	public static List<String> logList=new ArrayList<String>();
	/**
	 * @param sdf
	 * @param today
	 * @param date
	 * @param c
	 * @param time
	 */
	
	public MovieCommon(SimpleDateFormat sdf, Date today, String date, Calendar c, String time) {
		super();
		this.sdf = sdf;
		this.today = today;
		this.date = date;
		this.c = c;
		this.time = time;
	}
	public MovieCommon() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
