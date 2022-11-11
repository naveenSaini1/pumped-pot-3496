package com.tripy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.globalexception.FeedbackException;
import com.tripy.models.Customers;
import com.tripy.models.Feedback;
import com.tripy.repositary.CustomersRepo;
import com.tripy.repositary.IFeedBackRepository;
import com.tripy.repositary.feedbackDao;

@Service
public class IFeedBackDaoImpl implements IFeedbackServer {
	@Autowired
	private feedbackDao feedDao;
	@Autowired
	private CustomersRepo customerepo;
	
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
	public List<Feedback> viewallfeedbacks() throws FeedbackException {
		// TODO Auto-generated method stub
		Optional<List<Feedback>> fedOptional = Optional.of(feedDao.findAll());
		if (fedOptional.isPresent()) {

			return fedOptional.get();

		}
		throw new FeedbackException("No feedbacks found!");
		
	}

	@Override
	public Feedback delteById(Integer id) throws FeedbackException {
		// TODO Auto-generated method stub
		Optional<Feedback> fedOptional = feedDao.findById(id);
		if (fedOptional.isPresent()) {
			 feedDao.deleteById(id);
			return fedOptional.get();
//			return fedOptional.get();
			

		}
		throw new FeedbackException("No feedbacks found!");
//		return feedback;
	}

	@Override
	public Feedback findbycustomerid(Integer Customerid) throws FeedbackException {
//		public Feedback findbycustomerid(Integer Customerid)  throws FeedbackException{
		//
				Optional<Customers> customers= customerepo.findById(Customerid);
				if(customers.isPresent()) {
					Optional<Feedback> f1= ifeedbackRepo.findByCustomerName((customers.get().getCustomerName()));
				
					return f1.get();
					
			}
//				return new Feedback();
			throw new FeedbackException("no Data Found");
//				
//			}
//				return null;
	}

}
