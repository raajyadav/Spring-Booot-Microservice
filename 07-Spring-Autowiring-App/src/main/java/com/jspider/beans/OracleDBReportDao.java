package com.jspider.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class OracleDBReportDao implements ReportDao{
//	
//	OracleDBReportDao(){
//		System.out.println("OracleDBReportDao :: constructor"); 
//	}

	@Override
	public void getData() {
		System.out.println("Getting data from oracle db...");
		
	}

}
