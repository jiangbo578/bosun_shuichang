package com.gouhai.baoshan.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * 工具类
 * 
 * @author yangsj
 * 
 */
public class Utils {

	public static String show(Object obj) {
		return obj != null ? obj.toString() : "";
	}

	/**
	 * 取配置文件节点
	 * 
	 * @param properties
	 *            properties文件
	 * @param attrNode
	 *            节点属性
	 * */
	public static String getBundelPath(String properties, String attrNode) {
		Locale myLocale = Locale.getDefault();
		ResourceBundle bundle = ResourceBundle.getBundle(properties, myLocale);
		return bundle.getString(attrNode);
	}

	/** 生成UUID */
	public static String generID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 对比日期
	 * 
	 * @param date1
	 *            日期一
	 * @param date2
	 *            日期二
	 * @author Administrator
	 * @return 两个日期相差的天数，前面的日期要小于后面的日期
	 * */
	public static int dateContrast(String date1, String date2) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(sdf.parse(date1));
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(sdf.parse(date2));
		long l = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		int days = new Long(l / (1000 * 60 * 60 * 24)).intValue();
		return days;
	}

	/**
	 * 日期格式转化
	 * 
	 * @param date
	 * @param string
	 * @return
	 */
	public static String FormatDate(Date date, String string) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat dateformat = new SimpleDateFormat(string);
		return dateformat.format(date);
	}

	/**
	 * 返回字符串指令的日期格式
	 * 
	 * @param timeString
	 *            需要转化的字符串
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date parseFormatted(String timeString, String format)
			throws ParseException {
		Date date = null;

		if (timeString == null || timeString.equals(""))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		date = sdf.parse(timeString);
		return date;
	}

	/**
	 * 比较日期
	 * 
	 * @param t1
	 *            日期1
	 * @param t2
	 *            日期2
	 * @return true:t1>t2,false:t1<t2
	 */
	public static boolean compareDate(Date t1, Date t2) {
		return t1.after(t2);
	}

	/**
	 * 获取现在日期
	 *  
	 * @return 现在日期 yyyy-MM-dd

	 * @throws ParseException
	 */
	public static Date getDateNow() throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String sndate = df.format(new Date());
		return df.parse(sndate);
	}

	/**
	 * 获取现在日期
	 * 
	 * @return 现在日期 yyyy-MM-dd HH:mm:ss
	
	 * @throws ParseException
	 */
	public static Date getDateNows() throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sndate = df.format(new Date());
		return df.parse(sndate);
	}

	/**
	 * 判断指定日期是否在今天days天以后（用来提示过期警告）
	 * 
	 * @param t
	 * @param days
	 * @return
	 */
	public static boolean earlyDays(Date t, int days) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, days);
		return compareDate(t, c.getTime());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.MONTH, 1);

		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.MONTH, 2);
		// System.out.println(Utils.compareDate(c1.getTime(), c2.getTime()));
		System.out.println(Utils.earlyDays(c1.getTime(), 29));
	}

	public static String escape(String src) {
		int i;
		char j;
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length() * 6);
		for (i = 0; i < src.length(); i++) {
			j = src.charAt(i);
			if (Character.isDigit(j) || Character.isLowerCase(j)
					|| Character.isUpperCase(j))
				tmp.append(j);
			else if (j < 256) {
				tmp.append("%");
				if (j < 16)
					tmp.append("0");
				tmp.append(Integer.toString(j, 16));
			} else {
				tmp.append("%u");
				tmp.append(Integer.toString(j, 16));
			}
		}
		return tmp.toString();
	}

	public static String unescape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length());
		int lastPos = 0, pos = 0;
		char ch;
		while (lastPos < src.length()) {
			pos = src.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (src.charAt(pos + 1) == 'u') {
					ch = (char) Integer.parseInt(src
							.substring(pos + 2, pos + 6), 16);
					tmp.append(ch);
					lastPos = pos + 6;
				} else {
					ch = (char) Integer.parseInt(src
							.substring(pos + 1, pos + 3), 16);
					tmp.append(ch);
					lastPos = pos + 3;
				}
			} else {
				if (pos == -1) {
					tmp.append(src.substring(lastPos));
					lastPos = src.length();
				} else {
					tmp.append(src.substring(lastPos, pos));
					lastPos = pos;
				}
			}
		}
		return tmp.toString();
	}

}
