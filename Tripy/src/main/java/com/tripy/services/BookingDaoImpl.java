package com.tripy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tripy.customerexception.BookingNotFoundException;
import com.tripy.models.Booking;
import com.tripy.repositary.BookingRepository;

@Service
public class BookingDaoImpl implements BookingService{
	
	@Autowired
	private BookingRepository BookRepo;
	
	@Override
	public Booking makeBooking(Booking booking) throws BookingNotFoundException{
		Booking b = BookRepo.save(booking);
		
		if(b!=null) {
			return b;
		}else {
			throw new BookingNotFoundException("Please Enter valid data..!!");
		}
	}

	@Override
	public Booking cancelBooking(Integer bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		Booking b = BookRepo.findById(bookingId).orElseThrow(()-> new BookingNotFoundException("Booking not found with Booking Id:"+ bookingId));
		BookRepo.delete(b);
		return b;
	}

	@Override
	public Booking viewBooking(Integer bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		Booking b = BookRepo.findById(bookingId).orElseThrow(()-> new BookingNotFoundException("Booking not found with Booking Id:"+ bookingId));
		return b;
	}

	@Override
	public List<Booking> viewAllBookings() throws BookingNotFoundException {
		// TODO Auto-generated method stub
		 List<Booking> list = BookRepo.findAll();
		 if(list.size()==0) {
			 throw new BookingNotFoundException("Booking List is empty..!!");
		 }
		return list;
	}

}
