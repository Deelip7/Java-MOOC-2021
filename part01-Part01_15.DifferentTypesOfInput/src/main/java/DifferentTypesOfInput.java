
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String strVal = scan.nextLine();
        System.out.println("Give an integer:");
        int intVal = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubVal = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean boolVal = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + strVal );
        System.out.println("You gave the integer " + intVal );
        System.out.println("You gave the double " + doubVal );
        System.out.println("You gave the boolean " + boolVal );




    }
}
