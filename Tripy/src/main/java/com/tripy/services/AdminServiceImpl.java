package com.tripy.services;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.DOMImplementationSource;

import com.tripy.customerexception.AdminExecption;
import com.tripy.models.Admin;
import com.tripy.models.CurrentAdminSession;
import com.tripy.models.AdminLoginDTO;
import com.tripy.repositary.AdminRepo;
import com.tripy.repositary.AdminSessionRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired(required = true)
	private AdminRepo aRepo;
	
	@Autowired(required = true)
	private AdminSessionRepo sessionRepo;

	@Override
	public Admin registerAdmin(Admin admin) throws AdminExecption {
		
		Admin existadmin = aRepo.findByMobile(admin.getMobile());
		
		if(existadmin != null)
			throw new AdminExecption("Admin already registered with mobile number "+admin.getMobile());
		
		return aRepo.save(admin);
	}

	@Override
	public Admin deleteAdminById(Integer id) throws AdminExecption {
		
		Optional<Admin> opt= aRepo.findById(id);
		if(opt.isPresent()) {
			Admin admin = opt.get();
			aRepo.delete(admin);
			return admin;
		}else {
			throw new AdminExecption("Account not found with id "+id);
		}
	}

	@Override
	public Admin findAdminById(Integer id) throws AdminExecption {
		
		return aRepo.findById(id).orElseThrow(()->new AdminExecption("Account does not found with id: "+id));
		
	}

	@Override
	public Admin updateAdminDetails(Admin admin, String key) throws AdminExecption {
		
		CurrentAdminSession loggedAdmin = sessionRepo.findByAdId(key);
		
		if(loggedAdmin == null) {
			throw new AdminExecption("Please provide valid key to update details");
		}
		
		if(admin.getAdminId()==loggedAdmin.getAdminId()) {
			return aRepo.save(admin);
		}else
		throw new AdminExecption("Invalid admin details, please login first");
	}

	@Override
	public String adminLogInToAccount(AdminLoginDTO adminLoginDTO) throws LoginException {
		
		Admin existingAdmin= aRepo.findByMobile(adminLoginDTO.getMobileNo());
		
		if(existingAdmin == null) {
			throw new LoginException("Please enter a valid moblie number");
		}
		
		Optional<CurrentAdminSession> validOptional = sessionRepo.findById(existingAdmin.getAdminId());
		
		if (validOptional.isPresent()) {
			throw new LoginException("Already logged in with this number "+existingAdmin.getMobile());
		}
		
		if (existingAdmin.getPassword().equals(adminLoginDTO.getPassword())) {
			
			String keyString = RandomString.make(6);
			
			CurrentAdminSession currentSession = new CurrentAdminSession(existingAdmin
													.getAdminId(),keyString,LocalDateTime.now());
			
			sessionRepo.save(currentSession);
			
			return currentSession.toString();
			
		}else 
			throw new LoginException("Please enter a valid password");
		
	}

	@Override
	public String adminLogOutFromAccount(String key) throws LoginException {
		
		CurrentAdminSession adminCurrentSession = sessionRepo.findByAdId(key);
		
		if(adminCurrentSession == null)
			throw new LoginException("User not logged in with this number");
		
		sessionRepo.delete(adminCurrentSession);
		return "Logged Out Successfully !";
	}

	

}
