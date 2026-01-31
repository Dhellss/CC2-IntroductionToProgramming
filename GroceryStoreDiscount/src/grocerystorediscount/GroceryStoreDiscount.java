 
package grocerystorediscount;
 import java.util.Scanner;
public class GroceryStoreDiscount {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        
         

      while (true){
          
          System.out.print("Enter the total amount purchased: ");
       String ifif = input.nextLine();
       
       double Discount;
        try {
          
           Discount = Double.parseDouble(ifif);
        } catch (NumberFormatException e) {
         
           
            System.out.println("You must enter the total amount of purchased!");
          continue;
        }
                     System.out.println("=====================================" );

          if (Discount >= 10000){
       
           double total1 = 0.15 *Discount ;
           double amount = Discount - total1;
        System.out.println("Discount: 15%" );
       System.out.println("Final price after discount: " + amount );
       
       }
       else if (Discount >= 5000){
       
           double total2 = 0.10 *Discount;
           double amount1 = Discount - total2;
        System.out.println("Discount: 10%" );
       System.out.println("Final price after discount: " + amount1 );
       
       }
        else if (Discount >= 1000){
       
           double total3 = 0.05 *Discount;
           double amount2 = Discount - total3;
        System.out.println("Discount: 5%" );
       System.out.println("Final price after discount: " + amount2 );
       
       }
       else if (Discount < 1000){
       
        
        System.out.println("Discount: No Discount" );
       System.out.println("Final price after discount: " + Discount);
       
       }
      
      
       
      
                System.out.println("=====================================" );
        System.out.println("");
        System.out.println("");
         
         
         
          
          
  
      }
          
       
            
         
         
          
             
             
             
             
      
        
        
     }
       
         
    }
    

