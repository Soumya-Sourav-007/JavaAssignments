package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

/*
 * Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
 */
public class WindChill {

	
	public static void main(String[] args) {
		
		Scanner getWthValue = new Scanner(System.in);
//		temperature t (in Fahrenheit)	
			System.out.println(": Enter temperature t (in Fahrenheit) :");
			float tempfh=getWthValue.nextFloat();
	//wind Speed
			System.out.println(": Enter wind speed v (in miles per hour) :");
			float windSpeed=getWthValue.nextFloat();
	//Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3		
			if(tempfh<50 && windSpeed>3 && windSpeed<120) {
				
					double effectiveTemp=(35.74 + 0.6215*tempfh + (0.4275*tempfh - 35.75))*(Math.pow(windSpeed, 0.16));
					
					System.out.println(": NWS defines the effective temperature (the wind chill) :: "+effectiveTemp);
			}else {
				System.out.println(":: Note: the formula is not valid if temperature is larger than 50 in absolute value or if wind speed is larger than 120 or less than 3  ::");
			}
		
	}
}
