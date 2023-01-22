package Day_6_Assignments;

import java.util.Scanner;

/*
 * Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
 */
public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int j;
		do {

		System.out.println("Enter a number to check ");
		int prime= scanner.nextInt();
		
		int temp =0;
		for(int i=2; i<prime;i++)
		{
			if (prime%i == 0) {
				
				temp=temp+1;
			}
		}
		if(temp == 0)
		{
			System.out.println(prime + " this is a prime number.");
		}
		else
		{
			System.out.println(prime + " this is not a prime number.");
		}
		System.out.println("If you want to check another number then press 1 ::");
		j=scanner.nextInt();
		} while (j==1);
	}

}
