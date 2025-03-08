import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a series of numbers separated by commas: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(",");
        int sum = 0;

        for (String number : numbers) {
            sum += Integer.parseInt(number.trim());
        }

        System.out.println("The sum of the numbers is: " + sum);

        scanner.close();
    }
}