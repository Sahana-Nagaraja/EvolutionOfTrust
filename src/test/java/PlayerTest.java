import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void shouldAddScoreToPlayer() {
        Player player = new Player(new UserPlayer());
        player.addToScore(5);
        assertEquals(5, player.getTotalScore());
    }

}