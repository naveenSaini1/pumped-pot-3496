package com.tripy.services;

import java.util.List;

import com.tripy.customerexception.BookingNotFoundException;
import com.tripy.models.Booking;

public interface IBookingService {

	public Booking makeBooking(Booking booking)throws BookingNotFoundException;
	public Booking cancelBooking(Integer bookingId)throws BookingNotFoundException;
	public Booking viewBooking(Integer bookingId)throws BookingNotFoundException;
	public List<Booking> viewAllBookings()throws BookingNotFoundException;
	
}
