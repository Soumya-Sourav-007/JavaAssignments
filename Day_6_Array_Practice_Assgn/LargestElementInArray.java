package Day_6_Array_Practice_Assgn;

import java.util.Scanner;

//Program to find largest element of an array


public class LargestElementInArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many elements you and to give :: ");
		int num=scanner.nextInt();
		int[] array=new int[num];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter "+(i+1)+" element ::");
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("Largest element is :: " + max);
		
	}

}
