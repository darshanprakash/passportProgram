package practice.day2.rpsGame;

public class Player {

    private String name;

    private Move move;

    private Integer score;

    public Player() {
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Move getMove() {
        return move;
    }

    protected void setMove(Move move) {
        this.move = move;
        System.out.println(name + " selected " + move);
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
