import java.util.Scanner;

public class WordSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence with run-together words: ");
        String input = scanner.nextLine();

        String formattedSentence = separateWords(input);
        System.out.println("Formatted sentence: " + formattedSentence);

        scanner.close();
    }

    public static String separateWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        StringBuilder result = new StringBuilder();
        result.append(sentence.charAt(0)); // Add the first character as is

        for (int i = 1; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            // If the current character is uppercase, add a space and convert to lowercase
            if (Character.isUpperCase(currentChar)) {
                result.append(' ');
                result.append(Character.toLowerCase(currentChar));
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}