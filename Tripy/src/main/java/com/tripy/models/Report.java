package com.tripy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Report {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reportId;
	private String reportName;
	private String reportType;
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public Report(Integer reportId, String reportName, String reportType) {
		super();
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportType = reportType;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", reportName=" + reportName + ", reportType=" + reportType + "]";
	}
	
	
	
}

