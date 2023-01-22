package Day_6_Array_Practice_Assgn;

import java.util.Scanner;

//Program to find smallest number in an array
public class SmallestEelementInArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many elements you want to enter :: ");
		int n = scanner.nextInt();
		int[] array=new int[n];
		
		for (int i=0;i<array.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Elemenet :: ");
			array[i]=scanner.nextInt();
		}
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		System.out.println("Minimum number is :: "+min);
	}

}
