package com.jspider.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	

	private ReportDao dao;
	
	
	public void setReport(ReportDao dao) {
		System.out.println("Setter method called...");
		this.dao=dao;
	}

	@Autowired
	ReportService(ReportDao dao){
		System.out.println("ReportService :: constructor");
		this.dao=dao;
	}
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated.....");
	}
	
}
