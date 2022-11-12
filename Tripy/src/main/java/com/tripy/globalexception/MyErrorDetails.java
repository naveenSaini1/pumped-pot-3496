package com.tripy.globalexception;

import java.time.LocalDateTime;

public class MyErrorDetails {
	
	private LocalDateTime TimeStamp;
	private String message;
	private String Description;
	public LocalDateTime getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public MyErrorDetails(LocalDateTime timeStamp, String message, String description) {
		super();
		TimeStamp = timeStamp;
		this.message = message;
		Description = description;
	}
	public MyErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyErrorDetails [TimeStamp=" + TimeStamp + ", message=" + message + ", Description=" + Description + "]";
	}
	
	
	

}
