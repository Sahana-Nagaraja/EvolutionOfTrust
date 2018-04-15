import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DetectivePlayerTest {
    @Test
    public void shouldCoopertareInFirstRound(){
        assertEquals(Input.COOPERATE, new DetectivePlayer().getInput(Arrays.asList()));
    }

    @Test
    public void shouldCheatInSecondRound(){
        assertEquals(Input.CHEAT, new DetectivePlayer().getInput(Arrays.asList(Input.COOPERATE)));

    }

    @Test
    public void shouldAnalyseAndActLikeCopycatIfCheated(){
        assertEquals(Input.COOPERATE, new DetectivePlayer().getInput(Arrays.asList(Input.COOPERATE, Input.CHEAT,Input.COOPERATE,Input.COOPERATE)));
    }

    @Test
    public void shouldAnalyseAndAlwaysCheatIfNeverCheated(){
        assertEquals(Input.CHEAT, new DetectivePlayer().getInput(Arrays.asList(Input.COOPERATE, Input.COOPERATE,Input.COOPERATE,Input.COOPERATE)));
    }
}
