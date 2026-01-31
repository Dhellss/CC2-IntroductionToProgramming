 
package restaurantordersystem;
import java.util.Scanner;
 
public class RestaurantOrderSystem {

  
    public static void main(String[] args) {
      Scanner num = new Scanner (System.in);
      
     //this is a simple banner of Jollibee
      System.out.println("============================================================================================================");
      System.out.println("\t\t     ***   *******  **    **    *******  ******* ******* ******                                                                               ");
      System.out.println("\t\t     ***   **   **  **    **       *     **   ** **      **                                           ");
      System.out.println("\t\t**   ***   **   **  **    **       *     ******* ******  ******                                               ");
      System.out.println("\t\t**   ***   **   **  **    **       *     **   ** **      **                                                   ");
      System.out.println("\t\t********   *******  ***** ***** *******  ******* ******* ******                                              ");
      System.out.println("============================================================================================================");
      
      
       //this is the menu
      System.out.print("          _____Solo Meals_____");
      System.out.println("                                _____Dou/Family Meals_____");
      System.out.print("\"1\" Chickenjoy\t\t -PHP 189.00\t||");
       System.out.println("  \"9\"  Chickenjoy w/ Spaghetti\t\t\t -PHP 295.00 ");
       
      System.out.print("\"2\" Burger_Steak\t -PHP 76.00\t||");
       System.out.println("  \"10\" 8-pc Chickenjoy Bucket\t\t\t\t -PHP 631.00");
       
      System.out.print("\"3\" Jolly_Spaghetti\t -PHP 80.00\t||");
       System.out.println("  \"11\" Jolly Spaghetti Family Pan\t\t\t -PHP 320.00");
       
      System.out.print("\"4\" Palabok\t\t -PHP 138.00\t||");
       System.out.println("  \"12\" Burger Steak Family Savers (6-pc)\t\t -PHP 470.00");
       
      System.out.print("\"5\" Yumburger\t\t -PHP 50.00\t||");
       System.out.println("  \"13\" Jolly Crispy Fries Bucket\t\t\t -PHP 196.00");
       
      System.out.print("\"6\" Choco_Sundae\t -PHP 39.00\t||");
       System.out.println("  \"14\" 2-pc Chickenjoy Solo (with rice & gravy)\t -PHP 186.00");
       
      System.out.print("\"7\" Peach_Mango_Pie\t -PHP 45.00\t||");
       System.out.println("  \"15\" 5-pc Burger Bundle (Yumburgers + Drinks)\t -PHP 365.00 ");
       
      System.out.print("\"8\" Jolly Crispy Fries\t -PHP 57.00\t||");
       System.out.println("  \"16\" 10-pc Burger Bundle (Yumburgers + Drinks)\t -PHP 699.00");
       
      System.out.println("------------------------------------------------------------------------------------------------------------");
      System.out.println("\"0\" Exit");
      System.out.println("============================================================================================================");
      System.out.println("");
    

              int choose;// this need to display outside to recognize below 
              
              //this block auto detect if the user input string/symbol instead of the choices in the Menu
           while (true){
               System.out.println("=====================================");
               System.out.print("Enter the menu number of your choice: ");
       
              String choosing = num.nextLine(); //the input becomes String first
             
           try{
             choose = Integer.parseInt(choosing); //if the input is changeable to integer is = to true and it will goo outside to loop 
             
             //this if statement detect if the user input lower/higher than the choices
               if(choose<0 || choose >=17){
                System.out.println("wala yan sa pagpipilian boss");
                System.out.println("");
                System.out.println("");
               }
               else{
                  break;
               }
               } 
           
           //this will be printed if there is an error in the input
           catch (Exception e) {
               System.out.println("meron bang "+choosing+" sa pagpipilian? ");
               System.out.println("");
               System.out.println("");
              }
              }
           
          
           //this switch statement
          switch (choose){
              //this block exit the program if the user input 0
              case 0: 
                  System.out.println("Exitting Menu!...");
                  
                  break;
                  
                  
                  //this block 1 until to 16 is the choices in the menu
              case 1:
                  int Qty1; 
                  
                  //this while statement is for, detect if the user input input string or symbol instead of  number of Quantity
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo1 = num.nextLine();
                      try {
                          Qty1 = Integer.parseInt(jo1);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total1 = Qty1 * 189;// for the value of total I multiply the Qty input to the price from the menu
                  System.out.println("");
                  System.out.println("");
                  
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose); //I need to re enter this so that the output will be easy to understand by the user
                  System.out.println("Enter the quantity: " + Qty1);
                  System.out.println("You ordered Chickenjoy.");
                  System.out.println("Total amount: " + total1 + " PHP"); //the total will display here
                  System.out.println("=====================================");
 
                  break;
              
                  
                  
              case 2:
                  int Qty2;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo2 = num.nextLine();
                      try {
                          Qty2 = Integer.parseInt(jo2);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total2 = Qty2 * 76;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty2);
                  System.out.println("You ordered Burger Steak.");
                  System.out.println("Total amount: " + total2 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
              case 3:
                  int Qty3;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo3 = num.nextLine();
                      try {
                          Qty3 = Integer.parseInt(jo3);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total3 = Qty3 * 80;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty3);
                  System.out.println("You ordered Jolly Spaghetti.");
                  System.out.println("Total amount: " + total3 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
                  
              case 4:
                  int Qty4;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo4 = num.nextLine();
                      try {
                          Qty4 = Integer.parseInt(jo4);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total4 = Qty4 * 138;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty4);
                  System.out.println("You ordered Palabok.");
                  System.out.println("Total amount: " + total4 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
                  
              case 5:
                  int Qty5;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo5 = num.nextLine();
                      try {
                          Qty5 = Integer.parseInt(jo5);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total5 = Qty5 * 50;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty5);
                  System.out.println("You ordered Yumburger.");
                  System.out.println("Total amount: " + total5 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
              case 6:
                  int Qty6;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo6 = num.nextLine();
                      try {
                          Qty6 = Integer.parseInt(jo6);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total6 = Qty6 * 39;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty6);
                  System.out.println("You ordered Choco_Sundae.");
                  System.out.println("Total amount: " + total6 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
              case 7:
                  int Qty7;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo7 = num.nextLine();
                      try {
                          Qty7 = Integer.parseInt(jo7);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total7 = Qty7 * 45;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty7);
                  System.out.println("You ordered Peach_Mango_Pie.");
                  System.out.println("Total amount: " + total7 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
                  
                  
              case 8:
                  int Qty8;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo8 = num.nextLine();
                      try {
                          Qty8 = Integer.parseInt(jo8);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total8 = Qty8 * 57;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty8);
                  System.out.println("You ordered Jolly Crispy Fries.");
                  System.out.println("Total amount: " + total8 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
              case 9:
                  int Qty9;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo9 = num.nextLine();
                      try {
                          Qty9 = Integer.parseInt(jo9);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total9 = Qty9 * 295;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty9);
                  System.out.println("You ordered Chickenjoy w/ Spaghetti.");
                  System.out.println("Total amount: " + total9 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
              case 10:
                  int Qty10;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo10 = num.nextLine();
                      try {
                          Qty10 = Integer.parseInt(jo10);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total10 = Qty10 * 631;
                  System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty10);
                  System.out.println("You ordered 8-pc Chickenjoy Bucket.");
                  System.out.println("Total amount: " + total10 + " PHP");
                  System.out.println("=====================================");
                  System.out.println("");
                  System.out.println("");
                  break;

                  
                  
              case 11:
                  int Qty11;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo11 = num.nextLine();
                      try {
                          Qty11 = Integer.parseInt(jo11);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total11 = Qty11 * 320;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty11);
                  System.out.println("You ordered Jolly Spaghetti Family Pan.");
                  System.out.println("Total amount: " + total11 + " PHP");
                  System.out.println("=====================================");
                  System.out.println("");
                  System.out.println("");
                  break;

                  
                  
              case 12:
                  int Qty12;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo12 = num.nextLine();
                      try {
                          Qty12 = Integer.parseInt(jo12);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total12 = Qty12 * 470;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty12);
                  System.out.println("You ordered Burger Steak Family Savers (6-pc).");
                  System.out.println("Total amount: " + total12 + " PHP");
                  System.out.println("=====================================");
                  System.out.println("");
                  System.out.println("");
                  break;

                  
                  
              case 13:
                  int Qty13;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo13 = num.nextLine();
                      try {
                          Qty13 = Integer.parseInt(jo13);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total13 = Qty13 * 196;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty13);
                  System.out.println("You ordered Jolly Crispy Fries Bucket.");
                  System.out.println("Total amount: " + total13 + " PHP");
                  System.out.println("=====================================");
                  System.out.println("");
                  System.out.println("");
                  break;

                  
                  
              case 14:
                  int Qty14;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo14 = num.nextLine();
                      try {
                          Qty14 = Integer.parseInt(jo14);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total14 = Qty14 * 186;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty14);
                  System.out.println("You ordered 2-pc Chickenjoy Solo (with rice & gravy).");
                  System.out.println("Total amount: " + total14 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
              case 15:
                  int Qty15;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo15 = num.nextLine();
                      try {
                          Qty15 = Integer.parseInt(jo15);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total15 = Qty15 * 365;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty15);
                  System.out.println("You ordered 5-pc Burger Bundle (Yumburgers + Drinks).");
                  System.out.println("Total amount: " + total15 + " PHP");
                  System.out.println("=====================================");
                  break;

                  
                  
              case 16:
                  int Qty16;
                  while (true) {
                      System.out.print("Enter the quantity: ");
                      String jo16 = num.nextLine();
                      try {
                          Qty16 = Integer.parseInt(jo16);
                          break;
                      } catch (Exception e) {
                          System.out.println("You must Enter the Quantity!!\n");
                      }
                  }
                  int total16 = Qty16 * 699;
                                    System.out.println("");
                  System.out.println("");
                  System.out.println("=====================================");
                  System.out.println("Enter the menu number of your choice: "+ choose);
                  System.out.println("Enter the quantity: " + Qty16);
                  System.out.println("You ordered 10-pc Burger Bundle (Yumburgers + Drinks).");
                  System.out.println("Total amount: " + total16 + " PHP");
                  System.out.println("=====================================");
                  break;

          }   
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
        
    }
    
}