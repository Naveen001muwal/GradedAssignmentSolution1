package com.GreatLearning.service;

public class HRDepartment extends SuperDepartment {



	public HRDepartment(){
	
		}
	public String departmentName() {
		return "HR  Department";

	}

	@Override
	 public String getTodayWork()
	 {
		 return "Fill today’s timesheet and mark your attendance";
	 }
	@Override
	 public String getWorkDeadline()
	 {
		 return " Complete by EOD " ;
	 }

	 public String doActivity()
	 {
		 return "Lunch" ;
	 }

}
