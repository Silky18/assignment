package com.gl.drivermain;

import com.gl.admindepartment.AdminDepartment;
import com.gl.hrdepartment.HrDepartment;
import com.gl.superdepartment.SuperDepartment;
import com.gl.techdepartment.TechDepartment;

public class DriverMain {

	public static void main(String[] args) {

		SuperDepartment admindepartment=new AdminDepartment();//creating object of AdminDepartment 
		SuperDepartment hrdepartment=new HrDepartment();//creating object of HrDepartment class
		SuperDepartment techdepartment=new TechDepartment();//creating object of TechDepartment class

		//Admin department will display all its functionalities		
		System.out.println(admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		System.out.println();
		System.out.println();


		//hrdepartment will display all its functionalities
		System.out.println(hrdepartment.departmentName());
		System.out.println(HrDepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		System.out.println();
		System.out.println();

		//TechFepartment will display all its functionalities
		System.out.println(techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(TechDepartment.getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday());

	}

}
