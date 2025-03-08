import java.util.Scanner;

public class TelephoneNumberTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 10-character telephone number in the format XXX-XXX-XXXX: ");
        String phoneNumber = scanner.nextLine();

        String translatedNumber = translatePhoneNumber(phoneNumber);
        System.out.println("Translated telephone number: " + translatedNumber);

        scanner.close();
    }

    public static String translatePhoneNumber(String phoneNumber) {
        StringBuilder translated = new StringBuilder();

        for (char ch : phoneNumber.toCharArray()) {
            if (Character.isLetter(ch)) {
                char upperCh = Character.toUpperCase(ch);
                if (upperCh >= 'A' && upperCh <= 'C') {
                    translated.append('2');
                } else if (upperCh >= 'D' && upperCh <= 'F') {
                    translated.append('3');
                } else if (upperCh >= 'G' && upperCh <= 'I') {
                    translated.append('4');
                } else if (upperCh >= 'J' && upperCh <= 'L') {
                    translated.append('5');
                } else if (upperCh >= 'M' && upperCh <= 'O') {
                    translated.append('6');
                } else if (upperCh >= 'P' && upperCh <= 'S') {
                    translated.append('7');
                } else if (upperCh >= 'T' && upperCh <= 'V') {
                    translated.append('8');
                } else if (upperCh >= 'W' && upperCh <= 'Z') {
                    translated.append('9');
                }
            } else {
                translated.append(ch);
            }
        }

        return translated.toString();
    }
}