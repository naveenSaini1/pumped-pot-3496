package com.tripy.frontcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.customerexception.BookingNotFoundException;
import com.tripy.models.Booking;
import com.tripy.services.IBookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	private IBookingService iBookingSer;
	
	
	
	
	@PostMapping("/newbooking/{did}")
	public Booking newBooking(@Valid @RequestBody Booking booking,@PathVariable("did")Integer did) throws BookingNotFoundException {
		
		return iBookingSer.makeBooking(booking); 
		
//		return new Booking();
	}
	
	@GetMapping("/veiwallbookings")
	public List<Booking> viewAllBookings() throws BookingNotFoundException {
		return iBookingSer.viewAllBookings();
		
	}
}
