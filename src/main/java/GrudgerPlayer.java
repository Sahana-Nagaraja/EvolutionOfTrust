import java.util.List;

public class GrudgerPlayer implements PlayerBehavior{
    public Input getInput(List<Input> inputs) {
        if (inputs.contains(Input.CHEAT)) return Input.CHEAT;
        return Input.COOPERATE;
    }
}
