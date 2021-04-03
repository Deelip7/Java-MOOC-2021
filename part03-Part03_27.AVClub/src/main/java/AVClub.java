
import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] strArry = str.split(" ");
            for (String s : strArry) {
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
        }
    }
}
