import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MorseCodeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to Morse code: ");
        String input = scanner.nextLine().toUpperCase();

        String morseCode = convertToMorseCode(input);
        System.out.println("Morse code: " + morseCode);

        scanner.close();
    }

    public static String convertToMorseCode(String input) {
        // Define lists for characters and their corresponding Morse codes
        List<Character> characters = new ArrayList<>();
        List<String> morseCodes = new ArrayList<>();

        // Add characters and Morse codes to the lists

        characters.add(' '); morseCodes.add(" ");

        StringBuilder morseCode = new StringBuilder();

        for (char ch : input.toCharArray()) {
            int index = characters.indexOf(ch);
            if (index != -1) {
                morseCode.append(morseCodes.get(index)).append(" ");
            } else {
                morseCode.append("? ");
            }
        }

        return morseCode.toString().trim();
    }
}