package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripy.models.Destination;

public interface DestinationRepo extends JpaRepository<Destination, Integer> {

}
