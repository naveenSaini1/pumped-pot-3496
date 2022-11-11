package com.tripy.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Feedback;

@Repository
public interface IFeedBackRepository extends JpaRepository<Feedback, Integer>{

	Optional<Feedback> findByCustomerName(String customerName);

}
