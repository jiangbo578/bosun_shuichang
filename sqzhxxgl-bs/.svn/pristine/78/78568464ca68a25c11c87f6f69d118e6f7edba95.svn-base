/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.quertz;

import com.gouhai.baoshan.service.business.BusinessService;


/**
 * 如果干事在周期内没创建业务表单，系统自动创建
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
public class CreateBusinessTask {
    //private static final Logger logger = LoggerFactory.getLogger(CreateBusinessTask.class);

	private BusinessService businessService;
	
    public void create() {
    	businessService.createBusinessBySys();
    }

	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}
    
}
