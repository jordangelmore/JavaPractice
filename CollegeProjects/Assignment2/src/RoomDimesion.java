import sun.security.util.Length;

/**
 * Created by Gundam 240sx on 6/27/2016.
 */
public class RoomDimesion {
    private double length;
    private double width;


    public RoomDimesion(double len, double wid) {
        this.length = len;
        this.width = wid;
    }

    public RoomDimesion(RoomDimesion roomDimesion){
        this.length = roomDimesion.getLength();
        this.width = roomDimesion.getWidth();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    public double getArea(){
            return length*width; }

    @Override
    public String toString() {
        return "RoomDimesion{" +
                "length=" + length +
                ", width=" +width +
                '}';
    }
}
