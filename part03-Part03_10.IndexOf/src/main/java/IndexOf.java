
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here
        System.out.println("Search for? ");
        int index = Integer.valueOf(scanner.nextLine());
        int counter = 0;

        for( int num : list) {
           if(num == index){
               System.out.println(num + " is at index " + counter);
           }
            counter++;
        }
    }
}
