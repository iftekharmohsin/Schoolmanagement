package com.frozan.service;

import com.frozan.dao.DailyTimeTableDAO;
import com.frozan.model.DailyTimeTable;

public class DailyTimeTableSvc {
	
	//public DailyTimeTable dailyTimeTable;
	public DailyTimeTable getDailyTimeTable(String day ,String classId){
		DailyTimeTableDAO dailyTimeTableDAO=new DailyTimeTableDAO();
		
		
		return dailyTimeTableDAO.timeTable(day, classId);
	}

}
