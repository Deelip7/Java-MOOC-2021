
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Enter the first string:");
        String strFirst = scan.nextLine();

        System.out.println("Enter the second string:");
        String strSec = scan.nextLine();

        if (strFirst.equals(strSec)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
