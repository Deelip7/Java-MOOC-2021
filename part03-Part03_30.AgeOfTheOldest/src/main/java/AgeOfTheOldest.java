
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList();

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] strArry = str.split(",");
            ages.add(Integer.valueOf(strArry[1]));
        }
        int oldest = ages.get(0);

        for (int a : ages){
            if(a > oldest){
                oldest = a;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
