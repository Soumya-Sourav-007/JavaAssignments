package Day_8_EmployeeWage;


//calculating wages for a month
//total wprking day is 20

public class Uc5 {
	
	public void calculateMonthlyWage()
	{
byte workingDay=20;
		
		if (workingDay == 20) {
			
			int wage = workingDay*160;//assuming 20 working day
			System.out.println("total wage :: " + wage);
			
		}
	}
	
	public static void main(String[] args) {
		
		Uc5 uc5= new Uc5();
		uc5.calculateMonthlyWage();
		
	}
}
