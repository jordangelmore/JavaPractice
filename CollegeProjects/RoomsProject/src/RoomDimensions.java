
/**
 * Created by Gundam 240sx on 4/4/2016.
 */
public class RoomDimensions {
    double length;
    double width;

    public RoomDimensions (double length, double width){
        super();
        this.length = length;
        this.width = width;


}

    public double GetArea(){
        return length * width;
    }

    @Override
    public String toString(){
        return "return Dimensions [length = " + length + "width = " + width + "]";
    }

}