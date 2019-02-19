import java.awt.geom.Area;

/**
 * Created by Gundam 240sx on 6/27/2016.
 */
public class RoomCarpet {

    private double carpetCost;
    private RoomDimesion roomDimesion;

    public RoomCarpet(double carpetCost2, RoomDimesion roomDimesion) {
        this.carpetCost = carpetCost2;
        this.roomDimesion = roomDimesion;
    }

    public RoomCarpet(RoomCarpet rc)
    {
        this.roomDimesion = rc.roomDimesion;
        this.carpetCost =  rc.getCarpetCost();
    }


    public double getTotalCost(){
            return carpetCost * roomDimesion.getArea();}

    public double getCarpetCost() {
        return carpetCost;
    }

    public RoomDimesion getSize() {
        return roomDimesion;
    }


    @Override
    public String toString() {
        return "RoomCarpet{" +
                "carpetCost=" + carpetCost +
                ", roomDimesion=" + roomDimesion +
                "total cost=" + getTotalCost() +
                 '}';
    }
}

