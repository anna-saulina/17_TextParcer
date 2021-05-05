import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string = "ABCDEFGHIJGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" +
                "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String symbol = " \\n\\t,.!?;:()";

        Scanner reader = new Scanner(System.in);  // Читаем ввод строки с консоли
        System.out.println("Enter a string: ");
        String input = reader.nextLine(); // Записываем введенную строку с консоли в переменную
        int count = 0;
        int countWords = 0;
        String word = "";

        // Инициализируем массив для накопления и подсчета слов
        ArrayList<String> words = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            String newletter = Character.toString(letter);
            boolean ifContain = true;
            if (ifContain == string.contains(newletter)) {
                count += 1;
                word += newletter;
                // Если последний символ в строке оканчивается буквой - добавляем слово в массив
                if (i == input.length() - 1 && ifContain == string.contains(newletter)) {
                    words.add(word);
                    countWords += 1;
                }
            } else {
                // Добавляем слово в массив, если встречаем разделитель и если слово не пустое
                if (word.length() > 0) {
                    words.add(word);
                    countWords += 1;
                    word = "";
                } else {
                    continue;
                }
            }
        }

        System.out.println("Количество букв в строке: " + count);
        System.out.println("Количество слов в строке: " + countWords);
    }
}
