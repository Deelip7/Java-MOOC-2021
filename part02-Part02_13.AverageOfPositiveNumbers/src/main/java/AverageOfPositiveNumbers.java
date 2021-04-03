
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number != 0) {
                if (number > 0) {
                    total += number;
                    count++;
                }
                continue;
            }

            if (number == 0) {
                if (total == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println((double) total / count);
                }
                break;
            }
        }
    }
}
