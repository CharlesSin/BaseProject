package old;

public class Data {

    private String analysisans;
    private double totalScore;

    public String analysisData(double totalScore) {

        if (totalScore < 200) {
            analysisans = "Please Go To Work, Because your study result is to bad.";
            System.out.println(analysisans);
        } else if (totalScore >= 200) {
            analysisans = "Please When To High School STUDY HARD!!!";
            System.out.println(analysisans);
        }

        return analysisans;

    }

    public double getTotalScore() {
        System.out.println("Your total score after analysis : " + totalScore);
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore / 2;
    }

}
