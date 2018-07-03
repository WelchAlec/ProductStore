//This class is used for ordering nodes
public class ProductNode{
    private ProductNode next;
    private ProductNode prev;
    private ProductInfo info;
    
    public ProductNode(ProductInfo info, ProductNode next, ProductNode prev){
        this.info = info;
        this.next = next;
        this.prev = prev;
    }
    public void setInfo(ProductInfo info){
        this.info = info;
    }
    public void setNext(ProductNode node){
        this.next = node;
    }
    public ProductInfo getInfo(){
        return info;
    }
    public ProductNode getNext(){
        return next;
    }
    public void setPrev(ProductNode node){
        this.prev = prev;
    }
    public ProductNode getPrev(){
        return prev;
    }
}