
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                total += number;
                count++;
                continue;
            }
            if (number == 0) {
                System.out.println("Average of the numbers: " + (double) total/count);
                break;
            }
        }//
    }
}
