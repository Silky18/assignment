package com.gl.admindepartment;

import com.gl.superdepartment.SuperDepartment;

/*i)  departmentName 
ii)  getTodaysWork  
iii) getWorkDeadline

departmentName will return “ Admin Department “
getTodaysWork will return “Complete your documents Submission”
getWorkDeadline will return “ Complete by EOD “


*/
public class AdminDepartment extends SuperDepartment {
	// public class AdminDepartment extends SuperDepartment

	public String departmentName() {
		String departmentName = "Welcome to Admin Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String todayWorkStatus = "Complete your documents Submission";
		return todayWorkStatus;
	}

	public String getWorkDeadline() {
		String workDeadLine = "Complete by EOD";
		return workDeadLine;
	}

}
