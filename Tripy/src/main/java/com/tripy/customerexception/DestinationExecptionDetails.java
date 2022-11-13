package com.tripy.customerexception;

import java.time.LocalDateTime;

public class DestinationExecptionDetails {
	private String name;
	private String desc;
	private LocalDateTime localDate;
	public DestinationExecptionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DestinationExecptionDetails(String name, String desc, LocalDateTime localDate) {
		super();
		this.name = name;
		this.desc = desc;
		this.localDate = localDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDateTime getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDateTime localDate) {
		this.localDate = localDate;
	}
	
	

}
