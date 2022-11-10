package com.tripy.services;

import java.util.List;

import com.tripy.models.Booking;

public interface IBookingService {

	public Booking makeBooking(Booking booking);
	public Booking cancelBooking(Integer bookingId);
	public Booking viewBooking(Integer bookingId);
	public List<Booking> viewAllBookings();
	
}
