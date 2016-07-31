package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.PydzbgzDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.fd.Volunteerteam;
import com.gouhai.baoshan.entity.business.dqgz.zb.Pydzbgz;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 党员（群众）评议党支部工作情况
 * 
 * @author sun
 * 
 */
@Service
public class PydzbgzService {

	@Autowired
	private PydzbgzDao pydzbgzDao;

	public List<Pydzbgz> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  pydzbgzDao.findList("from Pydzbgz where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return pydzbgzDao.findCount("from Pydzbgz where businessForm=?", businessForm);
	}
	
	public void insert(Pydzbgz allowance) {
		pydzbgzDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Pydzbgz allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			pydzbgzDao.delete(allowance);
		}
	}

	public Pydzbgz findOne(String id) {
		return pydzbgzDao.findOne(id);
	}
	
	public void update(Pydzbgz allowance, String businessFormId) {
		Pydzbgz findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			
			
			findTwjrhmc.setBadCount(allowance.getBadCount());
			findTwjrhmc.setBaseGoodCount(allowance.getBaseGoodCount());
			findTwjrhmc.setCommonCount(allowance.getCommonCount());
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setGoodCount(allowance.getGoodCount());
			findTwjrhmc.setHost(allowance.getHost());
			findTwjrhmc.setLocale(allowance.getLocale());
			findTwjrhmc.setResult(allowance.getResult());
			findTwjrhmc.setSummary(allowance.getSummary());
			findTwjrhmc.setSum(allowance.getSum());
			
			findTwjrhmc.setUpdateDate(new Date());
			pydzbgzDao.update(findTwjrhmc);
		}
	}

}
