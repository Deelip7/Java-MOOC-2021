
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {

            while (fileScan.hasNextLine()) {

                String[] data = fileScan.nextLine().split(",");

                if (data[1].equals("1")) {
                    System.out.println(data[0] + ", age: " + data[1] + " year");
                } else {
                    System.out.println(data[0] + ", age: " + data[1] + " years");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
