package com.gouhai.baoshan.service.business.dqgz.zb;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.dqgz.zb.NdzzshgkDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.dqgz.zb.Ndzzshgk;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 党员（群众）评议党支部工作情况
 * 
 * @author sun
 * 
 */
@Service
public class NdzzshgkService {

	@Autowired
	private NdzzshgkDao ndzzshgkDao;

	public List<Ndzzshgk> getBeanList(BusinessForm businessForm, int pageNumber) {
		return  ndzzshgkDao.findList("from Ndzzshgk where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getBeanCount(BusinessForm businessForm) {
		return ndzzshgkDao.findCount("from Ndzzshgk where businessForm=?", businessForm);
	}
	
	public void insert(Ndzzshgk allowance) {
		ndzzshgkDao.insert(allowance);
	}

	public void delete(String id, String businessFormId) {
		Ndzzshgk allowance = findOne(id);
		if (allowance.getBusinessForm().getId().equals(businessFormId)) {
			ndzzshgkDao.delete(allowance);
		}
	}

	public Ndzzshgk findOne(String id) {
		return ndzzshgkDao.findOne(id);
	}
	
	public void update(Ndzzshgk allowance, String businessFormId) {
		Ndzzshgk findTwjrhmc = findOne(allowance.getId());
		if (findTwjrhmc.getBusinessForm().getId().equals(businessFormId)) {
			findTwjrhmc.setTopic(allowance.getTopic());
			findTwjrhmc.setType(allowance.getType());
			findTwjrhmc.setDate(allowance.getDate());
			findTwjrhmc.setLocale(allowance.getLocale());
			findTwjrhmc.setSummaryRecord(allowance.getSummaryRecord());
			findTwjrhmc.setUpdateDate(new Date());
			ndzzshgkDao.update(findTwjrhmc);
		}
	}

}
