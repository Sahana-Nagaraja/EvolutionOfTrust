import java.util.List;

public class CheatPlayer implements PlayerBehavior {

    public Input getInput(List<Input> inputs) {
        return Input.CHEAT;
    }
}
