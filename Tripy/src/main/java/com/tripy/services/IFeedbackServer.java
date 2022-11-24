package com.tripy.services;

import com.tripy.globalexception.FeedbackException;
import com.tripy.models.Feedback;
import java.util.*;

public interface IFeedbackServer {
	public Feedback addFeedback(Feedback feedback) throws FeedbackException;
    public Feedback findbyfeedbackid(Integer feedbackid);
    public List<Feedback> findbycustomerid(Integer Customerid) throws FeedbackException;
    public List<Feedback> viewallfeedbacks() throws FeedbackException;
    public Feedback delteById(Integer id) throws FeedbackException;
    
}
