
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("File: ");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int gameCount = 0;
        int gameWon = 0;
        int gameLost = 0;

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {

                String[] data = fileScan.nextLine().split(",");

                String homeName = data[0];
                String visitingName = data[1];
                int homePoint = Integer.valueOf(data[2]);
                int visitingPoint = Integer.valueOf(data[3]);

                if (homeName.equals(teamName)) {
                    gameCount++;
                    if (homePoint > visitingPoint ) {
                        gameWon++;
                    } else {
                        gameLost++;
                    }
                }else if(visitingName.equals(teamName)){
                    gameCount++;
                    if (visitingPoint > homePoint ) {
                        gameWon++;
                    } else {
                        gameLost++;
                    }
                }


            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + gameWon);
        System.out.println("Losses: " + gameLost);


    }

}
