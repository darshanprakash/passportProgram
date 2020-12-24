package practice.day2.rpsGame;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class User extends Player {

    private Scanner scanner;

    private final Logger logger;

    public User() {
        setName("You");
        setScore(0);
        scanner = new Scanner(System.in);
        logger = Logger.getLogger(User.class.getName());
    }

    public void selectMove() {
        System.out.println("Select your Move: R -> rock, P -> paper or S -> scissor");
        String input = scanner.nextLine().toUpperCase();
        switch (input) {
            case "R" -> {
                setMove(Move.ROCK);
                logger.info("user selected the move "+ Move.ROCK);
            }
            case "P" -> {
                setMove(Move.PAPER);
                logger.info("user selected the move "+ Move.PAPER);
            }
            case "S" -> {
                setMove(Move.SCISSOR);
                logger.info("user selected the move "+ Move.SCISSOR);

            }
            default -> {
                logger.info("user selected incorrect move");
                throw new IllegalArgumentException("Cannot accept the input");
            }
        }
    }
}
