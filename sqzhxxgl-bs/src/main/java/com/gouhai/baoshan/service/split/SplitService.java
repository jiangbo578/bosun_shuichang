package com.gouhai.baoshan.service.split;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.split.SplitDao;
import com.gouhai.baoshan.entity.spilt.Split;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class SplitService {
	@Autowired
	private SplitDao splitDao;

	public String insertSplit(Split split) {
		return splitDao.insertSplit(split);
	}

	public void updateSplit(Split split) {
		splitDao.updateSplit(split);
	}

	public Split getByPid(String pid) {
		return splitDao.getByPid(pid);
	}

	public List<Split> getSplitByStreetId(String streetId) {
		return splitDao.getSplitByStreetId(streetId);
	}

	public List<Split> getSplitByCommitteeId(String committeeId) {
		return splitDao.getSplitByCommitteeId(committeeId);
	}

	public void deleteSplit(Split split) {
		splitDao.deleteSplit(split);
	}

	// 查询
	final static String hql = "from Split where committeeId=? order by realDate";

	public List<Split> getObjList(int pageNumber, String myId) {
		List<Split> d = splitDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, myId);
		return d;
	}

	public long getObjCount(String myId) {
		return splitDao.findCount(hql, myId);
	}
}
