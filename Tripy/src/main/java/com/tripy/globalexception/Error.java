package com.tripy.globalexception;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {
	
	private LocalDateTime timeStamp;
	private String message;
	private String description;

}
