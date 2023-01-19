package Day_5_BasicJavaPrograms_Assignments;

import java.util.Scanner;

//Java Program to Check Whether an Alphabet is Vowel or Consonant
public class AlphabetIsVowelOrConsonant {
	
	public char getChar(char ch) {
		
		
		if ((ch>=65 && ch<=90) || (ch>=96 && ch<=123)) {
			
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
            System.out.println(ch + " is vowel");
		
        }else {
            System.out.println(ch + " is consonant");}
		}
		return ch;
		
	}
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int i;
		do {
		System.out.println("Enter an alphabet :: ");
		char ch=scanner.next().charAt(0);
		AlphabetIsVowelOrConsonant alphabetIsVowelOrConsonant = new AlphabetIsVowelOrConsonant();
		
		alphabetIsVowelOrConsonant.getChar(ch);
		System.out.println("If you want to check again then press 1 :: ");
		i=scanner.nextInt();
		} while (i==1);
		
	}

}
