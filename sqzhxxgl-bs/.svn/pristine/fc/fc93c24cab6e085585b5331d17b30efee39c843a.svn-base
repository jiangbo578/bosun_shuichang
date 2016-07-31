/**
 * Copyright (c) www.zouqi.com
 */
package com.gouhai.baoshan.utils.log;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gouhai.baoshan.entity.log.Logger;
import com.gouhai.baoshan.service.log.LoggerService;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class LogHandler {

	@Autowired
	private LoggerService loggerService;

	public void logBefore(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		
		Log log = method.getAnnotation(Log.class);

		if (log != null) {
			Class<?> clazz = method.getDeclaringClass();
			String url = "";
			// 类级别的url映射
			RequestMapping classrequestMapping = clazz.getAnnotation(RequestMapping.class);
			if (classrequestMapping != null) {
				if (classrequestMapping.value().length == 0) {
					url += "/" + clazz.getName();
				} else {
					url += classrequestMapping.value()[0];
				}
			}
			// 方法级别的url映射
			RequestMapping methodRequestMapping = method.getAnnotation(RequestMapping.class);
			if (methodRequestMapping != null) {
				if (methodRequestMapping.value().length == 0) {
					url += "/" + method.getName();
				} else {
					url += methodRequestMapping.value()[0];
				}
			}
			Logger logger = new Logger();
			logger.setUrl(url);
			logger.setMessage(log.value());
			loggerService.insert(logger);
		}

	}

}
