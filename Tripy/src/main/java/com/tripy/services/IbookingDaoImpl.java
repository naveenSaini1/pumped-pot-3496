package com.tripy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.customerexception.BookingNotFoundException;
import com.tripy.models.Booking;
import com.tripy.repositary.IBookingRepository;

@Service
public class IbookingDaoImpl implements IBookingService{
	
	@Autowired
	private IBookingRepository IbookRepo;
	
	@Override
	public Booking makeBooking(Booking booking) throws BookingNotFoundException{
//		System.out.println("start-------------------------------------------------------------------------------------------");
		Booking b = IbookRepo.save(booking);
//		System.out.println("end"+b+"-------------------------------------------------------------------");
//		Booking b = new Booking(); 
		
		if(b!=null) {
			return b;
		}else {
			throw new BookingNotFoundException("Please Enter valid data..!!");
		}
	}

	@Override
	public Booking cancelBooking(Integer bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		Booking b = IbookRepo.findById(bookingId).orElseThrow(()-> new BookingNotFoundException("Booking not found with Booking Id:"+ bookingId));
		IbookRepo.delete(b);
		return b;
	}

	@Override
	public Booking viewBooking(Integer bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookings() {
		// TODO Auto-generated method stub
		 List<Booking> list = IbookRepo.findAll();
		return list;
	}

}
