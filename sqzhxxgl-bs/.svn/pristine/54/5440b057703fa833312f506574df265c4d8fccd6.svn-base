package com.gouhai.baoshan.service.split;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.split.LinkManDao;
import com.gouhai.baoshan.entity.spilt.LinkMan;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class LinkManService
{
	@Autowired
	private LinkManDao linkManDao;
	
	public void insertLinkMan(LinkMan linkMan)
	{
		linkManDao.insertLinkMan(linkMan);
	}
	
	public List<LinkMan> getLinkMan(String myId)
	{
		return linkManDao.getLinkMan(myId);
	}
	
	public void updateLinkMan(LinkMan linkMan)
	{
		linkManDao.updateLinkMan(linkMan);
	}
	
	public void deleteLinkMan(LinkMan linkMan)
	{
		linkManDao.deleteLinkMan(linkMan);
	}
	
	public LinkMan getLink(String pid)
	{
		return linkManDao.getLink(pid);
	}
	
	public LinkMan getByTwo(String myId,String splitId)
	{
		return linkManDao.getByTwo(myId, splitId);
	}

	// 查询
	final static String hql = "from LinkMan where myId=? order by sendDate";

	public List<LinkMan> getObjList(int pageNumber, String myId) {
		List<LinkMan> d = linkManDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, myId);
		return d;
	}

	public long getObjCount(String myId) {
		return linkManDao.findCount(hql, myId);
	}
}
