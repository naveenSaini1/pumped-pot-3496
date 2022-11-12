package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
