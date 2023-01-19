package Day_5_BasicJavaPrograms_Assignments;


import java.util.Scanner;

//java program to compute quotient and remainder
public class QuotientAndRemainder {
	
	public int getQuotient(int a, int b) {
		
		a=a/b;
		return a;
	}
	public int getRemainder(int a, int b) {
		
		a=a%b;
		return a;
	}
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int i;
		do {
			
	
		System.out.println("Enter a number :: ");
		int a=scanner.nextInt();
		System.out.println("Enter second number :: ");
		int b = scanner.nextInt();
		
		System.out.println("Quotient of the number is ::");
		QuotientAndRemainder quotient = new QuotientAndRemainder();
		int quo = quotient.getQuotient(a,b);
		System.out.println(quo);
		System.out.println("Remainder is ::");
		int rem= quotient.getRemainder(a,b);
		System.out.println(rem);
		
		System.out.println("If you want to check again then press 1 ::");
		i=scanner.nextInt();
		} while (i==1);
	}
}
