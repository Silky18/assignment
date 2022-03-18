package com.gl.techdepartment;

import com.gl.superdepartment.SuperDepartment;

/*i)  departmentName 
ii)  getTodaysWork  
iii) getWorkDeadline
iv) getTechStackInformation

departmentName will return “ Tech Department “
getTodaysWork will return  “ Complete coding of module 1”
getWorkDeadline will return “ Complete by EOD “
getTechStackInformation will return “core Java”
*/

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String departmentName = "Welcome to Tech Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String getTodaysWork = "Complete coding of Module 1";
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}

	public static String getTechStackInformation() {
		return "Core Java";
	}

}
