package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

import Day_4_Logic_Practice_Assignments.LeapYearChecking;

public class LeapYear {

public boolean checkLeapYear (int year) {
		
		if ((year%4==0 && year%100 != 0) || (year%400==0)) {
			
			System.out.println("The given year :: "+ year + " is a Leap Year" );
		}
		else
		{
			System.out.println("The given year :: "+ year + " is a not Leap Year");
		}
		return false;
}
public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	int i;int year;
	do {
		
		do {
			System.out.println("Enter a year ");
			year =scanner.nextInt();
			}
				while (year<999 || year>9999);
		
				LeapYearChecking check = new LeapYearChecking();
				check.checkLeapYear(year);
		
		System.out.println("If you want to check another year then press 1 :: ");
		i = scanner.nextInt();
	}
	while(i==1);
}}

