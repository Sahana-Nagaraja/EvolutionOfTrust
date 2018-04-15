import java.util.Scanner;

public class ConsoleInputReader {
    private static Scanner scan = new Scanner(System.in);

    public Input readSingleInput() {
        String in = scan.nextLine().toUpperCase().trim();
        return Input.valueOf(in);
    }
}
