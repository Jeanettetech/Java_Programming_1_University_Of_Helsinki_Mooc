
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: "); 
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;
               
                try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visPoints = Integer.valueOf(parts[3]);

                if (team.equals(homeTeam)) {
                    count++;

                    if (homePoints > visPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team.equals(visTeam)) {
                    count++;

                    if (homePoints < visPoints) {
                        wins++;
                    } else {
                        losses++;
                    }

                }

            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Reading the file failed");

        }

    }
}
        

    