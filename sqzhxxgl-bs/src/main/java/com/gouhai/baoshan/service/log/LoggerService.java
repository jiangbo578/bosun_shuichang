/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.log;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.BaseDao;
import com.gouhai.baoshan.entity.log.Logger;
import com.gouhai.baoshan.service.BaseService;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
@Service
public class LoggerService extends BaseService<Logger, String>{

    @Resource(name = "loggerDao")
    public void setDao(BaseDao<Logger, String> dao) {  
        super.setDao(dao);  
    }
    
    public void mergeUser(){

		System.out.println("toAdd~~~~");
		Logger logger = new Logger();
		logger.setUrl("url~~~");
		logger.setMessage("message");
		insert(logger);
		
		System.out.println("toAdd2~~~~~");
		Logger logger2 = new Logger();
		logger2.setUrl("url2~~~");
		logger2.setMessage("message2");
		insert(logger2);
    }
}
