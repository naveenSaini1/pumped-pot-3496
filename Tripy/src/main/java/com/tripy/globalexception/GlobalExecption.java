package com.tripy.globalexception;

import java.nio.file.AccessDeniedException;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExecption {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> OtherExceptionHandler(Exception exp, WebRequest req){
		MyErrorDetails authEx = new MyErrorDetails();
		authEx.setTimestamp(LocalDateTime.now());
		authEx.setMessage(exp.getMessage());
		authEx.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(authEx,HttpStatus.BAD_REQUEST);
	}
	
	// MANV EXCEPTION HANDLER
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exp) {
		
		MyErrorDetails authEx = new MyErrorDetails();
		authEx.setTimestamp(LocalDateTime.now());
		authEx.setMessage("Validation Error");
		authEx.setDescription(exp.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<MyErrorDetails>(authEx,HttpStatus.BAD_REQUEST);
	}

	//ACCESS DENIED EXCEPTION HANDLER
	@ExceptionHandler(AccessDeniedException.class)
	public ResponseEntity<MyErrorDetails> AccessDeniedExceptionHandler(AccessDeniedException exp, WebRequest req){
		MyErrorDetails authEx = new MyErrorDetails();
		authEx.setTimestamp(LocalDateTime.now());
		authEx.setMessage(exp.getMessage());
		authEx.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(authEx,HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(ReportException.class)
	public ResponseEntity<MyErrorDetails> packageExceptionHandler(ReportException re, WebRequest req){
		MyErrorDetails red = new MyErrorDetails();
		red.setTimestamp(LocalDateTime.now());
		red.setMessage(re.getMessage());
		red.setDescription(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(red,HttpStatus.BAD_REQUEST);
	}
	

}
