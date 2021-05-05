import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string = "ABCDEFGHIJGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String symbol = " \\n\\t,.!?;:()";

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a string: ");
        String input = reader.nextLine(); // Scans the next token of the input as an int.
//once finished
        int count = 0;
        int countWords = 0;
        String word = "";

        ArrayList<String> words = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            String newletter = Character.toString(letter);
            boolean ifContain = true;
            if (ifContain == string.contains(newletter)) {
                count += 1;
                word += newletter;
            } else {
                words.add(word);
                countWords += 1;
                word = "";
            }
        }
        countWords += 1;

        System.out.println("Количество букв в строке: " + count);
        System.out.println("Количество слов в строке: " + countWords);
    }
}
