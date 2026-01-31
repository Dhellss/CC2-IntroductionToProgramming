

package classroomattendancesystem;

import java.util.Scanner;

public class ClassroomAttendanceSystem {

    
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        int Ttlll;
        int Prsnt = 0;
        int Absnt = 0;
        String Attndance;
        
        
        System.out.print("Enter the total number of students: ");
        Ttlll = input.nextInt();

        for (int i = 1; i <= Ttlll; i++) {
            
            
            
          System.out.print("Is student " + i + " present? (Y/N): ");
          Attndance = input.nextLine();
          
          
            if (Attndance.equalsIgnoreCase("Y")) {
                Prsnt++;
            } else if (Attndance.equalsIgnoreCase("N")) {
                Absnt++;
            } else {
                System.out.println("Opps must Enter Y/N...");
                i--; 
            }}
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("Total present: " + Prsnt);
        System.out.println("Total absent: " + Absnt);

        input.close();
    }
}

        
        
        
        
  

