import java.util.List;

public interface PlayerBehavior {
    Input getInput(List<Input> otherInputs);
}
