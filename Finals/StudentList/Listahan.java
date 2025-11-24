import java.util.Scanner;
public class Listahan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String StudentList[] = new String[10];
        int x = 0;

        while (x < StudentList.length) {
            System.out.print("Enter name " + (x + 1) + ": ");
            StudentList[x] = scan.nextLine();
            x++;
        }
        System.out.println("Student List: ");
        x = 0;
        while (x < StudentList.length) {
            System.out.println((x+1) +". " + StudentList[x]);
            x++;
        }
            scan.close();


    }
}
