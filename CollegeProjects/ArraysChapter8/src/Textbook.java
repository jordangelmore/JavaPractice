/**
 * Created by Gundam 240sx on 6/27/2016.
 */
public class Textbook {
    private String title;
    private String author;
    private String publisher;

    //constructor
    public Textbook(String textTitle, String auth, String pub){
        title = textTitle;
        author = auth;
        publisher = pub;
    }

    //copy constructor initializes the object as a copy ofanother textbook object
    public Textbook(Textbook object2){
        title = object2.title;
        author = object2.author;
        publisher= object2.publisher;
    }

    //set method sets value for each field
    public void set(String textTitle, String auth, String pub){
        title = textTitle;
        author = auth;
        publisher = pub;
    }
//return string containing the information
    public String toString() {
         String str = "Title: " + title +
                "\nAuthor:" + author +
                "\nPublisher:" + publisher;
        return str;

    }



}
