
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstVolume = new Container();
        Container secondVolume = new Container();
        
        


        while (true) {
            System.out.println("First:" + firstVolume);
            System.out.println("Second:" + secondVolume);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstVolume.add(amount);
                

            }else if (command.equals("move")) {
                              
                if (amount<=0||firstVolume.contains()==0){
                    return;
                }
                 
                if(firstVolume.contains()-amount<0){
                    amount = firstVolume.contains();
                }
                firstVolume.remove(amount);
                secondVolume.add(amount);
          
            } else if (command.equals("remove")){
                secondVolume.remove(amount);
            }

        }
    }
}

    

    
         