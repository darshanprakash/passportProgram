package practice.day1.carpet;

public class RoomCarpet {

    RoomDimension roomDimension;

    private final int costPerSqFoot;

    public RoomCarpet(int length, int width, int costPerSqFoot) {
        roomDimension = new RoomDimension(length, width);
        this.costPerSqFoot = costPerSqFoot;
    }

    public long getCostOfCarpet() {
        return costPerSqFoot * roomDimension.getArea();
    }
}
