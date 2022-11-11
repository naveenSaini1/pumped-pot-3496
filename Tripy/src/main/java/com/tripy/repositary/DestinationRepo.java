package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Destination;
@Repository
public interface DestinationRepo extends JpaRepository<Destination, Integer> {

}
