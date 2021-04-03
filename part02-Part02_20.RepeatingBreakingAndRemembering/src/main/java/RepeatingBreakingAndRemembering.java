
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int total = 0,counter = 0 , even = 0, odd = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
            total += num;
            counter++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + total);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (double) total/counter);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
