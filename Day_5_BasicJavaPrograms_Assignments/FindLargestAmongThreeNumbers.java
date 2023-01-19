package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

//Find the largest among three numbers 

public class FindLargestAmongThreeNumbers {
	
	public void largest(int a, int b ,int c) {
		
		if (a>b && b>c ) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c )
		{
			System.out.println("B is greater");
			if (a == c &&  a!= b )
			{
				System.out.println(" and  A is eqal to C");
			}
		}else if (c>a && c> b) {
			System.out.println("C is greater");
			if (a == b &&  a!= c) {
				System.out.println("and A is eqal to B");
			}
		}
		else if (a == b &&  a!= c)
		{
			System.out.println(" A is eqal to B");
		}
		else if (a == c && a!= b) {
			System.out.println(" A and C is same");	
		}
		else if (c == b && c!= a)
		{
			System.out.println(" C is eqal to b ");
		}
		else 
		{
			System.out.println("All values are same");
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i;
		do {
			
		
		System.out.println("Enter First Number :: ");
		int a =scanner.nextInt();
		System.out.println("Enter Second Number :: ");
		int b =scanner.nextInt();
		System.out.println("Enter Third Number :: ");
		int c =scanner.nextInt();
		
		FindLargestAmongThreeNumbers large = new FindLargestAmongThreeNumbers();
		large.largest(a, b, c);
		System.out.println("If you want to check again press 1 :: ");
		i  =scanner.nextInt();
		} while (i == 1);
		
	}

}
