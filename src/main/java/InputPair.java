import java.util.Objects;

public class InputPair {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputPair inputPair = (InputPair) o;
        return input1 == inputPair.input1 &&
                input2 == inputPair.input2;
    }

    @Override
    public int hashCode() {

        return Objects.hash(input1, input2);
    }

    private Input input1;
    private Input input2;
    InputPair( Input input1, Input input2){
        this.input1 = input1;
        this.input2 = input2;
    }

}
