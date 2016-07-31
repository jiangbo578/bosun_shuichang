/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.service.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.person.PersonDao;
import com.gouhai.baoshan.entity.person.Person;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;

	public List<Person> findPerson(String searchName, String code)
			throws ParseException {
		String hql = "from Person where (xm=? or zjhm=?) and  JZDZZJGDM=?";
		System.out.println(hql);
		List<Person> list = personDao
				.findAll(hql, searchName, searchName, code);
		for (int i = 0; i < list.size(); i++) {
			Person person = list.get(i);
			if (person.getXBHZ().equals("男性")) {
				list.get(i).setXBHZ("男");
			} else {
				list.get(i).setXBHZ("女");
			}
		}
		return list;
	}

	// 查询

	public List<Person> getObjList(int pageNumber, String JZDZZJGDM, String code)
			throws ParseException {
		//System.out.println(JZDZZJGDM);
		String hql = "from Person where JZDZZJGDM=? ";
		//System.out.println("请求"+code);
		if (code != null && !code.equals("") && !code.equals("1")) {
			hql += " and( XM like '" + code.trim() + "%' or ZJHM like '"
					+ code.trim() + "%')";
		}
		hql += " order by jzdz";
	//	System.out.println(hql);
		List<Person> list = personDao.findList(hql, pageNumber,
				PageableController.PAGE_SIZE, JZDZZJGDM);
		return list;
	}

	public long getObjCount(String JZDZZJGDM, String code) {
		String hql = "from Person where JZDZZJGDM=? ";
		if (code != null && !code.equals("") && !code.equals("1")) {
			hql += " and( XM like '" + code.trim() + "%' or ZJHM like '"
					+ code.trim() + "%')";
		}

		return personDao.findCount(hql, JZDZZJGDM);
	}

	// 根据居委会编码获取八十岁以上的老人
	public List<Person> getPersonsByCode(String code, Date date) {
		//System.out.println(date);
		return personDao.findAll("from Person where CSRQ<=? and JZDZZJGDM=? ",date, code);
	}
}
