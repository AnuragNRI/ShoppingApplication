import java.util.ArrayList;
import java.util.Scanner;



public class Cart {
    Scanner sc = new Scanner(System.in);
    static int genId = 1;
    int id;
    ArrayList<Product> prodList = new ArrayList<Product>();
    int cartTotal;

    public Cart(){
        id = genId;
        genId++;
    }

    public void addToCart(){
        Inventory.showInventoryData();
        System.out.println("\n");
        System.out.println("Enter Your Choice");
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the quantity");
        int quant = Integer.parseInt(sc.nextLine());
        float isAdded = Inventory.updateInventory(choice , quant);
        cartTotal += isAdded;


        
    }

    


}
