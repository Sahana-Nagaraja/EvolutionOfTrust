import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static junit.framework.TestCase.assertEquals;

public class UserPlayerTest {
    @Test
    public void shouldReadSingleInputFromUserForCheat(){
        System.setIn(new ByteArrayInputStream("CHEAT".getBytes()));

        assertEquals(Input.CHEAT, new ConsoleInputReader().readSingleInput());
    }
    @Ignore
    @Test
    public void shouldReadSingleInputFromUserForCooperate(){
        System.setIn(new ByteArrayInputStream("COOPERATE".getBytes()));

        assertEquals(Input.COOPERATE, new ConsoleInputReader().readSingleInput());

    }
}
