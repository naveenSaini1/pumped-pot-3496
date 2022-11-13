package com.tripy.services;

import com.tripy.customerexception.LoginException;
import com.tripy.models.LoginUser;

public interface LoginUserService {

	public String loginIntoAccount(LoginUser login) throws LoginException;
	public String logOutFromAccount(String kay) throws LoginException ;
}
