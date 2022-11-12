package com.tripy.services;

import java.util.List;

import com.tripy.globalexception.HotelException;
import com.tripy.models.Hotel;

public interface HotelService {
	
    public Hotel addHotel(Hotel hotel)throws HotelException;
	
    public List<Hotel> getHotelList() throws HotelException;
	
	public Hotel getHotelById(Integer id) throws HotelException;
	
	public Hotel deleteHotelById(Integer id) throws HotelException;
	
	public Hotel updateHotelDetails(Hotel hotel) throws HotelException;
	
	public Hotel updateHotelRentById(Integer id, Integer IncreasingRent) throws HotelException;
	
	public Hotel getHotelsByHotelName(String hotelName) throws HotelException;
	
	public List<Hotel> getHotelsByAddress(String address) throws HotelException;

}
