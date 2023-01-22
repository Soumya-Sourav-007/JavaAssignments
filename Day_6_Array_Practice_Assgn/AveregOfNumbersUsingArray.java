package Day_6_Array_Practice_Assgn;


//Java Program to Calculate average of numbers using Array
public class AveregOfNumbersUsingArray {

	
	public static void main(String[] args) {
		
		int array[] = {10,20,30};
		int sum=0;
		
		for (int i =0;i<array.length;i++)
		{
			
			sum=sum +array[i];
		}
		System.out.println("Sum of the array elements is :: "+ sum);
		
		System.out.println("Averegae of the elements :: " + sum/array.length );
	}
}
