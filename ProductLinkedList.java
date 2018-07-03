/*Product Linked List class -- allows nodes to be put in order
   The size variable assigns new products an id number */

import java.util.*;
public class ProductLinkedList{
    private ProductNode head;
    private ProductNode tail;
    private int size = 1;
    Scanner scanner = new Scanner(System.in);
    public int getSize(){
        return size;
    }
    public void addBack(ProductInfo info){
        size++;
        if(head == null){
            head = new ProductNode(info, null, null);
            tail = head;
        }
        else{
            ProductNode node = new ProductNode(info, null, tail);
            this.tail.setNext(node);
            this.tail = node;
        }
    }
    //deletes node that is inputted by the user
    public void deleteSelectedNode(int input){
        ProductNode node = tail;
        int userInput = input;
        try{
            while(node.getInfo().getID() != userInput){
                node = node.getPrev();
            }
            if(node.getInfo().getID() == userInput){
                System.out.println(node.getInfo().getName());
                if(node.getPrev() != null){
                    node = node.getPrev();
                    node.setNext(node.getNext().getNext());
                    int count = node.getInfo().getID();
                    size--;
                    System.out.println("Your item has been deleted");
                }
                else{
                    head = node.getNext();
                    System.out.println("Your item has been deleted");
                }
                
            }        
            else
                System.out.println("Your ID number was not located");
        }catch(Exception e){
            System.out.println("Error in program: ID number not in use");
        }
    } 
    //adds ammount of each node in use and multiplies their prices 
    public void totalSummary(){
        int numberOfItems = 0;
        double totalPrice = 0.00;
        ProductNode currentNode = head;
        try{
            while(currentNode != null){
                numberOfItems= numberOfItems + currentNode.getInfo().getQuantity();
                totalPrice = totalPrice + (currentNode.getInfo().getPrice() * currentNode.getInfo().getQuantity());
                currentNode = currentNode.getNext();
            }
            System.out.println("Total Number of Items: " + numberOfItems);
            System.out.println("Total Price of all items in stock: $" + totalPrice);
            System.out.println();
        }catch(Exception e){
            System.out.println("Error in program, no items found");
        }
    }
    //prints user specified node
    public void printSpecificNode(int input){
        int userInput = input;
        ProductNode currentNode;
        currentNode = head;
        boolean found = false;
        try{
            if(currentNode.getInfo().getID() == userInput)
                found = true;
            while(currentNode.getInfo().getID() != userInput && found == false){
                currentNode = currentNode.getNext();
                if(currentNode.getInfo().getID() == userInput)
                    found = true;
            }
            if(found == true){
                System.out.println();
                System.out.println("Item Name: " + currentNode.getInfo().getName());
                System.out.println("Item ID: " + currentNode.getInfo().getID());
                System.out.println("Item Quantity: " + currentNode.getInfo().getQuantity());
                System.out.println("Item Price: " + currentNode.getInfo().getPrice());
                System.out.println();
            }
            else
                System.out.println("Your item was not found, invalid ID number");
        }catch(Exception e){
            System.out.println("An error was found in your input, there may not be an item with that ID number");
        }
    }
    // allows user to edit a specific node
    public void editAnItem(int id){
        int itemID = id;
        int userInput = 0;
        ProductNode currentNode = head;
        try{
            while(currentNode.getInfo().getID() != itemID){
                currentNode = currentNode.getNext();
            }
            do{
                if(currentNode.getInfo().getID() == itemID){
                    System.out.println("Would you like to edit... ");
                    System.out.println("1. The name of the item ");
                    System.out.println("2. The price of the item");
                    System.out.println("3. The Quantity of the item");
                    System.out.println("4. End operation");
                    userInput = scanner.nextInt();
                }
                else
                    System.out.println("Your item was not found");
                if(userInput == 1){
                    System.out.println("Change the name of " + currentNode.getInfo().getName());
                    System.out.println("---------------");
                    System.out.print("Enter the new name for " + currentNode.getInfo().getName() + ": ");
                    currentNode.getInfo().setName(scanner.next());
                    System.out.println();
                }    
                    else
                        if(userInput == 2){
                            System.out.println("Change the price of " + currentNode.getInfo().getName());
                            System.out.println("------------------"); 
                            System.out.print("The current price of " + currentNode.getInfo().getName() + " is ");
                            System.out.println(currentNode.getInfo().getPrice());
                            System.out.print("Enter the new price for " + currentNode.getInfo().getName() + ": $");
                            currentNode.getInfo().setPrice(scanner.nextDouble());
                            System.out.println();
                        }
                        else
                            if(userInput == 3){
                                System.out.println("Change the quantity of " + currentNode.getInfo().getName());
                                System.out.println("------------------");
                                System.out.print("The current quantity of " + currentNode.getInfo().getName() + " is ");
                                System.out.println(currentNode.getInfo().getQuantity());
                                System.out.print("Enter the new quantity for " + currentNode.getInfo().getName() + ": ");
                                currentNode.getInfo().setQuantity(scanner.nextInt());
                                System.out.println();
                            }
                            else
                                if(userInput == 4)
                                    System.out.println("Operation ended");
                                else
                                    System.out.println("Not a valid input");
            }while(userInput != 4);
        }catch(Exception e){
            System.out.println("This operation was not possible, error in user input");
        }
    }
    //print function that prints all nodes
    public void printAllNodes(){
        int count = this.size;
        ProductNode currentNode;
        currentNode = head;
        boolean print = true;
        try{
            while(currentNode.getInfo().getID() >= 0 && count > 1 && print == true){
               System.out.println("Name: " + currentNode.getInfo().getName());
               System.out.println("ID number: " + currentNode.getInfo().getID());
               System.out.println("Product Price: $" + currentNode.getInfo().getPrice());
               System.out.println("Quantity: " + currentNode.getInfo().getQuantity());
               System.out.println();
               if(currentNode.getNext() != null)
                   currentNode = currentNode.getNext();
               else    
                   print = false;
            }
        }catch(Exception e){
            System.out.println("Error in program: No items were found");
        }
    }
}


