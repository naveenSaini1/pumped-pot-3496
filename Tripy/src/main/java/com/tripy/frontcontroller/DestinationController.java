package com.tripy.frontcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.customerexception.DestinationExecption;
import com.tripy.models.Destination;
import com.tripy.services.DestinationSeriviceImpl;
@RequestMapping
@RestController
public class DestinationController {
	
	@Autowired
	private DestinationSeriviceImpl destinationSeriviceImpl;
	
	@PostMapping("/destinations")
	public ResponseEntity<Destination> saveDestination(@RequestBody Destination destination) throws DestinationExecption{
//		System.out.println(destination);
		Destination destination2= destinationSeriviceImpl.registerDestinations(destination);
		return new ResponseEntity<Destination>(destination2, HttpStatus.CREATED);
	}
	@GetMapping("/destinations")
	public ResponseEntity<List<Destination>> getAllDestination() throws DestinationExecption{
		
		List<Destination> list= destinationSeriviceImpl.showAllDesitnations();
		return new ResponseEntity<List<Destination>>(list, HttpStatus.OK);
				
	}
	@PutMapping("/destinations/{id}")
	public ResponseEntity<Destination> updateDestination(@RequestBody Destination destination,@PathVariable("id") Integer id) throws DestinationExecption{
		
		Destination destination1= destinationSeriviceImpl.updateDestination(destination, id);
		return new ResponseEntity<Destination>(destination1, HttpStatus.OK);
	}
	@GetMapping("/destinations/{id}")
	public ResponseEntity<Destination> getDestinationById(@PathVariable("id") Integer id) throws DestinationExecption{
		Destination destination= destinationSeriviceImpl.findDestinationById(id);
		return new ResponseEntity<Destination>(destination, HttpStatus.OK);
	}
	
	@DeleteMapping("/destinations/{id}")
	public ResponseEntity<Destination> deleteById(@PathVariable("id") Integer id) throws DestinationExecption{
		Destination destination= destinationSeriviceImpl.deletedestinatinsById(id);
		return new ResponseEntity<Destination>(destination, HttpStatus.OK);
	}
	

}
//{
//    "destinationName":"Delhi",
//    "description":"Take Our Package",
//    "packages":[
//        {
//            "packageName":"Delhi With Faimly",
//            "packageDescription":"Sab se Satasta",
//            "packageType":"Faimly Pack",
//            "packageCost":10000.0,
//            "payment":{
//                "status":"Pending"
//            },
//            "hotel":{
//                "hotelName":"Jai Bala Hotel",
//                "hotelType":"Faimly Hotel",
//                "hotelDesciption":"Ak bar aayi fir kabhi mat",
//                "address":"new Street 12 sector",
//                "rent":4000,
//                "status":"5 start"
//            },
//            "route":{
//                "routeFrom":"hisar",
//                "routeTo":"delhi",
//                "departureTime": "2018-02-05T12:59:11.332",
//                "arrivalTime": "2018-02-05T12:59:11.332",
//                "doj":"2022-11-12",
//                "pickupPoint":"station",
//                "fare":3000.4,
//                "bus":{
//                    "busType":"fully ac",
//                    "busNumber":"123456",
//                    "capacity":30,
//                    "travels":{
//                        "travelsName":"Humari Dhullhan",
//                        "agentName":"Game of Thronws",
//                        "address":"Hisar",
//                        "contact":"24458924"
//
//
//                    }
//                }
//            }
//
//        },
//        {
//            "packageName":"Delhi With Faimly",
//            "packageDescription":"Sab se Satasta",
//            "packageType":"Faimly Pack",
//            "packageCost":10000.0,
//            "payment":{
//                "status":"Pending"
//            },
//            "hotel":{
//                "hotelName":"Jai Bala Hotel",
//                "hotelType":"Faimly Hotel",
//                "hotelDesciption":"Ak bar aayi fir kabhi mat",
//                "address":"new Street 12 sector",
//                "rent":4000,
//                "status":"5 start"
//            },
//            "route":{
//                "routeFrom":"hisar",
//                "routeTo":"delhi",
//                "departureTime": "2018-02-05T12:59:11.332",
//                "arrivalTime": "2018-02-05T12:59:11.332",
//                "doj":"2022-11-12",
//                "pickupPoint":"station",
//                "fare":3000.4,
//                "bus":{
//                    "busType":"fully ac",
//                    "busNumber":"123456",
//                    "capacity":30,
//                    "travels":{
//                        "travelsName":"Humari Dhullhan",
//                        "agentName":"Game of Thronws",
//                        "address":"Hisar",
//                        "contact":"24458924"
//
//
//                    }
//                }
//            }
//
//        }
//    
//    ]
//}