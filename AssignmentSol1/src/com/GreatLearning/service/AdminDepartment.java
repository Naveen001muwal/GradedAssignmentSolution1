package com.GreatLearning.service;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment() {
		

	}

	@Override
	public String departmentName() {
		return " Admin Department";

	}

	@Override
	public String getTodayWork() {
		return "Complete you document submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	 public String isTodayAHoliday()
	 {
		 return "Today is not a holiday" ;
	 }
	
}