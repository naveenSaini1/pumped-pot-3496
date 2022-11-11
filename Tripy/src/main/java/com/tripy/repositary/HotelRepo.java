package com.tripy.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer>{

    public Hotel findHotelByhotelName(String hotelName);
	
	public List<Hotel> findHotelByAddress(String address);
	
}
