package com.rays.basics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormat {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String myDate = df.format(d);
        System.out.println(myDate);
        Date pDate = df.parse("15/02/2222");
        System.out.println(pDate);
	}

}
