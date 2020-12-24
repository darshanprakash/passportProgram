package practice.day2.rpsGame;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Game {

    private final Logger logger;
    private User user;
    private Computer computer;
    private Scanner scanner;
    private boolean playing;

    public Game() {
        user = new User();
        computer = new Computer();
        scanner = new Scanner(System.in);
        logger = Logger.getLogger(PlayRPS.class.getName());
        startGame();
    }

    private void startGame() {
        logger.info("The game has started");
        playing = true;
        while (playing) {
            user.selectMove();
            computer.selectMove();
            setScore();
            displayScore();
            continueGame();
        }
        displayWinner();
    }

    private void setScore() {
        GameState state = user.getMove().checkResult(computer.getMove());
        switch (state) {
            case WIN -> user.setScore(user.getScore() + 1);
            case LOOSE -> computer.setScore(computer.getScore() + 1);
        }

    }

    private void displayScore() {
        System.out.println("Your score: " + user.getScore() + "\t\tComputer's score: " + computer.getScore());
    }

    private void continueGame() {
        System.out.println("Do you like to continue the game? [Y/N]");
        if (!scanner.nextLine().toUpperCase().equals("Y")) {
            playing = false;
            logger.info("user has aborted the game");
        }
    }

    private void displayWinner() {
        if (computer.getScore() == user.getScore()) System.out.println("The game was a draw.");
        else if (user.getScore() > computer.getScore()) System.out.println("You won the Game!");
        else System.out.println("You lost the Game!");
    }
}
