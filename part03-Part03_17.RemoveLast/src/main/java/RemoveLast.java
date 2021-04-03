
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    private static void removeLast(ArrayList<String> str) {
        if(str.size() > 1){
            str.remove(str.get(str.size()-1));
        }
    }
}
