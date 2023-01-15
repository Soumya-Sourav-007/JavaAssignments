package EmployeeWage;

//swtich case

public class Uc4 {
	
	public static void main(String[] args) {
		
		
		byte partTime=(byte)(Math.random()*10);
		
		
		int wagePerHour=20;
	
		System.out.println("Part_Time Hour :: "+partTime);
		switch(partTime) {
		case 2:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 3:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 4:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 5:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 6:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 7:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 8:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		default:
			System.out.println(" :: Invalid Working Hour ::");	
		}
		
	}

}
