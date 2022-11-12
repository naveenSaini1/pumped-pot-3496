package com.tripy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.globalexception.ReportException;
import com.tripy.models.Report;
import com.tripy.repositary.ReportRepo;


@Service
public class ReportServiceDaoimpl implements ReportService{

	@Autowired
	 private ReportRepo rRepo;
	
	@Override
	public Report addReport(Report report) throws ReportException {
		
		 return rRepo.save(report);
		
	}

	@Override
	public List<Report> viewAllReports() throws ReportException {
		
		 List<Report> list =  rRepo.findAll();
		 
		 if(list.size()>0) {
			 return list;
		 }
		 else {
			 throw new ReportException("Report list is not Availabel");
		 }
		
	}

	@Override
	public Report deleteReport(Integer reportId) throws ReportException {
		 
	  	Optional<Report> opt = rRepo.findById(reportId);
	  	
	  	if(opt.isPresent()) {
	  		rRepo.deleteById(reportId);
	  		return opt.get();
	  	}
	  	else {
	  		throw new ReportException("Report is not Present with id "+reportId);
	  	}
		
	}

}
