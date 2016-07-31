package com.gouhai.baoshan.service.split;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.split.CopyObjectDao;
import com.gouhai.baoshan.entity.spilt.CopyObject;

@Service
public class CopyObjectService
{
	@Autowired
	private CopyObjectDao copyObjectDao;
	
	public void insertCopyObject(CopyObject copyObject)
	{
		copyObjectDao.insertCopyObject(copyObject);
	}
	
	public List<CopyObject> getCopyObject(String myId)
	{
		return copyObjectDao.getCopyObject(myId);
	}
	
	public void updateCopyObject(CopyObject copyObject)
	{
		copyObjectDao.updateCopyObject(copyObject);
	}
	
	public CopyObject getSingleCopy(String pid)
	{
		return copyObjectDao.getSingleCopyObject(pid);
	}
	
	public CopyObject getByTwo(String myId,String splitId)
	{
		return copyObjectDao.getObjectByTwo(myId, splitId);
	}
	
}
