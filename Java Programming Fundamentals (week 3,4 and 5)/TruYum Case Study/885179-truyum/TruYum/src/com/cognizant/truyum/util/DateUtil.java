package com.cognizant.truyum.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 
 *
 */
public class DateUtil {
	
	/**
	 * 
	 * @param date
	 * @return SimpleDateFormat
	 * @throws ParseException
	 */
	public static Date convertToDate(String date) throws ParseException{
		return new SimpleDateFormat("dd/MM/yyyy").parse(date);
	}
}
