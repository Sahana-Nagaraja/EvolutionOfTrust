import java.util.Scanner;

class ConsoleInputReader {
    private Scanner scan = new Scanner(System.in);

    Input readSingleInput() {
        String in = scan.nextLine().toUpperCase().trim();
        return Input.valueOf(in);
    }
}
