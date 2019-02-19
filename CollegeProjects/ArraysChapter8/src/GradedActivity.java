/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class GradedActivity {
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public char getGrade()
    {char lettergrade;

    if (score >= 90)
    lettergrade = 'A';
        else if(score >=80)
            lettergrade ='B';
    else if(score >=70)
        lettergrade ='C';
    else if(score >=60)
        lettergrade ='D';
        else
    lettergrade = 'F';
        return lettergrade;
    }


}
