import java.util.Scanner;

public class Peta {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
      
         //Variables & Primitive Datatypes
         int prelim = 0, midterm = 0, preFinal = 0, finals = 0;
         double GWA, grades;
         
         //Output & Strings
         String title = "My Performance Task";
         System.out.println(title);
         System.out.println("Enter your grade in COMPROG 1 in this SEM");
        // Input

         System.out.print("Enter your Prelim Grade: ");
         prelim = scan.nextInt();
          
         System.out.print("Enter your Midterm Grade: ");
         midterm = scan.nextInt();

         System.out.print("Enter your Pre Final Grade: ");
         preFinal = scan.nextInt();

         System.out.print("Enter your Finals Grade: ");
         finals = scan.nextInt();
        // Expressions & Operators 
         GWA = (prelim * 0.20) + (midterm * 0.20) + (preFinal * 0.20) + (finals * 0.40);

         System.out.println("Your GWA in COMPROG 1 is :" + GWA);
        //  Operators
         if (GWA >= 59.59) { 
            System.out.println("Status: PASSED");
            System.out.println("Congratulations!");
        } else {
            System.out.println("Status: FAILED");
            System.out.println("Study harder next time.");
        }
         System.out.println("Enter Your GWA in COMPROG 1: ");
         grades = scan.nextDouble();

       
        scan.close();

        


        
     

     
    }
}
