
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter count1 = new Counter(1);

        count1.increase();
        System.out.println(count1.value());
    }
}
