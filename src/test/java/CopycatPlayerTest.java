import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class CopycatPlayerTest {
    @Test
    public void returnCooperateForFirstMove(){
        assertEquals(Input.COOPERATE, new CopycatPlayer().getInput(Arrays.asList()));
    }
    @Test
    public void returnCopyOfOtherPlayerForCheat(){
        assertEquals(Input.CHEAT, new CopycatPlayer().getInput(Arrays.asList(Input.CHEAT)));
    }
    @Test
    public void returnCopyOfOtherPlayerForCooperate(){
        assertEquals(Input.COOPERATE, new CopycatPlayer().getInput(Arrays.asList(Input.COOPERATE)));
    }
}
