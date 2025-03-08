import java.util.Scanner;

class StringAnalyzer {
    private String text;

    public StringAnalyzer(String text) {
        this.text = text;
    }

    public int countVowels() {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : text.toCharArray()) {
            if (vowels.indexOf(ch) != -1) count++;
        }
        return count;
    }

    public int countConsonants() {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (char ch : text.toCharArray()) {
            if (consonants.indexOf(ch) != -1) count++;
        }
        return count;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringAnalyzer analyzer = new StringAnalyzer(input);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Count the number of vowels in the string");
            System.out.println("b. Count the number of consonants in the string");
            System.out.println("c. Count both the vowels and consonants in the string");
            System.out.println("d. Enter another string");
            System.out.println("e. Exit the program");
            System.out.print("Choose an option: ");
            char choice = scanner.nextLine().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Number of vowels: " + analyzer.countVowels());
                    break;
                case 'b':
                    System.out.println("Number of consonants: " + analyzer.countConsonants());
                    break;
                case 'c':
                    System.out.println("Number of vowels: " + analyzer.countVowels());
                    System.out.println("Number of consonants: " + analyzer.countConsonants());
                    break;
                case 'd':
                    System.out.print("Enter another string: ");
                    analyzer.setText(scanner.nextLine());
                    break;
                case 'e':
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}