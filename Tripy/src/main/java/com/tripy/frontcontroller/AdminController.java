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
	
	@Autowired(required = true)
	private AdminService adminService;
	
	@PostMapping("/admin")
	public ResponseEntity<String> registerAdmin(@Validated @RequestBody Admin admin) throws AdminExecption {
		
		String saveAdmin = adminService.registerAdmin(admin);
		
		return new ResponseEntity<String>(saveAdmin,HttpStatus.CREATED);
		
	}
	@GetMapping("/admin/{id}")
	public ResponseEntity<Admin> findAdminById(@PathVariable("id") Integer id) throws AdminExecption{
		Admin admin = adminService.findAdminById(id);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<String> deleteAdminByIdHandler(@PathVariable("id") Integer id) throws AdminExecption{
		String deletedAdmin = adminService.deleteAdminById(id);
		return new ResponseEntity<String>(deletedAdmin,HttpStatus.OK);
	}
	
	@PutMapping("/admin/")
	public ResponseEntity<String> updateAdminDetails(@Validated @RequestBody Admin admin,@RequestParam(required = false) String key) throws AdminExecption{
		
		String updatedAdmin = adminService.updateAdminDetails(admin, key);
		
		return new ResponseEntity<String>(updatedAdmin,HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginAdminHandler(@Validated @RequestBody AdminLoginDTO aDto) throws LoginException{
		String string = adminService.adminLogInToAccount(aDto);
		
		return new ResponseEntity<String>(string,HttpStatus.OK);
	}
	
	@PostMapping("/logout")
	public String logoutAdminHandler(@RequestParam(required = false) String key) throws LoginException{
		
		return adminService.adminLogOutFromAccount(key);
	}
	
}
