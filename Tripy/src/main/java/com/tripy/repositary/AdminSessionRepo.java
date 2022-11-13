package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripy.models.CurrentAdminSession;

public interface AdminSessionRepo extends JpaRepository<CurrentAdminSession, Integer>{
	
	public CurrentAdminSession findByAdId(String adId);
}
