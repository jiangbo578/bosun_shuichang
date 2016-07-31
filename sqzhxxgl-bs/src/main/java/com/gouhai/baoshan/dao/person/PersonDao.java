/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.dao.person;

import org.springframework.stereotype.Repository;

import com.gouhai.baoshan.dao.BaseDao;
import com.gouhai.baoshan.entity.person.Person;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
@Repository
public class PersonDao extends BaseDao<Person, String> {

	public Person getPersonByCardId(String cardid) {
		String sql = "from bs_person as bs where bs.cardid=?";
        return findOne(sql, cardid); 
	}
}
