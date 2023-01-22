package Day_6_Array_Practice_Assgn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Java Program to sort an array in ascending order
public class SortAnArrayInAscendingOrder {

	
	public static void main(String[] args) {
		
		System.out.println("Sort an array in ascending order");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elemetns you want to enter :: ");
		int n =scanner.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element "+ (i+1));
			array[i]=scanner.nextInt();
		}
		System.out.println("Elements entered :: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		//Arrays.sort(array);//inbuilt method for sorting 
		//System.out.println("Arrays after shorting :: "+Arrays.toString(array));
		
		byte min=0;
		for(byte i=0;i<array.length;i++) {
			for(byte j=(byte)(i+1);j<array.length;j++) {
				if (array[i]>array[j]) {
						min=(byte) array[i];
						array[i]=array[j];
						array[j]=min;
				}
			}
		}
		System.out.println("]");
		System.out.print("sorted_Array[i] :: [ ");
		//printing sorted Array
		for(byte i = 0;i<array.length;i++) {
				System.out.print(array[i]+" ");
		}
		System.out.println("]");
	}
}
		
		
		
