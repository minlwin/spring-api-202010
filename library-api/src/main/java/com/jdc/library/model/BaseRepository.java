package com.jdc.library.model;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID>{

	Page<T> search(String where, Map<String, Object> params, String orderBy, int page, int limit);
	
}
