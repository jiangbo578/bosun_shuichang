package com.gouhai.baoshan.service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ExportDao;
import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;

/**
 * 公用的导出方法
 * 
 * @author 徐舟
 * 
 */
@Service
public class ExportService {
	@Autowired
	private ExportDao exportDao;
	public List<BaseEntity> getObjList(BusinessForm businessForm, String code,String hylb) {
		String hql = "from " + code + " where businessForm=?";
		//System.out.println(hylb);
		if(code.equals("Hyjl")&&hylb!=null){
			hql+=" and hylb like '%"+hylb+"%'";
		}
		return exportDao.findAll(hql, businessForm);
	}
}
