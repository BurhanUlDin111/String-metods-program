import java.util.HashMap;
import java.util.Map;

public class StringOperations {

    // Method to count the number of words in a string
    public static int wordCount(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+"); // Split by whitespace
        return words.length;
    }

    // Method to convert a char array to a String
    public static String arrayToString(char[] array) {
        return new String(array);
    }

    // Method to find the most frequent character in a string
    public static char mostFrequent(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty.");
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequentChar;
    }

    // Method to replace all occurrences of a substring with another string
    public static String replaceSubstring(String string1, String string2, String string3) {
        if (string1 == null || string2 == null || string3 == null) {
            throw new IllegalArgumentException("Arguments cannot be null.");
        }
        return string1.replace(string2, string3);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Demonstrate wordCount
        String sentence = "The dog jumped over the fence";
        System.out.println("Word count: " + wordCount(sentence));

        // Demonstrate arrayToString
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Char array to string: " + arrayToString(charArray));

        // Demonstrate mostFrequent
        String text = "hello world";
        System.out.println("Most frequent character: " + mostFrequent(text));

        // Demonstrate replaceSubstring
        String string1 = "the dog jumped over the fence";
        String string2 = "the";
        String string3 = "that";
        System.out.println("Replaced string: " + replaceSubstring(string1, string2, string3));
    }
}