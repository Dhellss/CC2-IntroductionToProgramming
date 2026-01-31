
package finalchallenge;
import java.util.Scanner;
public class FinalChallenge {

    
    
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in); //user input is needed to get the information
       
       int size= 10;// this the size slot of my arrays
       String[] proName = new String[size]; //this is the storage of the names of products
       double[] priceV = new double [size];//this is the storage of the price of products
          String[] subpriceV = new String [size];
       int[] Quanti = new int [size];//this is the storage of the Quantity of products
          String[] subQuanti = new String [size];
       
       double[] ttlV = new double[size];// this is the storage for the value of Total value is priceV * Quanti and the result will insert here
       double total=0;// this variable is the total amount of total value
       
       
        for (int i = 0;i < size; i++){
            System.out.println("");
            System.out.println("==========================");
            System.out.println("|        Products " + (i+1) +"      |");
            System.out.println("==========================");
            System.out.println("");
            
            System.out.print("What is your product: ");
            proName[i] = input.nextLine();
                  System.out.println("");
                  
            System.out.print("What is the price of your product \""+proName[i]+"\": ");
           
            //checker block 
         //this while loop block use for, if user input an invalid input 
            while(true){
             subpriceV[i] = input.nextLine(); //string first 
             try{
                   priceV[i]= Double.parseDouble(subpriceV[i]); // if string value is paresable into integer this will become true and if it is not system will get errors and Catch will be printed
                   System.out.println("");
                   //this if block check if the user input less than Zero
                   if (priceV[i]<0){ 
                    System.out.print("Grabe naman yang Value mo boss...\n ulit: ");
                    
                   }
                   else{break;
                   }
                       
                   }catch(Exception e){
                   System.out.println("Price Value lang naman ilalagay mo...");
                   }
            }
                  
                   
            System.out.print("What is the Quantity of your products \""+proName[i]+"\": ");
          
            while(true){
             subQuanti[i] = input.nextLine();
             try{
                   Quanti[i]= Integer.parseInt(subQuanti[i]);
                   System.out.println("");
                      if (Quanti[i]<0){
                    System.out.print("Grabe naman yang Value mo boss...\n ulit: ");
                    
                   }
                   else{break;
                   }

                   }catch(Exception e){
                   System.out.println("Quantity Value lang naman ilalagay mo...");}
            }
            

             ttlV[i] = priceV[i] * Quanti[i];
             
              System.out.println("");
    System.out.println("Name\t\t\tPrice\t\t\tQuantity\t\t\tTotal Value ");
              System.out.println("===================================================================");
           for (int all = 0; all < size;all++){
    System.out.println( (all+1)+ ".  "+proName[all]+"  " +"\t\t" + priceV[all]+"  "+ "\t\t\t" + Quanti[all]+"  "+"\t\t\t" + ttlV[all] );
    }
              System.out.println("===================================================================");

           }
           
    System.out.println("\n");
    System.out.println("");
    System.out.println("                             FINAL");
    System.out.println("            ========================================");
    System.out.println("                 List of Products ni Dhellskiee");
    System.out.println("            ========================================");
    System.out.println("");
    System.out.println("===================================================================");
    System.out.println("Name\t\t\tPrice\t\t\tQuantity\t\t\t Total Value ");
    System.out.println("-------------------------------------------------------------------");
        for (int all = 0; all < size;all++){
    System.out.println( (all+1)+ ".  "+proName[all] +"  "+"\t\t\t" + priceV[all]+"  "+ "\t\t\t" + Quanti[all]+"  "+"\t\t\t" + ttlV[all] );
        }
    System.out.println("===================================================================");
   //this block add all the amount of total value
    for (int sheesh = 0;sheesh < size;sheesh++){
     total += ttlV[sheesh];
    }
   
        System.out.println("Total: PhP "+ total);
        double Avg = total / size;
        System.out.println("Avarage: "+ Avg);
        
        
        
        
        
  
      double highest = priceV[0];
        double lowest = Quanti[0];

        
        
        
        for (int i = 1; i < ttlV.length; i++) {
            if (ttlV[i] > highest) {
                highest = ttlV[i];
            }
            if (ttlV[i] < lowest) {
                lowest = ttlV[i];
            }
          System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
            
        }

      
        
        
    }
}

      

