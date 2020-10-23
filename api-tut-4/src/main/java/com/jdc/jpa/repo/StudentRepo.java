package com.jdc.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.jpa.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
