package Day_6_Array_Practice_Assgn;

import java.util.Scanner;

//Java Program to left rotate the elements of an array


public class LeftRotateElementsOfArray {
	
	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter how many elements you want to insert :: ");
	 int n =scanner.nextInt();
	 int[] array=new int[n];
	 for (int i =0;i<array.length;i++)
	 {
		 System.out.println("Enter "+(i+1)+" element :: ");
		 array[i]=scanner.nextInt();
		 
	 }
	 System.out.println("Given array is ::");
	 for (int i=0;i<array.length;i++)
	 {
		 System.out.print(array[i]+" ");
	 }
	 System.out.println();
	 int first=array[0];
	 for(int i=0;i<array.length-1;i++)
	 {
		 array[i]=array[i+1];
	 }
	 array[array.length-1]=first;
	 System.out.println("Output array is ::");
	 for (int i=0;i<array.length;i++)
	 {
		 System.out.print(array[i]+" ");
	 }
	 
	 
	}

}
