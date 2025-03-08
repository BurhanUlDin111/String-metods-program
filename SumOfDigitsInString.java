import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a series of single-digit numbers with nothing separating them: ");
        String input = scanner.nextLine();

        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum += digit;

                if (digit > highest) {
                    highest = digit;
                }
                if (digit < lowest) {
                    lowest = digit;
                }
            }
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Highest digit: " + highest);
        System.out.println("Lowest digit: " + lowest);

        scanner.close();
    }
}