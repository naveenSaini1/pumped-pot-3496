package com.tripy.frontcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.globalexception.FeedbackException;
import com.tripy.models.Feedback;
import com.tripy.services.IFeedBackDaoImpl;

@RestController
public class FeedBackController {
	@Autowired
	private IFeedBackDaoImpl ifeedbackDao;
	
	@GetMapping("/feedbacks")
	public ResponseEntity<List<Feedback>> getAllFeedback() throws FeedbackException{
		List<Feedback>list= ifeedbackDao.viewallfeedbacks();
		return new ResponseEntity<List<Feedback>>(list, HttpStatus.OK);
	}
	@PostMapping("/feedbacks")
	public ResponseEntity<Feedback> registerFeedback(@RequestBody Feedback feedback) throws FeedbackException{
		Feedback f1= ifeedbackDao.addFeedback(feedback);
		return new ResponseEntity<Feedback>(f1, HttpStatus.CREATED);

	}
	@GetMapping("/feedbacks/{id}")
	public ResponseEntity<Feedback> getfeedbackById(@PathVariable("id") Integer id){
		Feedback feedback= ifeedbackDao.findbyfeedbackid(id);
		System.out.println(feedback);
		return new ResponseEntity<Feedback>(feedback, HttpStatus.OK);	
	}
	@DeleteMapping("/feedbacks/{id}")
	public ResponseEntity<Feedback> deleteFeedById(@PathVariable("id") Integer id) throws FeedbackException{
		Feedback feedback= ifeedbackDao.delteById(id);
		return new ResponseEntity<Feedback>(feedback, HttpStatus.OK);
	}
	@GetMapping("/feedbacks/customer/{id}")
	public ResponseEntity<List<Feedback>> getByCustomerId(@PathVariable("id") Integer id) throws FeedbackException{
		System.out.print(id);
		List<Feedback> feedback= ifeedbackDao.findbycustomerid(id);
		return new ResponseEntity<List<Feedback>>(feedback, HttpStatus.OK);
//		Feedback feedback=new Feedback();
//		return new ResponseEntity<Feedback>(feedback,HttpStatus.OK);
	}
	
	
	

}
