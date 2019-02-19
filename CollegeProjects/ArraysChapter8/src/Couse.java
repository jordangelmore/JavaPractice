/**
 * Created by Gundam 240sx on 6/27/2016.
 */
public class Couse {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    //constructor sets parameters

    public Couse(String Cname, Instructor instr, Textbook text){
        courseName = Cname;
        //new instructor object passing inst as an arguement to the copy constructor
        instructor = new Instructor(instr);
        textbook = new Textbook(text);
    }

    //getters
    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }
    //tostring method
    public String toString()
    {
        String str = "course Name: " + courseName +
                "\nInstructor:" + instructor +
                "\nTextbook info:\n" + textbook;
        return str;
    }

}
