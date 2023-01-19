package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

//Chech Even or odd
public class CheckEvenOrOdd {

	
	
public boolean getEvenOrOdd (int number) {
		
		return number%2 == 0;
		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i;
		do {
			
		
		System.out.println("Enter a number :: ");
		int number =scanner.nextInt();
		
		CheckEvenOrOdd check = new CheckEvenOrOdd();
		
		if (check.getEvenOrOdd(number)) {
			
			System.out.println("The given number = " + number + " is Even");
		}
		else { 
			System.out.println("The given number = " + number + " is odd");
		}
		System.out.println("If you want to check again then type 1 :: ");
		 i = scanner.nextInt();
		
		} while (i == 1);
		
	}

}
