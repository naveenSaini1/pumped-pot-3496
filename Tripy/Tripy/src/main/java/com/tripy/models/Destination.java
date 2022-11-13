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

@Entity
public class Destination {
	@Override
	public String toString() {
		return "Destination [destinationId=" + destinationId + ", destinationName=" + destinationName + ", description="
				+ description + ", packages=" + packages + "]";
	}
	public Integer getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(Integer destinationId) {
		this.destinationId = destinationId;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Package> getPackages() {
		return packages;
	}
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	public Destination(Integer destinationId, String destinationName, String description, List<Package> packages) {
		super();
		this.destinationId = destinationId;
		this.destinationName = destinationName;
		this.description = description;
		this.packages = packages;
	}
	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer destinationId;
	private String destinationName;
	private String description;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Package> packages=new ArrayList<>();

}
