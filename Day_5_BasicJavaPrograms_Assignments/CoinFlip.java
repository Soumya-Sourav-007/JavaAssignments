package Day_5_BasicJavaPrograms_Assignments;

/*1. Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
 * 
 */

import java.util.Scanner;

public class CoinFlip {

	
	public static void main(String[] args) {
		
		System.out.println("Flippling the coin");
		System.out.println("Enter the times you want to flip the coin ::");
		Scanner scanner = new Scanner(System.in);
		int flip =scanner.nextInt();
		
		int countHeads = 0;
		int countTails = 0;
		for (int i =0; i<flip; i++) {
		float coin = (float) Math.random();
		
		if (coin < 0.5) {
			
			//System.out.println("Heads");
			countHeads++;
		}
		else
		{
			//System.out.println("tails");
			countTails++;
		}}
		
		double total =(double)(countTails+countHeads)/100;
		
		System.out.println("Head Percentage :: " + countHeads/total);
		System.out.println("Tails Percentage :: " + countTails/total);
		
	}
}
