package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

/*
 * Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */
public class Distance {
	
	public static void main(String[] args) {
		
		
		
		Scanner getIpCoordinates = new Scanner(System.in);
//x-Co_Ordinate			
		System.out.println(": Enter x-Co_Ordinate :");
		int pointX=getIpCoordinates.nextInt();
//y-Co_Ordinate		
		System.out.println(": Enter y-Co_Ordinate :");
		int pointY=getIpCoordinates.nextInt();	
		System.out.println("::: CALCULATING DISTANCE FROM (x,y) TO (0,0) :::");
//distance		
		double euclideanDistance=Math.sqrt((pointX*pointX)+(pointY*pointY));
		
		System.out.println(": Distance from (x,y) to (0,0)  ::"+euclideanDistance+" units");
	}

}
