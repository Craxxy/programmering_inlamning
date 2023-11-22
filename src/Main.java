import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharCounter charCounter = new CharCounter();

        while(true){
            String input = scanner.nextLine().toLowerCase(Locale.ROOT);
            if(input.equals("stop")) {
                System.out.println("CHARS: " + charCounter.getAmountOfChars());
                System.out.println("LINES: " + charCounter.getAmountOfLines());
                break;
            }
            charCounter.addWords(input);
        }
    }
}