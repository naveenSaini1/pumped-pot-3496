package com.tripy.globalexception;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class GlobalExecption {
	
	
	@ExceptionHandler(ReportException.class)
	public ResponseEntity<MyErrorDetails> packageExceptionHandler(ReportException re, WebRequest req){
		MyErrorDetails red = new MyErrorDetails();
		red.setTimestamp(LocalDateTime.now());
		red.setMessage(re.getMessage());
		red.setDescription(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(red,HttpStatus.BAD_REQUEST);
	}
	

}
