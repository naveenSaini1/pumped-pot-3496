package com.tripy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.tripy.repositary.IpackageRepository;

@Service
public class IpackageDaoImpl implements IpackageService{

//	@Autowired
//	private IpackageRepository iPackageRepo;
	
	@Override
	public Package addPackage(Package pac) {
		// TODO Auto-generated method stub
//		Package p = iPackageRepo.save(pac);
		
		return null;
	}

	@Override
	public Package deletePachage(Integer pachageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Package searchPachage(Integer pachageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Package> viewAllPachage() {
		// TODO Auto-generated method stub
		return null;
	}

}
