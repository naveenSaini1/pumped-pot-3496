package com.tripy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.customerexception.AdminExecption;
import com.tripy.models.Admin;
import com.tripy.repositary.AdminRep;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRep aRepo;

	@Override
	public Admin registerAdmin(Admin admin) throws AdminExecption {
		Admin regAdmin = aRepo.save(admin);
		
		return regAdmin;
	}

	@Override
	public Admin loginAdmin(String userName, String password) throws AdminExecption {
		
		Optional<Admin> admin =  aRepo.findByUserNameAndPassword(userName, password);
		if(admin.isPresent()) {
			return admin.get();
		}else {
			throw new AdminExecption("Admin not found with username "+ userName);
		}
		
	}

	@Override
	public Admin deleteAdminById(Integer id) throws AdminExecption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findAdminById(Integer id) throws AdminExecption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin updateAdmin(Admin id) throws AdminExecption {
		// TODO Auto-generated method stub
		return null;
	}

}
