/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;

import com.gouhai.baoshan.utils.BeanUtils;

/**
 * 封装Hibernate原生API的DAO泛型基类。
 * 
 * 可在Service层直接使用，也可以扩展泛型DAO子类使用。
 * 
 * eg：public class UserDao extends BaseDao<User>
 * 
 * Spring3.1集成Hibernate4不再需要HibernateDaoSupport和HibernateTemplate了，直接使用原生API即可。
 * 
 * @param <T>
 *            DAO操作的对象类型
 * @param <PK>
 *            主键类型
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 * 
 */
public abstract class BaseDao<T, PK extends Serializable> {

	private Class<?> clazz;

	@Autowired
	private SessionFactory sessionFactory;

	public BaseDao() {
		this.clazz = BeanUtils.getSuperClassGenricType(getClass());
	}

	/**
	 * 取得当前Session
	 * 
	 * @return
	 */
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * 保存新增的对象
	 * 
	 * @param t
	 */
	public void insert(T t) {
		getCurrentSession().save(t);
	}

	/**
	 * 保存修改的对象
	 * 
	 * @param t
	 */
	public void update(T t) {
		getCurrentSession().update(t);
	}

	/**
	 * 插入，更新 与saveOrUpdate类似，但是可以对两个持有一样的标识对象进行合并
	 * 
	 * @param t
	 */
	public void merge(T t) {
		getCurrentSession().merge(t);
	}

	/**
	 * 保存新增或修改的对象
	 * 
	 * @param t
	 */
	public void saveOrUpdate(T t) {
		getCurrentSession().saveOrUpdate(t);
	}

	/**
	 * 删除对象
	 * 
	 * @param t
	 */
	public void delete(T t) {
		getCurrentSession().delete(t);
	}

	/**
	 * 按id删除对象
	 * 
	 * @param id
	 */
	public void delete(PK id) {
		delete(findOne(id));
	}

	/***********************************
	 ******* 按HQL查询 *******
	 ***********************************/

	private void setQueryParams(Query query, Object... params) {
		if (null == params) {
			return;
		}
		for (int i = 0, len = params.length; i < len; i++) {

			query.setParameter(i, params[i]);
		}
	}

	private Query createQuery(String hql) {
		Query query = getCurrentSession().createQuery(hql);
		return query;
	}

	/**
	 * 根据查询HQL与参数列表创建Query对象
	 * 
	 * @param hql
	 * @param params
	 *            数量可变的参数,按顺序绑定
	 * @return
	 */
	private Query createQuery(String hql, Object... params) {
		// System.err.println(hql);
		Query query = createQuery(hql);
		setQueryParams(query, params);
		return query;
	}

	/**
	 * 根据查询HQL与参数列表创建Query对象
	 * 
	 * @param hql
	 * @param params
	 *            命名参数,按名称绑定
	 * @return
	 */
	private Query createQuery(String hql, Map<String, Object> params) {
		Query query = createQuery(hql);
		if (params != null) {
			query.setProperties(params);
		}
		return query;
	}

	/**
	 * 按id获取对象
	 * 
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T findOne(PK id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	/**
	 * 按HQL查询唯一对象
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T findOne(String hql, Object... params) {
		return (T) createQuery(hql, params).uniqueResult();
	}

	/**
	 * 按HQL查询第一个对象
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T findTopOne(String hql, Object... params) {
		return (T) createQuery(hql, params).setFirstResult(0).setMaxResults(1)
				.uniqueResult();
	}

	/**
	 * 获取全部对象列表
	 * 
	 * @return
	 */
	public List<T> findAll() {
		String hql = "from " + clazz.getSimpleName();
		return findAll(hql);
	}

	/**
	 * 按HQL查询对象列表
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll(String hql, Object... params) {
		return createQuery(hql, params).list();
	}

	/**
	 * 按HQL查询分页对象列表
	 * 
	 * @param hql
	 * @param recordNum
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> findList(String hql, int pageNumber, int pageSize,
			Object... params) {
		return createQuery(hql, params)
				.setFirstResult((pageNumber - 1) * pageSize)
				.setMaxResults(pageSize).list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findList(String hql, int pageNumber, int pageSize) {
		return createQuery(hql).setFirstResult((pageNumber - 1) * pageSize)
				.setMaxResults(pageSize).list();
	}

	/**
	 * 执行count查询获得本次Hql查询所能获得的对象总数
	 * 
	 * 排除select子句和order by子句
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public long findCount(String hql, Object... params) {
		hql = "from " + StringUtils.substringAfter(hql, "from");
		hql = StringUtils.substringBefore(hql, "order by");
		String countHql = "select count(*) " + hql;
		long count = (Long) createQuery(countHql, params).uniqueResult();
		return count;
	}

	/**
	 * 执行HQL进行批量修改/删除操作
	 * 
	 * @param hql
	 * @param values
	 * @return 更新记录数
	 */
	public int batchExecute(String hql, Object... params) {
		return createQuery(hql, params).executeUpdate();
	}

	/**
	 * 取得对象的主键名
	 * 
	 * @return
	 */
	private String getIdName() {
		ClassMetadata meta = sessionFactory.getClassMetadata(clazz);
		return meta.getIdentifierPropertyName();
	}

	/***********************************
	 ******* 按Criteria查询 *******
	 ***********************************/

}