package com.frozan.dao.timetable;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.frozan.model.timetable.DailyTimeTable;

public class DailyTimeTableDao {

	private HibernateTemplate hibernateTemplate;

	public DailyTimeTableDao(HibernateTemplate hibernateTemplate) {
		
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(DailyTimeTableHlo dailyTimeTableHlo){
		hibernateTemplate.save(dailyTimeTableHlo);
	}

	public List<DailyTimeTable> getTimeTable(String classId){
		List<DailyTimeTable> dailyTimeTablesList=null;
		dailyTimeTablesList=hibernateTemplate.find("from DailyTimeTableHlo where classId=?",new Object[]{classId});
		
		return dailyTimeTablesList;
	}
}
