
import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            }
            String[] strArry = str.split(" ");
            for(String s : strArry){
                System.out.println(s);
            }
        }
    }
}
