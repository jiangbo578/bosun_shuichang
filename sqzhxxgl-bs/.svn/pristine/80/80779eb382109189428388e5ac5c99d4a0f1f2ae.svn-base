/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/**
 * 字符串操作辅助工具
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 */
public final class StringUtil {
    
    private final static Logger logger = Logger.getLogger(StringUtil.class);
    
    /**
     * 判断字符串是否为空
     * @param s
     * @return 
     */
    public static boolean isEmpty(String s){
        return s == null || s.trim().length() == 0;
    }

    public static boolean isNotEmpty(String s){
        return !isEmpty(s);
    }
    
    /**
     * 判断字符串是否全为英文字母
     * @param s
     * @return 
     */
    public static boolean isAllLetter(String s){
        String regex = "[a-zA-Z]+";
        Pattern p = Pattern.compile(regex);
        return p.matcher(s).matches();
    }
    
    /**
     * 判断字符串是否全为数字
     * @param s
     * @return 
     */
    public static boolean isAllDigit(String s){
        String regex = "\\d+";
        Pattern p = Pattern.compile(regex);
        return p.matcher(s).matches();
    }
    
    /**
     * 用MD5对字符串进行加密
     * @param s
     * @return 
     */
    public static String encodeMD5(String s){
        if(isEmpty(s)){
            return null;
        }
        MessageDigest md = null;
        try{
            md = MessageDigest.getInstance("MD5");
        }catch (NoSuchAlgorithmException ex) {
            logger.error(ex.getMessage(), ex);
            return null;
        }
        char[] hexDigits = { '0', '1', '2', '3', '4',
                             '5', '6', '7', '8', '9',
                             'A', 'B', 'C', 'D', 'E', 'F' };
        md.update(s.getBytes());
        byte[] datas = md.digest();
        int len = datas.length;
        char str[] = new char[len * 2];
        int k = 0;
        for (int i = 0; i < len; i++) {
            byte byte0 = datas[i];
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
    }

    /**
     * 获取文件的后缀名
     * @param filename
     * @return 
     */
    public static String getExt(String filename){
        String ext = null;
        int index = filename.lastIndexOf(".");
        if(index > 0){
            ext = filename.substring(index + 1).toLowerCase();
        }
        return ext;
    }
}
