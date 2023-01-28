package Day_8_EmployeeWage;

//Calculate Daily Employee wage 
//wage per hour is 20 and full day hour is 8


public class Uc2 {

	
	public void getDailyEmployeeWage()
	{
byte perHour = 20;
		
		int perDayTime = (int) (((Math.random())* 10 ));
		
		System.out.println(perDayTime);
		
		if (perDayTime % 8 == 0 && perDayTime != 0) {
			
			int wage = (int) (perDayTime*perHour);
			
			System.out.println("Full day slary is :: " + wage);
		}
		else if (perDayTime % 4 == 0 && perDayTime != 0) {
			
			int wage = (int) (perDayTime*(perHour/2));
			
			System.out.println("Half day salary is :: " + wage);
		}
		else {
			System.out.println("invalid working hours");
		}
	}
	public static void main(String[] args) {
		
		Uc2 uc2= new Uc2();
		uc2.getDailyEmployeeWage();
		
		
	}
	
	
}