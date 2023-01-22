package Day_6_Array_Practice_Assgn;


//Java Program to print the elements of an array present on even Position
public class PrintElementsPresentOnEvenPositions {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Eelenets present in even positions :: ");
		for (int i=0;i<array.length;i=i+2)//for even position elements
		{
			System.out.print(array[i] + " ");
		}
		
	}
	
	
}
