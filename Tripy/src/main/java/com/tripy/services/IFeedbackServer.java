package com.tripy.services;

import com.tripy.globalexception.FeedbackException;
import com.tripy.models.Feedback;
import java.util.*;

public interface IFeedbackServer {
	public Feedback addFeedback(Feedback feedback);
    public Feedback findbyfeedbackid(Integer feedbackid);
    public Feedback findbycustomerid(Integer Customerid);
    public List<Feedback> viewallfeedbacks() throws FeedbackException;
}