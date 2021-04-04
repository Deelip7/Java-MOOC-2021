
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        try {

            // scanner for reading the file
            Scanner scan = new Scanner(Paths.get("data.txt"));

            // read the file until all lines have been read
            while (scan.hasNextLine()) {
                // read one line
                String row = scan.nextLine();
                // print the line
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
