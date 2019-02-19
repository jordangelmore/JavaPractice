import javax.swing.*;

/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class GradeDemo {

    public static void main(String[] args) {
        String input;
        double testScore;

        //create a graded activity object
        GradedActivity grade = new GradedActivity();

        //get test score
        input = JOptionPane.showInputDialog("Enter " +
        "a numeric test score.");
        testScore = Double.parseDouble(input);

        //store the score in the grade object
        grade.setScore(testScore);

        //display the letterGrad fo the score
        JOptionPane.showMessageDialog(null,"the grade for that test is "
        + grade.getGrade());

        System.exit(0);
    }
}
