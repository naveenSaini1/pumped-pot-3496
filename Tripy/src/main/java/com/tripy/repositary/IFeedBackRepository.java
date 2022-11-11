package com.tripy.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripy.models.Feedback;

@Repository
public interface IFeedBackRepository extends JpaRepository<Feedback, Integer>{

}
