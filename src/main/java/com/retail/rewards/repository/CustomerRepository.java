package com.retail.rewards.repository;

import org.springframework.data.repository.CrudRepository;

import com.retail.rewards.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}
