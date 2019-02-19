/**
 * Created by Gundam 240sx on 6/27/2016.
 */
public class CourseDemo {

    public static void main(String[] args) {
        //create instructor object
        Instructor myInstructor = new Instructor("Kramer" , "Shawn" , "Rm3030");

        Textbook myText = new Textbook("Starting ouit with java", "Gaddis", "Addison");
        Couse myCouse = new Couse("Intro to java", myInstructor, myText);

        //display course info
        System.out.println(myCouse);

    }
}
