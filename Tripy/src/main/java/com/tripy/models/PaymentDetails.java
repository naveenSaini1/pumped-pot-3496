package com.tripy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer paymentId;
	private String status;
	

}
