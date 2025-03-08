import java.util.Scanner;

public class PigLatinConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String pigLatinSentence = convertToPigLatin(sentence);
        System.out.println("Pig Latin: " + pigLatinSentence);

        scanner.close();
    }

    public static String convertToPigLatin(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                String pigLatinWord = word.substring(1) + word.charAt(0) + "ay";
                pigLatinSentence.append(pigLatinWord).append(" ");
            } else {
                pigLatinSentence.append(word).append("ay ");
            }
        }

        return pigLatinSentence.toString().trim();
    }
}