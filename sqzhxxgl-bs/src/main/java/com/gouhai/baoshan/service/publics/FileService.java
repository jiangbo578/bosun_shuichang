package com.gouhai.baoshan.service.publics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.publics.FileDao;
import com.gouhai.baoshan.dao.publics.NewsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.business.shgl.xfzsx.Tsjbzx;

import com.gouhai.baoshan.entity.publics.News;
import com.gouhai.baoshan.entity.publics.Upfiles;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class FileService {
    @Autowired
	private FileDao fileDao; 
// 增加
	public void insert(Upfiles files) {
		fileDao.insert(files);
	}

	// 查询
	public Upfiles findOne(String id) {
		return fileDao.findOne(id);
	}

	// 查询
	public Upfiles findByAppid(String appid) {
		String hql="from Upfiles where applyId='"+appid+"'";
		List<Upfiles>  list= fileDao.findAll(hql);
		 if(list.size()>0){
			 
			 return list.get(0);
		 }
		  return null;
		}
	
	// 删除
	public void delete(String id) {
	
		
		fileDao.delete(id);
	}
	public List<Upfiles> getNewsList(int pageNumber) {
	
		List<Upfiles>  list= fileDao.findList("from Upfiles", pageNumber, PageableController.PAGE_SIZE);
	
		return list;
	}
	
	public List<Upfiles> getNewsListbytop(int pageNumber) {
		
		List<Upfiles>  list= fileDao.findList("from Upfiles", pageNumber,8);
	
		return list;
	}
	public long getNewsCount() {
		return fileDao.findCount("from Upfiles");
	}
	
	// 修改
	public void update(Upfiles t) {
		fileDao.update(t);
	}
}
