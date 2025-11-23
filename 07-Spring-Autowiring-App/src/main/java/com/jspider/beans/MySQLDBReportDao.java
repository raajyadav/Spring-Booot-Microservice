package com.jspider.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MySQLDBReportDao implements ReportDao{
//	
//	MySQLDBReportDao(){
//		 System.out.println("MySQLDBReportDao :: constructor");
//	}

	@Override
	public void getData() {
		System.out.println("Getting data from sql db... ");
		
	}

	
}
