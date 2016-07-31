package com.gouhai.baoshan.service.business.ggfw.cjrgz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.business.ggfw.cjrgz.FcbkjdryDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.Fcbkjdry;
import com.gouhai.baoshan.entity.business.ggfw.cjrgz.head.Fcbkjd;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 党员干部扶残帮困结对记录业务层
 * 
 * @author 徐舟
 * 
 */
@Service
public class FcbkjdryService {

	@Autowired
	private FcbkjdryDao fcbkjdryDao;

	// 查询
	final static String hql = "from Fcbkjdry where fcbkjd=? order by updateDate";

	public List<Fcbkjdry> getObjList(int pageNumber, Fcbkjd fcbkjd) {
		return fcbkjdryDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, fcbkjd);
	}

	public long getObjCount( Fcbkjd fcbkjd) {
		return fcbkjdryDao.findCount(hql, fcbkjd);
	}

	// 增加
	public void insert(Fcbkjdry t) {
		fcbkjdryDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		fcbkjdryDao.delete(id);
	}

	// 修改
	public void update(Fcbkjdry t) {
		fcbkjdryDao.update(t);
	}

	public Fcbkjdry findOne(String id) {
		return fcbkjdryDao.findOne(id);
	}
}
