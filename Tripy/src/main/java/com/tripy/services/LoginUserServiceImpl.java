package com.tripy.services;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tripy.customerexception.LoginException;
import com.tripy.models.CurrentUserSession;
import com.tripy.models.Customers;
import com.tripy.models.LoginUser;
import com.tripy.repositary.CustomerRepository;
import com.tripy.repositary.SessionDao;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginUserServiceImpl implements LoginUserService{

	@Autowired
	private CustomerRepository cRepository;
	
	@Autowired
	private SessionDao sService;
	
	@Override
	public String loginIntoAccount(LoginUser login) throws LoginException {
		// TODO Auto-generated method stub
		Customers existingCust = cRepository.findByEmail(login.getUserId());
		
		if(existingCust == null) {
			throw new LoginException("Please Enter a valid Email");
		}
		
		Optional<CurrentUserSession> validCustomer = sService.findById(existingCust.getCustomerId());
		
		if(validCustomer.isPresent()) {
			throw new LoginException("User already Logged In");
		}
		
		if(existingCust.getPassword().equals(login.getPassword())) {
			
			String ukey  = RandomString.make(6);
			
			CurrentUserSession currentUser = new CurrentUserSession(existingCust.getCustomerId(),ukey,LocalDateTime.now());
			
			sService.save(currentUser);
			
			return "Login successfully..!!\n"+currentUser.toString();
			
		}else {
			throw new LoginException("Please Enter a valid Password");
		}
//		return "hello!";
	}

	@Override
	public String logOutFromAccount(String ukey) throws LoginException {
		

		CurrentUserSession cu = sService.findByUkey(ukey);
		
		if(cu == null) {
			throw new LoginException("User Not Logged In");
		}
		
		sService.delete(cu);
		
		return "Logged Out !";
	}

}
