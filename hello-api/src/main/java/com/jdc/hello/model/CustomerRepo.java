package com.jdc.hello.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.hello.model.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
