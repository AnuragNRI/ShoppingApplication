import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product("Ideapad", "lenevo", 20, 70000);
        Product p2 = new Product("pavilion", "hp", 30, 65000);
        Product p3 = new Product("TUF Gaming", "Asus", 15, 75000);
        Product p4 = new Product("Victus", "hp", 40, 60000);
        Product p5 = new Product("Inspiron", "Dell", 25, 50000);

        Inventory.addToInventory(p1);
        Inventory.addToInventory(p2);
        Inventory.addToInventory(p3);
        Inventory.addToInventory(p4);
        Inventory.addToInventory(p5);

        Customer c = new Customer("Anurag Bakode", "anurag@gmail", 9131471408l);

        outer_loop: while (true) {
            System.out.println("\n");
            System.out.println("1 . Shopping");
            System.out.println("2 . Show Innventory");
            System.out.println("3 .Cart Details");
            System.out.println("4. Customer Details");
            System.out.println("5. Exit Application");

            System.out.println("\n");
            System.out.println("Enter your Choice");
            int input = Integer.parseInt(sc.nextLine());

            switch (input) {
                case 1:
                    c.addToCart();
                    break;
                case 2:
                    Inventory.showInventoryData();
                    break;
                case 3:
                    c.cartTotal();
                    break;

                case 4:
                    c.showCustomerDetails();

                case 5:
                    break outer_loop;

                default:
                    System.out.println("Wrong Input");
                    break;

            }
            
            System.out.println("\n");
            System.out.println("Do you want to continue");
            String check = sc.nextLine();
            if (check.equals("no"))
                break;

        }

        sc.close();
    }
}
