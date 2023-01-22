package Day_6_Array_Practice_Assgn;


//Java Program to copy all the elements of an array into another array
public class CopyOfArrayElementsToAnotherArray {
	
	public static void main(String[] args) {
		
		int[] array = {10,20,30,40};
//		int[] copy =array;
//		System.out.println("Array");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i] + " ");
//		}
//		System.out.println("\nCoppied array");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(copy[i] + " ");
//		}
/*		
		int[] copy= new int[array.length];
		System.arraycopy(array, 0, copy, 0, array.length);//builtin method to copy array
		System.out.println("Array");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("\nCoppied array");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(copy[i] + " ");
		}
*/
		int[] copy=new int[array.length];
		
		for (int i=0;i<array.length;i++)
		{
			copy[i]=array[i];
		}
		System.out.println("Array");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("\nCoppied array");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(copy[i] + " ");
		}
	}

}
