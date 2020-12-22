package com.cognizant.truyum.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date convertToDate(String date) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date DATE = null;
		try {
			DATE = dateFormat.parse(date);
		} catch (ParseException e) {
			System.out.println(e);
		}
		return DATE;
	}
}
