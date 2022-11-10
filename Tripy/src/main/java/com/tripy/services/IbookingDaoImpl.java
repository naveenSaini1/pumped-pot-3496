package com.tripy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.models.Booking;
import com.tripy.repositary.IBookingRepository;

@Service
public class IbookingDaoImpl implements IBookingService{
	
	@Autowired
	private IBookingRepository IbookRepo;
	
	@Override
	public Booking makeBooking(Booking booking){
		Booking b = IbookRepo.save(booking);
		return null;
	}

	@Override
	public Booking cancelBooking(Integer bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking viewBooking(Integer bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

}
