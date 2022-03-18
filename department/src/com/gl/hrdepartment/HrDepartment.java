package com.gl.hrdepartment;

import com.gl.superdepartment.SuperDepartment;

/* Methods name
 *  
i)  departmentName 
ii)  getTodaysWork  
iii) getWorkDeadline
iv) doActivity

departmentName will return “ Hr Department “
getTodaysWork will return  “ Fill today’s worksheet and mark your attendance”
getWorkDeadline will return “ Complete by EOD “
doActivity “team Lunch”
*/

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		String departmentName = "Welcome to Hr Department";
		return departmentName;
	}

	public String getTodaysWork() {
		String getTodaysWork = "Fill today’s worksheet and mark your attendance";
		return getTodaysWork;
	}

	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}

	public static String doActivity() {
		String doActivity = "team Lunch";
		return doActivity;

	}
}
