import java.util.List;

public class GrudgerPlayer implements PlayerBehavior{
    public Input getInput(List<Input> otherInputs) {
        if (otherInputs.contains(Input.CHEAT)) return Input.CHEAT;
        return Input.COOPERATE;
    }
}
