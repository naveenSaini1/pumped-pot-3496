package com.tripy.frontcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.customerexception.LoginException;
import com.tripy.models.Login;
import com.tripy.services.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService logService;
	
	@PostMapping("login")
	public ResponseEntity<String> Login(@RequestBody Login login) throws LoginException{
		
		String string = logService.loginIntoAccount(login);
		
		return new ResponseEntity<String>(string,HttpStatus.OK);
	}
	
	@DeleteMapping("logout/{key}")
	public ResponseEntity<String> Login(@PathVariable("key") String key) throws LoginException{
		
		String string = logService.logOutFromAccount(key);
		
		return new ResponseEntity<String>(string,HttpStatus.OK);
	}

}
