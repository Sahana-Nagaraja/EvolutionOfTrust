import java.util.List;

public class UserPlayer implements PlayerBehavior {

    public Input getInput(List<Input> otherInputs) {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return consoleInputReader.readSingleInput();
    }

}
