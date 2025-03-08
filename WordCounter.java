import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int wordCount = 0;

            while (fileScanner.hasNext()) {
                fileScanner.next();
                wordCount++;
            }

            System.out.println("The file contains " + wordCount + " words.");
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        scanner.close();
    }
}