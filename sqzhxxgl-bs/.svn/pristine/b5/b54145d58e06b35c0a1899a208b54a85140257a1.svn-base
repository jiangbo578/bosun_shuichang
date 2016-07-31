/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;


/**
 * 时间工具类
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
public class DateTimeUtil {

	
	public static final Logger logger = Logger.getLogger(DateTimeUtil.class);
	public static final String PATTERN_LONG = "yyyy-MM-dd HH:mm:ss";
	public static final String PATTERN_SHORT = "yyyy-MM-dd";
	public static final String PATTERN_MM月dd日 = "MM月dd日";
	
	/**
	 * Date转String型
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String getDateToString(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}
	
	/**
	 * String转Date型
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Date getStringToDate(String date, String pattern) {
		Date newDate = null;
		try {
			newDate = new SimpleDateFormat(pattern).parse(date);
		} catch (ParseException e) {
			logger.error("DateTimeUtil.getStringToDate() error");
		} 
		return newDate;
	}
	
	public static Date getYMDDate(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(new Date());
		cal1.set(Calendar.MONTH, cal.get(Calendar.MONTH));
		cal1.set(Calendar.DAY_OF_YEAR, cal.get(Calendar.DAY_OF_YEAR));
		cal1.set(Calendar.HOUR_OF_DAY, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		return cal1.getTime();
	}
	
	public static void main(String[] args) {
        String str = "Mon Jun 23 00:00:00 CST 2014";
        Date date = parse(str, "EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        System.out.printf("%tF %<tT%n", date);
        
    	System.err.println(getDateToString(new Date(), "MM月dd日"));

    	Calendar cal = Calendar.getInstance();
		cal.setTime(DateTimeUtil.getStringToDate(DateTimeUtil.getDateToString(new Date(), DateTimeUtil.PATTERN_MM月dd日), DateTimeUtil.PATTERN_MM月dd日));
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(new Date());
		cal1.set(Calendar.MONTH, cal.get(Calendar.MONTH));
		cal1.set(Calendar.DAY_OF_YEAR, cal.get(Calendar.DAY_OF_YEAR));
		cal1.set(Calendar.HOUR_OF_DAY, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		System.err.println(cal1.getTime());
    }
 
    public static Date parse(String str, String pattern, Locale locale) {
        if(str == null || pattern == null) {
            return null;
        }
        try {
            return new SimpleDateFormat(pattern, locale).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    public static String format(Date date, String pattern, Locale locale) {
        if(date == null || pattern == null) {
            return null;
        }
        return new SimpleDateFormat(pattern, locale).format(date);
    }

}
