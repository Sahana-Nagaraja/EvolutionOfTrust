import java.util.Arrays;
import java.util.Scanner;

public class GameEngine {


    private final Player player1;
    private final Player player2;
    private int rounds;

    public GameEngine(Player player1, Player player2, int rounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
    }

    public void start() {
        for (int i = 0; i < rounds; i++) {
            System.out.println(play());
        }
    }

    String play() {
            Input input1 = player1.playerBehavior.getInput(Arrays.asList());
            Input input2 = player2.playerBehavior.getInput(Arrays.asList(input1));
            InputPair inputPair = new InputPair(input1, input2);
            OutputPair outputPair = Machine.getScore(inputPair);
            player1.addToScore(outputPair.getOutput1());
            player2.addToScore(outputPair.getOutput2());
            return player1.score+","+player2.score;
        }
}
