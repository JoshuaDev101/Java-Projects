import java.util.Scanner;

public class Peta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1.Strings  
        String title = "My Performance Task";

        // 2.Output
        System.out.println(title);
        System.out.println("Enter you Grade in Comprog 1 this SEM.");

        // 3. Variables & 4. Primitive Data Types
        double[] grades = new double[4]; 
        String[] gradeNames = {"Prelim", "Midterm", "Pre-Final", "Finals"};

        // 5. Repetition
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter your " + gradeNames[i] + " Grade: ");
            grades[i] = scan.nextDouble();
        }

        // 6. Expressions & 7. Operators
        double GWA = (grades[0] * 0.20) + (grades[1] * 0.20) + (grades[2] * 0.20) + (grades[3] * 0.40);

        System.out.println("Your Computed GWA: " + GWA);

        // 8. Selection 
        if (GWA >= 59.59) {
            System.out.println("Status: PASSED");
            System.out.println("Great job! Keep it up!");
        } else {
            System.out.println("Status: FAILED");
            System.out.println("Don't give up! Try again next time.");
        }

        scan.close();
    }
}
