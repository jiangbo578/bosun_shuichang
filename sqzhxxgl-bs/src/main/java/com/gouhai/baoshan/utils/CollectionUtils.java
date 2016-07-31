/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 集合操作的Utils函数集合
 * 
 * 主要针对Web应用与Hibernate的特征而开发
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class CollectionUtils extends org.springframework.util.CollectionUtils {
	
	private static Logger logger = LoggerFactory.getLogger(CollectionUtils.class);

	private CollectionUtils() {
		
	}
	
	/**
	 * 提取集合中的对象的属性,组合成列表.
	 * 
	 * @param collection
	 *            来源集合.
	 * @param propertityName
	 *            要提取的属性名.
	 */
	public static List<Object> fetchPropertyToList(Collection<?> collection,
			String propertyName){

		List<Object> list = new ArrayList<Object>();
		if (CollectionUtils.isEmpty(collection)) {
			return null;
		}
		try {
			for (Object obj : collection) {
				list.add(PropertyUtils.getProperty(obj, propertyName));
			}
		} catch (IllegalAccessException e) {
			logger.error("IllegalAccessException", e);
		} catch (InvocationTargetException e) {
			logger.error("InvocationTargetException", e);
		} catch (NoSuchMethodException e) {
			logger.error("NoSuchMethodException", e);
		}
		return list;
	}
	/**
	 * 提取集合中的对象的属性,组合成由分割符分隔的字符串.
	 * 
	 * @param collection
	 *            来源集合.
	 * @param propertityName
	 *            要提取的属性名.
	 * @param separator
	 *            分隔符.
	 */
	public static String fetchPropertyToString(Collection<?> collection,
			String propertyName, String separator){
		List<Object> list = fetchPropertyToList(collection, propertyName);
		return StringUtils.join(list, separator);
	}
}
