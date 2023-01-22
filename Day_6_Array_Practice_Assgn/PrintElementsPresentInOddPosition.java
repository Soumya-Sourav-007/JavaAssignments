package Day_6_Array_Practice_Assgn;



//Java Program to print the elements of an array present on odd position
public class PrintElementsPresentInOddPosition {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Elements present in odd position");
		for(int i=1;i<array.length;i=i+2)//for odd position 
		{
			System.out.print(array[i] + " ");
		}
		
	}
}
