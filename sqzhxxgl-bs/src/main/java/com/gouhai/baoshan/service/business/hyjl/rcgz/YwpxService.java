package com.gouhai.baoshan.service.business.hyjl.rcgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.hyjl.rcgz.YwpxDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.hyjl.rcgz.Ywpx;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 业务培训(学习)记录  业务层
 * 
 * @author MedivhQ
 * 
 */
@Service
public class YwpxService {
	@Autowired
	private YwpxDao ywpxDao;

	public List<Ywpx> getYwpxList(BusinessForm businessForm, int pageNumber) {
		return ywpxDao.findList("from Ywpx where businessForm=? order by updateDate", pageNumber, PageableController.PAGE_SIZE, businessForm);
	}
	
	public long getYwpxCount(BusinessForm businessForm) {
		return ywpxDao.findCount("from Ywpx where businessForm=?", businessForm);
	}
	
	public void insert(Ywpx Ywpx) {
		ywpxDao.insert(Ywpx);
	}

	public void delete(String id, String businessFormId) {
		Ywpx ywpx = findOne(id);
		if (ywpx.getBusinessForm().getId().equals(businessFormId)) {
			ywpxDao.delete(ywpx);
		}
	}

	public Ywpx findOne(String id) {
		return ywpxDao.findOne(id);
	}
	
	public void update(Ywpx ywpx, String businessFormId) {
		Ywpx findYwpx = findOne(ywpx.getId());
		if (findYwpx.getBusinessForm().getId().equals(businessFormId)) {
			findYwpx.setBbmc(ywpx.getBbmc());
			findYwpx.setBzrs(ywpx.getBzrs());
			findYwpx.setCxfw(ywpx.getCxfw());
			findYwpx.setDd(ywpx.getDd());
			findYwpx.setId(ywpx.getId());
			findYwpx.setJxks(ywpx.getJxks());
			findYwpx.setPxnr(ywpx.getPxnr());
			findYwpx.setPxqx(ywpx.getPxqx());
			findYwpx.setRs(ywpx.getRs());
			findYwpx.setSj(ywpx.getSj());
			findYwpx.setSsywx(ywpx.getSsywx());
			findYwpx.setType(ywpx.getType());
			findYwpx.setZjr(ywpx.getZjr());
			ywpxDao.update(findYwpx);
		}
	}

	public void setYwpxDao(YwpxDao ywpxDao) {
		this.ywpxDao = ywpxDao;
	}
	
	
}
