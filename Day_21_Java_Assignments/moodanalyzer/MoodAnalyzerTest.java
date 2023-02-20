package Day_21_Java_Assignments.moodanalyzer;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyzerTest {
		
		@Test
		public void moodAnalyzerHappyTest() {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
			assertEquals("HAPPY",moodAnalyzer.moodAnalyzer("JAVA HO TO DO HAPPY"));
		}
		@Test
		public void moodAnalyzerSadTest() {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
			assertEquals("SAD",moodAnalyzer.moodAnalyzer("SAD HO TO DO JAVA"));
		}
	
	}