
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int nums = Integer.valueOf(scanner.nextLine());

            if (nums == -1) {
                break;
            }
            statistics.addNumber(nums);

            if (nums % 2 == 0) {
                even.addNumber(nums);
            } else {
                odd.addNumber(nums);
            }
        }


//        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
//        System.out.println("Average: " + statistics.average());
    }
}
