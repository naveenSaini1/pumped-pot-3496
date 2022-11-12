package com.tripy.models;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer feedbackId;
	private String feedback;
	private Integer rating;
	private LocalDate submitDate;
	private String customerName;
	public Feedback(Integer feedbackId, String feedback, Integer rating, LocalDate submitDate, String customerName) {
		super();
		this.feedbackId = feedbackId;
		this.feedback = feedback;
		this.rating = rating;
		this.submitDate = submitDate;
		this.customerName = customerName;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public LocalDate getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
