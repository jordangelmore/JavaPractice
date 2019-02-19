import java.awt.*;

/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class rectangle {
  private double length, width;

    public rectangle(double len, double w) {

        length = len;
        width = w;
    }

   /* public rectangle(rectangle rect){
        this.length = rect.getLength();
        this.width = rect.getWidth();
    }*/

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public  double getArea(){
        return length*width;
    }

    /*@Override
    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                "area=" + getArea() +
                '}';
    }*/
}
