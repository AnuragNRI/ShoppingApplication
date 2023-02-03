public class Product {
    //name,brand,qty,price
    static int genId = 1;
    int id;
    String name ;
    String brand;
    int quantity;
    float price;

    public Product(String name , String brand , int quantity , float price){
        this.id  = genId;
        genId++;
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public void showProdDetails(){
        System.out.println("Name--" + name);
        System.out.println("Brand--" + brand);
        System.out.println("Quantity--" + quantity);
        System.out.println("Price--" + price);
    }
}
