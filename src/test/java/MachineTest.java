import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MachineTest {
    @Test
    public void shouldReturn0WhenBothPlayersCheat() {
        InputPair inputPair = new InputPair(Input.CHEAT,Input.CHEAT);
        OutputPair outputPair = new OutputPair(0,0);
        assertEquals(outputPair, Machine.getScore(inputPair));
    }
    @Test
    public void shouldReturn3AndMinus1WhenPlayer1CheatsAndPlayer2Cooperates() {
        InputPair inputPair = new InputPair(Input.CHEAT,Input.COOPERATE);
        OutputPair outputPair = new OutputPair(3,-1);

        assertEquals(outputPair, Machine.getScore(inputPair));

    }

    @Test
    public void shouldReturnMinus1And3WhenPlayer1CooperatesAndPlayer2Cheats() {
        InputPair inputPair = new InputPair(Input.COOPERATE,Input.CHEAT);
        OutputPair outputPair = new OutputPair(-1,3);

        assertEquals(outputPair, Machine.getScore(inputPair));
    }

    @Test
    public void shouldReturn2And2WhenPlayer1CooperatesAndPlayer2Cooperates() {
        InputPair inputPair = new InputPair(Input.COOPERATE,Input.COOPERATE);
        OutputPair outputPair = new OutputPair(2,2);

        assertEquals(outputPair, Machine.getScore(inputPair));
    }

}
