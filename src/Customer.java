public class Customer {
    String name;
    String email;
    long phoneNumber;
    Cart c;

    public Customer(String name , String email , long phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        c = new Cart();
    }

    public void showCustomerDetails(){
        System.out.println("Name-- "+ name );
        System.out.println("Email--" + email);
        System.out.println("Phone Number--" + phoneNumber);
    }

    public void addToCart(){
        c.addToCart();

    }

    public void cartTotal(){
        System.out.println("\n");
        System.out.println("The cart Total is " + c.cartTotal);
    }
}
