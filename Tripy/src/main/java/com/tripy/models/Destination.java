package com.tripy.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

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

public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer destinationId;
	private String destinationName;
	private String description;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Package> packages=new ArrayList<>();

}
