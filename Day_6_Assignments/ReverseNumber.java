package Day_6_Assignments;

import java.util.Scanner;

/*
 * In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
 */
public class ReverseNumber {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		
		int number = scanner.nextInt();
		System.out.println("Given number before reverse is = "+ number);
		
		int rem;
		int rev=0;
		while (number !=0)
		{
			rem = number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("After the reverse the number is ::" + rev);
	}
}
