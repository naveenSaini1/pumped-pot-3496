package com.tripy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity


public class Package {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer packageId;
	private String packageName;
	private String packageDescription;
	private String packageType;
	private double packageCost;
	@OneToOne(cascade = CascadeType.ALL)
	private PaymentDetails payment;
	@OneToOne(cascade = CascadeType.ALL)
	private Hotel hotel;
	@OneToOne(cascade = CascadeType.ALL)
	private Route route;
	public Package(Integer packageId, String packageName, String packageDescription, String packageType,
			double packageCost, PaymentDetails payment, Hotel hotel, Route route) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.payment = payment;
		this.hotel = hotel;
		this.route = route;
	}
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	public PaymentDetails getPayment() {
		return payment;
	}
	public void setPayment(PaymentDetails payment) {
		this.payment = payment;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
