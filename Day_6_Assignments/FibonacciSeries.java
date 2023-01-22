package Day_6_Assignments;

import java.util.Scanner;

/*Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).*/
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int number =scanner.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i =1;i<=number;i++)
		{
			c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
		
	}
}
