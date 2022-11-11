package com.tripy.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Admin;

@Repository
public interface AdminRep extends JpaRepository<Admin, Integer>{
	
	public Optional<Admin> findByUserNameAndPassword(String userName, String password);

}
