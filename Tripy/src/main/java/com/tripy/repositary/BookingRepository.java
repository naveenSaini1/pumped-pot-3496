package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Booking;

@Repository
public interface IBookingRepository extends JpaRepository<Booking, Integer>{

}
