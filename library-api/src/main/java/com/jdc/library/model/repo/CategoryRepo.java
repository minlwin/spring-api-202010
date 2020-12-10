package com.jdc.library.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.library.model.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
