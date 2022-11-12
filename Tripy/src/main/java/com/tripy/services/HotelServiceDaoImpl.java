package com.tripy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.globalexception.HotelException;
import com.tripy.models.Hotel;
import com.tripy.repositary.HotelRepo;

@Service
public class HotelServiceDaoImpl implements HotelService{
	
	@Autowired
	private HotelRepo hRepo;

	@Override
	public Hotel addHotel(Hotel hotel) throws HotelException {
	   Hotel h1 = 	hRepo.save(hotel);
	   
	   return h1;
	   
	}
	
	  //get all hotel list
		@Override
		public List<Hotel> getHotelList() throws HotelException {
			
			List<Hotel> list =  hRepo.findAll();
			
			if(list.size()>0) {
				return list;
			}
			else {
				throw new HotelException("Hotel List Not Found...");
			}
			
		}

		@Override
		public Hotel getHotelById(Integer id) throws HotelException {
			
			Optional<Hotel> finHotel =  hRepo.findById(id);
			
			if(finHotel.isPresent()) {
				Hotel hotel = finHotel.get();
				return hotel;
			}
			else {
				throw new HotelException("Hotel is not Found with Id "+id);
			}
			
		}

		@Override
		public Hotel deleteHotelById(Integer id) throws HotelException {
			  Optional<Hotel> opt =  hRepo.findById(id);
			  
			  if(opt.isPresent()) {
				  Hotel hotel = opt.get();
				  hRepo.deleteById(id);
				  return hotel;
			  }
			  else {
				  throw new HotelException("Hotel is not Found with Id "+id);
			  }
		}

		@Override
		public Hotel updateHotelDetails(Hotel hotel) throws HotelException {
			
	       Optional<Hotel> opt =  hRepo.findById(hotel.getHotelId());
	       
	       if(opt.isPresent()) {
	    	   return hRepo.save(hotel);
	       }
	       else {
	    	   throw new HotelException("Hotel not Found");
	       }
			
		}

		@Override
		public Hotel updateHotelRentById(Integer id, Integer IncreasingRent) throws HotelException {
			
			    Optional<Hotel> opt = hRepo.findById(id);
			    
			    if(opt.isPresent()) {
			      Hotel	hotel = opt.get();
			      hotel.setRent(hotel.getRent()+IncreasingRent);
			      return hRepo.save(hotel);
			    }
			    else {
			    	throw new HotelException("Hotel not Found");
			    }
			
		}

		@Override
		public Hotel getHotelsByHotelName(String hotelName) throws HotelException {
			
			    Hotel findHotel =  hRepo.findHotelByhotelName(hotelName);
			    
			    if(findHotel != null) {
			    	return findHotel;
			    }
			    else {
			    	throw new HotelException("Hotel not Found with name "+hotelName);
			    }
			
		}

		@Override
		public List<Hotel> getHotelsByAddress(String address) throws HotelException {
			
			List<Hotel> list =  hRepo.findHotelByAddress(address);
			
			if(list.size()>0) {
				return list;
			}
			else {
				throw new HotelException("Hotel not Found with Address "+address);
			}
		}

		

}
