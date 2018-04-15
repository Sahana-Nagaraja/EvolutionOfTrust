import java.util.Objects;

public class OutputPair {
    private int output1;
    private int output2;

    OutputPair() {

    }

    OutputPair(int output1, int output2) {
        this.output1 = output1;
        this.output2 = output2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutputPair that = (OutputPair) o;
        return output1 == that.output1 &&
                output2 == that.output2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(output1, output2);
    }

    public int getOutput1() {
        return output1;
    }

    public int getOutput2() {
        return output2;
    }

    @Override
    public String toString() {
        return output1+","+output2;
    }
}


