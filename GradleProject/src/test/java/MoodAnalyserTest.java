import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void HappyMoods() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("this is happy massage");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }


    @Test
    public void testMoodAnalysis() {
         MoodAnalyser moodAnalyser = new MoodAnalyser();
         String mood = moodAnalyser.analyseMood("this is sad massage");
         System.out.println(mood);
         Assert.assertThat(mood, CoreMatchers.is("SAD"));
    
    }
}
