package com.tripy.models;

import lombok.Data;

@Data
public class AdminLoginDTO {
	
	private String mobileNo;
	private String password;
	
	public AdminLoginDTO() {
		
	}

	public AdminLoginDTO(String mobileNo, String password) {
		super();
		this.mobileNo = mobileNo;
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminLoginDTO [mobileNo=" + mobileNo + ", password=" + password + "]";
	}

}
