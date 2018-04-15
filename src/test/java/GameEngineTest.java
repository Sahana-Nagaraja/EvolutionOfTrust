import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameEngineTest {

    @Mock
    private UserPlayer reader;

    @Mock
    private CheatPlayer cheater;

    @Mock
    private CooperatePlayer Cooperator;

    @Test
    public void shouldReturnCheatPlayer() {
        Player player1 = new Player(reader);
        when(player1.playerBehavior.getInput(null)).thenReturn(Input.COOPERATE);
        Player player2 = new Player(new CheatPlayer());
        GameEngine gameEngine = new GameEngine(player1, player2,1);

        assertEquals("-1,3", gameEngine.play());
        assertEquals(-1, player1.getTotalScore());
        assertEquals(3, player2.getTotalScore());
    }

    @Test
    public void shouldReturnForMultipleRoundsOnCheatPlayer() {
        Player player1 = new Player(reader);
        when(player1.playerBehavior.getInput(null)).thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE);
        Player player2 = new Player(new CheatPlayer());
        GameEngine gameEngine = new GameEngine(player1, player2,5);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));

        gameEngine.start();

        assertEquals("-1,3\n-2,6\n-3,9\n-4,12\n-5,15\n", outStream.toString());

    }

    @Test
    public void shouldReturnCopycatResultsForTwoCopyCats() {
        Player player1 = new Player(cheater);

        when(player1.playerBehavior.getInput(any())).thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE);
        Player player2 = new Player(new CopycatPlayer());

        GameEngine gameEngine = new GameEngine(player1, player2,5);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));

        gameEngine.start();

        assertEquals("2,2\n4,4\n6,6\n8,8\n10,10\n", outStream.toString());

    }

}