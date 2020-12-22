package practice.day1.carpet;

public class RoomCarpet extends RoomDimension {

    private final int costPerSqFoot;

    public RoomCarpet(int length, int width, int costPerSqFoot) {
        super(length, width);
        this.costPerSqFoot = costPerSqFoot;
    }

    public long getCostOfCarpet() {
        return costPerSqFoot * getArea();
    }
}
