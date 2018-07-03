import java.util.*;
/*
 * 
* This is the main program class that has a main menu loop
*
*/
public class main{
    public static void main (String [] args){
        //dec of objects
        ProductLinkedList list = new ProductLinkedList();
        ProductInfo node = new ProductInfo();
        MainMenu menu = new MainMenu();
        Scanner scanner = new Scanner(System.in);
        
        //dec of variables
        String name;
        double price;
        int quantity, id, input;
        //initial main menu prompt for user input
        menu.printMainMenu();
        //allows user to make an input choice
        menu.setInput(scanner.nextInt());
        //main menu loop that user sees when program is ran
       while(menu.getInput() != 6){
           //if user selects "1", this is prompted
           if(menu.getInput() == 1){
               System.out.print("Enter the item's name: ");
               name = scanner.next();
               System.out.println();
               System.out.print("Enter the price of the item: ");
               price = scanner.nextDouble();
               System.out.println();
               System.out.print("Enter the quantity of the item: ");
               quantity = scanner.nextInt();
               System.out.println();
               list.addBack(new ProductInfo(name,price,quantity,list.getSize()));
           }
           else
               //if user selects "2" this is prompted
               if(menu.getInput() == 2){
                   System.out.println("Please enter the ID number of the item you wish to delete: ");
                   id = scanner.nextInt();
                   list.deleteSelectedNode(id);
               }
               else
                   //if user selects "3" this is prompted
                   if(menu.getInput() == 3){
                       
                       System.out.println();
                       System.out.println("1. Input the ID number of the item you wish to get info about: ");
                       System.out.println("2. Get a list of all items and ID numbers currently in use");
                       input = scanner.nextInt();
                       if(input == 1){
                           System.out.println("Input ID number: ");
                           id = scanner.nextInt();
                           list.printSpecificNode(id);
                       }    
                       else
                           if(input == 2)
                               list.printAllNodes();
                           else
                               System.out.println("Not a valid input");
                       System.out.println();        
               }    
               else
                   //if user selects "4", this is prompted
                   if(menu.getInput() == 4){
                       System.out.println();
                       System.out.println("Total Summary Of All Items");
                       System.out.println("--------------------------");
                       list.totalSummary();
                   }
                   else
                       //if user selects "5", this is prompted
                       if(menu.getInput() == 5){
                           System.out.println("1. See a list of all items: ");
                           System.out.println("2. Enter the ID number of the item you wish to edit: ");
                           input = scanner.nextInt();
                           if(input == 1)
                               list.printAllNodes();
                           if(input == 2){
                               System.out.println("Enter the ID number: ");
                               id = scanner.nextInt();
                               list.editAnItem(id);
                           }    
                       }
                       else
                           System.out.println("Invalid input, returning you to main menu...");
           menu.printMainMenu();
           menu.setInput(scanner.nextInt()); 
       }
        
       System.out.println("THE PROGRAM HAS ENDED");
       
    }
}