
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CooperatePlayerTest {

    @Test
    public void shouldReturnCooperatePlayer() {
        assertEquals(Input.COOPERATE, new CooperatePlayer().getInput(Arrays.asList(Input.COOPERATE)));
    }

}