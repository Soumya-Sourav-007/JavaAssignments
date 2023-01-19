package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

/*
 * a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */
public class PowerOfTwo {

	public static void main(String[] args) {

		System.out.println("Enter a number :: ");
		Scanner scanner = new Scanner(System.in);
		
		int num=scanner.nextInt();
		if(num>0 && num<31)
		{
		for (int i = 1; i <= num; i++) 
		{
			System.out.println("2^" + i + " = " + (int) (Math.pow(2, i)));
		}
		
		}

	}

}
