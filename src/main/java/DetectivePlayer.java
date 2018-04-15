import java.util.Arrays;
import java.util.List;

public class DetectivePlayer implements PlayerBehavior{

    @Override
    public Input getInput(List<Input> otherInputs) {
        List<Input> detectiveInputs = Arrays.asList(Input.COOPERATE,Input.CHEAT,Input.COOPERATE,Input.COOPERATE);
        if(otherInputs.size()>=4){
            if(otherInputs.contains(Input.CHEAT)){
                return new CopycatPlayer().getInput(otherInputs);
            }
            else
                return Input.CHEAT;
        }
        return detectiveInputs.get(otherInputs.size());
    }
}
