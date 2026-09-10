enum Laptop10{
    Macbook(1000),XPS(500),Surface(750),Thinkpad(800);//Constructor...constructor is also a type of object
    //for keeping the values into the bracket
    private int price;
    private Laptop10(int price){
        this.price = price;
        
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum3 {
    public static void main(String args[]){
        Laptop10 l1 = Laptop10.Macbook;
        l1.setPrice(999);
        System.out.println(l1 + " : " + l1.getPrice());

        //for all the laptops and their prices.
        for (Laptop10 l2 :Laptop10.values()){
            System.out.println(l2+" : "+l2.getPrice());
        }



    }
    
}
