package practice.day1;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printSpeed(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid");
        else System.out.println(toMilesPerHour(kilometersPerHour));

    }

    public static void main(String[] args) {
        printSpeed(100.5);
    }
}
