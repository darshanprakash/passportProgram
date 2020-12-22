package practice.day1;

public class SpeedConverter {

    private long toMilesPerHour(double kilometersPerHour) {
        return Math.round(kilometersPerHour / 1.609);
    }

    public void printSpeedInMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid");
        else System.out.println(toMilesPerHour(kilometersPerHour));
    }
}
