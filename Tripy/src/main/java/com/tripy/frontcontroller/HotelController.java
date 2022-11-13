package com.tripy.frontcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.globalexception.HotelException;
import com.tripy.models.Hotel;
import com.tripy.services.HotelService;

@RestController
public class HotelController {
	
	@Autowired(required = true)
	private HotelService hService;
	
	@PostMapping("/hotels")
	public ResponseEntity<Hotel> addHotelHandler(@Valid @RequestBody Hotel hotel) throws HotelException{
		
	  Hotel addedHotel	= hService.addHotel(hotel);
	  
	  return new ResponseEntity<Hotel>(addedHotel, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/hotels")
	public ResponseEntity<List<Hotel>> getHotelListHandler() throws HotelException{
		
	       List<Hotel> list = hService.getHotelList();
	       
	       return new ResponseEntity<List<Hotel>>(list, HttpStatus.OK);
		
	}
	
	@GetMapping("/hotels/{id}")
	public ResponseEntity<Hotel> getHotelByIdHandler(@PathVariable("id") Integer id) throws HotelException{
		
		   Hotel getHotel = hService.getHotelById(id);
		
		   return new ResponseEntity<Hotel>(getHotel, HttpStatus.OK);
	}
	
	@DeleteMapping("deleteHotels/{id}")
	public ResponseEntity<Hotel> deleteHotelByIdHandler(@PathVariable("id") Integer id) throws HotelException{
		
		Hotel dltHotel = hService.deleteHotelById(id);
		
		return new ResponseEntity<Hotel>(dltHotel, HttpStatus.OK);
		
	}
	
	@PutMapping("updateHotel")
	public ResponseEntity<Hotel> updateHotelDetailsHandler(@RequestBody Hotel hotel) throws HotelException{
		
		Hotel updateHotel = hService.updateHotelDetails(hotel);
		
		return new ResponseEntity<Hotel>(updateHotel, HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("updateHotel/{id}")
	public ResponseEntity<Hotel> updateHotelRentByIdHandler(@PathVariable("id") Integer id, @RequestParam(value = "rent") Integer rent) throws HotelException{
		
		Hotel updateHotel = hService.updateHotelRentById(id,rent);
		
		return new ResponseEntity<Hotel>(updateHotel, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("hotelByhotelName/{hotelName}")
	public ResponseEntity<Hotel> getHotelsByRentHandler(@PathVariable("hotelName") String hotelName) throws HotelException{
		
		     Hotel list =  hService.getHotelsByHotelName(hotelName);
		     
		    return new ResponseEntity<Hotel>(list, HttpStatus.OK);
		
	}
	
	@GetMapping("hotelByAddress/{address}")
	public ResponseEntity<List<Hotel>> getHotelsByAddress(@PathVariable("address") String address) throws HotelException{
		
		     List<Hotel> list =  hService.getHotelsByAddress(address);
		     
		    return new ResponseEntity<List<Hotel>>(list, HttpStatus.OK);
		
	}


}
