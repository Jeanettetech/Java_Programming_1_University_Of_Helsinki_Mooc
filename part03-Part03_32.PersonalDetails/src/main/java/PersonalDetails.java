
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int i = 0;
        double count = 0;
        int nameLength = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            sum = sum+ Integer.valueOf(pieces[1]);
            count++;
            nameLength = Integer.valueOf(pieces[0].length());
            if(nameLength>i){
               i= nameLength;
               name = pieces[0];
                  
                }
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of birth years: "+sum/count);
    }
}

            
            
            
            
       