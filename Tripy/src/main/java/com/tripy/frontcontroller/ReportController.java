package com.tripy.frontcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.globalexception.ReportException;
import com.tripy.models.Report;
import com.tripy.services.ReportService;

@RestController
public class ReportController {
	
	@Autowired(required = true)
	private ReportService rSer;
	
	@PostMapping("/addReport")
	public ResponseEntity<Report> addReportHandle(@RequestBody Report report) throws ReportException{
		
		 Report addedRep  =   rSer.addReport(report);
		 
		 return new ResponseEntity<Report>(addedRep, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/reports")
	public ResponseEntity<List<Report>> getAllReporthandle() throws ReportException{
		
		List<Report> list = rSer.viewAllReports();
		
		return new ResponseEntity<List<Report>>(list, HttpStatus.OK);
	}
	
	@DeleteMapping("/removeReport")
	public ResponseEntity<Report> deleteReportById(@RequestParam Integer reportId ) throws ReportException{
		
		Report dlt = rSer.deleteReport(reportId);
		
		return new ResponseEntity<Report>(dlt, HttpStatus.OK);
	}
	

}
