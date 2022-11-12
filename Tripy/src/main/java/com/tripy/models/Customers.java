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
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cusomterId;
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
	
	

}
