package com.tripy.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer routeId;
	private String routeFrom;
	private String routeTo;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private LocalDate doj;
	private String pickupPoint;
	private double fare;
	@OneToOne
	private Bus bus;
	
	

}
