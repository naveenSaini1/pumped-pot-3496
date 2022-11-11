package com.tripy.services;

import java.util.List;

import com.tripy.customerexception.AdminExecption;
import com.tripy.models.Admin;
import com.tripy.models.Customers;

public interface AdminService {
	
	public Admin registerAdmin(Admin admin) throws AdminExecption;
	public Admin loginAdmin(String userName,String password) throws AdminExecption;
	public Admin deleteAdminById(Integer id) throws AdminExecption;
	public Admin findAdminById(Integer id) throws AdminExecption;
	public Admin updateAdmin(Admin id) throws AdminExecption;
	
	


}
