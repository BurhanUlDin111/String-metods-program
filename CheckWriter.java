import java.util.Scanner;

public class CheckWriter {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date (MM/DD/YYYY): ");
        String date = scanner.nextLine();

        System.out.print("Enter the payee's name: ");
        String payee = scanner.nextLine();

        System.out.print("Enter the check amount: ");
        double amount = scanner.nextDouble();

        String amountInWords = convertToWords(amount);
        System.out.println("\nDate: " + date);
        System.out.println("Pay to the Order of: " + payee);
        System.out.println(amountInWords);
        System.out.printf("$%.2f\n", amount);

        scanner.close();
    }

    public static String convertToWords(double amount) {
        int dollars = (int) amount;
        int cents = (int) Math.round((amount - dollars) * 100);

        String dollarWords = convertNumberToWords(dollars);
        String centWords = cents > 0 ? " and " + cents + " cents" : "";

        return dollarWords + centWords;
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        String words = "";
        if (number / 1000 > 0) {
            words += convertNumberToWords(number / 1000) + " Thousand ";
            number %= 1000;
        }
        if (number / 100 > 0) {
            words += convertNumberToWords(number / 100) + " Hundred ";
            number %= 100;
        }
        if (number > 0) {
            if (number < 10) {
                words += units[number];
            } else if (number < 20) {
                words += teens[number - 10];
            } else {
                words += tens[number / 10] + " ";
                words += units[number % 10];
            }
        }

        return words.trim();
    }
}