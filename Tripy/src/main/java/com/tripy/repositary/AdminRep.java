package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripy.models.Admin;


public interface AdminRep extends JpaRepository<Admin, Integer>{
	
	

}
