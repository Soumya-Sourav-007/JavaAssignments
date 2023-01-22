package Day_6_Array_Practice_Assgn;


//Java Program to Calculate average of numbers using Array
public class AddElementsOfArray {

	
	public static void main(String[] args) {
		
		
		System.out.println("Addition of array elements ");
	
		int array []= {10,30,40,50};
		
		int sum =0;
		
		for (int num : array)
		{
			sum=sum+num;
		}
//		for (int i=0;i<array.length;i++)
//		{
//			sum = sum + array[i];
//		}
		System.out.println("Sum of array elements :: "+sum);
	
	}
	
}
