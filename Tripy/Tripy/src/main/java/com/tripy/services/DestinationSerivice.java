package com.tripy.services;

import java.util.List;

import com.tripy.customerexception.DestinationExecption;
import com.tripy.models.Destination;

public interface DestinationSerivice {
	
	public Destination registerDestinations(Destination destination) throws DestinationExecption;
	public List<Destination> showAllDesitnations() throws DestinationExecption;
	public Destination deletedestinatinsById(Integer destinationId) throws DestinationExecption;
	public Destination findDestinationById(Integer destinationId) throws DestinationExecption;
	public Destination updateDestination(Destination destination,Integer id) throws DestinationExecption;
	
}
