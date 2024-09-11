
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int numberOfPositives = 0;
        double positiveSum = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
           
            if(input == 0){
                break;
            }
            
            if(input >0){
                numberOfPositives++;
                positiveSum= positiveSum+input;
                count++;
                
            }else{
                count++;

            }
       
        
        }
  
        if (count == 0||numberOfPositives==0){
            System.out.println("Cannot calculate average");
       
        }else{
            System.out.println("Average of the numbers: "+positiveSum/numberOfPositives);
            
            
        }


 
        

    }
}
