package Day_20_Java_Assignments.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnanlyzerTest {
	
	@Test
	public void moodAnalyzerHappyTest() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		assertEquals("HAPPY",moodAnalyzer.moodAnalyzer("JAVA >>>>> DO HAPPY"));
	}
	@Test
	public void moodAnalyzerSadTest() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		assertEquals("SAD",moodAnalyzer.moodAnalyzer("SAD >>>>> DO JAVA"));
	}

}


