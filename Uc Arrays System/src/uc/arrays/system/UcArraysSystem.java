package uc.arrays.system;
import java.util.Scanner;

public class UcArraysSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("       Sirang Kapo team!          ");
        System.out.println();

        String students[] = {"Dhellmar","Shaquil","Crist","Zues","Jared"};
        int size = 3;
        double grades[][] = new double[students.length][size];

        // Input grades
        for (int i = 0; i < students.length; i++) {
            System.out.println("Input mo yung tatlong grade ni: " + students[i] + ":");

            for (int times = 0; times < size; times++) {

                while (true) {
                    System.out.print(students[i] + " - Grade " + (times + 1) + ": ");

                    try {
                        double g = Double.parseDouble(input.nextLine());

                        if (g <= 0) {
                            System.out.println("Bawal 0 or negative! Ulit:");
                        } else if (g > 100) {
                            System.out.println("Sobrang taas! Dapat 1–100 lang. Ulit:");
                        } else {
                            grades[i][times] = g; // valid input
                            break; // exit while loop
                        }

                    } catch (Exception e) {
                        System.out.println("Ayusin mo naman boss, numbers lang!");
                    }
                }
            }
            System.out.println();
        }

        // Calculate and display averages
        System.out.println("==== Averages per Student ====");
        for (int i = 0; i < students.length; i++) {
            double total = 0;

            for (int j = 0; j < size; j++) {
                total += grades[i][j];
            }

            double average = total / size;
            System.out.println(students[i] + " Average: " + average);
            
            
            
            
        }
    }
}
