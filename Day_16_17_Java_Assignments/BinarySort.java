package Day_16_17_Java_Assignments;

import java.util.Scanner;

public class BinarySort {

	 static int binarySearch(String[] stringArray, String getUserInput)
	    {
	        int l = 0, r = stringArray.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	 
	            int res = getUserInput.compareTo(stringArray[m]);
	 
	            // Check if x is present at mid
	            if (res == 0) {
	                return m;
	            }
	            // If x greater, ignore left half
	            if (res > 0) {
	                l = m + 1;
	            }
	            // If x is smaller, ignore right half
	            else {
	                r = m - 1;
	                }
	        }
	        return -1;
	    }
	 
	 
	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		
		String[] stringArray = new String[5]; //{ "contribute", "geeks", "ide", "practice"}
	        
		System.out.println(" Enter five Words :: ");
		for(int i = 0; i < stringArray.length;i++) {
			stringArray[i] = getInput.next();
		}
		
		System.out.println("Enter word to search :: ");
		 String getUserInput = getInput.next();
	        int result = binarySearch(stringArray, getUserInput);
	 
	        if (result == -1)
	        {
	            System.out.println(" The word is found or not ");
	            }else {
	            System.out.println(" Word found at :: "+getUserInput + '\n' + " index :: " + (result+1));
	            }
			}
}
