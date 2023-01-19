package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

//Swap Two Numbers 
public class SwapTwoNumbers {

	//public int swap(int a, int b) {
		
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		return a;
		//System.out.println(a + "and" + b);
		
	//}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number :: ");
		int a=scanner.nextInt();
		System.out.println("Enter Second Number :: ");
		int b = scanner.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Two Numbers after swapping :: " + a + " and " + b);
		
//SwapTwoNumbers swap = new SwapTwoNumbers();
//	int c=swap.swap(a, b);
//  int d=swap.swap(b, a);
//System.out.println(c + " and "+ d + "After Swaping");
		
	}
	
}
