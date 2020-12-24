package practice.day2.rpsGame;

public enum Move {

    ROCK,
    PAPER,
    SCISSOR;

    public GameState checkResult(Move otherMove) {
        switch (this) {
            case ROCK -> {
                if (otherMove == ROCK) return GameState.DRAW;
                else if (otherMove == PAPER) return GameState.LOOSE;
                else return GameState.WIN;
            }
            case PAPER -> {
                if (otherMove == PAPER) return GameState.DRAW;
                else if (otherMove == SCISSOR) return GameState.LOOSE;
                else return GameState.WIN;
            }
            case SCISSOR -> {
                if (otherMove == SCISSOR) return GameState.DRAW;
                else if (otherMove == ROCK) return GameState.LOOSE;
                else return GameState.WIN;
            }
        }
        return null;
    }
}
