package Day_8_EmployeeWage;

//Add Part time Employee & Wage
//Assume Part time Hour is 8

public class Uc3 {
	
	public void addPartTimeEmployeeWage()
	{
		byte perHour = 20;
		byte fullTime = 8;
		int employee = (int) (((Math.random())* 100 ));
		
		System.out.println("Employee present" + employee);
		
		int wage = perHour*fullTime*employee;
		System.out.println("Total wage perday :: " + wage);
	}
	
public static void main(String[] args) {
	
	
	Uc3 uc3= new Uc3();
	uc3.addPartTimeEmployeeWage();
}
}
