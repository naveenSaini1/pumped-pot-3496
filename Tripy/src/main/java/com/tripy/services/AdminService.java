package com.tripy.services;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.tripy.customerexception.AdminExecption;
import com.tripy.models.Admin;
import com.tripy.models.AdminLoginDTO;
import com.tripy.models.Customers;

public interface AdminService {
	
	public String registerAdmin(Admin admin) throws AdminExecption;
	public String deleteAdminById(Integer id) throws AdminExecption;
	public Admin findAdminById(Integer id) throws AdminExecption;
	public String updateAdminDetails(Admin admin,String key) throws AdminExecption;
	
	public String adminLogInToAccount(AdminLoginDTO adminLoginDTO) throws LoginException;
	
	public String adminLogOutFromAccount(String key) throws LoginException;
}
