public class MoodAnalyser {
    public String analyseMood(String massage) {
        if (massage.contains(("sad"))){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
