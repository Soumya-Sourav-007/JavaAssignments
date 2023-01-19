package Day_5_BasicJavaPrograms_Assignments;

import java.util.Iterator;
import java.util.Scanner;

/*
 * a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
 */
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = scanner.nextInt();
		
		if (number != 0) 
		{
		for(int i=1; i<=number;i++) 
		{
			System.out.print(" + (1/"+i+")");
		}
		}
		
		
	}
	
}
