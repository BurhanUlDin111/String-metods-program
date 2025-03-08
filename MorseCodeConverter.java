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
        characters.add('A'); morseCodes.add(".-");
        characters.add('B'); morseCodes.add("-...");
        characters.add('C'); morseCodes.add("-.-.");
        characters.add('D'); morseCodes.add("-..");
        characters.add('E'); morseCodes.add(".");
        characters.add('F'); morseCodes.add("..-.");
        characters.add('G'); morseCodes.add("--.");
        characters.add('H'); morseCodes.add("....");
        characters.add('I'); morseCodes.add("..");
        characters.add('J'); morseCodes.add(".---");
        characters.add('K'); morseCodes.add("-.-");
        characters.add('L'); morseCodes.add(".-..");
        characters.add('M'); morseCodes.add("--");
        characters.add('N'); morseCodes.add("-.");
        characters.add('O'); morseCodes.add("---");
        characters.add('P'); morseCodes.add(".--.");
        characters.add('Q'); morseCodes.add("--.-");
        characters.add('R'); morseCodes.add(".-.");
        characters.add('S'); morseCodes.add("...");
        characters.add('T'); morseCodes.add("-");
        characters.add('U'); morseCodes.add("..-");
        characters.add('V'); morseCodes.add("...-");
        characters.add('W'); morseCodes.add(".--");
        characters.add('X'); morseCodes.add("-..-");
        characters.add('Y'); morseCodes.add("-.--");
        characters.add('Z'); morseCodes.add("--..");
        characters.add('0'); morseCodes.add("-----");
        characters.add('1'); morseCodes.add(".----");
        characters.add('2'); morseCodes.add("..---");
        characters.add('3'); morseCodes.add("...--");
        characters.add('4'); morseCodes.add("....-");
        characters.add('5'); morseCodes.add(".....");
        characters.add('6'); morseCodes.add("-....");
        characters.add('7'); morseCodes.add("--...");
        characters.add('8'); morseCodes.add("---..");
        characters.add('9'); morseCodes.add("----.");
        characters.add('.'); morseCodes.add(".-.-.-");
        characters.add(','); morseCodes.add("--..--");
        characters.add('?'); morseCodes.add("..--..");
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