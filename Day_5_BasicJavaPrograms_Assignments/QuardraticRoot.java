package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

/*
 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
 */
public class QuardraticRoot {

		public static void main(String[] args) {
			
			Scanner getcoefficients = new Scanner(System.in);
	//coefficient for 'x*x'		
			System.out.println("Enter a coefficient for 'x*x' : ");
			int xSqrCoefficient=getcoefficients.nextInt();
	//coefficient for 'x'
			System.out.println("Enter a coefficient for 'x' : ");
			int xCoefficient=getcoefficients.nextInt();
	//constant
			System.out.println("Enter a constant for  : ");
			int constant=getcoefficients.nextInt();
	//formula based
			int delta = xCoefficient*(4*xSqrCoefficient*constant);
			double firstRoot=(-xCoefficient + Math.sqrt(delta))/(2*xSqrCoefficient);
			double secondRoot=(-xCoefficient - Math.sqrt(delta))/(2*xSqrCoefficient);
			
			System.out.println("First root :: "+firstRoot);
			System.out.println("Second root :: "+secondRoot);

		}
}
