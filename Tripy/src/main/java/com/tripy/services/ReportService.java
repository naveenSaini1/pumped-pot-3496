package com.tripy.services;

import java.util.List;

import com.tripy.globalexception.ReportException;
import com.tripy.models.Report;

public interface ReportService {
	
	 
		public Report addReport(Report report) throws ReportException;
		public List<Report> viewAllReports() throws ReportException;
		public Report deleteReport(Integer reportId) throws ReportException;

}
