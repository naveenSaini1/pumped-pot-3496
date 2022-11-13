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
	
	@ExceptionHandler(AdminExecption.class)
	public ResponseEntity<MyErrorDetails> adminexceptionHandler(AdminExecption ae , WebRequest req) {
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ae.getMessage());
		err.setDescription(req.getDescription(false));
	
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(BookingNotFoundException.class)
	public ResponseEntity<Error> myBookingHandller(BookingNotFoundException bnf,WebRequest wr){
		Error e = new Error();
		e.setTimeStamp(LocalDateTime.now());
		e.setMessage(bnf.getMessage());
		e.setDescription(wr.getDescription(false));
		return new ResponseEntity<Error>(e,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<Error> myCustomerHandller(CustomerNotFoundException bnf,WebRequest wr){
		Error e = new Error();
		e.setTimeStamp(LocalDateTime.now());
		e.setMessage(bnf.getMessage());
		e.setDescription(wr.getDescription(false));
		return new ResponseEntity<Error>(e,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<Error> myCustomerHandller(LoginException bnf,WebRequest wr){
		Error e = new Error();
		e.setTimeStamp(LocalDateTime.now());
		e.setMessage(bnf.getMessage());
		e.setDescription(wr.getDescription(false));
		return new ResponseEntity<Error>(e,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> ExceptionHandler(Exception se , WebRequest req) {
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

	

}
