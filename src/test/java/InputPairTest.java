import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class InputPairTest {

    @Test
    public void shouldReturnFalseForDifferntInputPairs(){
        InputPair inputPair1 = new InputPair(Input.CHEAT,Input.COOPERATE);
        InputPair inputPair2 = new InputPair(Input.CHEAT,Input.CHEAT);
        assertFalse(inputPair1.equals(inputPair2));
    }@Test
    public void shouldReturnTrueforSameInputPair(){
        InputPair inputPair1 = new InputPair(Input.CHEAT,Input.COOPERATE);
        InputPair inputPair2 = new InputPair(Input.CHEAT,Input.COOPERATE);
        assertTrue(inputPair1.equals(inputPair2));
    }
}
