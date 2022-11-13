package com.tripy.services;

import com.tripy.customerexception.LoginException;
import com.tripy.models.Login;

public interface LoginService {

	public String loginIntoAccount(Login login) throws LoginException;
	public String logOutFromAccount(String kay) throws LoginException ;
}
