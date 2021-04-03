
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program
        int SEC_IN_DAY = 86400;
        System.out.println("How many days would you like to convert to seconds?");
        int numOfDays = Integer.valueOf(scanner.nextLine());

        System.out.println( numOfDays * SEC_IN_DAY);

    }
}
