package com.tripy.services;

import com.tripy.models.Booking;

public interface IBookingService {

	public Booking makeBooking();
	public Booking cancelBooking();
	
}
