package com.tripy.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tripy.customerexception.DestinationExecption;
import com.tripy.models.Destination;
import com.tripy.repositary.DestinationRepo;
@Service

public class DestinationSeriviceImpl implements DestinationSerivice {
	@Autowired
	private DestinationRepo destinationRepo;

	@Override
	public Destination registerDestinations(Destination destination) throws DestinationExecption {
		System.out.println(destination);
		Destination destination2= destinationRepo.save(destination);
		return destination2;
	}

	@Override
	public List<Destination> showAllDesitnations() throws DestinationExecption {
		List<Destination> destinations= destinationRepo.findAll();
		if(destinations.size()!=0) {
			return destinations;
		}
		throw new DestinationExecption("Till Now No data Present");
		
	}

	@Override
	public Destination deletedestinatinsById(Integer destinationId) throws DestinationExecption {
		Optional<Destination> destination= destinationRepo.findById(destinationId);
		if(destination.isPresent()) {
			destinationRepo.deleteById(destinationId);
			return destination.get();
		}
		throw new DestinationExecption("Please Enter Valid Id");
	}

	@Override
	public Destination findDestinationById(Integer destinationId) throws DestinationExecption {
		Optional<Destination> destination= destinationRepo.findById(destinationId);
		if(destination.isPresent()) {
			return destination.get();
		}
		throw new DestinationExecption("Please Enter Valid Id");
		
	}

	@Override
	public Destination updateDestination(Destination destination,Integer id) throws DestinationExecption {
		Optional<Destination> destination1= destinationRepo.findById(id);
		if(destination1.isPresent()) {
			destination.setDestinationId(id);
			Destination updateDestination=destinationRepo.save((destination));
			return updateDestination;
		}
		throw new DestinationExecption("Please Enter Valid Id");
	}

}
