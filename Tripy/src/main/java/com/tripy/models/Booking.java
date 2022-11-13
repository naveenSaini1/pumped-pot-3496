package com.tripy.models;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	@Size(min = 2,message = "Enter the bookingtype between minmum 3 length ")
	private String bookingType;
	@Size(min = 3,message = "Elease Enter minimum 3 length")
	private String description;
	@Size(min  = 3,message = "Elease Enter minimum 3 length")
	private String bookingTitle;
	private LocalDate bookingDate;
	@OneToOne
	private Destination destination;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId,
			@Size(min = 2, message = "Enter the bookingtype between minmum 3 length ") String bookingType,
			@Size(min = 3, message = "Elease Enter minimum 3 length") String description,
			@Size(min = 3, message = "Elease Enter minimum 3 length") String bookingTitle, LocalDate bookingDate,
			Destination destination) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.destination = destination;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBookingTitle() {
		return bookingTitle;
	}

	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingType=" + bookingType + ", description=" + description
				+ ", bookingTitle=" + bookingTitle + ", bookingDate=" + bookingDate + ", destination=" + destination
				+ "]";
	}
	
}
