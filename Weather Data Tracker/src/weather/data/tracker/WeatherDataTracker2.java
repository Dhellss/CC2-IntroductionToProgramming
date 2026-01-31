package weather.data.tracker;
import java.util.Scanner;

public class WeatherDataTracker2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        final int city = 3;
        final int days = 7;

        double[][] tmper = new double[city][days];

        System.out.println("=== Weather Data Tracker ===");
        System.out.println("Enter the temperature for 3 cities over 7 days.\n");

     
        for (int i = 0; i < city; i++) {
            System.out.println("City " + (i + 1) + ": ");
            for (int j = 0; j < days; j++) {
                System.out.print("  Day " + (j + 1) + " temperature: ");
                tmper[i][j] = data.nextDouble();
            }
            System.out.println();
        }

      
        for (int i = 0; i < city; i++) {
            double sum = 0;
            double highest = tmper[i][0];
            double lowest = tmper[i][0]; 

            for (int j = 0; j < days; j++) {
                double temp = tmper[i][j];
                sum += temp;

                if (temp > highest) highest = temp;
                if (temp < lowest) lowest = temp; 
            }

            double avg = sum / days;
            System.out.println("===============================================");
            System.out.println("City " + (i + 1) + " Results:");
            System.out.print("  Highest Temperature: "+ highest);
            System.out.println("");
            System.out.print("  Lowest Temperature: "+lowest);
            System.out.println("");
            System.out.print("  Average Temperature: "+avg);
            System.out.println("");
            System.out.println("===============================================");
            System.out.println("");
            System.out.println("");
        }

      
    }
}
