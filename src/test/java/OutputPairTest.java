import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OutputPairTest {
    @Test
    public void shouldReturnTrueforSameObjects(){
        OutputPair outputPair1 = new OutputPair(0,0);
        OutputPair outputPair2 = new OutputPair(0,0);
        assertEquals(outputPair1, outputPair2);
    }
    @Test
    public void shouldReturnFalseforDifferentObjects(){
        OutputPair outputPair1 = new OutputPair(3,0);
        OutputPair outputPair2 = new OutputPair(0,0);
        assertNotEquals(outputPair1, outputPair2);
    }
}
