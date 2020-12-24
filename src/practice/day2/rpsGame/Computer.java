package practice.day2.rpsGame;

import org.apache.log4j.Logger;

import java.util.Random;

public class Computer extends Player {

    private final Logger logger;
    private Random random;

    public Computer() {
        setName("Computer");
        setScore(0);
        random = new Random();
        logger = Logger.getLogger(Computer.class.getName());
    }

    public void selectMove() {
        Move move = Move.values()[random.nextInt(Move.values().length)];
        setMove(move);
        logger.info("Computer selected " + move);
    }
}
