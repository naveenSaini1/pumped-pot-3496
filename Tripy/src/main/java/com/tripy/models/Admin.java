package com.tripy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	@Size(min = 3,max = 10,message = "pleases enter Minimum three length")
	private String adminName;
	@Email
	private String email;
	@Size(min=4,max=8 ,message = "please enter Your good Password")
	private String passowrd;
	@Max(value = 10)
	@Min(value = 10)
	private String mobile;

}
