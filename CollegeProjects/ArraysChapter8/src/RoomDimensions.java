/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class RoomDimensions {
    double length;
    double width;

    public RoomDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

}
