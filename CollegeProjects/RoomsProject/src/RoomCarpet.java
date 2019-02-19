/**
 * Created by Gundam 240sx on 4/4/2016.
 */
public class RoomCarpet {
    public RoomDimensions RoomDim;
    private double CostOfCarpet;

    public RoomCarpet(RoomDimensions RoomDim, double CostOfCarpet){
        super();
        this.RoomDim = RoomDim;
        this.CostOfCarpet = CostOfCarpet;

    }
      public double GetTotalCost(){
          return CostOfCarpet * RoomDim.GetArea();
      }


    @Override
    public String toString(){
        return "The total cost of the carpet is $" + GetTotalCost();
    }

}
