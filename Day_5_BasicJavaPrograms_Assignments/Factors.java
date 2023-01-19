package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

/*
 * a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
 */
public class Factors {

	public static void main(String[] args) {
		
		System.out.println("Enter a number :: ");
		Scanner scanner = new Scanner(System.in);
		
		int num=scanner.nextInt();
		for (int i = 1; i <= num; i++) 
		{
			if (num%i==0)
			{int temp=0;
			for (int j = i; j >0; j--) 
			{
				if (i%j==0)
				{
					temp++;
				}
			}
			if(temp==2)
			{
				System.out.println(i);
			}
			}
		}
	}
}

