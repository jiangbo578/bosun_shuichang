package com.gouhai.baoshan.service.mould;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.mould.MouldDao;
import com.gouhai.baoshan.dao.mould.Mould_GatherDao;
import com.gouhai.baoshan.entity.business.Business;
import com.gouhai.baoshan.entity.mould.Mould;
import com.gouhai.baoshan.entity.mould.Mould_Gather;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * @author 徐舟
 * 
 *         2014-9-30
 */
@Service
public class MouldService {
	@Autowired
	private MouldDao mouldDao;
	@Autowired
	private Mould_GatherDao gatherDao;
	private final static String hql = "from Mould  order by updateDate";

	// 增加
	public void insert(Mould t, String code) {
		mouldDao.insert(t);
		String[] str = code.split("%");
		Mould_Gather gather = null;
		for (int i = 0; i < str.length; i++) {
			gather = new Mould_Gather();
			gather.setBusiness(new Business(str[i]));
			gather.setMould(t);
			gatherDao.insert(gather);
		}
	}

	// 查询
	public Mould findOne(String id) {
		return mouldDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		gatherDao.batchExecute("delete from Mould_Gather where mould=?",
				new Mould(id));
		mouldDao.delete(id);
	}

	// 查询
	public List<Mould> getObjList(int pageNumber) {
		return mouldDao.findList(hql, pageNumber, PageableController.PAGE_SIZE);
	}

	// 查询全部
	public List<Mould> getAll() {
		return mouldDao.findAll();
	}

	public long getObjCount() {

		return mouldDao.findCount(hql);
	}

	// 修改
	public void update(Mould t, String code) {
		String[] str = code.split("%");
		Mould_Gather gather = null;
		gatherDao.batchExecute("delete from Mould_Gather where mould=?", t);
		for (int i = 0; i < str.length; i++) {
			gather = new Mould_Gather();
			gather.setBusiness(new Business(str[i]));
			gather.setMould(t);
			gatherDao.insert(gather);
		}
		mouldDao.update(t);
	}

	// 根据ID查询
	public List<Mould_Gather> getGathers(Mould mould) {
		return gatherDao.findAll("from Mould_Gather where mould=?", mould);
	}

}
