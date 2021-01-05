package com.jdc.library.model;

public abstract class BaseService<T, ID> {

	protected BaseRepository<T, ID> repo;

	public BaseService(BaseRepository<T, ID> repo) {
		super();
		this.repo = repo;
	}
	
	public T save(T t) {
		return repo.save(t);
	}
}
