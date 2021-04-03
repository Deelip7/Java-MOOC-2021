import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("Title: ");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break
                        ;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());

            System.out.println("Publication year: ");
            String year = scan.nextLine();

            books.add(new Book(title, pages, year));

        }

        System.out.println("What information will be printed? ");
        String infoOption = scan.nextLine();

        for (Book book : books) {
            if (infoOption.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println(book);
            }
        }

    }
}
