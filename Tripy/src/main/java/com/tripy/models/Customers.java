package com.tripy.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	@Size(min = 3) 
	private String customerName;
	@Size(min = 4)
	private String password;
	@Email
	private String email;
	@Size(min = 10 ,max = 10,message = "Please Enter the 10 Digit Mobile Number")
	private String mobile;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Destination> routes=new ArrayList<>(); 
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}

	public Customers(Integer customerId, @Size(min = 3) String customerName, @Size(min = 4) String password,
			@Email String email,
			@Size(min = 10, max = 10, message = "Please Enter the 10 Digit Mobile Number") String mobile,
			List<Destination> routes) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.routes = routes;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Destination> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Destination> routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", email=" + email + ", mobile=" + mobile + ", routes=" + routes + "]";
	}
	
	

}
