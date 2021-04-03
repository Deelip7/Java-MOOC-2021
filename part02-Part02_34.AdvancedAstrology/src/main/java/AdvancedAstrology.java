
public class AdvancedAstrology {
    public static void printStars(int number) {
        // part 1 of the exercise
        int countPrinted = 0;
        while (countPrinted < number) {
            System.out.print("*");
            countPrinted = countPrinted + 1;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int countPrinted = 0;
        while (countPrinted < number) {
            System.out.print(" ");
            countPrinted = countPrinted + 1;
        }
    }

    public static void printTriangle(int size) {
        int full = 0;
        while (size > 0) {
            full++;
            size--;
            printSpaces(size);
            printStars(full);
        }
    }

    public static void christmasTree(int height) {
        int full = 0;
        int next =0;
        int startH = height;
        while (height > 0) {
            full++;
            height--;
            printSpaces(height);
            printStars(full);
            full++;
        }

        for(int row = 0 ; row < 2 ; row++){
            printSpaces(startH-2);
            printStars(3);

        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(4);
//        christmasTree(4);
        christmasTree(4);
    }
}
