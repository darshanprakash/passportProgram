package practice.day1.carpet;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class CarpetCostCalculator {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(CarpetCostCalculator.class.getName());
        logger.info("Logger Set up");
        System.out.println("Carpet cost Calculator");
        System.out.println("Enter the length of the room: ");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        System.out.println("Enter the width of the room: ");
        int width = in.nextInt();
        System.out.println("Enter the cost per square feet of carpet: ");
        int cost = in.nextInt();
        RoomCarpet roomCarpet = new RoomCarpet(length, width, cost);
        System.out.print("Cost of carpet for the room: " + roomCarpet.getCostOfCarpet());
        System.out.println();
    }
}
