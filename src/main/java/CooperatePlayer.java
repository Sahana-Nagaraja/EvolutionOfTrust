import java.util.List;

public class CooperatePlayer implements PlayerBehavior {

    public Input getInput(List<Input> inputs) {
        return Input.COOPERATE;
    }
}
