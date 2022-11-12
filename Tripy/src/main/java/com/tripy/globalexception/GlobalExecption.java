package com.tripy.globalexception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.tripy.customerexception.BookingNotFoundException;

@ControllerAdvice
public class GlobalExecption {
	
	
	@ExceptionHandler(BookingNotFoundException.class)
	public ResponseEntity<Error> myBookingHandller(BookingNotFoundException bnf,WebRequest wr){
		Error e = new Error();
		e.setTimeStamp(LocalDateTime.now());
		e.setMessage(bnf.getMessage());
		e.setDescription(wr.getDescription(false));
		return new ResponseEntity<Error>(e,HttpStatus.BAD_REQUEST);
	}
	

}
