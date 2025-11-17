import java.util.Scanner;
 // for (int i = 0; i < StudentList.length; i++) {
        //     System.out.println("Enter Name " + (i + 1) + ": ");
        //     StudentList[i] = scan.nextLine();
        // }
        
        // System.out.println("Student List");
        // for (String student : StudentList) {
        //     System.out.println(student);
        // }
public class Listahan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] StudentList = new String[10];
        int x = 0;

        while(x < StudentList.length){
            System.out.println("Enter name " + ( x + 1)+ ": ");
            StudentList[x] = scan.nextLine();
            x++;
        }
            System.out.println("Student List: ");
        x = 0;
        while(x < StudentList.length){
            System.out.println(StudentList[x]);
            x++;
        }
        scan.close();
       
        





        scan.close();  
    }
}
