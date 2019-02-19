/**
 * Created by Gundam 240sx on 6/28/2016.
 */
public class RoomCarpet extends RoomDimensions{

    double carpetCost;

    public RoomCarpet(double length, double width, double cost){
        super(length, width);
        carpetCost =cost;
    }

    public double getCarpetCost() {
        return carpetCost;
    }

    public double getTotalCost(){
        return getArea() * carpetCost;
    }

}
