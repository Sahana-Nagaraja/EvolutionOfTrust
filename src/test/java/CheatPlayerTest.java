import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CheatPlayerTest {

    @Test
    public void shouldReturnCheatPlayer() {
        assertEquals(Input.CHEAT, new CheatPlayer().getInput(Arrays.asList(Input.COOPERATE)));
    }


}