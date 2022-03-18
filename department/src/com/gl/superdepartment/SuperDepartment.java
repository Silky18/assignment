package com.gl.superdepartment;

/*i)  departmentName 
ii)  getTodaysWork  
iii) getWorkDeadline
iv) isTodayAHoliday

departmentName will return “ Super Department “
getTodaysWork will return  “ No Work as of now”
getWorkDeadline will return “ Nil “
isTodayAHoliday will return “ Today is not a holiday”

*/
public abstract class SuperDepartment {
	public abstract String departmentName();

	public abstract String getTodaysWork();

	public abstract String getWorkDeadline();

	public String isTodayAHoliday() {
		String dayStatus = "Today is not a Holiday";
		return dayStatus;
	}

}
