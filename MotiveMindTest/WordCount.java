package MotiveMindTest;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countWords(input));
    }

    public static int countWords(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i == 0 || (c >= 'A' && c <= 'Z')) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    count += 2;
                } else {
                    count += 1;
                }
            }
        }
        return count;
    }
}
