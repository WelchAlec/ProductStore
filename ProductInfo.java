//This class is used for assigning data to specfic nodes
public class ProductInfo{
    private String name;
    private double price;
    private int quantity, id;
    
    public ProductInfo(){
        name = null;
        id = -1;
        price = -1;
        quantity = -1;
    }
    public ProductInfo(String name, double price, int quantity, int id){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
}

