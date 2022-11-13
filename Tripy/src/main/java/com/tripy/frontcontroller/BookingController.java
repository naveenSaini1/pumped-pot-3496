package com.tripy.frontcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.customerexception.BookingNotFoundException;
import com.tripy.customerexception.DestinationExecption;
import com.tripy.models.Booking;
import com.tripy.models.Destination;
import com.tripy.services.BookingService;
import com.tripy.services.DestinationSerivice;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	private BookingService iBookingSer;
	
	@Autowired 
	private DestinationSerivice destiService; 
	
	@GetMapping("/destinations")
	public ResponseEntity<List<Destination>> getAllDestination() throws DestinationExecption{
		List<Destination> list = destiService.showAllDesitnations();
		return new ResponseEntity<List<Destination>>(list,HttpStatus.OK);
	}
//	
	@PostMapping("/newbooking/{did}")
	public ResponseEntity<Booking> newBooking(@Valid @RequestBody Booking booking,@PathVariable("did")Integer did) throws BookingNotFoundException {
		
		 Booking book =  iBookingSer.makeBooking(booking); 
		
		return new ResponseEntity<Booking>(book,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/cancelbooking/{bookingid}")
	public ResponseEntity<Booking> cancelBooking(@PathVariable("bookingid") Integer bookingid) throws BookingNotFoundException{
		Booking book = iBookingSer.cancelBooking(bookingid);
		return new ResponseEntity<Booking>(book,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/viewbooking/{bookingid}")
	public ResponseEntity<Booking> viewBookingById(@PathVariable("bookingid") Integer bookingid) throws BookingNotFoundException{
		Booking b = iBookingSer.viewBooking(bookingid);
		return new ResponseEntity<Booking>(b,HttpStatus.OK);
	}
	
	@GetMapping("/veiwallbookings")
	public ResponseEntity<List<Booking>> viewAllBookings() throws BookingNotFoundException {
	 	List<Booking> list = iBookingSer.viewAllBookings();
		return new ResponseEntity<List<Booking>>(list,HttpStatus.OK);
	}
}
