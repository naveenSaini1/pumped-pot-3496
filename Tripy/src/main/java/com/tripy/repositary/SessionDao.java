package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.CurrentUserSession;

@Repository
public interface SessionDao extends JpaRepository<CurrentUserSession, Integer>{

	public CurrentUserSession findByKey(String key);
	
}
