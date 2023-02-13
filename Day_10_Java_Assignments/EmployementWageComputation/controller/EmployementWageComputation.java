package Day_10_Java_Assignments.EmployementWageComputation.controller;

import java.util.Scanner;
import Day_10_Java_Assignments.EmployementWageComputation.interfaces.IWageComputation;
import Day_10_Java_Assignments.EmployementWageComputation.services.ImplementationWageComputation;
import Day_10_Java_Assignments.EmployementWageComputation.model.Computation;
public class EmployementWageComputation {

	public static void computeEmployeeWage(int classMethodChoice) {
		if(classMethodChoice == 1 ) {
			computation.setPresentFullTime(getEmployee.employeesPresentFullTime());			
			computation.setFullTimeWage(getEmployee.dailyFullTimeEmployeeWage(computation.fullDayHour, computation.wagePerHour, computation.getPresentFullTime()));
		}else if(classMethodChoice == 2) {
			computation.setPresentPartTime(getEmployee.employeesPresentPartTime());
			System.out.println("Enter number of Working Hour:: ");
			computation.setPartTimeHour( getUserInput.nextInt());
			computation.setPartTimeWage( getEmployee.dailyPartTimeEmployeeWage(computation.getPartTimeHour(), computation.wagePerHour, computation.getPresentPartTime()));
		}
	}
	
	public static void computeEmployeeWage(int classMethodCompanyChoice, int wagePerHour, int fullDayHour) {
		if(classMethodCompanyChoice == 1 ) {
			computation.setPresentFullTime(getEmployee.employeesPresentFullTime());			
			computation.setFullTimeWage(getEmployee.dailyFullTimeEmployeeWage(fullDayHour, wagePerHour, computation.getPresentFullTime()));
		}else if(classMethodCompanyChoice == 2) {
			computation.setPresentPartTime(getEmployee.employeesPresentPartTime());
			System.out.println("Enter number of Working Hour:: ");
			computation.setPartTimeHour( getUserInput.nextInt());
			computation.setPartTimeWage( getEmployee.dailyPartTimeEmployeeWage(computation.getPartTimeHour(), wagePerHour, computation.getPresentPartTime()));
		}
	}
	
	
	
	static void getWage(int wagePerHour, int fullDayHour) {
		System.out.println("Perss 1: Full Time Wage ::"+'\n'+"Perss 2: Part Time Wage ::");
		int classMethodCompanyChoice = getUserInput.nextInt();
		computeEmployeeWage(classMethodCompanyChoice, wagePerHour, fullDayHour);
	}
	
	
	
	static Computation computation = new Computation();
	static IWageComputation getEmployee = new ImplementationWageComputation();
	static Scanner getUserInput = new Scanner(System.in);

//main-method
	public static void main(String[] args) {
		byte option = 0;
		
			
//displaying welcome message
		getEmployee.displayMessage();
		
		do {
		System.out.println(" 1.FullTime Employement Wages"+'\n'+" 2.PartTime Employement Wages"+'\n'
				+" 3.Employement Wage For A Month :: "+'\n'+" 4.Total working days or hours reached First( Total_WorkingHour = 100 && Total_Days_In_Month )"+'\n'
				+" 5.Use Class method to get Wage"+'\n'+" 6.Get Employement Wages For Different Companies"+'\n'+" Enter option::");
		option = getUserInput.nextByte();
		switch(option) {
		case 1:	
//number of employees present per day
			computation.setPresentFullTime(getEmployee.employeesPresentFullTime());
//wage for single employee per day
			computation.setFullTimeWage(getEmployee.dailyFullTimeEmployeeWage(computation.fullDayHour, computation.wagePerHour, computation.getPresentFullTime()));
			break;
		case 2:
//number of employees present per day
			computation.setPresentPartTime(getEmployee.employeesPresentPartTime());
//wage for single employee per day
			System.out.println("Enter number of Working Hour:: ");
			computation.setPartTimeHour( getUserInput.nextInt());
			computation.setPartTimeWage( getEmployee.dailyPartTimeEmployeeWage(computation.getPartTimeHour(), computation.wagePerHour, computation.getPresentPartTime()));
		break;
//Employement_Wage for a Month
		case 3:
			System.out.println("Press 1. For FullTime Employement Wages For A Month"+'\n'+"Press 2. For PartTime Employement Wages For A Month");
			byte choice = getUserInput.nextByte();
			if(choice == 1) {
				computation.setWageForMonth(getEmployee.wageForMonth(20, computation.wagePerHour, computation.fullDayHour));
			}else if(choice ==2) {
				computation.setWageForMonth(getEmployee.wageForMonth(20, computation.wagePerHour, computation.fullDayHour));
			}
			break;
		case 4:
			getEmployee.workingHoursOrDaysReachFirst(computation.fullDayHour);
			break;
		case 5:
			getWage(computation.wagePerHour, computation.fullDayHour);
			break;
		case 6:int companyNumber = 0;
			do {
			System.out.println("Press 1: Reliance"+'\n'+"Press 2: Walmart"+'\n'+"Press 3: UnitedHealthGroups"+'\n'+"Press 4: ZS Associates"+'\n'+"Press 5: All Company's Detail"+'\n'+" Enter option :: ");
			companyNumber = getUserInput.nextInt();
			int wagePerHour = 0;
			int fullDayHour = 0;
					switch(companyNumber) {
						case 1:
							System.out.println(" *****   RELIANCE   ***** ");
							wagePerHour = 12;
							fullDayHour = 7;
							getWage(wagePerHour, fullDayHour);
							break;
						case 2:
							System.out.println(" *****   Walmart   ***** ");
							wagePerHour = 13;
							fullDayHour = 10;
							getWage(wagePerHour, fullDayHour);
							break;
						case 3:
							System.out.println(" *****   UnitedHealthGroups   ***** ");
							wagePerHour = 9;
							fullDayHour = 9;
							getWage(wagePerHour, fullDayHour);
							break;
						case 4:
							System.out.println(" *****   ZS Associates   ***** ");
							wagePerHour = 14;
							fullDayHour = 8;
							getWage(wagePerHour, fullDayHour);
							break;
						case 5:
							String[] companyNames = {" *****   RELIANCE   ***** "," *****   Walmart   ***** "," *****   UnitedHealthGroups   ***** "," *****   ZS Associates   ***** "};
							int[] wagePerHr = {12,13,9,14};
							int[] fullDayHr = {7,10,9,8};
							for(int i = 0;i < 4; i++) {
								System.out.println(companyNames[i]);
								getWage(wagePerHr[i], fullDayHr[i]);
							}
							break;
					}}while(companyNumber > 5 || companyNumber < 1);
			break;
		default:
			System.err.println(" :: INVALID INPUT! try again :: ");
		}
		}while(option > 6 || option < 1);
		
		System.out.println("-->>>  Thank You for Using :: Employement Wage Computation Device ::  <<<--");
		
		
		
		
		
		
		



				
	}		
}
