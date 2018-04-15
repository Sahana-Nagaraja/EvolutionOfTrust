import java.util.ArrayList;
import java.util.List;

public class Player{

    int score;
    private List<Input> otherInputs;

    public Player(PlayerBehavior playerBehavior) {
        otherInputs = new ArrayList<>();
        this.playerBehavior = playerBehavior;
    }

    PlayerBehavior playerBehavior;
    public int getTotalScore() {
        return score;
    }
    public void addToScore(int value) {
        this.score += value;
    }
    public void setOtherInputs(Input input){
        otherInputs.add(input);
    }

}
