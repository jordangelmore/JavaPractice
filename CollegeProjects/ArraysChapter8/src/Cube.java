import java.awt.*;

/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class Cube extends rectangle{
    private double hieght;

    public Cube(double len, double w, double h) {
      super(len, w);
        hieght = h;
    }

    public double getHieght() {
        return hieght;
    }

    public double getSrufaceArea(){
        return getArea() * 6; }

    public double getVolume(){
        return getArea() * hieght;
    }



}
