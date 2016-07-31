/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.activiti;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public class ShujiClaimTaskListener implements TaskListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void notify(DelegateTask delegateTask) {
		delegateTask.setAssignee((String) delegateTask.getVariable("shujiId"));
	}

}
