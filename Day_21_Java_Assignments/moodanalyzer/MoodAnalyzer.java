package Day_21_Java_Assignments.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {

	String moodAnalyzer(String message) throws MoodAnalyzerExceptions {
			if(message.contains("SAD")) {
				return "SAD";
			}else if(message.contains("HAPPY")) {
				return "HAPPY"; 
			}else {
				throw new MoodAnalyzerExceptions("Invalid Mood...");
			}
	}
	
	
	public static void main(String[] args) {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Tell me in one word what do you feel :: ");
		System.out.println("**********");
		try {
		System.out.println(moodAnalyzer.moodAnalyzer(getInput.next()));
		}catch(MoodAnalyzerExceptions e) {
			System.err.println(e);
			System.out.println("-- Stay Happy and Code --");
		}catch(Exception e) {
			System.err.println(e);
		}
		System.out.println("**********");
		

	}
	
}