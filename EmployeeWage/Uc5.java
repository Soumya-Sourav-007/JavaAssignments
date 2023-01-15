package EmployeeWage;


// calculating wages for a month
//total wprking day is 20

public class Uc5 {
	
	public static void main(String[] args) {
		
		byte workingDay=20;
		
		if (workingDay == 20) {
			
			int wage = workingDay*160;//assuming 20 working day
			System.out.println("total wage :: " + wage);
			
		}
	}
}
