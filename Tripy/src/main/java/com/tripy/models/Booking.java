package com.tripy.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
}
