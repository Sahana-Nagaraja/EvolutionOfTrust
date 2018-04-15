import java.util.List;

public class CopycatPlayer implements PlayerBehavior {

    public Input getInput(List<Input> inputs){
        if(inputs.size()>0) return inputs.get(inputs.size()-1);
        return Input.COOPERATE;
    }
}
