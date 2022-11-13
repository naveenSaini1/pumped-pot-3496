package com.tripy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

public class Travels {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer travelsId;
	private String travelsName;
	private String agentName;
	private String address;
	private String contact;
	public Travels(Integer travelsId, String travelsName, String agentName, String address, String contact) {
		super();
		this.travelsId = travelsId;
		this.travelsName = travelsName;
		this.agentName = agentName;
		this.address = address;
		this.contact = contact;
	}
	public Travels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getTravelsId() {
		return travelsId;
	}
	public void setTravelsId(Integer travelsId) {
		this.travelsId = travelsId;
	}
	public String getTravelsName() {
		return travelsName;
	}
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
