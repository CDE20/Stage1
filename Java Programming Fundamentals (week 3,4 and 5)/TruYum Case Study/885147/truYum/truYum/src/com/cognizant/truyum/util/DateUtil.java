package com.cognizant.truyum.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	public static Date convertToDate(String date) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		Date dateObj = null;
		try {
			dateObj = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return dateObj;
	}
}