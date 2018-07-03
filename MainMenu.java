//Class that prompts main menu to appear
public class MainMenu{
    private int input;
    public void printMainMenu(){
        System.out.println("---------------------------------------");
        System.out.println("      Main menu");
        System.out.println("      ---------");
        System.out.println("1. Input a new item");
        System.out.println("2. Delete an item");
        System.out.println("3. Get information of an item");
        System.out.println("4. Get a total summary of all items");
        System.out.println("5. Edit an Item");
        System.out.println("6. End Program");
        System.out.println("---------------------------------------");
    }
    public void setInput(int input){
        this.input = input;
    }
    public int getInput(){
        return input;
    }
}