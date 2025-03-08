import java.util.Scanner;

public class TelemarketingPhoneList {
    public static void main(String[] args) {
        String[] names = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String[] phones = {"555-2234", "555-9098", "555-1785", "555-9224"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name or part of a name to search: ");
        String searchTerm = scanner.nextLine().trim();

        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(names[i] + ": " + phones[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching names found.");
        }

        scanner.close();
    }
}