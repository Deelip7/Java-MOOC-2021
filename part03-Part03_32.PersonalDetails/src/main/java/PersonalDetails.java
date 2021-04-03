
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList();
        ArrayList<String> names = new ArrayList();

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] strArry = str.split(",");
            ages.add(Integer.valueOf(strArry[1]));
            names.add(strArry[0]);
        }
        int avgAge = 0;
        String longest = names.get(0);

        for(String n : names){
            if(n.length() > longest.length()){
                longest = n;
            }
        }

        for (int a : ages) {
            avgAge += a;
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (double) avgAge/ ages.size());
    }
}
