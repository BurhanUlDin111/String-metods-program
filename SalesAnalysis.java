import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalesAnalysis {
    public static void main(String[] args) {
        try {
            File file = new File("SalesData.txt");
            Scanner fileScanner = new Scanner(file);

            double totalSalesAllWeeks = 0;
            int weekCount = 0;
            double highestSales = Double.MIN_VALUE;
            int highestWeek = 0;
            double lowestSales = Double.MAX_VALUE;
            int lowestWeek = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] salesData = line.split(",");
                double totalSalesWeek = 0;

                for (String sale : salesData) {
                    totalSalesWeek += Double.parseDouble(sale);
                }

                double averageDailySales = totalSalesWeek / salesData.length;
                weekCount++;
                totalSalesAllWeeks += totalSalesWeek;

                if (totalSalesWeek > highestSales) {
                    highestSales = totalSalesWeek;
                    highestWeek = weekCount;
                }
                if (totalSalesWeek < lowestSales) {
                    lowestSales = totalSalesWeek;
                    lowestWeek = weekCount;
                }

                System.out.println("Week " + weekCount + ":");
                System.out.println("  Total Sales: $" + totalSalesWeek);
                System.out.println("  Average Daily Sales: $" + averageDailySales);
            }

            double averageWeeklySales = totalSalesAllWeeks / weekCount;

            System.out.println("\nOverall Results:");
            System.out.println("  Total Sales for All Weeks: $" + totalSalesAllWeeks);
            System.out.println("  Average Weekly Sales: $" + averageWeeklySales);
            System.out.println("  Week with Highest Sales: Week " + highestWeek);
            System.out.println("  Week with Lowest Sales: Week " + lowestWeek);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: SalesData.txt");
        }
    }
}