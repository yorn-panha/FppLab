package lab2.pencil;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String socialSecurityStatus;
		int age=60;
		socialSecurityStatus= age>65?"eligible":"ineligible";
		System.out.println(socialSecurityStatus);
		
		String s = "a friendly face";
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.substring(2,9));
		System.out.println(s.substring(4));
		
		System.out.println("----------");
		float i=(3 * 5 / 9 % 2); //% 2);
		System.out.println("i="+i);
		System.out.println(4 ^ 3 & 5);
		System.out.println(13 >> 2 << 2 ^ 4);
		float j=(32 | 16/3 >> 2 & 5);
		System.out.println(j);
		int b;
		int a = (b = 5);
		System.out.println(a);
		System.out.println(b);
		
		int r=2;
		double A=Math.PI*Math.pow(r, 2);
		System.out.println(A);
		int len=13,wid=30;
		double diagonal_length=Math.sqrt((Math.pow(len, 2)+Math.pow(wid, 2)));
		System.out.println(diagonal_length);
		
		
		Date d=new Date();
		//System.out.println(d);
		GregorianCalendar gc=new GregorianCalendar();
		d=gc.getTime();
		System.out.println(d);
		gc.setTime(d);
		
		
		String strFormat=String.format("%tD", d);
		System.out.println(strFormat);
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		String f=df.format(d);
		System.out.println(f);
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.of(2000, 1, 1));
		
		

		
	}
	//Formatting LocalDates as strings and reading date strings as LocalDates
	public static final String DATE_PATTERN = "MM/dd/yyyy";
	public static LocalDate localDateForString(String date) {
	return LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	public static String localDateAsString(LocalDate date) {
	return date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	//// LocalDate <--> GregorianCalendar conversions
	public static LocalDate LocalDateFromGregCalendar(GregorianCalendar cal) {
	return LocalDate.of(cal.get(Calendar.YEAR), 1 + cal.get(Calendar.MONTH),
	cal.get(Calendar.DATE));
	}
	public static GregorianCalendar GregorianCalendarFromLocalDate(LocalDate locDate) {
	return new GregorianCalendar(locDate.getYear(),
	locDate.getMonth().getValue()-1,
	locDate.getDayOfMonth());
	}

}
