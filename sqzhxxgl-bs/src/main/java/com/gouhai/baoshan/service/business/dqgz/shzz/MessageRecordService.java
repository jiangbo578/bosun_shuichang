/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.business.dqgz.shzz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.shzz.MessageRecordDao;
import com.gouhai.baoshan.entity.business.dqgz.shzz.MessageRecord;
import com.gouhai.baoshan.spring.PageableController;
/**
 * 
 * 
 * @author sun 2014-08-011
 *
 */
@Service
public class MessageRecordService {

	@Autowired
	private MessageRecordDao messageRecordDao;

	public List<MessageRecord> getBeanList(String networkerId, int pageNumber) {
		return messageRecordDao.findList("from MessageRecord m where m.networker.id = ?  order by updateDate", pageNumber, PageableController.PAGE_SIZE, networkerId);
	}
	
	public long getBeanCount(String networkerId) {
		return messageRecordDao.findCount("from MessageRecord m where m.networker.id = ?", networkerId);
	}
	
	public void insert(MessageRecord allowance) {
		messageRecordDao.insert(allowance);
	}

	public void delete(String id) {
		MessageRecord allowance = findOne(id);
		messageRecordDao.delete(allowance);
	}

	public MessageRecord findOne(String id) {
		return messageRecordDao.findOne(id);
	}
	
	public void update(MessageRecord allowance) {
		MessageRecord findTwjrhmc = findOne(allowance.getId());
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setContent(allowance.getContent());
			findTwjrhmc.setCount(allowance.getCount());
			findTwjrhmc.setUpdateDate(new Date());
			messageRecordDao.update(findTwjrhmc);
	}

}
