
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            System.out.println("Give a number");
            double input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0){
                break;
            
            }
            
            if (input < 0){
                System.out.println("Unsuitable number");
                continue;
                
            }else{
                System.out.println((Math.pow(input, 2)));
            }
        }
            
            
        

    }
}
