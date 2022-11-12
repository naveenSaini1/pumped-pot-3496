package com.tripy.frontcontroller;

import javax.security.auth.login.LoginException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.customerexception.AdminExecption;
import com.tripy.models.Admin;
import com.tripy.models.AdminLoginDTO;
import com.tripy.services.AdminService;

import net.bytebuddy.utility.RandomString;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> registerAdmin(@RequestBody Admin admin) throws AdminExecption {
		
		Admin saveAdmin = adminService.registerAdmin(admin);
		
		return new ResponseEntity<Admin>(saveAdmin,HttpStatus.CREATED);
		
	}
	@GetMapping("/admin/{id}")
	public ResponseEntity<Admin> findAdminById(@PathVariable("id") Integer id) throws AdminExecption{
		Admin admin = adminService.findAdminById(id);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<Admin> deleteAdminByIdHandler(@PathVariable("id") Integer id) throws AdminExecption{
		Admin deletedAdmin = adminService.deleteAdminById(id);
		return new ResponseEntity<Admin>(deletedAdmin,HttpStatus.OK);
	}
	
	@PutMapping("/admin/")
	public ResponseEntity<Admin> updateAdminDetails(@RequestBody Admin admin,@RequestParam(required = false) String key) throws AdminExecption{
		
		Admin updatedAdmin = adminService.updateAdminDetails(admin, key);
		
		return new ResponseEntity<Admin>(updatedAdmin,HttpStatus.OK);
	}
	
	@PostMapping("/admin/login")
	public ResponseEntity<String> loginAdminHandler(@PathVariable("login") @RequestBody AdminLoginDTO aDto) throws LoginException{
		String string = adminService.adminLogInToAccount(aDto);
		
		return new ResponseEntity<String>(string,HttpStatus.OK);
	}
	
	@PostMapping("/admin/logout")
	public String logoutAdminHandler(@PathVariable("logout") @RequestParam(required = false) String key) throws LoginException{
		
		return adminService.adminLogOutFromAccount(key);
	}
	
}
