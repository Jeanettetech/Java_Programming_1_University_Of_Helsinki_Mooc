
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;


        while (true) {
            System.out.println("First:" + firstVolume + "/" + maxVolume);
            System.out.println("Second:" + secondVolume + "/" + maxVolume);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    firstVolume += amount;
                    if (firstVolume > maxVolume) {
                        firstVolume = maxVolume;
                    }
                }

            } else if (command.equals("move") && amount >= 0) {
                if ((firstVolume - amount) >= 0) {
                    firstVolume -= amount;
                    secondVolume += amount;
                    if (firstVolume > 100 || secondVolume > 100) {
                        firstVolume = 100;
                        secondVolume = 100;
                    }
                } else if ((firstVolume - amount) < 0) {
                    secondVolume += firstVolume;
                    firstVolume = 0;
                }
                if (secondVolume >= maxVolume) {
                    secondVolume = maxVolume;
                }
            } else if (command.equals("remove") && amount > 0) {
                if (secondVolume - amount > 0) {
                    secondVolume -= amount;
                } else if (secondVolume - amount <= 0) {
                    secondVolume = 0;
                }
            }

        }
    }
}

