package com.tripy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;



@Entity
@Data
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	@Size(min = 3,max = 10,message = "Name length shoud be minimum 3 and maximum 10")
	private String adminName;
	@Email
	private String email;
	@Size(min=4,message = "Password length shoud be minimum 4")
	private String password;
	@Size(min = 10,max = 10,message = "Mobile length should be minimum and maximum 10")
	private String mobile;
	
	public Admin() {
		
	}

	public Admin(Integer adminId,
			@Size(min = 3, max = 10, message = "Name length shoud be minimum 3 and maximum 10") 
			String adminName,
			@Email String email,
			@Size(min = 4, message = "Password length shoud be minimum 4") 
			String password,
			@Size(min = 10, max = 10, message = "Mobile length should be minimum and maximum 10") 
			String mobile) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + "]";
	}

}
