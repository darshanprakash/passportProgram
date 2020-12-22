package practice.day1;

public class DistanceConverter {

    private double toCentimeter(double feet) {
        return feet * 30.48;
    }

    private long toCentimeter(int feet) {
        return (long) (feet * 30.48);
    }

    public void printDistanceInCentiMeter(double feet) {
        if (feet < 0) System.out.println("Invalid");
        else System.out.println(toCentimeter(feet));
    }

    public void printDistanceInCentiMeter(int feet) {
        if (feet < 0) System.out.println("Invalid");
        else System.out.println(toCentimeter(feet));
    }
}
