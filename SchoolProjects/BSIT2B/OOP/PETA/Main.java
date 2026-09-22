
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        int choice = 0;
        Scanner scan = new Scanner(System.in);
       customerOrder CO = null;

        while(exit == false){
            ChoiceDisplay();
           System.out.println("Choice a number");
           choice = scan.nextInt();
           scan.nextLine();
            switch (choice) {
                case 1:
                     System.out.println("Enter Your Order: ");
                    String cOrder = scan.nextLine();
                    System.out.println("Enter Quantity: ");
                    int q = scan.nextInt();
                    CO = new customerOrder(cOrder,q);
                     
                    break;
                case 2:
                    CO.Display();
                case 3:
                    
                     exit = true;
                    break;
            }

        }
    }

    static void ChoiceDisplay(){
        System.out.println("1. Print the Customer");
        System.out.println("2. print");
        System.out.println("3. ");
    }


}



class customerOrder{
    private String order1;
    private int quantity;

    public customerOrder(String order1, int quantity){
        this.order1 = order1;
        this.quantity =  quantity;
    }
    public String getOrder1(){
        return order1;
    }
    public void setOrder1(String order1){
        this.order1 = order1;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
    void Display(){
        System.out.println("You've ordered: "+ order1 + " x" + quantity);
    }
}
