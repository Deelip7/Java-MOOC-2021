
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int value = Integer.valueOf(scan.nextLine());
        double taxAmount = 0;

        if (value >= 5_000 && value <= 25_000) {
            taxAmount = (100 + (value - 5_000) * .08);
            System.out.println("Tax: " + taxAmount);
        } else if (value >= 25_000 && value <= 55_000) {
            taxAmount = (1_700 + (value - 25_000) * .10);
            System.out.println("Tax: " + taxAmount);
        } else if (value >= 55_000 && value <= 200_000) {
            taxAmount = (4_700 + (value - 55_000) * .12);
            System.out.println("Tax: " + taxAmount);
        } else if (value >= 200_000 && value <= 1_000_000) {
            taxAmount = (22_100 + (value - 200_000) * .15);
            System.out.println("Tax: " + taxAmount);
        }else if (value >= 1_000_000) {
            taxAmount = (142_100 + (value - 1_000_000) * .17);
            System.out.println("Tax: " + taxAmount);
        }else{
            System.out.println("No tax!");
        }

    }
}
