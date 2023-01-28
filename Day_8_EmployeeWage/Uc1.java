package Day_8_EmployeeWage;

//Employee is present or not


public class Uc1 {
	
	public void checkEmployee()
	{
		int emp = 1;
		
		int empCheck = (int) ( (Math.random() * 10 )% 2);
		
		if (empCheck == emp) {

			System.out.println("Employee is present");
			
		} else {
			
			System.out.println("Employee is absent");

		}
	}
	
	public static void main(String[] args) {
	
		Uc1 uc1= new Uc1();
		uc1.checkEmployee();
		
	}
	
}