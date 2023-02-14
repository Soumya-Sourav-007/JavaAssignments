package Day_16_17_Java_Assignments;

import java.util.Scanner;

/*
 6. An Anagram Detection Example
 
	a. Desc -> One string is an anagram of another if the second is simply a rearrangement of the first.
	   For example, 'heart' and 'earth' are anagrams...
	b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
	c. O/P -> The Two Strings are Anagram or not.... 
 */

class AnagramCheck {
	
	public AnagramCheck(String stringOne, String stringTwo ) {
		int count = 0;
		if(stringTwo.length() == stringOne.length()) {
			for(int i = 0; i < stringOne.length() ;i++) {
				System.out.println("string one :: "+stringOne.charAt(i));
				for(int j = 0; j < stringOne.length() ;j++) {
					System.out.println("string Two :: "+stringTwo.charAt(j));
					if(stringOne.charAt(i) == stringTwo.charAt(j)) {
						System.out.println("-------------------match");
						count++;
						break;
					}
				}
			}
			if(count == stringOne.length()) {
				System.out.println(" :: Anagram :: ");
			}
		}
	}
}

public class Anagram extends AnagramCheck {	

	public Anagram(String stringOne, String stringTwo) {
		super(stringOne, stringTwo);
	}

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);

		System.out.println("Enter a word");
		String inputFirstWord = name.next();
		
		System.out.println("Enter another word to check :: ");
		String inputSecondWord = name.next();
		AnagramCheck anagram = new Anagram(inputFirstWord, inputSecondWord);
	}

}