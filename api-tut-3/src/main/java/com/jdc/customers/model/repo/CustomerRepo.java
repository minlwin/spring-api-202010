package com.jdc.customers.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.customers.model.entity.Customer;

public interface CustomerRepo extends  JpaRepository<Customer, Integer> {

}
