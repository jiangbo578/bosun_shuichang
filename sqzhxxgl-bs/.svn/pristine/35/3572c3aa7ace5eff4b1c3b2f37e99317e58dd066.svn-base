/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 反射的Utils函数集合。
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class BeanUtils {

	private static Logger logger = LoggerFactory.getLogger(BeanUtils.class);

	/**
	 * 通过反射，获得Class定义中声明的父类的泛型参数的类型。如无法找到，返回Object.class。
	 * 
	 * eg：public UserDao extends BaseDao<User>
	 * 
	 * @param clazz
	 * @return
	 */
	public static Class<?> getSuperClassGenricType(Class<?> clazz) {
		return getSuperClassGenricType(clazz, 0);
	}

	/**
	 * 通过反射，获得定义Class时声明的父类的泛型参数的类型。如无法找到，返回Object.class。.
	 * 
	 * eg：public UserDao extends BaseDao<User,Long>
	 * 
	 * @param clazz
	 * @param index
	 * @return
	 */
	public static Class<?> getSuperClassGenricType(Class<?> clazz, int index) {

		//返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type。 
		Type type = clazz.getGenericSuperclass();

		if (!(type instanceof ParameterizedType)) {
			logger.warn(clazz.getSimpleName() + "'s superclass not ParameterizedType");
			return Object.class;
		}

		//返回表示此类型实际类型参数的 Type对象的数组 
		Type[] types = ((ParameterizedType) type).getActualTypeArguments();

		if (index >= types.length || index < 0) {
			logger.warn("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: "
					+ types.length);
			return Object.class;
		}
		if (!(types[index] instanceof Class)) {
			logger.warn(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
			return Object.class;
		}

		return (Class<?>) types[index];
	}
}
