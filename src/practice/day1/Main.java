package practice.day1;

public class Main {
    public static void main(String[] args) {
        SpeedConverter speedConverter = new SpeedConverter();
        speedConverter.printSpeedInMilesPerHour(100);

        DistanceConverter distanceConverter = new DistanceConverter();
        distanceConverter.printDistanceInCentiMeter(15.0);
    }
}
