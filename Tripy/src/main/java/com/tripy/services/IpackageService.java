package com.tripy.services;

import java.util.List;

public interface IpackageService {

	public Package addPackage(Package pac);
	public Package deletePachage(Integer pachageId);
	public Package searchPachage(Integer pachageId);
	public List<Package> viewAllPachage();
	
}
