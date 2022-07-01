package com.GreatLearning.service;

public class TechDepartment extends SuperDepartment {
	public TechDepartment(){
		
		
	}
	@Override
	public String departmentName() {
		return " Tech Department";

	}

	@Override
	public String getTodayWork() {
		return "Complete coding of Module 1 ";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	
}
@Override	
	
		public String getTechStackInformation() {
			return "Core Java ";

		}
	

}
