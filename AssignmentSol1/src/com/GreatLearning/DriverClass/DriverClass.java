package com.GreatLearning.DriverClass;
import java.util.Scanner;

import com.GreatLearning.service.AdminDepartment;
import com.GreatLearning.service.HRDepartment;
import com.GreatLearning.service.TechDepartment;

public class DriverClass {

public static void main(String[]args) {
	
	AdminDepartment Admin = new AdminDepartment();
	HRDepartment Hr = new HRDepartment() ;
	TechDepartment Tech = new TechDepartment();
	
	
	System.out.println("1.  AdminDepartment");
	System.out.println("2.  HRDepartment") ;
	System.out.println("3.  TechDepartment ") ;
	Scanner sc = new Scanner(System.in) ;
	int option = sc.nextInt();

	
if(option==1) {
System.out.println("1.Welcome to the"+	Admin.departmentName());
System.out.println(Admin.getTodayWork());
System.out.println(Admin.getWorkDeadline());
System.out.println(Admin.isTodayAHoliday());
}
else if (option==2) {
System.out.println("2.Welcome to the "+ Hr.departmentName());
System.out.println(Hr.doActivity());
System.out.println(Hr.getTodayWork());
System.out.println(Hr.getWorkDeadline());
System.out.println(Hr.isTodayAHoliday());

}
else if(option==3) {
System.out.println("3.Welcome to the "+ Tech.departmentName());
System.out.println(Tech.getTodayWork());
System.out.println(Tech.getWorkDeadline());
System.out.println(Tech.getTechStackInformation());
System.out.println(Tech.isTodayAHoliday());
}
else
{
	System.out.println("INVALID DETAILS.......... PlEASE SELECT FROM ABOVE OPTIONS");

}
}
}
