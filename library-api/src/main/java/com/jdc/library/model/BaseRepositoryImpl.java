package com.jdc.library.model;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.util.StringUtils;

public class BaseRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID>{

	private EntityManager em;
	
	public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.em = entityManager;
	}

	@Override
	public Page<T> search(String where, Map<String, Object> params, String orderBy, int current, int limit) {
		Page<T> page = new Page<>();
		page.setCurrent(current);
		page.setLimit(limit);
		page.setTotal(getTotal(where, params));

		
		StringBuffer sb = new StringBuffer(String.format("select t from %s t ", getDomainClass().getSimpleName()));
		
		if(StringUtils.hasLength(where)) {
			sb.append("1 = 1 and ").append(where);
		}
		
		if(StringUtils.hasLength(orderBy)) {
			sb.append("order by ").append(orderBy);
		}
		
		TypedQuery<T> query = em.createQuery(sb.toString(), getDomainClass());
		
		if(null != params) {
			for(String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
 		}
		
		if(current > 0 && limit > 0) {
			var pages = page.getTotal() / limit;
			if(page.getTotal() % limit > 0) {
				pages ++;
			}
			page.setTotalPage((int)pages);
			
			query.setFirstResult(current * limit + 1);
			query.setMaxResults(limit);
		}
		
		page.setList(query.getResultList());
		return page;
	}

	private long getTotal(String where, Map<String, Object> params) {
		StringBuffer sb = new StringBuffer(String.format("select count(t) from %s t ", getDomainClass().getSimpleName()));
		
		if(StringUtils.hasLength(where)) {
			sb.append("1 = 1 and ").append(where);
		}
		
		TypedQuery<Long> query = em.createQuery(sb.toString(), Long.class);
		
		if(null != params) {
			for(String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
 		}
				
		return query.getSingleResult();
	}

}
