package Day_10_Java_Assignments.EmployementWageComputation.model;

public class Computation {
	
	public final int wagePerHour = 20;
	public final int fullDayHour = 8;
	private int partTimeHour;
	private int fullTimeWage;
	private int partTimeWage;
	private int presentPartTime;
	private int presentFullTime;
	private int wageForMonth;
	
	
	public int getPresentPartTime() {
		return presentPartTime;
	}
	public void setPresentPartTime(int presentPartTime) {
		this.presentPartTime = presentPartTime;
	}
	public int getPresentFullTime() {
		return presentFullTime;
	}
	public void setPresentFullTime(int presentFullTime) {
		this.presentFullTime = presentFullTime;
	}
	public int getPartTimeWage() {
		return partTimeWage;
	}
	public void setPartTimeWage(int partTimeWage) {
		this.partTimeWage = partTimeWage;
	}
	public int getFullTimeWage() {
		return fullTimeWage;
	}
	public void setFullTimeWage(int fullTimeWage) {
		this.fullTimeWage = fullTimeWage;
	}
	public int getPartTimeHour() {
		return partTimeHour;
	}
	public void setPartTimeHour(int partTimeHour) {
		this.partTimeHour = partTimeHour;
	}
	public int getWageForMonth() {
		return wageForMonth;
	}
	public void setWageForMonth(int wageForMonth) {
		this.wageForMonth = wageForMonth;
	}
	

}