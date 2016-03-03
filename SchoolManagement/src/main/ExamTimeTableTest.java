package com.frozan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frozan.model.timetable.ExamTimeTable;
import com.frozan.service.timetable.ExamTimeTableSvc;

public class ExamTimeTableTest {

	public static void main(String args[]){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/frozan/common/Application-context.xml");
		
	    ExamTimeTable examTimeTable=new ExamTimeTable();
	    examTimeTable.setExamTimeTableId("1");
		examTimeTable.setClassId("X A");
		examTimeTable.setExamDay("Sun");
		examTimeTable.setStartTime("10:30");
		examTimeTable.setEndTime("11:30");
		examTimeTable.setSubject("English");
		
		ExamTimeTableSvc examTimeTableSvc=context.getBean("examTimeTableSvc" ,ExamTimeTableSvc.class);
		examTimeTableSvc.insert(examTimeTable);
	
		
		
		System.out.println(examTimeTableSvc.getTimeTable("X A"));
	}
}
