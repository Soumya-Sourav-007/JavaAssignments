package Day_6_Array_Practice_Assgn;

import java.util.Scanner;

//Java Program to reverse an array
public class ReverseAnArray {

	
	public static void main(String[] args) {
		
		System.out.println("Reversing an array ");
		System.out.println("How many elements do you want to enter :: ");
		Scanner scanner = new Scanner(System.in);
		
		int n =scanner.nextInt();
		int array[] = new int[n];
		
		for (int i=0;i<n;i++) {
		System.out.println("Enter "+ ((i+1)) + "element ");//to add elements
		array[i]=scanner.nextInt();
		
		}
		System.out.print("Elements Entered :: ");
		for(int i=0;i<n;i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.print(" and Reversed Eelemnts are :: ");
		for (int i=n-1;i>=0;i--)//to reverse an array
		{
			System.out.print(array[i]+" ");
		}
		
		
		
	}
}
