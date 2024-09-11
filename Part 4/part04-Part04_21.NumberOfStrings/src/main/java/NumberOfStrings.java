
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
      
//        int maximumDuration=0;
        while(true) {
            String input =scanner.nextLine();
            if(input.contains("end")){
                break;
            }
            
            strings.add(new String(input));
            
        }
            
        System.out.println(strings.size());
       
                   
            
        }
    }

            


