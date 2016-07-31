/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 可分页的控制器。
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 */
public abstract class PageableController {
	

	/**
	 * 分页，一页条数
	 */
	public final static int PAGE_SIZE = 10;

	protected Map<String, Object> pageResult(List<?> list, long count,
			int current) {
		return pageResult(list, count, current, PAGE_SIZE);
	}

	protected Map<String, Object> pageResult(List<?> list, long count,
			int current, int size) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("datas", list); // 数据列表
		map.put("count", count); // 数据总数
		map.put("current", current); // 当前页码
		map.put("size", size); // 页大小
		map.put("pages", (int) Math.ceil((double) count / size)); // 总页数
		return map;
	}

}
