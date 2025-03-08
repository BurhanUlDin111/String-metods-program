import java.util.Scanner;
public class SentenceCapitalizer {

    public static String sentenceCapitalizer(String text) {
        String[] sentences = text.split("\\. ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
                String capitalizedSentence = sentences[i].substring(0, 1).toUpperCase() + sentences[i].substring(1);
                result.append(capitalizedSentence);
                if (i < sentences.length - 1) result.append(". ");
        }
        System.out.println(sentences[0]);
        System.out.println(sentences[1]);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String capitalizedText = sentenceCapitalizer(input);
        System.out.println("Capitalized text: " + capitalizedText);
        scanner.close();
    }
} 
