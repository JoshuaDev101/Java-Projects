import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        
    
    String firstName;
    String lastName;
    int age;
    int studentID;
    String courses;
    int yearLevel;
    double grade;
    String email;
    String contact;
    String address;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your First Name: ");
        firstName = sc.next();

    System.out.println("Enter Last Name: ");
        lastName = sc.next();
    System.out.println("Enter your Age: ");
        age = sc.nextInt();
    System.out.println("Enter Student ID: ");
        studentID = sc.nextInt();
    System.out.println("Enter your Course");
        courses = sc.nextLine();
    System.out.println("Enter your Year Level");
        yearLevel = sc.nextInt();
    System.out.println("Enter your Average Grade 0.00 - 100.00");
        grade = sc.nextDouble();
    System.out.println("Enter your Email Address");
        email = sc.nextLine();
    System.out.println("Enter your Contact Number: ");
        contact = sc.nextLine();
    System.out.println("Enter your Address");
        address = sc.nextLine();

}
}
