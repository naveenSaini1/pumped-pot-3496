package com.tripy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.globalexception.FeedbackException;
import com.tripy.models.Feedback;
import com.tripy.repositary.IFeedBackRepository;
import com.tripy.repositary.feedbackDao;

@Service
public class IFeedBackDaoImpl implements IFeedbackServer {
	@Autowired
	private feedbackDao feedDao;
	
	@Autowired
	private IFeedBackRepository ifeedbackRepo;

	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		Feedback f = ifeedbackRepo.save(feedback);
		return f;
	}

	@Override
	public Feedback findbyfeedbackid(Integer feedbackid) {
		// TODO Auto-generated method stub
		Feedback op = ifeedbackRepo.findById(feedbackid).orElseThrow(()->new IllegalArgumentException("feedback not found..!!"));
		return op;
	}

	@Override
	public Feedback findbycustomerid(Integer Customerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedback> viewallfeedbacks() throws FeedbackException {
		// TODO Auto-generated method stub
		Optional<List<Feedback>> fedOptional = Optional.of(feedDao.findAll());
		if (fedOptional.isPresent()) {

			return fedOptional.get();

		}
		throw new FeedbackException("No feedbacks found!");
		
	}

}
