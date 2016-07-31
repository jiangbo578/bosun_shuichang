package com.gouhai.baoshan.service.publics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.publics.NewsDao;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.publics.News;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class NewsService {
    @Autowired
	private NewsDao newsDao; 
// 增加
	public void insert(News Tsjbzx) {
		newsDao.insert(Tsjbzx);
	}

	// 查询
	public News findOne(String id) {
		return newsDao.findOne(id);
	}

	// 删除
	public void delete(String id) {
		newsDao.delete(id);
	}
	public List<News> getNewsList(int pageNumber) {
	
		List<News>  list= newsDao.findList("from News order by adddate desc", pageNumber, PageableController.PAGE_SIZE);
	
		return list;
	}
	
	public List<News> getNewsListbytop(int pageNumber) {
		
		List<News>  list= newsDao.findList("from News order by adddate desc", pageNumber,8);
	
		return list;
	}
	public long getNewsCount() {
		return newsDao.findCount("from News");
	}
	// 查询
	final static String hql = "from News where businessForm=? order by updateDate";

	public List<News> getLzzList(int pageNumber, BusinessForm businessForm) {
		return newsDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE);
	}

	public long getLzzCount(BusinessForm businessForm) {
		return newsDao.findCount(hql, businessForm);
	}

	// 修改
	public void update(News t) {
		newsDao.update(t);
	}
	//查询全部
	public List<News> getAll(){
		return newsDao.findAll();
	}
}
