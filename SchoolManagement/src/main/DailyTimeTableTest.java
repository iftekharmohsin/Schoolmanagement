package com.frozan.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.frozan.model.timetable.DailyTimeTable;
import com.frozan.service.timetable.DailyTimeTableSvc;


public class DailyTimeTableTest {

	public static void main(String args[]){
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/frozan/common/Application-context.xml");
		
	/*	DailyTimeTable dailyTimeTable=new DailyTimeTable();
		dailyTimeTable.setClassId("X B");
		dailyTimeTable.setDayId("Sun");
		dailyTimeTable.setStartTime("10:30");
		dailyTimeTable.setEndTime("11:30");
		dailyTimeTable.setSubject("English");
		dailyTimeTable.setTeacher("iftekhar");
		
		dailyTimeTableSvc.insert(dailyTimeTable);
	*/
		DailyTimeTableSvc dailyTimeTableSvc=context.getBean("dailytimeTableSvc" ,DailyTimeTableSvc.class);
		
		System.out.println(dailyTimeTableSvc.getTimeTable("X A"));
	}
	
}
