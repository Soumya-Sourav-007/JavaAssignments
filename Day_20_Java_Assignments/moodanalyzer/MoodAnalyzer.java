package Day_20_Java_Assignments.moodanalyzer;

public class MoodAnalyzer {

	

	String moodAnalyzer(String message) {

		if(message.contains("SAD")) {
			return "SAD";
		}
		else {
				return "HAPPY";
		}

}
public static void main(String[] args) {

	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	System.out.println("**********");
	System.out.println(moodAnalyzer.moodAnalyzer("JAVA HO TO DO HAPPY"));
	System.out.println('\n'+"<<<<<>>>>>"+'\n');
	System.out.println(moodAnalyzer.moodAnalyzer("SAD HO TO DO JAVA"));
	System.out.println("**********");


}
}
