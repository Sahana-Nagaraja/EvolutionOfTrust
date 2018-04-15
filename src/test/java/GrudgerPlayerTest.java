import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GrudgerPlayerTest {
    @Test
    public void shouldCooperateInUntilTheOtherPlayerCheats(){
        assertEquals(Input.COOPERATE, new GrudgerPlayer().getInput(Arrays.asList(Input.COOPERATE)));
    }

    @Test
    public void shouldCheatWhenTheOtherPlayerCheats(){
        assertEquals(Input.CHEAT, new GrudgerPlayer().getInput(Arrays.asList(Input.CHEAT)));
    }

    @Test
    public void shouldContinueCheatingTillTheEndWhenTheOtherPlayerCheats(){
        assertEquals(Input.CHEAT, new GrudgerPlayer().getInput(Arrays.asList(Input.COOPERATE,Input.CHEAT, Input.COOPERATE)));
    }
}
