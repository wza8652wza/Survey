package com.survey.dao;

import java.util.List;

/**
 * baseDao接口
 * @author apple
 *
 * @param <T>
 */
public interface BaseDao<T> {

	
	public void saveEntity(T t);
	public void saveOrUpdateEntity(T t);
	public void updateEntity(T t);
	public void deleteEntity(T t);
	public void batchEntityByHql(String hql,Object ...objects);
	public void executeSql(String sql,Object ...objects);
	
	public T loadEntity(Integer id);
	public T getEntity(Integer id);
	public List<T> findEntityByHql(String hql,Object...objects);
	//单值检索，确保查询结果只有一个数
	public Object uniqueResult(String hql,Object...objects);
	
	//sql 查询
	public List executeSQLQuery(Class clazz,String sql,Object...objects);
}
