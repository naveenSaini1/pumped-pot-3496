package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{
	
	public Admin findByMobileNo(String mobileNo);

}
