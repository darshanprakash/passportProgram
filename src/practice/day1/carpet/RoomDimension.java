package practice.day1.carpet;

public class RoomDimension {

    private final int length;

    private final int width;

    public RoomDimension(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public long getArea() {
        return (long) length * width;
    }
}
