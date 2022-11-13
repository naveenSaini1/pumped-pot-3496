package com.tripy.models;

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
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer busId;
	private String busType;
	private String busNumber;
	private Integer capacity;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBusId() {
		return busId;
	}
	public void setBusId(Integer busId) {
		this.busId = busId;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Travels getTravels() {
		return travels;
	}
	public void setTravels(Travels travels) {
		this.travels = travels;
	}
	public Bus(Integer busId, String busType, String busNumber, Integer capacity, Travels travels) {
		super();
		this.busId = busId;
		this.busType = busType;
		this.busNumber = busNumber;
		this.capacity = capacity;
		this.travels = travels;
	}
	@OneToOne(cascade = CascadeType.ALL)
	private Travels travels;
	

}
