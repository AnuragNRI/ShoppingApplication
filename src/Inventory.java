import java.util.ArrayList;

public class Inventory {
    static ArrayList<Product> prodList = new ArrayList<Product>();
    
    public static void addToInventory(Product p){
        prodList.add(p);
    }

    public static void showInventoryData(){
        int n = prodList.size();
        System.out.println("\n");
        System.out.println("id /Name /Quantity /Price");
        // System.out.println("\n");
        for(int i = 0; i < n ; i++){
            System.out.println(i+1 + " " + prodList.get(i).name + " " + prodList.get(i).quantity +  " " + prodList.get(i).price);
        }
    }

    public static float updateInventory(int choice , int quant){
        try{
            if(quant <= prodList.get(choice-1).quantity){
                prodList.get(choice-1).quantity -= quant;
                return quant*prodList.get(choice-1).price;
            }else{
                System.out.println("Out of stock");
                return 0;
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Invalid Product id");
            return 0;
        }
        
        


    }

}
